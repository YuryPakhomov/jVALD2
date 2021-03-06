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
 * <p>Java class for CategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="book"/>
 *     &lt;enumeration value="database"/>
 *     &lt;enumeration value="journal"/>
 *     &lt;enumeration value="preprint"/>
 *     &lt;enumeration value="private communication"/>
 *     &lt;enumeration value="proceedings"/>
 *     &lt;enumeration value="report"/>
 *     &lt;enumeration value="theses"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CategoryType")
@XmlEnum
public enum CategoryType {

    @XmlEnumValue("book")
    BOOK("book"),
    @XmlEnumValue("database")
    DATABASE("database"),
    @XmlEnumValue("journal")
    JOURNAL("journal"),
    @XmlEnumValue("preprint")
    PREPRINT("preprint"),
    @XmlEnumValue("private communication")
    PRIVATE_COMMUNICATION("private communication"),
    @XmlEnumValue("proceedings")
    PROCEEDINGS("proceedings"),
    @XmlEnumValue("report")
    REPORT("report"),
    @XmlEnumValue("theses")
    THESES("theses");
    private final String value;

    CategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryType fromValue(String v) {
        for (CategoryType c: CategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
