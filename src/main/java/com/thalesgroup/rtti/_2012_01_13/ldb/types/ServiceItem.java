
package com.thalesgroup.rtti._2012_01_13.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual service's summary details for display on a departure board.
 * 
 * <p>Java class for ServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ArrayOfServiceLocations" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ArrayOfServiceLocations" minOccurs="0"/>
 *         &lt;element name="currentOrigins" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ArrayOfServiceLocations" minOccurs="0"/>
 *         &lt;element name="currentDestinations" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ArrayOfServiceLocations" minOccurs="0"/>
 *         &lt;element name="sta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}TimeType" minOccurs="0"/>
 *         &lt;element name="eta" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}TimeType" minOccurs="0"/>
 *         &lt;element name="std" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}TimeType" minOccurs="0"/>
 *         &lt;element name="etd" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}TimeType" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}PlatformType" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCName"/>
 *         &lt;element name="operatorCode" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode"/>
 *         &lt;element name="isCircularRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceID" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ServiceIDType"/>
 *         &lt;element name="adhocAlerts" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ArrayOfAdhocAlert" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItem", propOrder = {
    "origin",
    "destination",
    "currentOrigins",
    "currentDestinations",
    "sta",
    "eta",
    "std",
    "etd",
    "platform",
    "operator",
    "operatorCode",
    "isCircularRoute",
    "serviceID",
    "adhocAlerts"
})
public class ServiceItem {

    protected ArrayOfServiceLocations origin;
    protected ArrayOfServiceLocations destination;
    protected ArrayOfServiceLocations currentOrigins;
    protected ArrayOfServiceLocations currentDestinations;
    protected String sta;
    protected String eta;
    protected String std;
    protected String etd;
    protected String platform;
    @XmlElement(required = true)
    protected String operator;
    @XmlElement(required = true)
    protected String operatorCode;
    @XmlElement(defaultValue = "false")
    protected Boolean isCircularRoute;
    @XmlElement(required = true)
    protected String serviceID;
    protected ArrayOfAdhocAlert adhocAlerts;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setOrigin(ArrayOfServiceLocations value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setDestination(ArrayOfServiceLocations value) {
        this.destination = value;
    }

    /**
     * Gets the value of the currentOrigins property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getCurrentOrigins() {
        return currentOrigins;
    }

    /**
     * Sets the value of the currentOrigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setCurrentOrigins(ArrayOfServiceLocations value) {
        this.currentOrigins = value;
    }

    /**
     * Gets the value of the currentDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getCurrentDestinations() {
        return currentDestinations;
    }

    /**
     * Sets the value of the currentDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setCurrentDestinations(ArrayOfServiceLocations value) {
        this.currentDestinations = value;
    }

    /**
     * Gets the value of the sta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSta() {
        return sta;
    }

    /**
     * Sets the value of the sta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSta(String value) {
        this.sta = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEta() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEta(String value) {
        this.eta = value;
    }

    /**
     * Gets the value of the std property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStd() {
        return std;
    }

    /**
     * Sets the value of the std property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStd(String value) {
        this.std = value;
    }

    /**
     * Gets the value of the etd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtd() {
        return etd;
    }

    /**
     * Sets the value of the etd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtd(String value) {
        this.etd = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Sets the value of the operatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Gets the value of the isCircularRoute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCircularRoute() {
        return isCircularRoute;
    }

    /**
     * Sets the value of the isCircularRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCircularRoute(Boolean value) {
        this.isCircularRoute = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the adhocAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdhocAlert }
     *     
     */
    public ArrayOfAdhocAlert getAdhocAlerts() {
        return adhocAlerts;
    }

    /**
     * Sets the value of the adhocAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdhocAlert }
     *     
     */
    public void setAdhocAlerts(ArrayOfAdhocAlert value) {
        this.adhocAlerts = value;
    }

}
