
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for WohnungTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WohnungTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mietpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungWohnMieteTyp" minOccurs="0"/&gt;
 *         &lt;element name="Kaufpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungWohnKaufTyp" minOccurs="0"/&gt;
 *         &lt;element name="BefeuerungsArt" type="{http://www.immobilienscout24.de/immobilientransfer}BefeuerungsArtTyp" minOccurs="0"/&gt;
 *         &lt;element name="Energieausweis" type="{http://www.immobilienscout24.de/immobilientransfer}EnergieausweisTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WohnungKategorie" type="{http://www.immobilienscout24.de/immobilientransfer}WohnungKategorienTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Wohnflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Nutzflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Zimmer" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}ZimmeranzahlTyp" /&gt;
 *       &lt;attribute name="AnzahlBadezimmer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="AnzahlSchlafzimmer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="Etage" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3i0Typ" /&gt;
 *       &lt;attribute name="Etagenzahl" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" /&gt;
 *       &lt;attribute name="Baujahr" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *       &lt;attribute name="JahrLetzteModernisierung" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *       &lt;attribute name="Objektzustand" type="{http://www.immobilienscout24.de/immobilientransfer}ObjektZustandTyp" /&gt;
 *       &lt;attribute name="Heizungsart" type="{http://www.immobilienscout24.de/immobilientransfer}HeizungsartTyp" /&gt;
 *       &lt;attribute name="Aufzug" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Haustiere" type="{http://www.immobilienscout24.de/immobilientransfer}GenehmigungTyp" /&gt;
 *       &lt;attribute name="BalkonTerrasse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GartenBenutzung" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Einbaukueche" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BetreutesWohnen" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Foerderung" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Vermietet" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GaesteWC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Barrierefrei" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AlsFerienwohnungGeeignet" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Parkplatz" type="{http://www.immobilienscout24.de/immobilientransfer}StellplatzKategorieTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="AnzahlGaragenStellplaetze" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="Rollstuhlgerecht" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FreiAb" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="Ausstattungsqualitaet" type="{http://www.immobilienscout24.de/immobilientransfer}AusstattungsqualitaetsTyp" default="KeineAngabe" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WohnungTyp", propOrder = {
    "mietpreise",
    "kaufpreise",
    "befeuerungsArt",
    "energieausweis"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.WohnungKauf.Type.class,
    org.openestate.io.is24_xml.xml.WohnungMiete.Type.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public class WohnungTyp
    extends ImmobilieBaseTyp
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Mietpreise")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected VermarktungWohnMieteTyp mietpreise;
    @XmlElement(name = "Kaufpreise")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected VermarktungWohnKaufTyp kaufpreise;
    @XmlElement(name = "BefeuerungsArt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BefeuerungsArtTyp befeuerungsArt;
    @XmlElement(name = "Energieausweis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected EnergieausweisTyp energieausweis;
    @XmlAttribute(name = "WohnungKategorie")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected WohnungKategorienTyp wohnungKategorie;
    @XmlAttribute(name = "Wohnflaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal wohnflaeche;
    @XmlAttribute(name = "Nutzflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal nutzflaeche;
    @XmlAttribute(name = "Zimmer", required = true)
    @XmlJavaTypeAdapter(Adapter32 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal zimmer;
    @XmlAttribute(name = "AnzahlBadezimmer")
    @XmlJavaTypeAdapter(Adapter19 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long anzahlBadezimmer;
    @XmlAttribute(name = "AnzahlSchlafzimmer")
    @XmlJavaTypeAdapter(Adapter19 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long anzahlSchlafzimmer;
    @XmlAttribute(name = "Etage")
    @XmlJavaTypeAdapter(Adapter20 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long etage;
    @XmlAttribute(name = "Etagenzahl")
    @XmlJavaTypeAdapter(Adapter21 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long etagenzahl;
    @XmlAttribute(name = "Baujahr")
    @XmlJavaTypeAdapter(Adapter22 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long baujahr;
    @XmlAttribute(name = "JahrLetzteModernisierung")
    @XmlJavaTypeAdapter(Adapter22 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long jahrLetzteModernisierung;
    @XmlAttribute(name = "Objektzustand")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected ObjektZustandTyp objektzustand;
    @XmlAttribute(name = "Heizungsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected HeizungsartTyp heizungsart;
    @XmlAttribute(name = "Aufzug")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean aufzug;
    @XmlAttribute(name = "Haustiere")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected GenehmigungTyp haustiere;
    @XmlAttribute(name = "BalkonTerrasse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean balkonTerrasse;
    @XmlAttribute(name = "GartenBenutzung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean gartenBenutzung;
    @XmlAttribute(name = "Einbaukueche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean einbaukueche;
    @XmlAttribute(name = "BetreutesWohnen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean betreutesWohnen;
    @XmlAttribute(name = "Foerderung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean foerderung;
    @XmlAttribute(name = "Vermietet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean vermietet;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean denkmalschutzobjekt;
    @XmlAttribute(name = "GaesteWC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean gaesteWC;
    @XmlAttribute(name = "Keller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean keller;
    @XmlAttribute(name = "Barrierefrei")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean barrierefrei;
    @XmlAttribute(name = "AlsFerienwohnungGeeignet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean alsFerienwohnungGeeignet;
    @XmlAttribute(name = "Parkplatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected StellplatzKategorieTyp parkplatz;
    @XmlAttribute(name = "AnzahlGaragenStellplaetze")
    @XmlJavaTypeAdapter(Adapter19 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long anzahlGaragenStellplaetze;
    @XmlAttribute(name = "Rollstuhlgerecht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean rollstuhlgerecht;
    @XmlAttribute(name = "FreiAb")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String freiAb;
    @XmlAttribute(name = "Ausstattungsqualitaet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected AusstattungsqualitaetsTyp ausstattungsqualitaet;

    /**
     * Gets the value of the mietpreise property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungWohnMieteTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public VermarktungWohnMieteTyp getMietpreise() {
        return mietpreise;
    }

    /**
     * Sets the value of the mietpreise property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungWohnMieteTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setMietpreise(VermarktungWohnMieteTyp value) {
        this.mietpreise = value;
    }

    /**
     * Gets the value of the kaufpreise property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungWohnKaufTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public VermarktungWohnKaufTyp getKaufpreise() {
        return kaufpreise;
    }

    /**
     * Sets the value of the kaufpreise property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungWohnKaufTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setKaufpreise(VermarktungWohnKaufTyp value) {
        this.kaufpreise = value;
    }

    /**
     * Gets the value of the befeuerungsArt property.
     * 
     * @return
     *     possible object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BefeuerungsArtTyp getBefeuerungsArt() {
        return befeuerungsArt;
    }

    /**
     * Sets the value of the befeuerungsArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBefeuerungsArt(BefeuerungsArtTyp value) {
        this.befeuerungsArt = value;
    }

    /**
     * Gets the value of the energieausweis property.
     * 
     * @return
     *     possible object is
     *     {@link EnergieausweisTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public EnergieausweisTyp getEnergieausweis() {
        return energieausweis;
    }

    /**
     * Sets the value of the energieausweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergieausweisTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setEnergieausweis(EnergieausweisTyp value) {
        this.energieausweis = value;
    }

    /**
     * Gets the value of the wohnungKategorie property.
     * 
     * @return
     *     possible object is
     *     {@link WohnungKategorienTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public WohnungKategorienTyp getWohnungKategorie() {
        if (wohnungKategorie == null) {
            return WohnungKategorienTyp.KEINE_ANGABE;
        } else {
            return wohnungKategorie;
        }
    }

    /**
     * Sets the value of the wohnungKategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link WohnungKategorienTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setWohnungKategorie(WohnungKategorienTyp value) {
        this.wohnungKategorie = value;
    }

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getWohnflaeche() {
        return wohnflaeche;
    }

    /**
     * Sets the value of the wohnflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setWohnflaeche(BigDecimal value) {
        this.wohnflaeche = value;
    }

    /**
     * Gets the value of the nutzflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getNutzflaeche() {
        return nutzflaeche;
    }

    /**
     * Sets the value of the nutzflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setNutzflaeche(BigDecimal value) {
        this.nutzflaeche = value;
    }

    /**
     * Gets the value of the zimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getZimmer() {
        return zimmer;
    }

    /**
     * Sets the value of the zimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setZimmer(BigDecimal value) {
        this.zimmer = value;
    }

    /**
     * Gets the value of the anzahlBadezimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getAnzahlBadezimmer() {
        return anzahlBadezimmer;
    }

    /**
     * Sets the value of the anzahlBadezimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAnzahlBadezimmer(Long value) {
        this.anzahlBadezimmer = value;
    }

    /**
     * Gets the value of the anzahlSchlafzimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getAnzahlSchlafzimmer() {
        return anzahlSchlafzimmer;
    }

    /**
     * Sets the value of the anzahlSchlafzimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAnzahlSchlafzimmer(Long value) {
        this.anzahlSchlafzimmer = value;
    }

    /**
     * Gets the value of the etage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getEtage() {
        return etage;
    }

    /**
     * Sets the value of the etage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setEtage(Long value) {
        this.etage = value;
    }

    /**
     * Gets the value of the etagenzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getEtagenzahl() {
        return etagenzahl;
    }

    /**
     * Sets the value of the etagenzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setEtagenzahl(Long value) {
        this.etagenzahl = value;
    }

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getBaujahr() {
        return baujahr;
    }

    /**
     * Sets the value of the baujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBaujahr(Long value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the jahrLetzteModernisierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getJahrLetzteModernisierung() {
        return jahrLetzteModernisierung;
    }

    /**
     * Sets the value of the jahrLetzteModernisierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setJahrLetzteModernisierung(Long value) {
        this.jahrLetzteModernisierung = value;
    }

    /**
     * Gets the value of the objektzustand property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektZustandTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public ObjektZustandTyp getObjektzustand() {
        return objektzustand;
    }

    /**
     * Sets the value of the objektzustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektZustandTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setObjektzustand(ObjektZustandTyp value) {
        this.objektzustand = value;
    }

    /**
     * Gets the value of the heizungsart property.
     * 
     * @return
     *     possible object is
     *     {@link HeizungsartTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public HeizungsartTyp getHeizungsart() {
        return heizungsart;
    }

    /**
     * Sets the value of the heizungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeizungsartTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setHeizungsart(HeizungsartTyp value) {
        this.heizungsart = value;
    }

    /**
     * Gets the value of the aufzug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getAufzug() {
        return aufzug;
    }

    /**
     * Sets the value of the aufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAufzug(Boolean value) {
        this.aufzug = value;
    }

    /**
     * Gets the value of the haustiere property.
     * 
     * @return
     *     possible object is
     *     {@link GenehmigungTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public GenehmigungTyp getHaustiere() {
        return haustiere;
    }

    /**
     * Sets the value of the haustiere property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenehmigungTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setHaustiere(GenehmigungTyp value) {
        this.haustiere = value;
    }

    /**
     * Gets the value of the balkonTerrasse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBalkonTerrasse() {
        return balkonTerrasse;
    }

    /**
     * Sets the value of the balkonTerrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBalkonTerrasse(Boolean value) {
        this.balkonTerrasse = value;
    }

    /**
     * Gets the value of the gartenBenutzung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGartenBenutzung() {
        return gartenBenutzung;
    }

    /**
     * Sets the value of the gartenBenutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setGartenBenutzung(Boolean value) {
        this.gartenBenutzung = value;
    }

    /**
     * Gets the value of the einbaukueche property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getEinbaukueche() {
        return einbaukueche;
    }

    /**
     * Sets the value of the einbaukueche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setEinbaukueche(Boolean value) {
        this.einbaukueche = value;
    }

    /**
     * Gets the value of the betreutesWohnen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBetreutesWohnen() {
        return betreutesWohnen;
    }

    /**
     * Sets the value of the betreutesWohnen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBetreutesWohnen(Boolean value) {
        this.betreutesWohnen = value;
    }

    /**
     * Gets the value of the foerderung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getFoerderung() {
        return foerderung;
    }

    /**
     * Sets the value of the foerderung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setFoerderung(Boolean value) {
        this.foerderung = value;
    }

    /**
     * Gets the value of the vermietet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getVermietet() {
        return vermietet;
    }

    /**
     * Sets the value of the vermietet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setVermietet(Boolean value) {
        this.vermietet = value;
    }

    /**
     * Gets the value of the denkmalschutzobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getDenkmalschutzobjekt() {
        return denkmalschutzobjekt;
    }

    /**
     * Sets the value of the denkmalschutzobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setDenkmalschutzobjekt(Boolean value) {
        this.denkmalschutzobjekt = value;
    }

    /**
     * Gets the value of the gaesteWC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGaesteWC() {
        return gaesteWC;
    }

    /**
     * Sets the value of the gaesteWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setGaesteWC(Boolean value) {
        this.gaesteWC = value;
    }

    /**
     * Gets the value of the keller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKeller() {
        return keller;
    }

    /**
     * Sets the value of the keller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setKeller(Boolean value) {
        this.keller = value;
    }

    /**
     * Gets the value of the barrierefrei property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBarrierefrei() {
        return barrierefrei;
    }

    /**
     * Sets the value of the barrierefrei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBarrierefrei(Boolean value) {
        this.barrierefrei = value;
    }

    /**
     * Gets the value of the alsFerienwohnungGeeignet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getAlsFerienwohnungGeeignet() {
        return alsFerienwohnungGeeignet;
    }

    /**
     * Sets the value of the alsFerienwohnungGeeignet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAlsFerienwohnungGeeignet(Boolean value) {
        this.alsFerienwohnungGeeignet = value;
    }

    /**
     * Gets the value of the parkplatz property.
     * 
     * @return
     *     possible object is
     *     {@link StellplatzKategorieTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StellplatzKategorieTyp getParkplatz() {
        if (parkplatz == null) {
            return StellplatzKategorieTyp.KEINE_ANGABE;
        } else {
            return parkplatz;
        }
    }

    /**
     * Sets the value of the parkplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StellplatzKategorieTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setParkplatz(StellplatzKategorieTyp value) {
        this.parkplatz = value;
    }

    /**
     * Gets the value of the anzahlGaragenStellplaetze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getAnzahlGaragenStellplaetze() {
        return anzahlGaragenStellplaetze;
    }

    /**
     * Sets the value of the anzahlGaragenStellplaetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAnzahlGaragenStellplaetze(Long value) {
        this.anzahlGaragenStellplaetze = value;
    }

    /**
     * Gets the value of the rollstuhlgerecht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getRollstuhlgerecht() {
        return rollstuhlgerecht;
    }

    /**
     * Sets the value of the rollstuhlgerecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setRollstuhlgerecht(Boolean value) {
        this.rollstuhlgerecht = value;
    }

    /**
     * Gets the value of the freiAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getFreiAb() {
        return freiAb;
    }

    /**
     * Sets the value of the freiAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setFreiAb(String value) {
        this.freiAb = value;
    }

    /**
     * Gets the value of the ausstattungsqualitaet property.
     * 
     * @return
     *     possible object is
     *     {@link AusstattungsqualitaetsTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public AusstattungsqualitaetsTyp getAusstattungsqualitaet() {
        if (ausstattungsqualitaet == null) {
            return AusstattungsqualitaetsTyp.KEINE_ANGABE;
        } else {
            return ausstattungsqualitaet;
        }
    }

    /**
     * Sets the value of the ausstattungsqualitaet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AusstattungsqualitaetsTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAusstattungsqualitaet(AusstattungsqualitaetsTyp value) {
        this.ausstattungsqualitaet = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            VermarktungWohnMieteTyp theMietpreise;
            theMietpreise = this.getMietpreise();
            strategy.appendField(locator, this, "mietpreise", buffer, theMietpreise, (this.mietpreise!= null));
        }
        {
            VermarktungWohnKaufTyp theKaufpreise;
            theKaufpreise = this.getKaufpreise();
            strategy.appendField(locator, this, "kaufpreise", buffer, theKaufpreise, (this.kaufpreise!= null));
        }
        {
            BefeuerungsArtTyp theBefeuerungsArt;
            theBefeuerungsArt = this.getBefeuerungsArt();
            strategy.appendField(locator, this, "befeuerungsArt", buffer, theBefeuerungsArt, (this.befeuerungsArt!= null));
        }
        {
            EnergieausweisTyp theEnergieausweis;
            theEnergieausweis = this.getEnergieausweis();
            strategy.appendField(locator, this, "energieausweis", buffer, theEnergieausweis, (this.energieausweis!= null));
        }
        {
            WohnungKategorienTyp theWohnungKategorie;
            theWohnungKategorie = this.getWohnungKategorie();
            strategy.appendField(locator, this, "wohnungKategorie", buffer, theWohnungKategorie, (this.wohnungKategorie!= null));
        }
        {
            BigDecimal theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche, (this.wohnflaeche!= null));
        }
        {
            BigDecimal theNutzflaeche;
            theNutzflaeche = this.getNutzflaeche();
            strategy.appendField(locator, this, "nutzflaeche", buffer, theNutzflaeche, (this.nutzflaeche!= null));
        }
        {
            BigDecimal theZimmer;
            theZimmer = this.getZimmer();
            strategy.appendField(locator, this, "zimmer", buffer, theZimmer, (this.zimmer!= null));
        }
        {
            Long theAnzahlBadezimmer;
            theAnzahlBadezimmer = this.getAnzahlBadezimmer();
            strategy.appendField(locator, this, "anzahlBadezimmer", buffer, theAnzahlBadezimmer, (this.anzahlBadezimmer!= null));
        }
        {
            Long theAnzahlSchlafzimmer;
            theAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            strategy.appendField(locator, this, "anzahlSchlafzimmer", buffer, theAnzahlSchlafzimmer, (this.anzahlSchlafzimmer!= null));
        }
        {
            Long theEtage;
            theEtage = this.getEtage();
            strategy.appendField(locator, this, "etage", buffer, theEtage, (this.etage!= null));
        }
        {
            Long theEtagenzahl;
            theEtagenzahl = this.getEtagenzahl();
            strategy.appendField(locator, this, "etagenzahl", buffer, theEtagenzahl, (this.etagenzahl!= null));
        }
        {
            Long theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr, (this.baujahr!= null));
        }
        {
            Long theJahrLetzteModernisierung;
            theJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            strategy.appendField(locator, this, "jahrLetzteModernisierung", buffer, theJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null));
        }
        {
            ObjektZustandTyp theObjektzustand;
            theObjektzustand = this.getObjektzustand();
            strategy.appendField(locator, this, "objektzustand", buffer, theObjektzustand, (this.objektzustand!= null));
        }
        {
            HeizungsartTyp theHeizungsart;
            theHeizungsart = this.getHeizungsart();
            strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart, (this.heizungsart!= null));
        }
        {
            Boolean theAufzug;
            theAufzug = this.getAufzug();
            strategy.appendField(locator, this, "aufzug", buffer, theAufzug, (this.aufzug!= null));
        }
        {
            GenehmigungTyp theHaustiere;
            theHaustiere = this.getHaustiere();
            strategy.appendField(locator, this, "haustiere", buffer, theHaustiere, (this.haustiere!= null));
        }
        {
            Boolean theBalkonTerrasse;
            theBalkonTerrasse = this.getBalkonTerrasse();
            strategy.appendField(locator, this, "balkonTerrasse", buffer, theBalkonTerrasse, (this.balkonTerrasse!= null));
        }
        {
            Boolean theGartenBenutzung;
            theGartenBenutzung = this.getGartenBenutzung();
            strategy.appendField(locator, this, "gartenBenutzung", buffer, theGartenBenutzung, (this.gartenBenutzung!= null));
        }
        {
            Boolean theEinbaukueche;
            theEinbaukueche = this.getEinbaukueche();
            strategy.appendField(locator, this, "einbaukueche", buffer, theEinbaukueche, (this.einbaukueche!= null));
        }
        {
            Boolean theBetreutesWohnen;
            theBetreutesWohnen = this.getBetreutesWohnen();
            strategy.appendField(locator, this, "betreutesWohnen", buffer, theBetreutesWohnen, (this.betreutesWohnen!= null));
        }
        {
            Boolean theFoerderung;
            theFoerderung = this.getFoerderung();
            strategy.appendField(locator, this, "foerderung", buffer, theFoerderung, (this.foerderung!= null));
        }
        {
            Boolean theVermietet;
            theVermietet = this.getVermietet();
            strategy.appendField(locator, this, "vermietet", buffer, theVermietet, (this.vermietet!= null));
        }
        {
            Boolean theDenkmalschutzobjekt;
            theDenkmalschutzobjekt = this.getDenkmalschutzobjekt();
            strategy.appendField(locator, this, "denkmalschutzobjekt", buffer, theDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null));
        }
        {
            Boolean theGaesteWC;
            theGaesteWC = this.getGaesteWC();
            strategy.appendField(locator, this, "gaesteWC", buffer, theGaesteWC, (this.gaesteWC!= null));
        }
        {
            Boolean theKeller;
            theKeller = this.getKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller, (this.keller!= null));
        }
        {
            Boolean theBarrierefrei;
            theBarrierefrei = this.getBarrierefrei();
            strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei, (this.barrierefrei!= null));
        }
        {
            Boolean theAlsFerienwohnungGeeignet;
            theAlsFerienwohnungGeeignet = this.getAlsFerienwohnungGeeignet();
            strategy.appendField(locator, this, "alsFerienwohnungGeeignet", buffer, theAlsFerienwohnungGeeignet, (this.alsFerienwohnungGeeignet!= null));
        }
        {
            StellplatzKategorieTyp theParkplatz;
            theParkplatz = this.getParkplatz();
            strategy.appendField(locator, this, "parkplatz", buffer, theParkplatz, (this.parkplatz!= null));
        }
        {
            Long theAnzahlGaragenStellplaetze;
            theAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
            strategy.appendField(locator, this, "anzahlGaragenStellplaetze", buffer, theAnzahlGaragenStellplaetze, (this.anzahlGaragenStellplaetze!= null));
        }
        {
            Boolean theRollstuhlgerecht;
            theRollstuhlgerecht = this.getRollstuhlgerecht();
            strategy.appendField(locator, this, "rollstuhlgerecht", buffer, theRollstuhlgerecht, (this.rollstuhlgerecht!= null));
        }
        {
            String theFreiAb;
            theFreiAb = this.getFreiAb();
            strategy.appendField(locator, this, "freiAb", buffer, theFreiAb, (this.freiAb!= null));
        }
        {
            AusstattungsqualitaetsTyp theAusstattungsqualitaet;
            theAusstattungsqualitaet = this.getAusstattungsqualitaet();
            strategy.appendField(locator, this, "ausstattungsqualitaet", buffer, theAusstattungsqualitaet, (this.ausstattungsqualitaet!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof WohnungTyp) {
            final WohnungTyp copy = ((WohnungTyp) draftCopy);
            {
                Boolean mietpreiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietpreise!= null));
                if (mietpreiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    VermarktungWohnMieteTyp sourceMietpreise;
                    sourceMietpreise = this.getMietpreise();
                    VermarktungWohnMieteTyp copyMietpreise = ((VermarktungWohnMieteTyp) strategy.copy(LocatorUtils.property(locator, "mietpreise", sourceMietpreise), sourceMietpreise, (this.mietpreise!= null)));
                    copy.setMietpreise(copyMietpreise);
                } else {
                    if (mietpreiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mietpreise = null;
                    }
                }
            }
            {
                Boolean kaufpreiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreise!= null));
                if (kaufpreiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    VermarktungWohnKaufTyp sourceKaufpreise;
                    sourceKaufpreise = this.getKaufpreise();
                    VermarktungWohnKaufTyp copyKaufpreise = ((VermarktungWohnKaufTyp) strategy.copy(LocatorUtils.property(locator, "kaufpreise", sourceKaufpreise), sourceKaufpreise, (this.kaufpreise!= null)));
                    copy.setKaufpreise(copyKaufpreise);
                } else {
                    if (kaufpreiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaufpreise = null;
                    }
                }
            }
            {
                Boolean befeuerungsArtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.befeuerungsArt!= null));
                if (befeuerungsArtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BefeuerungsArtTyp sourceBefeuerungsArt;
                    sourceBefeuerungsArt = this.getBefeuerungsArt();
                    BefeuerungsArtTyp copyBefeuerungsArt = ((BefeuerungsArtTyp) strategy.copy(LocatorUtils.property(locator, "befeuerungsArt", sourceBefeuerungsArt), sourceBefeuerungsArt, (this.befeuerungsArt!= null)));
                    copy.setBefeuerungsArt(copyBefeuerungsArt);
                } else {
                    if (befeuerungsArtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.befeuerungsArt = null;
                    }
                }
            }
            {
                Boolean energieausweisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieausweis!= null));
                if (energieausweisShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergieausweisTyp sourceEnergieausweis;
                    sourceEnergieausweis = this.getEnergieausweis();
                    EnergieausweisTyp copyEnergieausweis = ((EnergieausweisTyp) strategy.copy(LocatorUtils.property(locator, "energieausweis", sourceEnergieausweis), sourceEnergieausweis, (this.energieausweis!= null)));
                    copy.setEnergieausweis(copyEnergieausweis);
                } else {
                    if (energieausweisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieausweis = null;
                    }
                }
            }
            {
                Boolean wohnungKategorieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnungKategorie!= null));
                if (wohnungKategorieShouldBeCopiedAndSet == Boolean.TRUE) {
                    WohnungKategorienTyp sourceWohnungKategorie;
                    sourceWohnungKategorie = this.getWohnungKategorie();
                    WohnungKategorienTyp copyWohnungKategorie = ((WohnungKategorienTyp) strategy.copy(LocatorUtils.property(locator, "wohnungKategorie", sourceWohnungKategorie), sourceWohnungKategorie, (this.wohnungKategorie!= null)));
                    copy.setWohnungKategorie(copyWohnungKategorie);
                } else {
                    if (wohnungKategorieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnungKategorie = null;
                    }
                }
            }
            {
                Boolean wohnflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnflaeche!= null));
                if (wohnflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWohnflaeche;
                    sourceWohnflaeche = this.getWohnflaeche();
                    BigDecimal copyWohnflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche, (this.wohnflaeche!= null)));
                    copy.setWohnflaeche(copyWohnflaeche);
                } else {
                    if (wohnflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnflaeche = null;
                    }
                }
            }
            {
                Boolean nutzflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nutzflaeche!= null));
                if (nutzflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNutzflaeche;
                    sourceNutzflaeche = this.getNutzflaeche();
                    BigDecimal copyNutzflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nutzflaeche", sourceNutzflaeche), sourceNutzflaeche, (this.nutzflaeche!= null)));
                    copy.setNutzflaeche(copyNutzflaeche);
                } else {
                    if (nutzflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nutzflaeche = null;
                    }
                }
            }
            {
                Boolean zimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zimmer!= null));
                if (zimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceZimmer;
                    sourceZimmer = this.getZimmer();
                    BigDecimal copyZimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZimmer), sourceZimmer, (this.zimmer!= null)));
                    copy.setZimmer(copyZimmer);
                } else {
                    if (zimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zimmer = null;
                    }
                }
            }
            {
                Boolean anzahlBadezimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlBadezimmer!= null));
                if (anzahlBadezimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAnzahlBadezimmer;
                    sourceAnzahlBadezimmer = this.getAnzahlBadezimmer();
                    Long copyAnzahlBadezimmer = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlBadezimmer", sourceAnzahlBadezimmer), sourceAnzahlBadezimmer, (this.anzahlBadezimmer!= null)));
                    copy.setAnzahlBadezimmer(copyAnzahlBadezimmer);
                } else {
                    if (anzahlBadezimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlBadezimmer = null;
                    }
                }
            }
            {
                Boolean anzahlSchlafzimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlSchlafzimmer!= null));
                if (anzahlSchlafzimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAnzahlSchlafzimmer;
                    sourceAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
                    Long copyAnzahlSchlafzimmer = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlSchlafzimmer", sourceAnzahlSchlafzimmer), sourceAnzahlSchlafzimmer, (this.anzahlSchlafzimmer!= null)));
                    copy.setAnzahlSchlafzimmer(copyAnzahlSchlafzimmer);
                } else {
                    if (anzahlSchlafzimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlSchlafzimmer = null;
                    }
                }
            }
            {
                Boolean etageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etage!= null));
                if (etageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceEtage;
                    sourceEtage = this.getEtage();
                    Long copyEtage = ((Long) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage, (this.etage!= null)));
                    copy.setEtage(copyEtage);
                } else {
                    if (etageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.etage = null;
                    }
                }
            }
            {
                Boolean etagenzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etagenzahl!= null));
                if (etagenzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceEtagenzahl;
                    sourceEtagenzahl = this.getEtagenzahl();
                    Long copyEtagenzahl = ((Long) strategy.copy(LocatorUtils.property(locator, "etagenzahl", sourceEtagenzahl), sourceEtagenzahl, (this.etagenzahl!= null)));
                    copy.setEtagenzahl(copyEtagenzahl);
                } else {
                    if (etagenzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.etagenzahl = null;
                    }
                }
            }
            {
                Boolean baujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baujahr!= null));
                if (baujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBaujahr;
                    sourceBaujahr = this.getBaujahr();
                    Long copyBaujahr = ((Long) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr, (this.baujahr!= null)));
                    copy.setBaujahr(copyBaujahr);
                } else {
                    if (baujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baujahr = null;
                    }
                }
            }
            {
                Boolean jahrLetzteModernisierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jahrLetzteModernisierung!= null));
                if (jahrLetzteModernisierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceJahrLetzteModernisierung;
                    sourceJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
                    Long copyJahrLetzteModernisierung = ((Long) strategy.copy(LocatorUtils.property(locator, "jahrLetzteModernisierung", sourceJahrLetzteModernisierung), sourceJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null)));
                    copy.setJahrLetzteModernisierung(copyJahrLetzteModernisierung);
                } else {
                    if (jahrLetzteModernisierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jahrLetzteModernisierung = null;
                    }
                }
            }
            {
                Boolean objektzustandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektzustand!= null));
                if (objektzustandShouldBeCopiedAndSet == Boolean.TRUE) {
                    ObjektZustandTyp sourceObjektzustand;
                    sourceObjektzustand = this.getObjektzustand();
                    ObjektZustandTyp copyObjektzustand = ((ObjektZustandTyp) strategy.copy(LocatorUtils.property(locator, "objektzustand", sourceObjektzustand), sourceObjektzustand, (this.objektzustand!= null)));
                    copy.setObjektzustand(copyObjektzustand);
                } else {
                    if (objektzustandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektzustand = null;
                    }
                }
            }
            {
                Boolean heizungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizungsart!= null));
                if (heizungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeizungsartTyp sourceHeizungsart;
                    sourceHeizungsart = this.getHeizungsart();
                    HeizungsartTyp copyHeizungsart = ((HeizungsartTyp) strategy.copy(LocatorUtils.property(locator, "heizungsart", sourceHeizungsart), sourceHeizungsart, (this.heizungsart!= null)));
                    copy.setHeizungsart(copyHeizungsart);
                } else {
                    if (heizungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizungsart = null;
                    }
                }
            }
            {
                Boolean aufzugShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aufzug!= null));
                if (aufzugShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAufzug;
                    sourceAufzug = this.getAufzug();
                    Boolean copyAufzug = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufzug", sourceAufzug), sourceAufzug, (this.aufzug!= null)));
                    copy.setAufzug(copyAufzug);
                } else {
                    if (aufzugShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aufzug = null;
                    }
                }
            }
            {
                Boolean haustiereShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haustiere!= null));
                if (haustiereShouldBeCopiedAndSet == Boolean.TRUE) {
                    GenehmigungTyp sourceHaustiere;
                    sourceHaustiere = this.getHaustiere();
                    GenehmigungTyp copyHaustiere = ((GenehmigungTyp) strategy.copy(LocatorUtils.property(locator, "haustiere", sourceHaustiere), sourceHaustiere, (this.haustiere!= null)));
                    copy.setHaustiere(copyHaustiere);
                } else {
                    if (haustiereShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haustiere = null;
                    }
                }
            }
            {
                Boolean balkonTerrasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balkonTerrasse!= null));
                if (balkonTerrasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBalkonTerrasse;
                    sourceBalkonTerrasse = this.getBalkonTerrasse();
                    Boolean copyBalkonTerrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balkonTerrasse", sourceBalkonTerrasse), sourceBalkonTerrasse, (this.balkonTerrasse!= null)));
                    copy.setBalkonTerrasse(copyBalkonTerrasse);
                } else {
                    if (balkonTerrasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balkonTerrasse = null;
                    }
                }
            }
            {
                Boolean gartenBenutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gartenBenutzung!= null));
                if (gartenBenutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGartenBenutzung;
                    sourceGartenBenutzung = this.getGartenBenutzung();
                    Boolean copyGartenBenutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gartenBenutzung", sourceGartenBenutzung), sourceGartenBenutzung, (this.gartenBenutzung!= null)));
                    copy.setGartenBenutzung(copyGartenBenutzung);
                } else {
                    if (gartenBenutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gartenBenutzung = null;
                    }
                }
            }
            {
                Boolean einbaukuecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einbaukueche!= null));
                if (einbaukuecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEinbaukueche;
                    sourceEinbaukueche = this.getEinbaukueche();
                    Boolean copyEinbaukueche = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einbaukueche", sourceEinbaukueche), sourceEinbaukueche, (this.einbaukueche!= null)));
                    copy.setEinbaukueche(copyEinbaukueche);
                } else {
                    if (einbaukuecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einbaukueche = null;
                    }
                }
            }
            {
                Boolean betreutesWohnenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betreutesWohnen!= null));
                if (betreutesWohnenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBetreutesWohnen;
                    sourceBetreutesWohnen = this.getBetreutesWohnen();
                    Boolean copyBetreutesWohnen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "betreutesWohnen", sourceBetreutesWohnen), sourceBetreutesWohnen, (this.betreutesWohnen!= null)));
                    copy.setBetreutesWohnen(copyBetreutesWohnen);
                } else {
                    if (betreutesWohnenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betreutesWohnen = null;
                    }
                }
            }
            {
                Boolean foerderungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.foerderung!= null));
                if (foerderungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFoerderung;
                    sourceFoerderung = this.getFoerderung();
                    Boolean copyFoerderung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "foerderung", sourceFoerderung), sourceFoerderung, (this.foerderung!= null)));
                    copy.setFoerderung(copyFoerderung);
                } else {
                    if (foerderungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.foerderung = null;
                    }
                }
            }
            {
                Boolean vermietetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermietet!= null));
                if (vermietetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVermietet;
                    sourceVermietet = this.getVermietet();
                    Boolean copyVermietet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vermietet", sourceVermietet), sourceVermietet, (this.vermietet!= null)));
                    copy.setVermietet(copyVermietet);
                } else {
                    if (vermietetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermietet = null;
                    }
                }
            }
            {
                Boolean denkmalschutzobjektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.denkmalschutzobjekt!= null));
                if (denkmalschutzobjektShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDenkmalschutzobjekt;
                    sourceDenkmalschutzobjekt = this.getDenkmalschutzobjekt();
                    Boolean copyDenkmalschutzobjekt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalschutzobjekt", sourceDenkmalschutzobjekt), sourceDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null)));
                    copy.setDenkmalschutzobjekt(copyDenkmalschutzobjekt);
                } else {
                    if (denkmalschutzobjektShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.denkmalschutzobjekt = null;
                    }
                }
            }
            {
                Boolean gaesteWCShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gaesteWC!= null));
                if (gaesteWCShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGaesteWC;
                    sourceGaesteWC = this.getGaesteWC();
                    Boolean copyGaesteWC = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gaesteWC", sourceGaesteWC), sourceGaesteWC, (this.gaesteWC!= null)));
                    copy.setGaesteWC(copyGaesteWC);
                } else {
                    if (gaesteWCShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gaesteWC = null;
                    }
                }
            }
            {
                Boolean kellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keller!= null));
                if (kellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKeller;
                    sourceKeller = this.getKeller();
                    Boolean copyKeller = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller, (this.keller!= null)));
                    copy.setKeller(copyKeller);
                } else {
                    if (kellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keller = null;
                    }
                }
            }
            {
                Boolean barrierefreiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.barrierefrei!= null));
                if (barrierefreiShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBarrierefrei;
                    sourceBarrierefrei = this.getBarrierefrei();
                    Boolean copyBarrierefrei = ((Boolean) strategy.copy(LocatorUtils.property(locator, "barrierefrei", sourceBarrierefrei), sourceBarrierefrei, (this.barrierefrei!= null)));
                    copy.setBarrierefrei(copyBarrierefrei);
                } else {
                    if (barrierefreiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.barrierefrei = null;
                    }
                }
            }
            {
                Boolean alsFerienwohnungGeeignetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alsFerienwohnungGeeignet!= null));
                if (alsFerienwohnungGeeignetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAlsFerienwohnungGeeignet;
                    sourceAlsFerienwohnungGeeignet = this.getAlsFerienwohnungGeeignet();
                    Boolean copyAlsFerienwohnungGeeignet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "alsFerienwohnungGeeignet", sourceAlsFerienwohnungGeeignet), sourceAlsFerienwohnungGeeignet, (this.alsFerienwohnungGeeignet!= null)));
                    copy.setAlsFerienwohnungGeeignet(copyAlsFerienwohnungGeeignet);
                } else {
                    if (alsFerienwohnungGeeignetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alsFerienwohnungGeeignet = null;
                    }
                }
            }
            {
                Boolean parkplatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkplatz!= null));
                if (parkplatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    StellplatzKategorieTyp sourceParkplatz;
                    sourceParkplatz = this.getParkplatz();
                    StellplatzKategorieTyp copyParkplatz = ((StellplatzKategorieTyp) strategy.copy(LocatorUtils.property(locator, "parkplatz", sourceParkplatz), sourceParkplatz, (this.parkplatz!= null)));
                    copy.setParkplatz(copyParkplatz);
                } else {
                    if (parkplatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkplatz = null;
                    }
                }
            }
            {
                Boolean anzahlGaragenStellplaetzeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlGaragenStellplaetze!= null));
                if (anzahlGaragenStellplaetzeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAnzahlGaragenStellplaetze;
                    sourceAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
                    Long copyAnzahlGaragenStellplaetze = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlGaragenStellplaetze", sourceAnzahlGaragenStellplaetze), sourceAnzahlGaragenStellplaetze, (this.anzahlGaragenStellplaetze!= null)));
                    copy.setAnzahlGaragenStellplaetze(copyAnzahlGaragenStellplaetze);
                } else {
                    if (anzahlGaragenStellplaetzeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlGaragenStellplaetze = null;
                    }
                }
            }
            {
                Boolean rollstuhlgerechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rollstuhlgerecht!= null));
                if (rollstuhlgerechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRollstuhlgerecht;
                    sourceRollstuhlgerecht = this.getRollstuhlgerecht();
                    Boolean copyRollstuhlgerecht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rollstuhlgerecht", sourceRollstuhlgerecht), sourceRollstuhlgerecht, (this.rollstuhlgerecht!= null)));
                    copy.setRollstuhlgerecht(copyRollstuhlgerecht);
                } else {
                    if (rollstuhlgerechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rollstuhlgerecht = null;
                    }
                }
            }
            {
                Boolean freiAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiAb!= null));
                if (freiAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreiAb;
                    sourceFreiAb = this.getFreiAb();
                    String copyFreiAb = ((String) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb, (this.freiAb!= null)));
                    copy.setFreiAb(copyFreiAb);
                } else {
                    if (freiAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freiAb = null;
                    }
                }
            }
            {
                Boolean ausstattungsqualitaetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausstattungsqualitaet!= null));
                if (ausstattungsqualitaetShouldBeCopiedAndSet == Boolean.TRUE) {
                    AusstattungsqualitaetsTyp sourceAusstattungsqualitaet;
                    sourceAusstattungsqualitaet = this.getAusstattungsqualitaet();
                    AusstattungsqualitaetsTyp copyAusstattungsqualitaet = ((AusstattungsqualitaetsTyp) strategy.copy(LocatorUtils.property(locator, "ausstattungsqualitaet", sourceAusstattungsqualitaet), sourceAusstattungsqualitaet, (this.ausstattungsqualitaet!= null)));
                    copy.setAusstattungsqualitaet(copyAusstattungsqualitaet);
                } else {
                    if (ausstattungsqualitaetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausstattungsqualitaet = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new WohnungTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final WohnungTyp that = ((WohnungTyp) object);
        {
            VermarktungWohnMieteTyp lhsMietpreise;
            lhsMietpreise = this.getMietpreise();
            VermarktungWohnMieteTyp rhsMietpreise;
            rhsMietpreise = that.getMietpreise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreise", lhsMietpreise), LocatorUtils.property(thatLocator, "mietpreise", rhsMietpreise), lhsMietpreise, rhsMietpreise, (this.mietpreise!= null), (that.mietpreise!= null))) {
                return false;
            }
        }
        {
            VermarktungWohnKaufTyp lhsKaufpreise;
            lhsKaufpreise = this.getKaufpreise();
            VermarktungWohnKaufTyp rhsKaufpreise;
            rhsKaufpreise = that.getKaufpreise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreise", lhsKaufpreise), LocatorUtils.property(thatLocator, "kaufpreise", rhsKaufpreise), lhsKaufpreise, rhsKaufpreise, (this.kaufpreise!= null), (that.kaufpreise!= null))) {
                return false;
            }
        }
        {
            BefeuerungsArtTyp lhsBefeuerungsArt;
            lhsBefeuerungsArt = this.getBefeuerungsArt();
            BefeuerungsArtTyp rhsBefeuerungsArt;
            rhsBefeuerungsArt = that.getBefeuerungsArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befeuerungsArt", lhsBefeuerungsArt), LocatorUtils.property(thatLocator, "befeuerungsArt", rhsBefeuerungsArt), lhsBefeuerungsArt, rhsBefeuerungsArt, (this.befeuerungsArt!= null), (that.befeuerungsArt!= null))) {
                return false;
            }
        }
        {
            EnergieausweisTyp lhsEnergieausweis;
            lhsEnergieausweis = this.getEnergieausweis();
            EnergieausweisTyp rhsEnergieausweis;
            rhsEnergieausweis = that.getEnergieausweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweis", lhsEnergieausweis), LocatorUtils.property(thatLocator, "energieausweis", rhsEnergieausweis), lhsEnergieausweis, rhsEnergieausweis, (this.energieausweis!= null), (that.energieausweis!= null))) {
                return false;
            }
        }
        {
            WohnungKategorienTyp lhsWohnungKategorie;
            lhsWohnungKategorie = this.getWohnungKategorie();
            WohnungKategorienTyp rhsWohnungKategorie;
            rhsWohnungKategorie = that.getWohnungKategorie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnungKategorie", lhsWohnungKategorie), LocatorUtils.property(thatLocator, "wohnungKategorie", rhsWohnungKategorie), lhsWohnungKategorie, rhsWohnungKategorie, (this.wohnungKategorie!= null), (that.wohnungKategorie!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            BigDecimal rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche, (this.wohnflaeche!= null), (that.wohnflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNutzflaeche;
            lhsNutzflaeche = this.getNutzflaeche();
            BigDecimal rhsNutzflaeche;
            rhsNutzflaeche = that.getNutzflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzflaeche", lhsNutzflaeche), LocatorUtils.property(thatLocator, "nutzflaeche", rhsNutzflaeche), lhsNutzflaeche, rhsNutzflaeche, (this.nutzflaeche!= null), (that.nutzflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsZimmer;
            lhsZimmer = this.getZimmer();
            BigDecimal rhsZimmer;
            rhsZimmer = that.getZimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZimmer), LocatorUtils.property(thatLocator, "zimmer", rhsZimmer), lhsZimmer, rhsZimmer, (this.zimmer!= null), (that.zimmer!= null))) {
                return false;
            }
        }
        {
            Long lhsAnzahlBadezimmer;
            lhsAnzahlBadezimmer = this.getAnzahlBadezimmer();
            Long rhsAnzahlBadezimmer;
            rhsAnzahlBadezimmer = that.getAnzahlBadezimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBadezimmer", lhsAnzahlBadezimmer), LocatorUtils.property(thatLocator, "anzahlBadezimmer", rhsAnzahlBadezimmer), lhsAnzahlBadezimmer, rhsAnzahlBadezimmer, (this.anzahlBadezimmer!= null), (that.anzahlBadezimmer!= null))) {
                return false;
            }
        }
        {
            Long lhsAnzahlSchlafzimmer;
            lhsAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            Long rhsAnzahlSchlafzimmer;
            rhsAnzahlSchlafzimmer = that.getAnzahlSchlafzimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlSchlafzimmer", lhsAnzahlSchlafzimmer), LocatorUtils.property(thatLocator, "anzahlSchlafzimmer", rhsAnzahlSchlafzimmer), lhsAnzahlSchlafzimmer, rhsAnzahlSchlafzimmer, (this.anzahlSchlafzimmer!= null), (that.anzahlSchlafzimmer!= null))) {
                return false;
            }
        }
        {
            Long lhsEtage;
            lhsEtage = this.getEtage();
            Long rhsEtage;
            rhsEtage = that.getEtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage, (this.etage!= null), (that.etage!= null))) {
                return false;
            }
        }
        {
            Long lhsEtagenzahl;
            lhsEtagenzahl = this.getEtagenzahl();
            Long rhsEtagenzahl;
            rhsEtagenzahl = that.getEtagenzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etagenzahl", lhsEtagenzahl), LocatorUtils.property(thatLocator, "etagenzahl", rhsEtagenzahl), lhsEtagenzahl, rhsEtagenzahl, (this.etagenzahl!= null), (that.etagenzahl!= null))) {
                return false;
            }
        }
        {
            Long lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            Long rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr, (this.baujahr!= null), (that.baujahr!= null))) {
                return false;
            }
        }
        {
            Long lhsJahrLetzteModernisierung;
            lhsJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            Long rhsJahrLetzteModernisierung;
            rhsJahrLetzteModernisierung = that.getJahrLetzteModernisierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jahrLetzteModernisierung", lhsJahrLetzteModernisierung), LocatorUtils.property(thatLocator, "jahrLetzteModernisierung", rhsJahrLetzteModernisierung), lhsJahrLetzteModernisierung, rhsJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null), (that.jahrLetzteModernisierung!= null))) {
                return false;
            }
        }
        {
            ObjektZustandTyp lhsObjektzustand;
            lhsObjektzustand = this.getObjektzustand();
            ObjektZustandTyp rhsObjektzustand;
            rhsObjektzustand = that.getObjektzustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektzustand", lhsObjektzustand), LocatorUtils.property(thatLocator, "objektzustand", rhsObjektzustand), lhsObjektzustand, rhsObjektzustand, (this.objektzustand!= null), (that.objektzustand!= null))) {
                return false;
            }
        }
        {
            HeizungsartTyp lhsHeizungsart;
            lhsHeizungsart = this.getHeizungsart();
            HeizungsartTyp rhsHeizungsart;
            rhsHeizungsart = that.getHeizungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizungsart", lhsHeizungsart), LocatorUtils.property(thatLocator, "heizungsart", rhsHeizungsart), lhsHeizungsart, rhsHeizungsart, (this.heizungsart!= null), (that.heizungsart!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAufzug;
            lhsAufzug = this.getAufzug();
            Boolean rhsAufzug;
            rhsAufzug = that.getAufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufzug", lhsAufzug), LocatorUtils.property(thatLocator, "aufzug", rhsAufzug), lhsAufzug, rhsAufzug, (this.aufzug!= null), (that.aufzug!= null))) {
                return false;
            }
        }
        {
            GenehmigungTyp lhsHaustiere;
            lhsHaustiere = this.getHaustiere();
            GenehmigungTyp rhsHaustiere;
            rhsHaustiere = that.getHaustiere();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustiere", lhsHaustiere), LocatorUtils.property(thatLocator, "haustiere", rhsHaustiere), lhsHaustiere, rhsHaustiere, (this.haustiere!= null), (that.haustiere!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBalkonTerrasse;
            lhsBalkonTerrasse = this.getBalkonTerrasse();
            Boolean rhsBalkonTerrasse;
            rhsBalkonTerrasse = that.getBalkonTerrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkonTerrasse", lhsBalkonTerrasse), LocatorUtils.property(thatLocator, "balkonTerrasse", rhsBalkonTerrasse), lhsBalkonTerrasse, rhsBalkonTerrasse, (this.balkonTerrasse!= null), (that.balkonTerrasse!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGartenBenutzung;
            lhsGartenBenutzung = this.getGartenBenutzung();
            Boolean rhsGartenBenutzung;
            rhsGartenBenutzung = that.getGartenBenutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartenBenutzung", lhsGartenBenutzung), LocatorUtils.property(thatLocator, "gartenBenutzung", rhsGartenBenutzung), lhsGartenBenutzung, rhsGartenBenutzung, (this.gartenBenutzung!= null), (that.gartenBenutzung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEinbaukueche;
            lhsEinbaukueche = this.getEinbaukueche();
            Boolean rhsEinbaukueche;
            rhsEinbaukueche = that.getEinbaukueche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einbaukueche", lhsEinbaukueche), LocatorUtils.property(thatLocator, "einbaukueche", rhsEinbaukueche), lhsEinbaukueche, rhsEinbaukueche, (this.einbaukueche!= null), (that.einbaukueche!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBetreutesWohnen;
            lhsBetreutesWohnen = this.getBetreutesWohnen();
            Boolean rhsBetreutesWohnen;
            rhsBetreutesWohnen = that.getBetreutesWohnen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betreutesWohnen", lhsBetreutesWohnen), LocatorUtils.property(thatLocator, "betreutesWohnen", rhsBetreutesWohnen), lhsBetreutesWohnen, rhsBetreutesWohnen, (this.betreutesWohnen!= null), (that.betreutesWohnen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFoerderung;
            lhsFoerderung = this.getFoerderung();
            Boolean rhsFoerderung;
            rhsFoerderung = that.getFoerderung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foerderung", lhsFoerderung), LocatorUtils.property(thatLocator, "foerderung", rhsFoerderung), lhsFoerderung, rhsFoerderung, (this.foerderung!= null), (that.foerderung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVermietet;
            lhsVermietet = this.getVermietet();
            Boolean rhsVermietet;
            rhsVermietet = that.getVermietet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietet", lhsVermietet), LocatorUtils.property(thatLocator, "vermietet", rhsVermietet), lhsVermietet, rhsVermietet, (this.vermietet!= null), (that.vermietet!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalschutzobjekt;
            lhsDenkmalschutzobjekt = this.getDenkmalschutzobjekt();
            Boolean rhsDenkmalschutzobjekt;
            rhsDenkmalschutzobjekt = that.getDenkmalschutzobjekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalschutzobjekt", lhsDenkmalschutzobjekt), LocatorUtils.property(thatLocator, "denkmalschutzobjekt", rhsDenkmalschutzobjekt), lhsDenkmalschutzobjekt, rhsDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null), (that.denkmalschutzobjekt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGaesteWC;
            lhsGaesteWC = this.getGaesteWC();
            Boolean rhsGaesteWC;
            rhsGaesteWC = that.getGaesteWC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gaesteWC", lhsGaesteWC), LocatorUtils.property(thatLocator, "gaesteWC", rhsGaesteWC), lhsGaesteWC, rhsGaesteWC, (this.gaesteWC!= null), (that.gaesteWC!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKeller;
            lhsKeller = this.getKeller();
            Boolean rhsKeller;
            rhsKeller = that.getKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKeller), LocatorUtils.property(thatLocator, "keller", rhsKeller), lhsKeller, rhsKeller, (this.keller!= null), (that.keller!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBarrierefrei;
            lhsBarrierefrei = this.getBarrierefrei();
            Boolean rhsBarrierefrei;
            rhsBarrierefrei = that.getBarrierefrei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei, (this.barrierefrei!= null), (that.barrierefrei!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAlsFerienwohnungGeeignet;
            lhsAlsFerienwohnungGeeignet = this.getAlsFerienwohnungGeeignet();
            Boolean rhsAlsFerienwohnungGeeignet;
            rhsAlsFerienwohnungGeeignet = that.getAlsFerienwohnungGeeignet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alsFerienwohnungGeeignet", lhsAlsFerienwohnungGeeignet), LocatorUtils.property(thatLocator, "alsFerienwohnungGeeignet", rhsAlsFerienwohnungGeeignet), lhsAlsFerienwohnungGeeignet, rhsAlsFerienwohnungGeeignet, (this.alsFerienwohnungGeeignet!= null), (that.alsFerienwohnungGeeignet!= null))) {
                return false;
            }
        }
        {
            StellplatzKategorieTyp lhsParkplatz;
            lhsParkplatz = this.getParkplatz();
            StellplatzKategorieTyp rhsParkplatz;
            rhsParkplatz = that.getParkplatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkplatz", lhsParkplatz), LocatorUtils.property(thatLocator, "parkplatz", rhsParkplatz), lhsParkplatz, rhsParkplatz, (this.parkplatz!= null), (that.parkplatz!= null))) {
                return false;
            }
        }
        {
            Long lhsAnzahlGaragenStellplaetze;
            lhsAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
            Long rhsAnzahlGaragenStellplaetze;
            rhsAnzahlGaragenStellplaetze = that.getAnzahlGaragenStellplaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGaragenStellplaetze", lhsAnzahlGaragenStellplaetze), LocatorUtils.property(thatLocator, "anzahlGaragenStellplaetze", rhsAnzahlGaragenStellplaetze), lhsAnzahlGaragenStellplaetze, rhsAnzahlGaragenStellplaetze, (this.anzahlGaragenStellplaetze!= null), (that.anzahlGaragenStellplaetze!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRollstuhlgerecht;
            lhsRollstuhlgerecht = this.getRollstuhlgerecht();
            Boolean rhsRollstuhlgerecht;
            rhsRollstuhlgerecht = that.getRollstuhlgerecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rollstuhlgerecht", lhsRollstuhlgerecht), LocatorUtils.property(thatLocator, "rollstuhlgerecht", rhsRollstuhlgerecht), lhsRollstuhlgerecht, rhsRollstuhlgerecht, (this.rollstuhlgerecht!= null), (that.rollstuhlgerecht!= null))) {
                return false;
            }
        }
        {
            String lhsFreiAb;
            lhsFreiAb = this.getFreiAb();
            String rhsFreiAb;
            rhsFreiAb = that.getFreiAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb, (this.freiAb!= null), (that.freiAb!= null))) {
                return false;
            }
        }
        {
            AusstattungsqualitaetsTyp lhsAusstattungsqualitaet;
            lhsAusstattungsqualitaet = this.getAusstattungsqualitaet();
            AusstattungsqualitaetsTyp rhsAusstattungsqualitaet;
            rhsAusstattungsqualitaet = that.getAusstattungsqualitaet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattungsqualitaet", lhsAusstattungsqualitaet), LocatorUtils.property(thatLocator, "ausstattungsqualitaet", rhsAusstattungsqualitaet), lhsAusstattungsqualitaet, rhsAusstattungsqualitaet, (this.ausstattungsqualitaet!= null), (that.ausstattungsqualitaet!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
