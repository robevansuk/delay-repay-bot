
package com.thalesgroup.rtti._2016_02_16.ldb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2016_02_16.ldb.types.StationBoardWithDetails;


/**
 * <p>Java class for StationBoardWithDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationBoardWithDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetStationBoardResult" type="{http://thalesgroup.com/RTTI/2016-02-16/ldb/types}StationBoardWithDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationBoardWithDetailsResponseType", propOrder = {
    "getStationBoardResult"
})
public class StationBoardWithDetailsResponseType {

    @XmlElement(name = "GetStationBoardResult")
    protected StationBoardWithDetails getStationBoardResult;

    /**
     * Gets the value of the getStationBoardResult property.
     * 
     * @return
     *     possible object is
     *     {@link StationBoardWithDetails }
     *     
     */
    public StationBoardWithDetails getGetStationBoardResult() {
        return getStationBoardResult;
    }

    /**
     * Sets the value of the getStationBoardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationBoardWithDetails }
     *     
     */
    public void setGetStationBoardResult(StationBoardWithDetails value) {
        this.getStationBoardResult = value;
    }

}
