
package com.thalesgroup.rtti._2012_01_13.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual calling point in a service.
 * 
 * <p>Java class for CallingPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallingPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="st" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}TimeType" minOccurs="0"/>
 *         &lt;element name="et" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}TimeType" minOccurs="0"/>
 *         &lt;element name="at" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}TimeType" minOccurs="0"/>
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
@XmlType(name = "CallingPoint", propOrder = {
    "locationName",
    "crs",
    "st",
    "et",
    "at",
    "adhocAlerts"
})
public class CallingPoint {

    @XmlElement(required = true)
    protected String locationName;
    @XmlElement(required = true)
    protected String crs;
    protected String st;
    protected String et;
    protected String at;
    protected ArrayOfAdhocAlert adhocAlerts;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrs(String value) {
        this.crs = value;
    }

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt() {
        return st;
    }

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt(String value) {
        this.st = value;
    }

    /**
     * Gets the value of the et property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEt() {
        return et;
    }

    /**
     * Sets the value of the et property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEt(String value) {
        this.et = value;
    }

    /**
     * Gets the value of the at property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAt() {
        return at;
    }

    /**
     * Sets the value of the at property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAt(String value) {
        this.at = value;
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
