//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.03 at 06:38:41 PM GMT+05:30 
//


package com.ultracash.upi.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


/**
 * <p>Java class for infoType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="infoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identity" type="{http://npci.org/upi/schema/}identityType"/>
 *         &lt;element name="Rating" type="{http://npci.org/upi/schema/}ratingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoType", propOrder = {
        "identity",
        "rating"
})
public class InfoType {

    @XmlElement(name = "Identity", required = true)
    protected IdentityType identity;
    @XmlElement(name = "Rating")
    protected RatingType rating;

    /**
     * Gets the value of the identity property.
     *
     * @return possible object is
     * {@link IdentityType }
     */
    public IdentityType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     *
     * @param value allowed object is
     *              {@link IdentityType }
     */
    public void setIdentity(IdentityType value) {
        this.identity = value;
    }

    /**
     * Gets the value of the rating property.
     *
     * @return possible object is
     * {@link RatingType }
     */
    public RatingType getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     *
     * @param value allowed object is
     *              {@link RatingType }
     */
    public void setRating(RatingType value) {
        this.rating = value;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}