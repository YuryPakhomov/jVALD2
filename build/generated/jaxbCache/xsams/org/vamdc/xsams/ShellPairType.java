//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.19 at 05:44:29 PM MSD 
//


package org.vamdc.xsams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShellPairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShellPairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shell1" type="{}ShellType"/>
 *         &lt;element name="Shell2" type="{}ShellType"/>
 *         &lt;element name="ShellPairTerm" type="{}TermType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="shellPairID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShellPairType", propOrder = {
    "shell1",
    "shell2",
    "shellPairTerm"
})
public class ShellPairType {

    @XmlElement(name = "Shell1", required = true)
    protected ShellType shell1;
    @XmlElement(name = "Shell2", required = true)
    protected ShellType shell2;
    @XmlElement(name = "ShellPairTerm", required = true)
    protected TermType shellPairTerm;
    @XmlAttribute(name = "shellPairID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String shellPairID;

    /**
     * Gets the value of the shell1 property.
     * 
     * @return
     *     possible object is
     *     {@link ShellType }
     *     
     */
    public ShellType getShell1() {
        return shell1;
    }

    /**
     * Sets the value of the shell1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShellType }
     *     
     */
    public void setShell1(ShellType value) {
        this.shell1 = value;
    }

    /**
     * Gets the value of the shell2 property.
     * 
     * @return
     *     possible object is
     *     {@link ShellType }
     *     
     */
    public ShellType getShell2() {
        return shell2;
    }

    /**
     * Sets the value of the shell2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShellType }
     *     
     */
    public void setShell2(ShellType value) {
        this.shell2 = value;
    }

    /**
     * Gets the value of the shellPairTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getShellPairTerm() {
        return shellPairTerm;
    }

    /**
     * Sets the value of the shellPairTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setShellPairTerm(TermType value) {
        this.shellPairTerm = value;
    }

    /**
     * Gets the value of the shellPairID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShellPairID() {
        return shellPairID;
    }

    /**
     * Sets the value of the shellPairID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShellPairID(String value) {
        this.shellPairID = value;
    }

}
