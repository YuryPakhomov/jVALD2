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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}sourceRef"/>
 *       &lt;attribute ref="{}methodRef"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryType", propOrder = {
    "comments"
})
@XmlSeeAlso({
    FunctionType.class,
    RadiativeTransitionType.class,
    CollisionalTransitionType.class,
    AtomType.class,
    SolidType.class,
    NonRadiativeTransitionType.class,
    MolecularStateType.class,
    DataSetType.class,
    AtomicNumericalDataType.class,
    TabulatedDataType.class,
    AtomicCompositionType.class,
    IonStateType.class,
    AtomicStateType.class,
    RoVibronicSplittingType.class,
    EnergyWavelengthType.class,
    IsotopeParametersType.class,
    SymbolType.class,
    RadiativeTransitionProbabilityType.class,
    WavelengthWavenumberType.class,
    MaterialCompositionType.class,
    MoleculeType.class,
    FitDataType.class,
    MoleculesType.class,
    DataType.class,
    AtomNType.class,
    CharacterisationType.class,
    PseudoStatisticalWeightType.class,
    NonRadiative.class,
    Solids.class,
    Atoms.class,
    Collisions.class,
    Radiative.class
})
public class PrimaryType {

    @XmlElement(name = "Comments")
    protected String comments;
    @XmlAttribute(name = "sourceRef")
    @XmlIDREF
    protected List<Object> sourceReves;
    @XmlAttribute(name = "methodRef")
    @XmlIDREF
    protected Object methodRef;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the sourceReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSourceReves() {
        if (sourceReves == null) {
            sourceReves = new ArrayList<Object>();
        }
        return this.sourceReves;
    }

    /**
     * Gets the value of the methodRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMethodRef() {
        return methodRef;
    }

    /**
     * Sets the value of the methodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMethodRef(Object value) {
        this.methodRef = value;
    }

}
