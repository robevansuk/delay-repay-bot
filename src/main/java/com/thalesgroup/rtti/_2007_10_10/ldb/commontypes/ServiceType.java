
package com.thalesgroup.rtti._2007_10_10.ldb.commontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="train"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="ferry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceType", namespace = "http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes")
@XmlEnum
public enum ServiceType {

    @XmlEnumValue("train")
    TRAIN("train"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("ferry")
    FERRY("ferry");
    private final String value;

    ServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceType fromValue(String v) {
        for (ServiceType c: ServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
