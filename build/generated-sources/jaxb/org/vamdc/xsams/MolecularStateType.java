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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MolecularStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MolecularStateType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrimaryType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MolecularStateCharacterisation" type="{}MolecularStateCharacterisationType" minOccurs="0"/>
 *         &lt;element name="TotalSpinMomentumS" type="{}MolecularQuantumNumberType" minOccurs="0"/>
 *         &lt;element name="TotalMagneticQuantumNumberS" type="{}MagneticQuantumNumberType" minOccurs="0"/>
 *         &lt;element name="Parity" type="{}ParityType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElectronicHome" type="{}ElectronicHomeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}stateID"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MolecularStateType", propOrder = {
    "description",
    "molecularStateCharacterisation",
    "totalSpinMomentumS",
    "totalMagneticQuantumNumberS",
    "parity",
    "comment",
    "electronicHome"
})
public class MolecularStateType
    extends PrimaryType
{

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "MolecularStateCharacterisation")
    protected MolecularStateCharacterisationType molecularStateCharacterisation;
    @XmlElement(name = "TotalSpinMomentumS")
    protected MolecularQuantumNumberType totalSpinMomentumS;
    @XmlElement(name = "TotalMagneticQuantumNumberS")
    protected MagneticQuantumNumberType totalMagneticQuantumNumberS;
    @XmlElement(name = "Parity")
    protected ParityType parity;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ElectronicHome")
    protected ElectronicHomeType electronicHome;
    @XmlAttribute(name = "stateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String stateID;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the molecularStateCharacterisation property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularStateCharacterisationType }
     *     
     */
    public MolecularStateCharacterisationType getMolecularStateCharacterisation() {
        return molecularStateCharacterisation;
    }

    /**
     * Sets the value of the molecularStateCharacterisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularStateCharacterisationType }
     *     
     */
    public void setMolecularStateCharacterisation(MolecularStateCharacterisationType value) {
        this.molecularStateCharacterisation = value;
    }

    /**
     * Gets the value of the totalSpinMomentumS property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public MolecularQuantumNumberType getTotalSpinMomentumS() {
        return totalSpinMomentumS;
    }

    /**
     * Sets the value of the totalSpinMomentumS property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public void setTotalSpinMomentumS(MolecularQuantumNumberType value) {
        this.totalSpinMomentumS = value;
    }

    /**
     * Gets the value of the totalMagneticQuantumNumberS property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public MagneticQuantumNumberType getTotalMagneticQuantumNumberS() {
        return totalMagneticQuantumNumberS;
    }

    /**
     * Sets the value of the totalMagneticQuantumNumberS property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public void setTotalMagneticQuantumNumberS(MagneticQuantumNumberType value) {
        this.totalMagneticQuantumNumberS = value;
    }

    /**
     * Gets the value of the parity property.
     * 
     * @return
     *     possible object is
     *     {@link ParityType }
     *     
     */
    public ParityType getParity() {
        return parity;
    }

    /**
     * Sets the value of the parity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParityType }
     *     
     */
    public void setParity(ParityType value) {
        this.parity = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the electronicHome property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicHomeType }
     *     
     */
    public ElectronicHomeType getElectronicHome() {
        return electronicHome;
    }

    /**
     * Sets the value of the electronicHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicHomeType }
     *     
     */
    public void setElectronicHome(ElectronicHomeType value) {
        this.electronicHome = value;
    }

    /**
     * Gets the value of the stateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateID() {
        return stateID;
    }

    /**
     * Sets the value of the stateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateID(String value) {
        this.stateID = value;
    }

}
