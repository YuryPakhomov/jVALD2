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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AtomNType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomNType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrimaryType">
 *       &lt;attribute name="nuclearSpinID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="elementSymbol" type="{}ElementSymbolType" />
 *       &lt;attribute name="isotope" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="xs:float" />
 *       &lt;attribute name="nuclearSpin" type="{}AngularMomentumType" />
 *       &lt;attribute name="hydrogenCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomNType")
public class AtomNType
    extends PrimaryType
{

    @XmlAttribute(name = "nuclearSpinID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String nuclearSpinID;
    @XmlAttribute(name = "elementSymbol")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String elementSymbol;
    @XmlAttribute(name = "isotope")
    @XmlSchemaType(name = "anySimpleType")
    protected String isotope;
    @XmlAttribute(name = "nuclearSpin")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double nuclearSpin;
    @XmlAttribute(name = "hydrogenCount")
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer hydrogenCount;
    @XmlAttribute(name = "count")
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer count;

    /**
     * Gets the value of the nuclearSpinID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuclearSpinID() {
        return nuclearSpinID;
    }

    /**
     * Sets the value of the nuclearSpinID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuclearSpinID(String value) {
        this.nuclearSpinID = value;
    }

    /**
     * Gets the value of the elementSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementSymbol() {
        return elementSymbol;
    }

    /**
     * Sets the value of the elementSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementSymbol(String value) {
        this.elementSymbol = value;
    }

    /**
     * Gets the value of the isotope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsotope() {
        if (isotope == null) {
            return "xs:float";
        } else {
            return isotope;
        }
    }

    /**
     * Sets the value of the isotope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsotope(String value) {
        this.isotope = value;
    }

    /**
     * Gets the value of the nuclearSpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNuclearSpin() {
        return nuclearSpin;
    }

    /**
     * Sets the value of the nuclearSpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuclearSpin(Double value) {
        this.nuclearSpin = value;
    }

    /**
     * Gets the value of the hydrogenCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getHydrogenCount() {
        return hydrogenCount;
    }

    /**
     * Sets the value of the hydrogenCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydrogenCount(Integer value) {
        this.hydrogenCount = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}
