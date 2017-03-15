package com.morphiles.delay.repay.api.departures

import org.junit.Test
import geb.spock.GebSpec
import spock.lang.Stepwise

@Stepwise
class PageFetchGebTest extends GebSpec {

    static final String LoginPage = "http://delayrepay.thameslinkrailway.com/customer-details"
    static final String AdminPage = "http://delayrepay.thameslinkrailway.com/customer-details"

    @Test
    def "go to Thameslink delay repay page"() {
        given:
        go LoginPage

        when:
        LoginPage.container.with {
            username = "admin"
            password = "password"
        }

        and:
        loginButton.click()

        then:
        at AdminPage
    }
}