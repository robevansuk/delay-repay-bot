
package com.thalesgroup.rtti._2016_02_16.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual service's summary details for display on a basic next/fastest departures board.
 * 
 * <p>Java class for DepartureItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartureItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service" type="{http://thalesgroup.com/RTTI/2016-02-16/ldb/types}ServiceItem"/>
 *       &lt;/sequence>
 *       &lt;attribute name="crs" use="required" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureItem", propOrder = {
    "service"
})
public class DepartureItem {

    @XmlElement(required = true, nillable = true)
    protected ServiceItem service;
    @XmlAttribute(name = "crs", required = true)
    protected String crs;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceItem }
     *     
     */
    public ServiceItem getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceItem }
     *     
     */
    public void setService(ServiceItem value) {
        this.service = value;
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

}
