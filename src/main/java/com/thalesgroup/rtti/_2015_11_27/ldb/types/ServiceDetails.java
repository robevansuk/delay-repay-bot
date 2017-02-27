
package com.thalesgroup.rtti._2015_11_27.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.ServiceType;
import com.thalesgroup.rtti._2012_01_13.ldb.types.ArrayOfAdhocAlert;


/**
 * A structure containing details of an individual service obtained from a departure board.
 * 
 * <p>Java class for ServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="serviceType" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}ServiceType"/>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="operator" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCName"/>
 *         &lt;element name="operatorCode" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode"/>
 *         &lt;element name="isCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delayReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overdueMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TrainLength" minOccurs="0"/>
 *         &lt;element name="detachFront" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isReverseFormation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}PlatformType" minOccurs="0"/>
 *         &lt;element name="sta" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="eta" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="ata" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="std" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="etd" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="atd" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/commontypes}TimeType" minOccurs="0"/>
 *         &lt;element name="adhocAlerts" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ArrayOfAdhocAlert" minOccurs="0"/>
 *         &lt;element name="previousCallingPoints" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}ArrayOfArrayOfCallingPoints" minOccurs="0"/>
 *         &lt;element name="subsequentCallingPoints" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}ArrayOfArrayOfCallingPoints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDetails", propOrder = {
    "generatedAt",
    "serviceType",
    "locationName",
    "crs",
    "operator",
    "operatorCode",
    "isCancelled",
    "cancelReason",
    "delayReason",
    "overdueMessage",
    "length",
    "detachFront",
    "isReverseFormation",
    "platform",
    "sta",
    "eta",
    "ata",
    "std",
    "etd",
    "atd",
    "adhocAlerts",
    "previousCallingPoints",
    "subsequentCallingPoints"
})
@XmlSeeAlso({
    com.thalesgroup.rtti._2016_02_16.ldb.types.ServiceDetails.class
})
public class ServiceDetails {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedAt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    @XmlElement(required = true)
    protected String locationName;
    @XmlElement(required = true)
    protected String crs;
    @XmlElement(required = true)
    protected String operator;
    @XmlElement(required = true)
    protected String operatorCode;
    @XmlElement(defaultValue = "false")
    protected Boolean isCancelled;
    protected String cancelReason;
    protected String delayReason;
    protected String overdueMessage;
    @XmlElement(defaultValue = "0")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer length;
    @XmlElement(defaultValue = "false")
    protected Boolean detachFront;
    @XmlElement(defaultValue = "false")
    protected Boolean isReverseFormation;
    protected String platform;
    protected String sta;
    protected String eta;
    protected String ata;
    protected String std;
    protected String etd;
    protected String atd;
    protected ArrayOfAdhocAlert adhocAlerts;
    protected ArrayOfArrayOfCallingPoints previousCallingPoints;
    protected ArrayOfArrayOfCallingPoints subsequentCallingPoints;

    /**
     * Gets the value of the generatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Sets the value of the generatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneratedAt(XMLGregorianCalendar value) {
        this.generatedAt = value;
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
     * Gets the value of the overdueMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueMessage() {
        return overdueMessage;
    }

    /**
     * Sets the value of the overdueMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueMessage(String value) {
        this.overdueMessage = value;
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
     * Gets the value of the ata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAta() {
        return ata;
    }

    /**
     * Sets the value of the ata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAta(String value) {
        this.ata = value;
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
     * Gets the value of the atd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtd() {
        return atd;
    }

    /**
     * Sets the value of the atd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtd(String value) {
        this.atd = value;
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

    /**
     * Gets the value of the previousCallingPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfCallingPoints }
     *     
     */
    public ArrayOfArrayOfCallingPoints getPreviousCallingPoints() {
        return previousCallingPoints;
    }

    /**
     * Sets the value of the previousCallingPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfCallingPoints }
     *     
     */
    public void setPreviousCallingPoints(ArrayOfArrayOfCallingPoints value) {
        this.previousCallingPoints = value;
    }

    /**
     * Gets the value of the subsequentCallingPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfCallingPoints }
     *     
     */
    public ArrayOfArrayOfCallingPoints getSubsequentCallingPoints() {
        return subsequentCallingPoints;
    }

    /**
     * Sets the value of the subsequentCallingPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfCallingPoints }
     *     
     */
    public void setSubsequentCallingPoints(ArrayOfArrayOfCallingPoints value) {
        this.subsequentCallingPoints = value;
    }

}
