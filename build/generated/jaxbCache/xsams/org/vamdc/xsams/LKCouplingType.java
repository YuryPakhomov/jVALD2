//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.19 at 05:44:29 PM MSD 
//


package org.vamdc.xsams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LKCouplingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LKCouplingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="L" type="{}OrbitalAngularMomentumType"/>
 *         &lt;element name="K" type="{}AngularMomentumType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LKCouplingType", propOrder = {

})
public class LKCouplingType {

    @XmlElement(name = "L", required = true)
    protected OrbitalAngularMomentumType l;
    @XmlElement(name = "K", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double k;

    /**
     * Gets the value of the l property.
     * 
     * @return
     *     possible object is
     *     {@link OrbitalAngularMomentumType }
     *     
     */
    public OrbitalAngularMomentumType getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrbitalAngularMomentumType }
     *     
     */
    public void setL(OrbitalAngularMomentumType value) {
        this.l = value;
    }

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setK(Double value) {
        this.k = value;
    }

}
