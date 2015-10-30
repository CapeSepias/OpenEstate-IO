
package org.openestate.io.daft_ie.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for overseasSaleAdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overseasSaleAdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="property_type" type="{}propertyType"/&gt;
 *         &lt;element name="house_type" type="{}houseType"/&gt;
 *         &lt;element name="commercial_type" type="{}commercialType"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{}positiveInteger"/&gt;
 *         &lt;element name="price_type"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="region"/&gt;
 *               &lt;enumeration value="excess"/&gt;
 *               &lt;enumeration value="from"/&gt;
 *               &lt;enumeration value="on application"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bathroom_number" type="{}positiveInteger"/&gt;
 *         &lt;element name="bedroom_number" type="{}positiveInteger"/&gt;
 *         &lt;element name="is_new_development" type="{}bool" minOccurs="0"/&gt;
 *         &lt;element name="units_available" type="{}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="new_development_availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="square_metres" type="{}positiveDecimal" minOccurs="0"/&gt;
 *         &lt;element name="acres" type="{}positiveDecimal" minOccurs="0"/&gt;
 *         &lt;element name="directions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="co2_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="energy_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viewing_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contact_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="main_email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cc_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="external_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agent_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="property_status"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="for-sale"/&gt;
 *               &lt;enumeration value="sale-agreed"/&gt;
 *               &lt;enumeration value="sold"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="photos" type="{}photosType" minOccurs="0"/&gt;
 *         &lt;element name="features" type="{}featuresType" minOccurs="0"/&gt;
 *         &lt;element name="pdfs" type="{}pdfsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overseasSaleAdType", propOrder = {
    "country",
    "region",
    "area",
    "address",
    "propertyType",
    "houseType",
    "commercialType",
    "description",
    "price",
    "priceType",
    "bathroomNumber",
    "bedroomNumber",
    "isNewDevelopment",
    "unitsAvailable",
    "newDevelopmentAvailability",
    "squareMetres",
    "acres",
    "directions",
    "co2Rating",
    "energyRating",
    "viewingDetails",
    "phone1",
    "phone2",
    "contactName",
    "phoneInfo",
    "mainEmail",
    "ccEmail",
    "externalId",
    "agentId",
    "propertyStatus",
    "photos",
    "features",
    "pdfs"
})
public class OverseasSaleAdType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected String country;
    @XmlElement(required = true)
    protected java.lang.String region;
    @XmlElement(required = true)
    protected java.lang.String area;
    @XmlElement(required = true)
    protected java.lang.String address;
    @XmlElement(name = "property_type", required = true)
    @XmlSchemaType(name = "string")
    protected PropertyType propertyType;
    @XmlElement(name = "house_type", required = true)
    @XmlSchemaType(name = "string")
    protected HouseType houseType;
    @XmlElement(name = "commercial_type", required = true)
    @XmlSchemaType(name = "string")
    protected CommercialType commercialType;
    @XmlElement(required = true)
    protected java.lang.String description;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    protected BigInteger price;
    @XmlElement(name = "price_type", required = true)
    protected OverseasSaleAdType.PriceType priceType;
    @XmlElement(name = "bathroom_number", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    protected BigInteger bathroomNumber;
    @XmlElement(name = "bedroom_number", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    protected BigInteger bedroomNumber;
    @XmlElement(name = "is_new_development", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean isNewDevelopment;
    @XmlElement(name = "units_available", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    protected BigInteger unitsAvailable;
    @XmlElement(name = "new_development_availability")
    protected java.lang.String newDevelopmentAvailability;
    @XmlElement(name = "square_metres", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal squareMetres;
    @XmlElement(type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal acres;
    protected java.lang.String directions;
    @XmlElement(name = "co2_rating")
    protected java.lang.String co2Rating;
    @XmlElement(name = "energy_rating")
    protected java.lang.String energyRating;
    @XmlElement(name = "viewing_details")
    protected java.lang.String viewingDetails;
    @XmlElement(required = true)
    protected java.lang.String phone1;
    protected java.lang.String phone2;
    @XmlElement(name = "contact_name", required = true)
    protected java.lang.String contactName;
    @XmlElement(name = "phone_info")
    protected java.lang.String phoneInfo;
    @XmlElement(name = "main_email", required = true)
    protected java.lang.String mainEmail;
    @XmlElement(name = "cc_email")
    protected java.lang.String ccEmail;
    @XmlElement(name = "external_id", required = true)
    protected java.lang.String externalId;
    @XmlElement(name = "agent_id", required = true)
    protected java.lang.String agentId;
    @XmlElement(name = "property_status", required = true)
    protected OverseasSaleAdType.PropertyStatus propertyStatus;
    protected PhotosType photos;
    protected FeaturesType features;
    protected PdfsType pdfs;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRegion(java.lang.String value) {
        this.region = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setArea(java.lang.String value) {
        this.area = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAddress(java.lang.String value) {
        this.address = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the houseType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseType }
     *     
     */
    public HouseType getHouseType() {
        return houseType;
    }

    /**
     * Sets the value of the houseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseType }
     *     
     */
    public void setHouseType(HouseType value) {
        this.houseType = value;
    }

    /**
     * Gets the value of the commercialType property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialType }
     *     
     */
    public CommercialType getCommercialType() {
        return commercialType;
    }

    /**
     * Sets the value of the commercialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialType }
     *     
     */
    public void setCommercialType(CommercialType value) {
        this.commercialType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDescription(java.lang.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public BigInteger getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPrice(BigInteger value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasSaleAdType.PriceType }
     *     
     */
    public OverseasSaleAdType.PriceType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasSaleAdType.PriceType }
     *     
     */
    public void setPriceType(OverseasSaleAdType.PriceType value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the bathroomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public BigInteger getBathroomNumber() {
        return bathroomNumber;
    }

    /**
     * Sets the value of the bathroomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBathroomNumber(BigInteger value) {
        this.bathroomNumber = value;
    }

    /**
     * Gets the value of the bedroomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public BigInteger getBedroomNumber() {
        return bedroomNumber;
    }

    /**
     * Sets the value of the bedroomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBedroomNumber(BigInteger value) {
        this.bedroomNumber = value;
    }

    /**
     * Gets the value of the isNewDevelopment property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Boolean getIsNewDevelopment() {
        return isNewDevelopment;
    }

    /**
     * Sets the value of the isNewDevelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsNewDevelopment(Boolean value) {
        this.isNewDevelopment = value;
    }

    /**
     * Gets the value of the unitsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public BigInteger getUnitsAvailable() {
        return unitsAvailable;
    }

    /**
     * Sets the value of the unitsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUnitsAvailable(BigInteger value) {
        this.unitsAvailable = value;
    }

    /**
     * Gets the value of the newDevelopmentAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNewDevelopmentAvailability() {
        return newDevelopmentAvailability;
    }

    /**
     * Sets the value of the newDevelopmentAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNewDevelopmentAvailability(java.lang.String value) {
        this.newDevelopmentAvailability = value;
    }

    /**
     * Gets the value of the squareMetres property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public BigDecimal getSquareMetres() {
        return squareMetres;
    }

    /**
     * Sets the value of the squareMetres property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSquareMetres(BigDecimal value) {
        this.squareMetres = value;
    }

    /**
     * Gets the value of the acres property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public BigDecimal getAcres() {
        return acres;
    }

    /**
     * Sets the value of the acres property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAcres(BigDecimal value) {
        this.acres = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDirections(java.lang.String value) {
        this.directions = value;
    }

    /**
     * Gets the value of the co2Rating property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCo2Rating() {
        return co2Rating;
    }

    /**
     * Sets the value of the co2Rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCo2Rating(java.lang.String value) {
        this.co2Rating = value;
    }

    /**
     * Gets the value of the energyRating property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEnergyRating() {
        return energyRating;
    }

    /**
     * Sets the value of the energyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEnergyRating(java.lang.String value) {
        this.energyRating = value;
    }

    /**
     * Gets the value of the viewingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getViewingDetails() {
        return viewingDetails;
    }

    /**
     * Sets the value of the viewingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setViewingDetails(java.lang.String value) {
        this.viewingDetails = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPhone1(java.lang.String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPhone2(java.lang.String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContactName(java.lang.String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the phoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPhoneInfo() {
        return phoneInfo;
    }

    /**
     * Sets the value of the phoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPhoneInfo(java.lang.String value) {
        this.phoneInfo = value;
    }

    /**
     * Gets the value of the mainEmail property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMainEmail() {
        return mainEmail;
    }

    /**
     * Sets the value of the mainEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMainEmail(java.lang.String value) {
        this.mainEmail = value;
    }

    /**
     * Gets the value of the ccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCcEmail() {
        return ccEmail;
    }

    /**
     * Sets the value of the ccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCcEmail(java.lang.String value) {
        this.ccEmail = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setExternalId(java.lang.String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAgentId(java.lang.String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the propertyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasSaleAdType.PropertyStatus }
     *     
     */
    public OverseasSaleAdType.PropertyStatus getPropertyStatus() {
        return propertyStatus;
    }

    /**
     * Sets the value of the propertyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasSaleAdType.PropertyStatus }
     *     
     */
    public void setPropertyStatus(OverseasSaleAdType.PropertyStatus value) {
        this.propertyStatus = value;
    }

    /**
     * Gets the value of the photos property.
     * 
     * @return
     *     possible object is
     *     {@link PhotosType }
     *     
     */
    public PhotosType getPhotos() {
        return photos;
    }

    /**
     * Sets the value of the photos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotosType }
     *     
     */
    public void setPhotos(PhotosType value) {
        this.photos = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesType }
     *     
     */
    public FeaturesType getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesType }
     *     
     */
    public void setFeatures(FeaturesType value) {
        this.features = value;
    }

    /**
     * Gets the value of the pdfs property.
     * 
     * @return
     *     possible object is
     *     {@link PdfsType }
     *     
     */
    public PdfsType getPdfs() {
        return pdfs;
    }

    /**
     * Sets the value of the pdfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfsType }
     *     
     */
    public void setPdfs(PdfsType value) {
        this.pdfs = value;
    }

    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry);
        }
        {
            java.lang.String theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion);
        }
        {
            java.lang.String theArea;
            theArea = this.getArea();
            strategy.appendField(locator, this, "area", buffer, theArea);
        }
        {
            java.lang.String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            PropertyType thePropertyType;
            thePropertyType = this.getPropertyType();
            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType);
        }
        {
            HouseType theHouseType;
            theHouseType = this.getHouseType();
            strategy.appendField(locator, this, "houseType", buffer, theHouseType);
        }
        {
            CommercialType theCommercialType;
            theCommercialType = this.getCommercialType();
            strategy.appendField(locator, this, "commercialType", buffer, theCommercialType);
        }
        {
            java.lang.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            BigInteger thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            OverseasSaleAdType.PriceType thePriceType;
            thePriceType = this.getPriceType();
            strategy.appendField(locator, this, "priceType", buffer, thePriceType);
        }
        {
            BigInteger theBathroomNumber;
            theBathroomNumber = this.getBathroomNumber();
            strategy.appendField(locator, this, "bathroomNumber", buffer, theBathroomNumber);
        }
        {
            BigInteger theBedroomNumber;
            theBedroomNumber = this.getBedroomNumber();
            strategy.appendField(locator, this, "bedroomNumber", buffer, theBedroomNumber);
        }
        {
            Boolean theIsNewDevelopment;
            theIsNewDevelopment = this.getIsNewDevelopment();
            strategy.appendField(locator, this, "isNewDevelopment", buffer, theIsNewDevelopment);
        }
        {
            BigInteger theUnitsAvailable;
            theUnitsAvailable = this.getUnitsAvailable();
            strategy.appendField(locator, this, "unitsAvailable", buffer, theUnitsAvailable);
        }
        {
            java.lang.String theNewDevelopmentAvailability;
            theNewDevelopmentAvailability = this.getNewDevelopmentAvailability();
            strategy.appendField(locator, this, "newDevelopmentAvailability", buffer, theNewDevelopmentAvailability);
        }
        {
            BigDecimal theSquareMetres;
            theSquareMetres = this.getSquareMetres();
            strategy.appendField(locator, this, "squareMetres", buffer, theSquareMetres);
        }
        {
            BigDecimal theAcres;
            theAcres = this.getAcres();
            strategy.appendField(locator, this, "acres", buffer, theAcres);
        }
        {
            java.lang.String theDirections;
            theDirections = this.getDirections();
            strategy.appendField(locator, this, "directions", buffer, theDirections);
        }
        {
            java.lang.String theCo2Rating;
            theCo2Rating = this.getCo2Rating();
            strategy.appendField(locator, this, "co2Rating", buffer, theCo2Rating);
        }
        {
            java.lang.String theEnergyRating;
            theEnergyRating = this.getEnergyRating();
            strategy.appendField(locator, this, "energyRating", buffer, theEnergyRating);
        }
        {
            java.lang.String theViewingDetails;
            theViewingDetails = this.getViewingDetails();
            strategy.appendField(locator, this, "viewingDetails", buffer, theViewingDetails);
        }
        {
            java.lang.String thePhone1;
            thePhone1 = this.getPhone1();
            strategy.appendField(locator, this, "phone1", buffer, thePhone1);
        }
        {
            java.lang.String thePhone2;
            thePhone2 = this.getPhone2();
            strategy.appendField(locator, this, "phone2", buffer, thePhone2);
        }
        {
            java.lang.String theContactName;
            theContactName = this.getContactName();
            strategy.appendField(locator, this, "contactName", buffer, theContactName);
        }
        {
            java.lang.String thePhoneInfo;
            thePhoneInfo = this.getPhoneInfo();
            strategy.appendField(locator, this, "phoneInfo", buffer, thePhoneInfo);
        }
        {
            java.lang.String theMainEmail;
            theMainEmail = this.getMainEmail();
            strategy.appendField(locator, this, "mainEmail", buffer, theMainEmail);
        }
        {
            java.lang.String theCcEmail;
            theCcEmail = this.getCcEmail();
            strategy.appendField(locator, this, "ccEmail", buffer, theCcEmail);
        }
        {
            java.lang.String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId);
        }
        {
            java.lang.String theAgentId;
            theAgentId = this.getAgentId();
            strategy.appendField(locator, this, "agentId", buffer, theAgentId);
        }
        {
            OverseasSaleAdType.PropertyStatus thePropertyStatus;
            thePropertyStatus = this.getPropertyStatus();
            strategy.appendField(locator, this, "propertyStatus", buffer, thePropertyStatus);
        }
        {
            PhotosType thePhotos;
            thePhotos = this.getPhotos();
            strategy.appendField(locator, this, "photos", buffer, thePhotos);
        }
        {
            FeaturesType theFeatures;
            theFeatures = this.getFeatures();
            strategy.appendField(locator, this, "features", buffer, theFeatures);
        }
        {
            PdfsType thePdfs;
            thePdfs = this.getPdfs();
            strategy.appendField(locator, this, "pdfs", buffer, thePdfs);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof OverseasSaleAdType) {
            final OverseasSaleAdType copy = ((OverseasSaleAdType) draftCopy);
            if (this.country!= null) {
                String sourceCountry;
                sourceCountry = this.getCountry();
                String copyCountry = ((String) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry));
                copy.setCountry(copyCountry);
            } else {
                copy.country = null;
            }
            if (this.region!= null) {
                java.lang.String sourceRegion;
                sourceRegion = this.getRegion();
                java.lang.String copyRegion = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion));
                copy.setRegion(copyRegion);
            } else {
                copy.region = null;
            }
            if (this.area!= null) {
                java.lang.String sourceArea;
                sourceArea = this.getArea();
                java.lang.String copyArea = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "area", sourceArea), sourceArea));
                copy.setArea(copyArea);
            } else {
                copy.area = null;
            }
            if (this.address!= null) {
                java.lang.String sourceAddress;
                sourceAddress = this.getAddress();
                java.lang.String copyAddress = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
            if (this.propertyType!= null) {
                PropertyType sourcePropertyType;
                sourcePropertyType = this.getPropertyType();
                PropertyType copyPropertyType = ((PropertyType) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType));
                copy.setPropertyType(copyPropertyType);
            } else {
                copy.propertyType = null;
            }
            if (this.houseType!= null) {
                HouseType sourceHouseType;
                sourceHouseType = this.getHouseType();
                HouseType copyHouseType = ((HouseType) strategy.copy(LocatorUtils.property(locator, "houseType", sourceHouseType), sourceHouseType));
                copy.setHouseType(copyHouseType);
            } else {
                copy.houseType = null;
            }
            if (this.commercialType!= null) {
                CommercialType sourceCommercialType;
                sourceCommercialType = this.getCommercialType();
                CommercialType copyCommercialType = ((CommercialType) strategy.copy(LocatorUtils.property(locator, "commercialType", sourceCommercialType), sourceCommercialType));
                copy.setCommercialType(copyCommercialType);
            } else {
                copy.commercialType = null;
            }
            if (this.description!= null) {
                java.lang.String sourceDescription;
                sourceDescription = this.getDescription();
                java.lang.String copyDescription = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                copy.setDescription(copyDescription);
            } else {
                copy.description = null;
            }
            if (this.price!= null) {
                BigInteger sourcePrice;
                sourcePrice = this.getPrice();
                BigInteger copyPrice = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.priceType!= null) {
                OverseasSaleAdType.PriceType sourcePriceType;
                sourcePriceType = this.getPriceType();
                OverseasSaleAdType.PriceType copyPriceType = ((OverseasSaleAdType.PriceType) strategy.copy(LocatorUtils.property(locator, "priceType", sourcePriceType), sourcePriceType));
                copy.setPriceType(copyPriceType);
            } else {
                copy.priceType = null;
            }
            if (this.bathroomNumber!= null) {
                BigInteger sourceBathroomNumber;
                sourceBathroomNumber = this.getBathroomNumber();
                BigInteger copyBathroomNumber = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bathroomNumber", sourceBathroomNumber), sourceBathroomNumber));
                copy.setBathroomNumber(copyBathroomNumber);
            } else {
                copy.bathroomNumber = null;
            }
            if (this.bedroomNumber!= null) {
                BigInteger sourceBedroomNumber;
                sourceBedroomNumber = this.getBedroomNumber();
                BigInteger copyBedroomNumber = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bedroomNumber", sourceBedroomNumber), sourceBedroomNumber));
                copy.setBedroomNumber(copyBedroomNumber);
            } else {
                copy.bedroomNumber = null;
            }
            if (this.isNewDevelopment!= null) {
                Boolean sourceIsNewDevelopment;
                sourceIsNewDevelopment = this.getIsNewDevelopment();
                Boolean copyIsNewDevelopment = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isNewDevelopment", sourceIsNewDevelopment), sourceIsNewDevelopment));
                copy.setIsNewDevelopment(copyIsNewDevelopment);
            } else {
                copy.isNewDevelopment = null;
            }
            if (this.unitsAvailable!= null) {
                BigInteger sourceUnitsAvailable;
                sourceUnitsAvailable = this.getUnitsAvailable();
                BigInteger copyUnitsAvailable = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "unitsAvailable", sourceUnitsAvailable), sourceUnitsAvailable));
                copy.setUnitsAvailable(copyUnitsAvailable);
            } else {
                copy.unitsAvailable = null;
            }
            if (this.newDevelopmentAvailability!= null) {
                java.lang.String sourceNewDevelopmentAvailability;
                sourceNewDevelopmentAvailability = this.getNewDevelopmentAvailability();
                java.lang.String copyNewDevelopmentAvailability = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "newDevelopmentAvailability", sourceNewDevelopmentAvailability), sourceNewDevelopmentAvailability));
                copy.setNewDevelopmentAvailability(copyNewDevelopmentAvailability);
            } else {
                copy.newDevelopmentAvailability = null;
            }
            if (this.squareMetres!= null) {
                BigDecimal sourceSquareMetres;
                sourceSquareMetres = this.getSquareMetres();
                BigDecimal copySquareMetres = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "squareMetres", sourceSquareMetres), sourceSquareMetres));
                copy.setSquareMetres(copySquareMetres);
            } else {
                copy.squareMetres = null;
            }
            if (this.acres!= null) {
                BigDecimal sourceAcres;
                sourceAcres = this.getAcres();
                BigDecimal copyAcres = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "acres", sourceAcres), sourceAcres));
                copy.setAcres(copyAcres);
            } else {
                copy.acres = null;
            }
            if (this.directions!= null) {
                java.lang.String sourceDirections;
                sourceDirections = this.getDirections();
                java.lang.String copyDirections = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "directions", sourceDirections), sourceDirections));
                copy.setDirections(copyDirections);
            } else {
                copy.directions = null;
            }
            if (this.co2Rating!= null) {
                java.lang.String sourceCo2Rating;
                sourceCo2Rating = this.getCo2Rating();
                java.lang.String copyCo2Rating = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "co2Rating", sourceCo2Rating), sourceCo2Rating));
                copy.setCo2Rating(copyCo2Rating);
            } else {
                copy.co2Rating = null;
            }
            if (this.energyRating!= null) {
                java.lang.String sourceEnergyRating;
                sourceEnergyRating = this.getEnergyRating();
                java.lang.String copyEnergyRating = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "energyRating", sourceEnergyRating), sourceEnergyRating));
                copy.setEnergyRating(copyEnergyRating);
            } else {
                copy.energyRating = null;
            }
            if (this.viewingDetails!= null) {
                java.lang.String sourceViewingDetails;
                sourceViewingDetails = this.getViewingDetails();
                java.lang.String copyViewingDetails = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "viewingDetails", sourceViewingDetails), sourceViewingDetails));
                copy.setViewingDetails(copyViewingDetails);
            } else {
                copy.viewingDetails = null;
            }
            if (this.phone1 != null) {
                java.lang.String sourcePhone1;
                sourcePhone1 = this.getPhone1();
                java.lang.String copyPhone1 = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phone1", sourcePhone1), sourcePhone1));
                copy.setPhone1(copyPhone1);
            } else {
                copy.phone1 = null;
            }
            if (this.phone2 != null) {
                java.lang.String sourcePhone2;
                sourcePhone2 = this.getPhone2();
                java.lang.String copyPhone2 = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phone2", sourcePhone2), sourcePhone2));
                copy.setPhone2(copyPhone2);
            } else {
                copy.phone2 = null;
            }
            if (this.contactName!= null) {
                java.lang.String sourceContactName;
                sourceContactName = this.getContactName();
                java.lang.String copyContactName = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "contactName", sourceContactName), sourceContactName));
                copy.setContactName(copyContactName);
            } else {
                copy.contactName = null;
            }
            if (this.phoneInfo!= null) {
                java.lang.String sourcePhoneInfo;
                sourcePhoneInfo = this.getPhoneInfo();
                java.lang.String copyPhoneInfo = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phoneInfo", sourcePhoneInfo), sourcePhoneInfo));
                copy.setPhoneInfo(copyPhoneInfo);
            } else {
                copy.phoneInfo = null;
            }
            if (this.mainEmail!= null) {
                java.lang.String sourceMainEmail;
                sourceMainEmail = this.getMainEmail();
                java.lang.String copyMainEmail = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "mainEmail", sourceMainEmail), sourceMainEmail));
                copy.setMainEmail(copyMainEmail);
            } else {
                copy.mainEmail = null;
            }
            if (this.ccEmail!= null) {
                java.lang.String sourceCcEmail;
                sourceCcEmail = this.getCcEmail();
                java.lang.String copyCcEmail = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "ccEmail", sourceCcEmail), sourceCcEmail));
                copy.setCcEmail(copyCcEmail);
            } else {
                copy.ccEmail = null;
            }
            if (this.externalId!= null) {
                java.lang.String sourceExternalId;
                sourceExternalId = this.getExternalId();
                java.lang.String copyExternalId = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId));
                copy.setExternalId(copyExternalId);
            } else {
                copy.externalId = null;
            }
            if (this.agentId!= null) {
                java.lang.String sourceAgentId;
                sourceAgentId = this.getAgentId();
                java.lang.String copyAgentId = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "agentId", sourceAgentId), sourceAgentId));
                copy.setAgentId(copyAgentId);
            } else {
                copy.agentId = null;
            }
            if (this.propertyStatus!= null) {
                OverseasSaleAdType.PropertyStatus sourcePropertyStatus;
                sourcePropertyStatus = this.getPropertyStatus();
                OverseasSaleAdType.PropertyStatus copyPropertyStatus = ((OverseasSaleAdType.PropertyStatus) strategy.copy(LocatorUtils.property(locator, "propertyStatus", sourcePropertyStatus), sourcePropertyStatus));
                copy.setPropertyStatus(copyPropertyStatus);
            } else {
                copy.propertyStatus = null;
            }
            if (this.photos!= null) {
                PhotosType sourcePhotos;
                sourcePhotos = this.getPhotos();
                PhotosType copyPhotos = ((PhotosType) strategy.copy(LocatorUtils.property(locator, "photos", sourcePhotos), sourcePhotos));
                copy.setPhotos(copyPhotos);
            } else {
                copy.photos = null;
            }
            if (this.features!= null) {
                FeaturesType sourceFeatures;
                sourceFeatures = this.getFeatures();
                FeaturesType copyFeatures = ((FeaturesType) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures));
                copy.setFeatures(copyFeatures);
            } else {
                copy.features = null;
            }
            if (this.pdfs!= null) {
                PdfsType sourcePdfs;
                sourcePdfs = this.getPdfs();
                PdfsType copyPdfs = ((PdfsType) strategy.copy(LocatorUtils.property(locator, "pdfs", sourcePdfs), sourcePdfs));
                copy.setPdfs(copyPdfs);
            } else {
                copy.pdfs = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OverseasSaleAdType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OverseasSaleAdType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OverseasSaleAdType that = ((OverseasSaleAdType) object);
        {
            String lhsCountry;
            lhsCountry = this.getCountry();
            String rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry)) {
                return false;
            }
        }
        {
            java.lang.String lhsRegion;
            lhsRegion = this.getRegion();
            java.lang.String rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion)) {
                return false;
            }
        }
        {
            java.lang.String lhsArea;
            lhsArea = this.getArea();
            java.lang.String rhsArea;
            rhsArea = that.getArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "area", lhsArea), LocatorUtils.property(thatLocator, "area", rhsArea), lhsArea, rhsArea)) {
                return false;
            }
        }
        {
            java.lang.String lhsAddress;
            lhsAddress = this.getAddress();
            java.lang.String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            PropertyType lhsPropertyType;
            lhsPropertyType = this.getPropertyType();
            PropertyType rhsPropertyType;
            rhsPropertyType = that.getPropertyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType)) {
                return false;
            }
        }
        {
            HouseType lhsHouseType;
            lhsHouseType = this.getHouseType();
            HouseType rhsHouseType;
            rhsHouseType = that.getHouseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "houseType", lhsHouseType), LocatorUtils.property(thatLocator, "houseType", rhsHouseType), lhsHouseType, rhsHouseType)) {
                return false;
            }
        }
        {
            CommercialType lhsCommercialType;
            lhsCommercialType = this.getCommercialType();
            CommercialType rhsCommercialType;
            rhsCommercialType = that.getCommercialType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialType", lhsCommercialType), LocatorUtils.property(thatLocator, "commercialType", rhsCommercialType), lhsCommercialType, rhsCommercialType)) {
                return false;
            }
        }
        {
            java.lang.String lhsDescription;
            lhsDescription = this.getDescription();
            java.lang.String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            BigInteger lhsPrice;
            lhsPrice = this.getPrice();
            BigInteger rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            OverseasSaleAdType.PriceType lhsPriceType;
            lhsPriceType = this.getPriceType();
            OverseasSaleAdType.PriceType rhsPriceType;
            rhsPriceType = that.getPriceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceType", lhsPriceType), LocatorUtils.property(thatLocator, "priceType", rhsPriceType), lhsPriceType, rhsPriceType)) {
                return false;
            }
        }
        {
            BigInteger lhsBathroomNumber;
            lhsBathroomNumber = this.getBathroomNumber();
            BigInteger rhsBathroomNumber;
            rhsBathroomNumber = that.getBathroomNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathroomNumber", lhsBathroomNumber), LocatorUtils.property(thatLocator, "bathroomNumber", rhsBathroomNumber), lhsBathroomNumber, rhsBathroomNumber)) {
                return false;
            }
        }
        {
            BigInteger lhsBedroomNumber;
            lhsBedroomNumber = this.getBedroomNumber();
            BigInteger rhsBedroomNumber;
            rhsBedroomNumber = that.getBedroomNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedroomNumber", lhsBedroomNumber), LocatorUtils.property(thatLocator, "bedroomNumber", rhsBedroomNumber), lhsBedroomNumber, rhsBedroomNumber)) {
                return false;
            }
        }
        {
            Boolean lhsIsNewDevelopment;
            lhsIsNewDevelopment = this.getIsNewDevelopment();
            Boolean rhsIsNewDevelopment;
            rhsIsNewDevelopment = that.getIsNewDevelopment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isNewDevelopment", lhsIsNewDevelopment), LocatorUtils.property(thatLocator, "isNewDevelopment", rhsIsNewDevelopment), lhsIsNewDevelopment, rhsIsNewDevelopment)) {
                return false;
            }
        }
        {
            BigInteger lhsUnitsAvailable;
            lhsUnitsAvailable = this.getUnitsAvailable();
            BigInteger rhsUnitsAvailable;
            rhsUnitsAvailable = that.getUnitsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitsAvailable", lhsUnitsAvailable), LocatorUtils.property(thatLocator, "unitsAvailable", rhsUnitsAvailable), lhsUnitsAvailable, rhsUnitsAvailable)) {
                return false;
            }
        }
        {
            java.lang.String lhsNewDevelopmentAvailability;
            lhsNewDevelopmentAvailability = this.getNewDevelopmentAvailability();
            java.lang.String rhsNewDevelopmentAvailability;
            rhsNewDevelopmentAvailability = that.getNewDevelopmentAvailability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newDevelopmentAvailability", lhsNewDevelopmentAvailability), LocatorUtils.property(thatLocator, "newDevelopmentAvailability", rhsNewDevelopmentAvailability), lhsNewDevelopmentAvailability, rhsNewDevelopmentAvailability)) {
                return false;
            }
        }
        {
            BigDecimal lhsSquareMetres;
            lhsSquareMetres = this.getSquareMetres();
            BigDecimal rhsSquareMetres;
            rhsSquareMetres = that.getSquareMetres();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "squareMetres", lhsSquareMetres), LocatorUtils.property(thatLocator, "squareMetres", rhsSquareMetres), lhsSquareMetres, rhsSquareMetres)) {
                return false;
            }
        }
        {
            BigDecimal lhsAcres;
            lhsAcres = this.getAcres();
            BigDecimal rhsAcres;
            rhsAcres = that.getAcres();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acres", lhsAcres), LocatorUtils.property(thatLocator, "acres", rhsAcres), lhsAcres, rhsAcres)) {
                return false;
            }
        }
        {
            java.lang.String lhsDirections;
            lhsDirections = this.getDirections();
            java.lang.String rhsDirections;
            rhsDirections = that.getDirections();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directions", lhsDirections), LocatorUtils.property(thatLocator, "directions", rhsDirections), lhsDirections, rhsDirections)) {
                return false;
            }
        }
        {
            java.lang.String lhsCo2Rating;
            lhsCo2Rating = this.getCo2Rating();
            java.lang.String rhsCo2Rating;
            rhsCo2Rating = that.getCo2Rating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "co2Rating", lhsCo2Rating), LocatorUtils.property(thatLocator, "co2Rating", rhsCo2Rating), lhsCo2Rating, rhsCo2Rating)) {
                return false;
            }
        }
        {
            java.lang.String lhsEnergyRating;
            lhsEnergyRating = this.getEnergyRating();
            java.lang.String rhsEnergyRating;
            rhsEnergyRating = that.getEnergyRating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyRating", lhsEnergyRating), LocatorUtils.property(thatLocator, "energyRating", rhsEnergyRating), lhsEnergyRating, rhsEnergyRating)) {
                return false;
            }
        }
        {
            java.lang.String lhsViewingDetails;
            lhsViewingDetails = this.getViewingDetails();
            java.lang.String rhsViewingDetails;
            rhsViewingDetails = that.getViewingDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "viewingDetails", lhsViewingDetails), LocatorUtils.property(thatLocator, "viewingDetails", rhsViewingDetails), lhsViewingDetails, rhsViewingDetails)) {
                return false;
            }
        }
        {
            java.lang.String lhsPhone1;
            lhsPhone1 = this.getPhone1();
            java.lang.String rhsPhone1;
            rhsPhone1 = that.getPhone1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone1", lhsPhone1), LocatorUtils.property(thatLocator, "phone1", rhsPhone1), lhsPhone1, rhsPhone1)) {
                return false;
            }
        }
        {
            java.lang.String lhsPhone2;
            lhsPhone2 = this.getPhone2();
            java.lang.String rhsPhone2;
            rhsPhone2 = that.getPhone2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone2", lhsPhone2), LocatorUtils.property(thatLocator, "phone2", rhsPhone2), lhsPhone2, rhsPhone2)) {
                return false;
            }
        }
        {
            java.lang.String lhsContactName;
            lhsContactName = this.getContactName();
            java.lang.String rhsContactName;
            rhsContactName = that.getContactName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactName", lhsContactName), LocatorUtils.property(thatLocator, "contactName", rhsContactName), lhsContactName, rhsContactName)) {
                return false;
            }
        }
        {
            java.lang.String lhsPhoneInfo;
            lhsPhoneInfo = this.getPhoneInfo();
            java.lang.String rhsPhoneInfo;
            rhsPhoneInfo = that.getPhoneInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneInfo", lhsPhoneInfo), LocatorUtils.property(thatLocator, "phoneInfo", rhsPhoneInfo), lhsPhoneInfo, rhsPhoneInfo)) {
                return false;
            }
        }
        {
            java.lang.String lhsMainEmail;
            lhsMainEmail = this.getMainEmail();
            java.lang.String rhsMainEmail;
            rhsMainEmail = that.getMainEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mainEmail", lhsMainEmail), LocatorUtils.property(thatLocator, "mainEmail", rhsMainEmail), lhsMainEmail, rhsMainEmail)) {
                return false;
            }
        }
        {
            java.lang.String lhsCcEmail;
            lhsCcEmail = this.getCcEmail();
            java.lang.String rhsCcEmail;
            rhsCcEmail = that.getCcEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccEmail", lhsCcEmail), LocatorUtils.property(thatLocator, "ccEmail", rhsCcEmail), lhsCcEmail, rhsCcEmail)) {
                return false;
            }
        }
        {
            java.lang.String lhsExternalId;
            lhsExternalId = this.getExternalId();
            java.lang.String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId)) {
                return false;
            }
        }
        {
            java.lang.String lhsAgentId;
            lhsAgentId = this.getAgentId();
            java.lang.String rhsAgentId;
            rhsAgentId = that.getAgentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentId", lhsAgentId), LocatorUtils.property(thatLocator, "agentId", rhsAgentId), lhsAgentId, rhsAgentId)) {
                return false;
            }
        }
        {
            OverseasSaleAdType.PropertyStatus lhsPropertyStatus;
            lhsPropertyStatus = this.getPropertyStatus();
            OverseasSaleAdType.PropertyStatus rhsPropertyStatus;
            rhsPropertyStatus = that.getPropertyStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyStatus", lhsPropertyStatus), LocatorUtils.property(thatLocator, "propertyStatus", rhsPropertyStatus), lhsPropertyStatus, rhsPropertyStatus)) {
                return false;
            }
        }
        {
            PhotosType lhsPhotos;
            lhsPhotos = this.getPhotos();
            PhotosType rhsPhotos;
            rhsPhotos = that.getPhotos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "photos", lhsPhotos), LocatorUtils.property(thatLocator, "photos", rhsPhotos), lhsPhotos, rhsPhotos)) {
                return false;
            }
        }
        {
            FeaturesType lhsFeatures;
            lhsFeatures = this.getFeatures();
            FeaturesType rhsFeatures;
            rhsFeatures = that.getFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures)) {
                return false;
            }
        }
        {
            PdfsType lhsPdfs;
            lhsPdfs = this.getPdfs();
            PdfsType rhsPdfs;
            rhsPdfs = that.getPdfs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pdfs", lhsPdfs), LocatorUtils.property(thatLocator, "pdfs", rhsPdfs), lhsPdfs, rhsPdfs)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="region"/&gt;
     *     &lt;enumeration value="excess"/&gt;
     *     &lt;enumeration value="from"/&gt;
     *     &lt;enumeration value="on application"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum PriceType {

        @XmlEnumValue("region")
        REGION("region"),
        @XmlEnumValue("excess")
        EXCESS("excess"),
        @XmlEnumValue("from")
        FROM("from"),
        @XmlEnumValue("on application")
        ON_APPLICATION("on application");
        private final java.lang.String value;

        PriceType(java.lang.String v) {
            value = v;
        }

        public java.lang.String value() {
            return value;
        }

        public static OverseasSaleAdType.PriceType fromValue(java.lang.String v) {
            for (OverseasSaleAdType.PriceType c: OverseasSaleAdType.PriceType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="for-sale"/&gt;
     *     &lt;enumeration value="sale-agreed"/&gt;
     *     &lt;enumeration value="sold"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum PropertyStatus {

        @XmlEnumValue("for-sale")
        FOR_SALE("for-sale"),
        @XmlEnumValue("sale-agreed")
        SALE_AGREED("sale-agreed"),
        @XmlEnumValue("sold")
        SOLD("sold");
        private final java.lang.String value;

        PropertyStatus(java.lang.String v) {
            value = v;
        }

        public java.lang.String value() {
            return value;
        }

        public static OverseasSaleAdType.PropertyStatus fromValue(java.lang.String v) {
            for (OverseasSaleAdType.PropertyStatus c: OverseasSaleAdType.PropertyStatus.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
