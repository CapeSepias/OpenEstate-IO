
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firmenname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmenanschrift" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vertretungsberechtigter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="berufsaufsichtsbehoerde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handelsregister" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handelsregister_nr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="umsst-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="steuernummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weiteres" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firmenname",
    "firmenanschrift",
    "telefon",
    "vertretungsberechtigter",
    "berufsaufsichtsbehoerde",
    "handelsregister",
    "handelsregisterNr",
    "umsstId",
    "steuernummer",
    "weiteres"
})
@XmlRootElement(name = "impressum_strukt")
public class ImpressumStrukt
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected String firmenname;
    @XmlElement(required = true)
    protected String firmenanschrift;
    @XmlElement(required = true)
    protected String telefon;
    @XmlElement(required = true)
    protected String vertretungsberechtigter;
    @XmlElement(required = true)
    protected String berufsaufsichtsbehoerde;
    @XmlElement(required = true)
    protected String handelsregister;
    @XmlElement(name = "handelsregister_nr", required = true)
    protected String handelsregisterNr;
    @XmlElement(name = "umsst-id", required = true)
    protected String umsstId;
    @XmlElement(required = true)
    protected String steuernummer;
    @XmlElement(required = true)
    protected String weiteres;

    /**
     * Gets the value of the firmenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmenname() {
        return firmenname;
    }

    /**
     * Sets the value of the firmenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmenname(String value) {
        this.firmenname = value;
    }

    /**
     * Gets the value of the firmenanschrift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmenanschrift() {
        return firmenanschrift;
    }

    /**
     * Sets the value of the firmenanschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmenanschrift(String value) {
        this.firmenanschrift = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the vertretungsberechtigter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertretungsberechtigter() {
        return vertretungsberechtigter;
    }

    /**
     * Sets the value of the vertretungsberechtigter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertretungsberechtigter(String value) {
        this.vertretungsberechtigter = value;
    }

    /**
     * Gets the value of the berufsaufsichtsbehoerde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerufsaufsichtsbehoerde() {
        return berufsaufsichtsbehoerde;
    }

    /**
     * Sets the value of the berufsaufsichtsbehoerde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerufsaufsichtsbehoerde(String value) {
        this.berufsaufsichtsbehoerde = value;
    }

    /**
     * Gets the value of the handelsregister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandelsregister() {
        return handelsregister;
    }

    /**
     * Sets the value of the handelsregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandelsregister(String value) {
        this.handelsregister = value;
    }

    /**
     * Gets the value of the handelsregisterNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandelsregisterNr() {
        return handelsregisterNr;
    }

    /**
     * Sets the value of the handelsregisterNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandelsregisterNr(String value) {
        this.handelsregisterNr = value;
    }

    /**
     * Gets the value of the umsstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmsstId() {
        return umsstId;
    }

    /**
     * Sets the value of the umsstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmsstId(String value) {
        this.umsstId = value;
    }

    /**
     * Gets the value of the steuernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSteuernummer() {
        return steuernummer;
    }

    /**
     * Sets the value of the steuernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSteuernummer(String value) {
        this.steuernummer = value;
    }

    /**
     * Gets the value of the weiteres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeiteres() {
        return weiteres;
    }

    /**
     * Sets the value of the weiteres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeiteres(String value) {
        this.weiteres = value;
    }

    public String toString() {
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
            String theFirmenname;
            theFirmenname = this.getFirmenname();
            strategy.appendField(locator, this, "firmenname", buffer, theFirmenname);
        }
        {
            String theFirmenanschrift;
            theFirmenanschrift = this.getFirmenanschrift();
            strategy.appendField(locator, this, "firmenanschrift", buffer, theFirmenanschrift);
        }
        {
            String theTelefon;
            theTelefon = this.getTelefon();
            strategy.appendField(locator, this, "telefon", buffer, theTelefon);
        }
        {
            String theVertretungsberechtigter;
            theVertretungsberechtigter = this.getVertretungsberechtigter();
            strategy.appendField(locator, this, "vertretungsberechtigter", buffer, theVertretungsberechtigter);
        }
        {
            String theBerufsaufsichtsbehoerde;
            theBerufsaufsichtsbehoerde = this.getBerufsaufsichtsbehoerde();
            strategy.appendField(locator, this, "berufsaufsichtsbehoerde", buffer, theBerufsaufsichtsbehoerde);
        }
        {
            String theHandelsregister;
            theHandelsregister = this.getHandelsregister();
            strategy.appendField(locator, this, "handelsregister", buffer, theHandelsregister);
        }
        {
            String theHandelsregisterNr;
            theHandelsregisterNr = this.getHandelsregisterNr();
            strategy.appendField(locator, this, "handelsregisterNr", buffer, theHandelsregisterNr);
        }
        {
            String theUmsstId;
            theUmsstId = this.getUmsstId();
            strategy.appendField(locator, this, "umsstId", buffer, theUmsstId);
        }
        {
            String theSteuernummer;
            theSteuernummer = this.getSteuernummer();
            strategy.appendField(locator, this, "steuernummer", buffer, theSteuernummer);
        }
        {
            String theWeiteres;
            theWeiteres = this.getWeiteres();
            strategy.appendField(locator, this, "weiteres", buffer, theWeiteres);
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
        if (draftCopy instanceof ImpressumStrukt) {
            final ImpressumStrukt copy = ((ImpressumStrukt) draftCopy);
            if (this.firmenname!= null) {
                String sourceFirmenname;
                sourceFirmenname = this.getFirmenname();
                String copyFirmenname = ((String) strategy.copy(LocatorUtils.property(locator, "firmenname", sourceFirmenname), sourceFirmenname));
                copy.setFirmenname(copyFirmenname);
            } else {
                copy.firmenname = null;
            }
            if (this.firmenanschrift!= null) {
                String sourceFirmenanschrift;
                sourceFirmenanschrift = this.getFirmenanschrift();
                String copyFirmenanschrift = ((String) strategy.copy(LocatorUtils.property(locator, "firmenanschrift", sourceFirmenanschrift), sourceFirmenanschrift));
                copy.setFirmenanschrift(copyFirmenanschrift);
            } else {
                copy.firmenanschrift = null;
            }
            if (this.telefon!= null) {
                String sourceTelefon;
                sourceTelefon = this.getTelefon();
                String copyTelefon = ((String) strategy.copy(LocatorUtils.property(locator, "telefon", sourceTelefon), sourceTelefon));
                copy.setTelefon(copyTelefon);
            } else {
                copy.telefon = null;
            }
            if (this.vertretungsberechtigter!= null) {
                String sourceVertretungsberechtigter;
                sourceVertretungsberechtigter = this.getVertretungsberechtigter();
                String copyVertretungsberechtigter = ((String) strategy.copy(LocatorUtils.property(locator, "vertretungsberechtigter", sourceVertretungsberechtigter), sourceVertretungsberechtigter));
                copy.setVertretungsberechtigter(copyVertretungsberechtigter);
            } else {
                copy.vertretungsberechtigter = null;
            }
            if (this.berufsaufsichtsbehoerde!= null) {
                String sourceBerufsaufsichtsbehoerde;
                sourceBerufsaufsichtsbehoerde = this.getBerufsaufsichtsbehoerde();
                String copyBerufsaufsichtsbehoerde = ((String) strategy.copy(LocatorUtils.property(locator, "berufsaufsichtsbehoerde", sourceBerufsaufsichtsbehoerde), sourceBerufsaufsichtsbehoerde));
                copy.setBerufsaufsichtsbehoerde(copyBerufsaufsichtsbehoerde);
            } else {
                copy.berufsaufsichtsbehoerde = null;
            }
            if (this.handelsregister!= null) {
                String sourceHandelsregister;
                sourceHandelsregister = this.getHandelsregister();
                String copyHandelsregister = ((String) strategy.copy(LocatorUtils.property(locator, "handelsregister", sourceHandelsregister), sourceHandelsregister));
                copy.setHandelsregister(copyHandelsregister);
            } else {
                copy.handelsregister = null;
            }
            if (this.handelsregisterNr!= null) {
                String sourceHandelsregisterNr;
                sourceHandelsregisterNr = this.getHandelsregisterNr();
                String copyHandelsregisterNr = ((String) strategy.copy(LocatorUtils.property(locator, "handelsregisterNr", sourceHandelsregisterNr), sourceHandelsregisterNr));
                copy.setHandelsregisterNr(copyHandelsregisterNr);
            } else {
                copy.handelsregisterNr = null;
            }
            if (this.umsstId!= null) {
                String sourceUmsstId;
                sourceUmsstId = this.getUmsstId();
                String copyUmsstId = ((String) strategy.copy(LocatorUtils.property(locator, "umsstId", sourceUmsstId), sourceUmsstId));
                copy.setUmsstId(copyUmsstId);
            } else {
                copy.umsstId = null;
            }
            if (this.steuernummer!= null) {
                String sourceSteuernummer;
                sourceSteuernummer = this.getSteuernummer();
                String copySteuernummer = ((String) strategy.copy(LocatorUtils.property(locator, "steuernummer", sourceSteuernummer), sourceSteuernummer));
                copy.setSteuernummer(copySteuernummer);
            } else {
                copy.steuernummer = null;
            }
            if (this.weiteres!= null) {
                String sourceWeiteres;
                sourceWeiteres = this.getWeiteres();
                String copyWeiteres = ((String) strategy.copy(LocatorUtils.property(locator, "weiteres", sourceWeiteres), sourceWeiteres));
                copy.setWeiteres(copyWeiteres);
            } else {
                copy.weiteres = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImpressumStrukt();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImpressumStrukt)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ImpressumStrukt that = ((ImpressumStrukt) object);
        {
            String lhsFirmenname;
            lhsFirmenname = this.getFirmenname();
            String rhsFirmenname;
            rhsFirmenname = that.getFirmenname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firmenname", lhsFirmenname), LocatorUtils.property(thatLocator, "firmenname", rhsFirmenname), lhsFirmenname, rhsFirmenname)) {
                return false;
            }
        }
        {
            String lhsFirmenanschrift;
            lhsFirmenanschrift = this.getFirmenanschrift();
            String rhsFirmenanschrift;
            rhsFirmenanschrift = that.getFirmenanschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firmenanschrift", lhsFirmenanschrift), LocatorUtils.property(thatLocator, "firmenanschrift", rhsFirmenanschrift), lhsFirmenanschrift, rhsFirmenanschrift)) {
                return false;
            }
        }
        {
            String lhsTelefon;
            lhsTelefon = this.getTelefon();
            String rhsTelefon;
            rhsTelefon = that.getTelefon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefon", lhsTelefon), LocatorUtils.property(thatLocator, "telefon", rhsTelefon), lhsTelefon, rhsTelefon)) {
                return false;
            }
        }
        {
            String lhsVertretungsberechtigter;
            lhsVertretungsberechtigter = this.getVertretungsberechtigter();
            String rhsVertretungsberechtigter;
            rhsVertretungsberechtigter = that.getVertretungsberechtigter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertretungsberechtigter", lhsVertretungsberechtigter), LocatorUtils.property(thatLocator, "vertretungsberechtigter", rhsVertretungsberechtigter), lhsVertretungsberechtigter, rhsVertretungsberechtigter)) {
                return false;
            }
        }
        {
            String lhsBerufsaufsichtsbehoerde;
            lhsBerufsaufsichtsbehoerde = this.getBerufsaufsichtsbehoerde();
            String rhsBerufsaufsichtsbehoerde;
            rhsBerufsaufsichtsbehoerde = that.getBerufsaufsichtsbehoerde();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berufsaufsichtsbehoerde", lhsBerufsaufsichtsbehoerde), LocatorUtils.property(thatLocator, "berufsaufsichtsbehoerde", rhsBerufsaufsichtsbehoerde), lhsBerufsaufsichtsbehoerde, rhsBerufsaufsichtsbehoerde)) {
                return false;
            }
        }
        {
            String lhsHandelsregister;
            lhsHandelsregister = this.getHandelsregister();
            String rhsHandelsregister;
            rhsHandelsregister = that.getHandelsregister();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handelsregister", lhsHandelsregister), LocatorUtils.property(thatLocator, "handelsregister", rhsHandelsregister), lhsHandelsregister, rhsHandelsregister)) {
                return false;
            }
        }
        {
            String lhsHandelsregisterNr;
            lhsHandelsregisterNr = this.getHandelsregisterNr();
            String rhsHandelsregisterNr;
            rhsHandelsregisterNr = that.getHandelsregisterNr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handelsregisterNr", lhsHandelsregisterNr), LocatorUtils.property(thatLocator, "handelsregisterNr", rhsHandelsregisterNr), lhsHandelsregisterNr, rhsHandelsregisterNr)) {
                return false;
            }
        }
        {
            String lhsUmsstId;
            lhsUmsstId = this.getUmsstId();
            String rhsUmsstId;
            rhsUmsstId = that.getUmsstId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umsstId", lhsUmsstId), LocatorUtils.property(thatLocator, "umsstId", rhsUmsstId), lhsUmsstId, rhsUmsstId)) {
                return false;
            }
        }
        {
            String lhsSteuernummer;
            lhsSteuernummer = this.getSteuernummer();
            String rhsSteuernummer;
            rhsSteuernummer = that.getSteuernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steuernummer", lhsSteuernummer), LocatorUtils.property(thatLocator, "steuernummer", rhsSteuernummer), lhsSteuernummer, rhsSteuernummer)) {
                return false;
            }
        }
        {
            String lhsWeiteres;
            lhsWeiteres = this.getWeiteres();
            String rhsWeiteres;
            rhsWeiteres = that.getWeiteres();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weiteres", lhsWeiteres), LocatorUtils.property(thatLocator, "weiteres", rhsWeiteres), lhsWeiteres, rhsWeiteres)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
