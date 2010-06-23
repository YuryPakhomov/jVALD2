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
 * <p>Java class for MethodCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MethodCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="experiment"/>
 *     &lt;enumeration value="theory"/>
 *     &lt;enumeration value="recommended"/>
 *     &lt;enumeration value="evaluated"/>
 *     &lt;enumeration value="empirical"/>
 *     &lt;enumeration value="scalingLaw"/>
 *     &lt;enumeration value="semiempirical"/>
 *     &lt;enumeration value="compilation"/>
 *     &lt;enumeration value="derived"/>
 *     &lt;enumeration value="observed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MethodCategoryType")
@XmlEnum
public enum MethodCategoryType {

    @XmlEnumValue("experiment")
    EXPERIMENT("experiment"),
    @XmlEnumValue("theory")
    THEORY("theory"),
    @XmlEnumValue("recommended")
    RECOMMENDED("recommended"),
    @XmlEnumValue("evaluated")
    EVALUATED("evaluated"),
    @XmlEnumValue("empirical")
    EMPIRICAL("empirical"),
    @XmlEnumValue("scalingLaw")
    SCALING_LAW("scalingLaw"),
    @XmlEnumValue("semiempirical")
    SEMIEMPIRICAL("semiempirical"),
    @XmlEnumValue("compilation")
    COMPILATION("compilation"),
    @XmlEnumValue("derived")
    DERIVED("derived"),
    @XmlEnumValue("observed")
    OBSERVED("observed");
    private final String value;

    MethodCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MethodCategoryType fromValue(String v) {
        for (MethodCategoryType c: MethodCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
