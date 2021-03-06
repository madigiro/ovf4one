//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.24 at 06:18:05 PM CET 
//


package org.dmtf.schemas.ovf.envelope._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * If present indicates that the virtual machine needs to be
 *                 initially booted to install and configure the software
 * 
 * <p>Java class for InstallSection_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallSection_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.dmtf.org/ovf/envelope/1}Section_Type">
 *       &lt;sequence>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="initialBootStopDelay" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" default="0" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallSection_Type", propOrder = {
    "any"
})
public class InstallSectionType
    extends SectionType
{

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "initialBootStopDelay", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer initialBootStopDelay;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the initialBootStopDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getInitialBootStopDelay() {
        if (initialBootStopDelay == null) {
            return  0;
        } else {
            return initialBootStopDelay;
        }
    }

    /**
     * Sets the value of the initialBootStopDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialBootStopDelay(Integer value) {
        this.initialBootStopDelay = value;
    }

}
