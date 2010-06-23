//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.19 at 05:44:29 PM MSD 
//


package org.vamdc.xsams;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouplingListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CouplingListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bBetaOther"/>
 *     &lt;enumeration value="bBetaJ"/>
 *     &lt;enumeration value="bBetaS"/>
 *     &lt;enumeration value="bBetaN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CouplingListType")
@XmlEnum
public enum CouplingListType {

    @XmlEnumValue("bBetaOther")
    B_BETA_OTHER("bBetaOther"),
    @XmlEnumValue("bBetaJ")
    B_BETA_J("bBetaJ"),
    @XmlEnumValue("bBetaS")
    B_BETA_S("bBetaS"),
    @XmlEnumValue("bBetaN")
    B_BETA_N("bBetaN");
    private final String value;

    CouplingListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouplingListType fromValue(String v) {
        for (CouplingListType c: CouplingListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}