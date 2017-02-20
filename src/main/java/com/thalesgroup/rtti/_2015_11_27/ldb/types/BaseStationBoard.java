
package com.thalesgroup.rtti._2015_11_27.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;
import com.thalesgroup.rtti._2012_01_13.ldb.types.ArrayOfNRCCMessages;


/**
 * A structure containing details of a departure board for a specific location.
 * 
 * <p>Java class for BaseStationBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseStationBoard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="filterLocationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType" minOccurs="0"/>
 *         &lt;element name="filtercrs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="filterType" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}FilterType" minOccurs="0"/>
 *         &lt;element name="nrccMessages" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ArrayOfNRCCMessages" minOccurs="0"/>
 *         &lt;element name="platformAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="areServicesAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseStationBoard", propOrder = {
    "generatedAt",
    "locationName",
    "crs",
    "filterLocationName",
    "filtercrs",
    "filterType",
    "nrccMessages",
    "platformAvailable",
    "areServicesAvailable"
})
@XmlSeeAlso({
    com.thalesgroup.rtti._2016_02_16.ldb.types.DeparturesBoardWithDetails.class,
    com.thalesgroup.rtti._2016_02_16.ldb.types.StationBoardWithDetails.class,
    com.thalesgroup.rtti._2016_02_16.ldb.types.DeparturesBoard.class,
    com.thalesgroup.rtti._2016_02_16.ldb.types.StationBoard.class,
    com.thalesgroup.rtti._2015_11_27.ldb.types.DeparturesBoardWithDetails.class,
    com.thalesgroup.rtti._2015_11_27.ldb.types.StationBoardWithDetails.class,
    com.thalesgroup.rtti._2015_11_27.ldb.types.DeparturesBoard.class,
    com.thalesgroup.rtti._2015_11_27.ldb.types.StationBoard.class
})
public class BaseStationBoard {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedAt;
    @XmlElement(required = true)
    protected String locationName;
    @XmlElement(required = true)
    protected String crs;
    protected String filterLocationName;
    protected String filtercrs;
    @XmlElement(defaultValue = "to")
    @XmlSchemaType(name = "string")
    protected FilterType filterType;
    protected ArrayOfNRCCMessages nrccMessages;
    @XmlElement(defaultValue = "false")
    protected Boolean platformAvailable;
    @XmlElement(defaultValue = "true")
    protected Boolean areServicesAvailable;

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
     * Gets the value of the filterLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterLocationName() {
        return filterLocationName;
    }

    /**
     * Sets the value of the filterLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterLocationName(String value) {
        this.filterLocationName = value;
    }

    /**
     * Gets the value of the filtercrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltercrs() {
        return filtercrs;
    }

    /**
     * Sets the value of the filtercrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltercrs(String value) {
        this.filtercrs = value;
    }

    /**
     * Gets the value of the filterType property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilterType() {
        return filterType;
    }

    /**
     * Sets the value of the filterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilterType(FilterType value) {
        this.filterType = value;
    }

    /**
     * Gets the value of the nrccMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNRCCMessages }
     *     
     */
    public ArrayOfNRCCMessages getNrccMessages() {
        return nrccMessages;
    }

    /**
     * Sets the value of the nrccMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNRCCMessages }
     *     
     */
    public void setNrccMessages(ArrayOfNRCCMessages value) {
        this.nrccMessages = value;
    }

    /**
     * Gets the value of the platformAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatformAvailable() {
        return platformAvailable;
    }

    /**
     * Sets the value of the platformAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatformAvailable(Boolean value) {
        this.platformAvailable = value;
    }

    /**
     * Gets the value of the areServicesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreServicesAvailable() {
        return areServicesAvailable;
    }

    /**
     * Sets the value of the areServicesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreServicesAvailable(Boolean value) {
        this.areServicesAvailable = value;
    }

}
