//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.24 at 06:18:05 PM CET 
//


package org.dmtf.schemas.wbem.wscim._1.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qualifierBoolean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualifierBoolean">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.dmtf.org/wbem/wscim/1/common>cimBoolean">
 *       &lt;attribute ref="{http://schemas.dmtf.org/wbem/wscim/1/common}qualifier use="required""/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualifierBoolean")
public class QualifierBoolean
    extends CimBoolean
{

    @XmlAttribute(name = "qualifier", namespace = "http://schemas.dmtf.org/wbem/wscim/1/common", required = true)
    protected boolean qualifier;

    /**
     * Gets the value of the qualifier property.
     * 
     */
    public boolean isQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     */
    public void setQualifier(boolean value) {
        this.qualifier = value;
    }

}
