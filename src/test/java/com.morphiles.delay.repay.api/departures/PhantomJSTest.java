package com.morphiles.delay.repay.api.departures;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static java.util.Arrays.asList;
import static java.util.concurrent.TimeUnit.SECONDS;

public class PhantomJSTest {

    Logger log = Logger.getLogger(PhantomJSTest.class.getName());
    private List<WebDriver> drivers = new ArrayList<>();
    static {
        System.setProperty("webdriver.chrome.driver", "/Users/ren7881/dev/webdrivers/chromedriver");
    }

    static final String URL = "http://delayrepay.thameslinkrailway.com/customer-details";
    static final String URL2 = "http://www.googletagmanager.com/gtm.js?id=GTM-T2QC2T&cv=72";

    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("javascript");

    @Test
    public void testDriver() throws IOException {
        WebDriver driver = new RemoteWebDriver(toUrl("http://localhost:9515"), DesiredCapabilities.chrome());
        driver.get(URL2);

        String response = driver.getPageSource();
        Document doc = Jsoup.connect(URL2).ignoreContentType(true).get();
        Elements scriptTags = doc.select("body");

        // get All functions


        try {
            String result = (String) engine.eval(response);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        log.info("PageSource " + response);

        driver.quit();
    }

    public URL toUrl(String url){
        try {
            return new URL(url);
        } catch (MalformedURLException ex) {
            log.error(ex);
        }
        return null;
    }

    public PhantomJSDriver createPhantomJsDriver(Capabilities capabilities) {
        final PhantomJSDriver phantomJSDriver = new PhantomJSDriver(capabilities);
        phantomJSDriver.manage().timeouts().pageLoadTimeout(10, SECONDS);
        drivers.add(phantomJSDriver);
        return phantomJSDriver;
    }

    public ChromeDriver createChromeDriver(Capabilities capabilities) {
        final ChromeDriver chromeDriver = new ChromeDriver(capabilities);
        chromeDriver.manage().timeouts().pageLoadTimeout(10, SECONDS);
        drivers.add(chromeDriver);
        return chromeDriver;
    }

    public void stopDrivers() {
        drivers.stream().forEach(WebDriver::quit);
    }

    public static DesiredCapabilities getDefaultDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability("acceptSslCerts", true);
        capabilities.setCapability("takesScreenshot", true);
        capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, asList("--ignore-ssl-errors=true"));
        LoggingPreferences loggingPreferences = new LoggingPreferences();
        loggingPreferences.enable(LogType.BROWSER, Level.ALL);
        capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingPreferences);
        return capabilities;
    }

    public static DesiredCapabilities getChromeCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability("acceptSslCerts", true);
        capabilities.setCapability("takesScreenshot", true);
        capabilities.setCapability(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, asList("--ignore-ssl-errors=true"));
        LoggingPreferences loggingPreferences = new LoggingPreferences();
        loggingPreferences.enable(LogType.BROWSER, Level.ALL);
        capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingPreferences);
        return capabilities;
    }
}