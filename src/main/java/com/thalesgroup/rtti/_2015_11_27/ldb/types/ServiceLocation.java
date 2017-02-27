
package com.thalesgroup.rtti._2015_11_27.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual origin or destination location of a service. Note that vias will only be specified for destinations.
 * 
 * <p>Java class for ServiceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="via" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="futureChangeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assocIsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocation", propOrder = {
    "locationName",
    "crs",
    "via",
    "futureChangeTo",
    "assocIsCancelled"
})
public class ServiceLocation {

    @XmlElement(required = true)
    protected String locationName;
    @XmlElement(required = true)
    protected String crs;
    protected String via;
    protected String futureChangeTo;
    @XmlElement(defaultValue = "false")
    protected Boolean assocIsCancelled;

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
     * Gets the value of the via property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVia() {
        return via;
    }

    /**
     * Sets the value of the via property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVia(String value) {
        this.via = value;
    }

    /**
     * Gets the value of the futureChangeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureChangeTo() {
        return futureChangeTo;
    }

    /**
     * Sets the value of the futureChangeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureChangeTo(String value) {
        this.futureChangeTo = value;
    }

    /**
     * Gets the value of the assocIsCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssocIsCancelled() {
        return assocIsCancelled;
    }

    /**
     * Sets the value of the assocIsCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssocIsCancelled(Boolean value) {
        this.assocIsCancelled = value;
    }

}
