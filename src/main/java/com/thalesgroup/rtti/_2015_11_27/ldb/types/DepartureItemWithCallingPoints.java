
package com.thalesgroup.rtti._2015_11_27.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual service's summary details for display on a "WithDetails" next/fastest departures board.
 * 
 * <p>Java class for DepartureItemWithCallingPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartureItemWithCallingPoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}ServiceItemWithCallingPoints"/>
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
@XmlType(name = "DepartureItemWithCallingPoints", propOrder = {
    "service"
})
public class DepartureItemWithCallingPoints {

    @XmlElement(required = true, nillable = true)
    protected ServiceItemWithCallingPoints service;
    @XmlAttribute(name = "crs", required = true)
    protected String crs;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceItemWithCallingPoints }
     *     
     */
    public ServiceItemWithCallingPoints getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceItemWithCallingPoints }
     *     
     */
    public void setService(ServiceItemWithCallingPoints value) {
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
