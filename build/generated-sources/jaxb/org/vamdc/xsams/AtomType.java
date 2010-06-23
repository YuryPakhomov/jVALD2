//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.19 at 05:44:29 PM MSD 
//


package org.vamdc.xsams;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrimaryType">
 *       &lt;sequence>
 *         &lt;element name="ChemicalElement" type="{}ChemicalElementType"/>
 *         &lt;element name="Isotope" type="{}IsotopeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomType", propOrder = {
    "chemicalElement",
    "isotopes"
})
public class AtomType
    extends PrimaryType
{

    @XmlElement(name = "ChemicalElement", required = true)
    protected ChemicalElementType chemicalElement;
    @XmlElement(name = "Isotope", required = true)
    protected List<IsotopeType> isotopes;

    /**
     * Gets the value of the chemicalElement property.
     * 
     * @return
     *     possible object is
     *     {@link ChemicalElementType }
     *     
     */
    public ChemicalElementType getChemicalElement() {
        return chemicalElement;
    }

    /**
     * Sets the value of the chemicalElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChemicalElementType }
     *     
     */
    public void setChemicalElement(ChemicalElementType value) {
        this.chemicalElement = value;
    }

    /**
     * Gets the value of the isotopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isotopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsotopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsotopeType }
     * 
     * 
     */
    public List<IsotopeType> getIsotopes() {
        if (isotopes == null) {
            isotopes = new ArrayList<IsotopeType>();
        }
        return this.isotopes;
    }

}
