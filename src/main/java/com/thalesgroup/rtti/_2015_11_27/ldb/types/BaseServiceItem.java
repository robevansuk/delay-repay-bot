
package com.thalesgroup.rtti._2015_11_27.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.ServiceType;
import com.thalesgroup.rtti._2012_01_13.ldb.types.ArrayOfAdhocAlert;


/**
 * An individual service's summary details for display on a departure board.
 * 
 * <p>Java class for BaseServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sta" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="eta" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="std" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="etd" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}PlatformType" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCName"/>
 *         &lt;element name="operatorCode" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode"/>
 *         &lt;element name="isCircularRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterLocationCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}ServiceType"/>
 *         &lt;element name="length" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TrainLength" minOccurs="0"/>
 *         &lt;element name="detachFront" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isReverseFormation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delayReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceID" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}ServiceIDType"/>
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
@XmlType(name = "BaseServiceItem", propOrder = {
    "sta",
    "eta",
    "std",
    "etd",
    "platform",
    "operator",
    "operatorCode",
    "isCircularRoute",
    "isCancelled",
    "filterLocationCancelled",
    "serviceType",
    "length",
    "detachFront",
    "isReverseFormation",
    "cancelReason",
    "delayReason",
    "serviceID",
    "adhocAlerts"
})
@XmlSeeAlso({
    com.thalesgroup.rtti._2016_02_16.ldb.types.BaseServiceItem.class,
    ServiceItem.class
})
public class BaseServiceItem {

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
    @XmlElement(defaultValue = "false")
    protected Boolean isCancelled;
    @XmlElement(defaultValue = "false")
    protected Boolean filterLocationCancelled;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    @XmlElement(defaultValue = "0")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer length;
    @XmlElement(defaultValue = "false")
    protected Boolean detachFront;
    @XmlElement(defaultValue = "false")
    protected Boolean isReverseFormation;
    protected String cancelReason;
    protected String delayReason;
    @XmlElement(required = true)
    protected String serviceID;
    protected ArrayOfAdhocAlert adhocAlerts;

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
     * Gets the value of the isCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelled() {
        return isCancelled;
    }

    /**
     * Sets the value of the isCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelled(Boolean value) {
        this.isCancelled = value;
    }

    /**
     * Gets the value of the filterLocationCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterLocationCancelled() {
        return filterLocationCancelled;
    }

    /**
     * Sets the value of the filterLocationCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterLocationCancelled(Boolean value) {
        this.filterLocationCancelled = value;
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
        return serviceType;
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
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the detachFront property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetachFront() {
        return detachFront;
    }

    /**
     * Sets the value of the detachFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetachFront(Boolean value) {
        this.detachFront = value;
    }

    /**
     * Gets the value of the isReverseFormation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReverseFormation() {
        return isReverseFormation;
    }

    /**
     * Sets the value of the isReverseFormation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReverseFormation(Boolean value) {
        this.isReverseFormation = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the delayReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayReason() {
        return delayReason;
    }

    /**
     * Sets the value of the delayReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayReason(String value) {
        this.delayReason = value;
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
