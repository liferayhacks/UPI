//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.03 at 06:38:41 PM GMT+05:30 
//


package com.ultracash.upi.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for credDataTypeConstant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="credDataTypeConstant">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alphanumeric"/>
 *     &lt;enumeration value="Numeric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "credDataTypeConstant")
@XmlEnum
public enum CredDataTypeConstant {

    @XmlEnumValue("Alphanumeric")
    ALPHANUMERIC("Alphanumeric"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric");
    private final String value;

    CredDataTypeConstant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CredDataTypeConstant fromValue(String v) {
        for (CredDataTypeConstant c: CredDataTypeConstant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
