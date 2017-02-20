
package com.thalesgroup.rtti._2015_11_27.ldb.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.ServiceType;


/**
 * A list of calling points in a single journey segment.
 * 
 * <p>Java class for ArrayOfCallingPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCallingPoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callingPoint" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}CallingPoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="serviceType" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}ServiceType" default="train" />
 *       &lt;attribute name="serviceChangeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="assocIsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCallingPoints", propOrder = {
    "callingPoint"
})
public class ArrayOfCallingPoints {

    @XmlElement(nillable = true)
    protected List<CallingPoint> callingPoint;
    @XmlAttribute(name = "serviceType")
    protected ServiceType serviceType;
    @XmlAttribute(name = "serviceChangeRequired")
    protected Boolean serviceChangeRequired;
    @XmlAttribute(name = "assocIsCancelled")
    protected Boolean assocIsCancelled;

    /**
     * Gets the value of the callingPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallingPoint }
     * 
     * 
     */
    public List<CallingPoint> getCallingPoint() {
        if (callingPoint == null) {
            callingPoint = new ArrayList<CallingPoint>();
        }
        return this.callingPoint;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        if (serviceType == null) {
            return ServiceType.TRAIN;
        } else {
            return serviceType;
        }
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceChangeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isServiceChangeRequired() {
        if (serviceChangeRequired == null) {
            return false;
        } else {
            return serviceChangeRequired;
        }
    }

    /**
     * Sets the value of the serviceChangeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceChangeRequired(Boolean value) {
        this.serviceChangeRequired = value;
    }

    /**
     * Gets the value of the assocIsCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssocIsCancelled() {
        if (assocIsCancelled == null) {
            return false;
        } else {
            return assocIsCancelled;
        }
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
