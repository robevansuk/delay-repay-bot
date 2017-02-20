
package com.thalesgroup.rtti._2007_10_10.ldb.commontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="to"/>
 *     &lt;enumeration value="from"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilterType", namespace = "http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes")
@XmlEnum
public enum FilterType {

    @XmlEnumValue("to")
    TO("to"),
    @XmlEnumValue("from")
    FROM("from");
    private final String value;

    FilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterType fromValue(String v) {
        for (FilterType c: FilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
