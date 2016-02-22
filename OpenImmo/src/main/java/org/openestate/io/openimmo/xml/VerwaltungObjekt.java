
package org.openestate.io.openimmo.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Java class for &lt;verwaltung_objekt&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objektadresseFreigeben",
    "verfuegbarAb",
    "abdatum",
    "bisdatum",
    "minMietdauer",
    "maxMietdauer",
    "versteigerungstermin",
    "wbsSozialwohnung",
    "vermietet",
    "gruppennummer",
    "zugang",
    "laufzeit",
    "maxPersonen",
    "nichtraucher",
    "haustiere",
    "geschlecht",
    "denkmalgeschuetzt",
    "alsFerien",
    "gewerblicheNutzung",
    "branchen",
    "hochhaus",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "verwaltung_objekt")
public class VerwaltungObjekt implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "objektadresse_freigeben")
    protected Boolean objektadresseFreigeben;
    @XmlElement(name = "verfuegbar_ab")
    protected String verfuegbarAb;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar abdatum;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar bisdatum;
    @XmlElement(name = "min_mietdauer")
    protected MinMietdauer minMietdauer;
    @XmlElement(name = "max_mietdauer")
    protected MaxMietdauer maxMietdauer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar versteigerungstermin;
    @XmlElement(name = "wbs_sozialwohnung")
    protected Boolean wbsSozialwohnung;
    protected Boolean vermietet;
    protected String gruppennummer;
    protected String zugang;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal laufzeit;
    @XmlElement(name = "max_personen", type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxPersonen;
    protected Boolean nichtraucher;
    protected Boolean haustiere;
    protected Geschlecht geschlecht;
    protected Boolean denkmalgeschuetzt;
    @XmlElement(name = "als_ferien")
    protected Boolean alsFerien;
    @XmlElement(name = "gewerbliche_nutzung")
    protected Boolean gewerblicheNutzung;
    protected String branchen;
    protected Boolean hochhaus;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the objektadresseFreigeben property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObjektadresseFreigeben() {
        return objektadresseFreigeben;
    }

    /**
     * Sets the value of the objektadresseFreigeben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObjektadresseFreigeben(Boolean value) {
        this.objektadresseFreigeben = value;
    }

    /**
     * Gets the value of the verfuegbarAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerfuegbarAb() {
        return verfuegbarAb;
    }

    /**
     * Sets the value of the verfuegbarAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerfuegbarAb(String value) {
        this.verfuegbarAb = value;
    }

    /**
     * Gets the value of the abdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAbdatum() {
        return abdatum;
    }

    /**
     * Sets the value of the abdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbdatum(Calendar value) {
        this.abdatum = value;
    }

    /**
     * Gets the value of the bisdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBisdatum() {
        return bisdatum;
    }

    /**
     * Sets the value of the bisdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBisdatum(Calendar value) {
        this.bisdatum = value;
    }

    /**
     * Gets the value of the minMietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link MinMietdauer }
     *     
     */
    public MinMietdauer getMinMietdauer() {
        return minMietdauer;
    }

    /**
     * Sets the value of the minMietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMietdauer }
     *     
     */
    public void setMinMietdauer(MinMietdauer value) {
        this.minMietdauer = value;
    }

    /**
     * Gets the value of the maxMietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link MaxMietdauer }
     *     
     */
    public MaxMietdauer getMaxMietdauer() {
        return maxMietdauer;
    }

    /**
     * Sets the value of the maxMietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxMietdauer }
     *     
     */
    public void setMaxMietdauer(MaxMietdauer value) {
        this.maxMietdauer = value;
    }

    /**
     * Gets the value of the versteigerungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getVersteigerungstermin() {
        return versteigerungstermin;
    }

    /**
     * Sets the value of the versteigerungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersteigerungstermin(Calendar value) {
        this.versteigerungstermin = value;
    }

    /**
     * Gets the value of the wbsSozialwohnung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWbsSozialwohnung() {
        return wbsSozialwohnung;
    }

    /**
     * Sets the value of the wbsSozialwohnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWbsSozialwohnung(Boolean value) {
        this.wbsSozialwohnung = value;
    }

    /**
     * Gets the value of the vermietet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVermietet() {
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
    public void setVermietet(Boolean value) {
        this.vermietet = value;
    }

    /**
     * Gets the value of the gruppennummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGruppennummer() {
        return gruppennummer;
    }

    /**
     * Sets the value of the gruppennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGruppennummer(String value) {
        this.gruppennummer = value;
    }

    /**
     * Gets the value of the zugang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZugang() {
        return zugang;
    }

    /**
     * Sets the value of the zugang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZugang(String value) {
        this.zugang = value;
    }

    /**
     * Gets the value of the laufzeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLaufzeit() {
        return laufzeit;
    }

    /**
     * Sets the value of the laufzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaufzeit(BigDecimal value) {
        this.laufzeit = value;
    }

    /**
     * Gets the value of the maxPersonen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getMaxPersonen() {
        return maxPersonen;
    }

    /**
     * Sets the value of the maxPersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPersonen(BigInteger value) {
        this.maxPersonen = value;
    }

    /**
     * Gets the value of the nichtraucher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNichtraucher() {
        return nichtraucher;
    }

    /**
     * Sets the value of the nichtraucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNichtraucher(Boolean value) {
        this.nichtraucher = value;
    }

    /**
     * Gets the value of the haustiere property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHaustiere() {
        return haustiere;
    }

    /**
     * Sets the value of the haustiere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaustiere(Boolean value) {
        this.haustiere = value;
    }

    /**
     * Gets the value of the geschlecht property.
     * 
     * @return
     *     possible object is
     *     {@link Geschlecht }
     *     
     */
    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the value of the geschlecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geschlecht }
     *     
     */
    public void setGeschlecht(Geschlecht value) {
        this.geschlecht = value;
    }

    /**
     * Gets the value of the denkmalgeschuetzt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDenkmalgeschuetzt() {
        return denkmalgeschuetzt;
    }

    /**
     * Sets the value of the denkmalgeschuetzt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDenkmalgeschuetzt(Boolean value) {
        this.denkmalgeschuetzt = value;
    }

    /**
     * Gets the value of the alsFerien property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlsFerien() {
        return alsFerien;
    }

    /**
     * Sets the value of the alsFerien property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlsFerien(Boolean value) {
        this.alsFerien = value;
    }

    /**
     * Gets the value of the gewerblicheNutzung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGewerblicheNutzung() {
        return gewerblicheNutzung;
    }

    /**
     * Sets the value of the gewerblicheNutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGewerblicheNutzung(Boolean value) {
        this.gewerblicheNutzung = value;
    }

    /**
     * Gets the value of the branchen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchen() {
        return branchen;
    }

    /**
     * Sets the value of the branchen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchen(String value) {
        this.branchen = value;
    }

    /**
     * Gets the value of the hochhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHochhaus() {
        return hochhaus;
    }

    /**
     * Sets the value of the hochhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHochhaus(Boolean value) {
        this.hochhaus = value;
    }

    /**
     * Gets the value of the userDefinedSimplefield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedSimplefield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedSimplefield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedSimplefield }
     * 
     * 
     */
    public List<UserDefinedSimplefield> getUserDefinedSimplefield() {
        if (userDefinedSimplefield == null) {
            userDefinedSimplefield = new ArrayList<UserDefinedSimplefield>();
        }
        return this.userDefinedSimplefield;
    }

    /**
     * Gets the value of the userDefinedAnyfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedAnyfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedAnyfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedAnyfield }
     * 
     * 
     */
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
    }

    /**
     * Gets the value of the userDefinedExtend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedExtend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedExtend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedExtend }
     * 
     * 
     */
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theObjektadresseFreigeben;
            theObjektadresseFreigeben = this.isObjektadresseFreigeben();
            strategy.appendField(locator, this, "objektadresseFreigeben", buffer, theObjektadresseFreigeben, (this.objektadresseFreigeben!= null));
        }
        {
            String theVerfuegbarAb;
            theVerfuegbarAb = this.getVerfuegbarAb();
            strategy.appendField(locator, this, "verfuegbarAb", buffer, theVerfuegbarAb, (this.verfuegbarAb!= null));
        }
        {
            Calendar theAbdatum;
            theAbdatum = this.getAbdatum();
            strategy.appendField(locator, this, "abdatum", buffer, theAbdatum, (this.abdatum!= null));
        }
        {
            Calendar theBisdatum;
            theBisdatum = this.getBisdatum();
            strategy.appendField(locator, this, "bisdatum", buffer, theBisdatum, (this.bisdatum!= null));
        }
        {
            MinMietdauer theMinMietdauer;
            theMinMietdauer = this.getMinMietdauer();
            strategy.appendField(locator, this, "minMietdauer", buffer, theMinMietdauer, (this.minMietdauer!= null));
        }
        {
            MaxMietdauer theMaxMietdauer;
            theMaxMietdauer = this.getMaxMietdauer();
            strategy.appendField(locator, this, "maxMietdauer", buffer, theMaxMietdauer, (this.maxMietdauer!= null));
        }
        {
            Calendar theVersteigerungstermin;
            theVersteigerungstermin = this.getVersteigerungstermin();
            strategy.appendField(locator, this, "versteigerungstermin", buffer, theVersteigerungstermin, (this.versteigerungstermin!= null));
        }
        {
            Boolean theWbsSozialwohnung;
            theWbsSozialwohnung = this.isWbsSozialwohnung();
            strategy.appendField(locator, this, "wbsSozialwohnung", buffer, theWbsSozialwohnung, (this.wbsSozialwohnung!= null));
        }
        {
            Boolean theVermietet;
            theVermietet = this.isVermietet();
            strategy.appendField(locator, this, "vermietet", buffer, theVermietet, (this.vermietet!= null));
        }
        {
            String theGruppennummer;
            theGruppennummer = this.getGruppennummer();
            strategy.appendField(locator, this, "gruppennummer", buffer, theGruppennummer, (this.gruppennummer!= null));
        }
        {
            String theZugang;
            theZugang = this.getZugang();
            strategy.appendField(locator, this, "zugang", buffer, theZugang, (this.zugang!= null));
        }
        {
            BigDecimal theLaufzeit;
            theLaufzeit = this.getLaufzeit();
            strategy.appendField(locator, this, "laufzeit", buffer, theLaufzeit, (this.laufzeit!= null));
        }
        {
            BigInteger theMaxPersonen;
            theMaxPersonen = this.getMaxPersonen();
            strategy.appendField(locator, this, "maxPersonen", buffer, theMaxPersonen, (this.maxPersonen!= null));
        }
        {
            Boolean theNichtraucher;
            theNichtraucher = this.isNichtraucher();
            strategy.appendField(locator, this, "nichtraucher", buffer, theNichtraucher, (this.nichtraucher!= null));
        }
        {
            Boolean theHaustiere;
            theHaustiere = this.isHaustiere();
            strategy.appendField(locator, this, "haustiere", buffer, theHaustiere, (this.haustiere!= null));
        }
        {
            Geschlecht theGeschlecht;
            theGeschlecht = this.getGeschlecht();
            strategy.appendField(locator, this, "geschlecht", buffer, theGeschlecht, (this.geschlecht!= null));
        }
        {
            Boolean theDenkmalgeschuetzt;
            theDenkmalgeschuetzt = this.isDenkmalgeschuetzt();
            strategy.appendField(locator, this, "denkmalgeschuetzt", buffer, theDenkmalgeschuetzt, (this.denkmalgeschuetzt!= null));
        }
        {
            Boolean theAlsFerien;
            theAlsFerien = this.isAlsFerien();
            strategy.appendField(locator, this, "alsFerien", buffer, theAlsFerien, (this.alsFerien!= null));
        }
        {
            Boolean theGewerblicheNutzung;
            theGewerblicheNutzung = this.isGewerblicheNutzung();
            strategy.appendField(locator, this, "gewerblicheNutzung", buffer, theGewerblicheNutzung, (this.gewerblicheNutzung!= null));
        }
        {
            String theBranchen;
            theBranchen = this.getBranchen();
            strategy.appendField(locator, this, "branchen", buffer, theBranchen, (this.branchen!= null));
        }
        {
            Boolean theHochhaus;
            theHochhaus = this.isHochhaus();
            strategy.appendField(locator, this, "hochhaus", buffer, theHochhaus, (this.hochhaus!= null));
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())));
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())));
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof VerwaltungObjekt) {
            final VerwaltungObjekt copy = ((VerwaltungObjekt) draftCopy);
            {
                Boolean objektadresseFreigebenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektadresseFreigeben!= null));
                if (objektadresseFreigebenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceObjektadresseFreigeben;
                    sourceObjektadresseFreigeben = this.isObjektadresseFreigeben();
                    Boolean copyObjektadresseFreigeben = ((Boolean) strategy.copy(LocatorUtils.property(locator, "objektadresseFreigeben", sourceObjektadresseFreigeben), sourceObjektadresseFreigeben, (this.objektadresseFreigeben!= null)));
                    copy.setObjektadresseFreigeben(copyObjektadresseFreigeben);
                } else {
                    if (objektadresseFreigebenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektadresseFreigeben = null;
                    }
                }
            }
            {
                Boolean verfuegbarAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verfuegbarAb!= null));
                if (verfuegbarAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVerfuegbarAb;
                    sourceVerfuegbarAb = this.getVerfuegbarAb();
                    String copyVerfuegbarAb = ((String) strategy.copy(LocatorUtils.property(locator, "verfuegbarAb", sourceVerfuegbarAb), sourceVerfuegbarAb, (this.verfuegbarAb!= null)));
                    copy.setVerfuegbarAb(copyVerfuegbarAb);
                } else {
                    if (verfuegbarAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verfuegbarAb = null;
                    }
                }
            }
            {
                Boolean abdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abdatum!= null));
                if (abdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceAbdatum;
                    sourceAbdatum = this.getAbdatum();
                    Calendar copyAbdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "abdatum", sourceAbdatum), sourceAbdatum, (this.abdatum!= null)));
                    copy.setAbdatum(copyAbdatum);
                } else {
                    if (abdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abdatum = null;
                    }
                }
            }
            {
                Boolean bisdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bisdatum!= null));
                if (bisdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceBisdatum;
                    sourceBisdatum = this.getBisdatum();
                    Calendar copyBisdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "bisdatum", sourceBisdatum), sourceBisdatum, (this.bisdatum!= null)));
                    copy.setBisdatum(copyBisdatum);
                } else {
                    if (bisdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bisdatum = null;
                    }
                }
            }
            {
                Boolean minMietdauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minMietdauer!= null));
                if (minMietdauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    MinMietdauer sourceMinMietdauer;
                    sourceMinMietdauer = this.getMinMietdauer();
                    MinMietdauer copyMinMietdauer = ((MinMietdauer) strategy.copy(LocatorUtils.property(locator, "minMietdauer", sourceMinMietdauer), sourceMinMietdauer, (this.minMietdauer!= null)));
                    copy.setMinMietdauer(copyMinMietdauer);
                } else {
                    if (minMietdauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minMietdauer = null;
                    }
                }
            }
            {
                Boolean maxMietdauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxMietdauer!= null));
                if (maxMietdauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    MaxMietdauer sourceMaxMietdauer;
                    sourceMaxMietdauer = this.getMaxMietdauer();
                    MaxMietdauer copyMaxMietdauer = ((MaxMietdauer) strategy.copy(LocatorUtils.property(locator, "maxMietdauer", sourceMaxMietdauer), sourceMaxMietdauer, (this.maxMietdauer!= null)));
                    copy.setMaxMietdauer(copyMaxMietdauer);
                } else {
                    if (maxMietdauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxMietdauer = null;
                    }
                }
            }
            {
                Boolean versteigerungsterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versteigerungstermin!= null));
                if (versteigerungsterminShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceVersteigerungstermin;
                    sourceVersteigerungstermin = this.getVersteigerungstermin();
                    Calendar copyVersteigerungstermin = ((Calendar) strategy.copy(LocatorUtils.property(locator, "versteigerungstermin", sourceVersteigerungstermin), sourceVersteigerungstermin, (this.versteigerungstermin!= null)));
                    copy.setVersteigerungstermin(copyVersteigerungstermin);
                } else {
                    if (versteigerungsterminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versteigerungstermin = null;
                    }
                }
            }
            {
                Boolean wbsSozialwohnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wbsSozialwohnung!= null));
                if (wbsSozialwohnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWbsSozialwohnung;
                    sourceWbsSozialwohnung = this.isWbsSozialwohnung();
                    Boolean copyWbsSozialwohnung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wbsSozialwohnung", sourceWbsSozialwohnung), sourceWbsSozialwohnung, (this.wbsSozialwohnung!= null)));
                    copy.setWbsSozialwohnung(copyWbsSozialwohnung);
                } else {
                    if (wbsSozialwohnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wbsSozialwohnung = null;
                    }
                }
            }
            {
                Boolean vermietetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermietet!= null));
                if (vermietetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVermietet;
                    sourceVermietet = this.isVermietet();
                    Boolean copyVermietet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vermietet", sourceVermietet), sourceVermietet, (this.vermietet!= null)));
                    copy.setVermietet(copyVermietet);
                } else {
                    if (vermietetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermietet = null;
                    }
                }
            }
            {
                Boolean gruppennummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gruppennummer!= null));
                if (gruppennummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGruppennummer;
                    sourceGruppennummer = this.getGruppennummer();
                    String copyGruppennummer = ((String) strategy.copy(LocatorUtils.property(locator, "gruppennummer", sourceGruppennummer), sourceGruppennummer, (this.gruppennummer!= null)));
                    copy.setGruppennummer(copyGruppennummer);
                } else {
                    if (gruppennummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gruppennummer = null;
                    }
                }
            }
            {
                Boolean zugangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zugang!= null));
                if (zugangShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceZugang;
                    sourceZugang = this.getZugang();
                    String copyZugang = ((String) strategy.copy(LocatorUtils.property(locator, "zugang", sourceZugang), sourceZugang, (this.zugang!= null)));
                    copy.setZugang(copyZugang);
                } else {
                    if (zugangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zugang = null;
                    }
                }
            }
            {
                Boolean laufzeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.laufzeit!= null));
                if (laufzeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLaufzeit;
                    sourceLaufzeit = this.getLaufzeit();
                    BigDecimal copyLaufzeit = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "laufzeit", sourceLaufzeit), sourceLaufzeit, (this.laufzeit!= null)));
                    copy.setLaufzeit(copyLaufzeit);
                } else {
                    if (laufzeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.laufzeit = null;
                    }
                }
            }
            {
                Boolean maxPersonenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxPersonen!= null));
                if (maxPersonenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceMaxPersonen;
                    sourceMaxPersonen = this.getMaxPersonen();
                    BigInteger copyMaxPersonen = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maxPersonen", sourceMaxPersonen), sourceMaxPersonen, (this.maxPersonen!= null)));
                    copy.setMaxPersonen(copyMaxPersonen);
                } else {
                    if (maxPersonenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxPersonen = null;
                    }
                }
            }
            {
                Boolean nichtraucherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nichtraucher!= null));
                if (nichtraucherShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNichtraucher;
                    sourceNichtraucher = this.isNichtraucher();
                    Boolean copyNichtraucher = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nichtraucher", sourceNichtraucher), sourceNichtraucher, (this.nichtraucher!= null)));
                    copy.setNichtraucher(copyNichtraucher);
                } else {
                    if (nichtraucherShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nichtraucher = null;
                    }
                }
            }
            {
                Boolean haustiereShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haustiere!= null));
                if (haustiereShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHaustiere;
                    sourceHaustiere = this.isHaustiere();
                    Boolean copyHaustiere = ((Boolean) strategy.copy(LocatorUtils.property(locator, "haustiere", sourceHaustiere), sourceHaustiere, (this.haustiere!= null)));
                    copy.setHaustiere(copyHaustiere);
                } else {
                    if (haustiereShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haustiere = null;
                    }
                }
            }
            {
                Boolean geschlechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschlecht!= null));
                if (geschlechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Geschlecht sourceGeschlecht;
                    sourceGeschlecht = this.getGeschlecht();
                    Geschlecht copyGeschlecht = ((Geschlecht) strategy.copy(LocatorUtils.property(locator, "geschlecht", sourceGeschlecht), sourceGeschlecht, (this.geschlecht!= null)));
                    copy.setGeschlecht(copyGeschlecht);
                } else {
                    if (geschlechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geschlecht = null;
                    }
                }
            }
            {
                Boolean denkmalgeschuetztShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.denkmalgeschuetzt!= null));
                if (denkmalgeschuetztShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDenkmalgeschuetzt;
                    sourceDenkmalgeschuetzt = this.isDenkmalgeschuetzt();
                    Boolean copyDenkmalgeschuetzt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalgeschuetzt", sourceDenkmalgeschuetzt), sourceDenkmalgeschuetzt, (this.denkmalgeschuetzt!= null)));
                    copy.setDenkmalgeschuetzt(copyDenkmalgeschuetzt);
                } else {
                    if (denkmalgeschuetztShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.denkmalgeschuetzt = null;
                    }
                }
            }
            {
                Boolean alsFerienShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alsFerien!= null));
                if (alsFerienShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAlsFerien;
                    sourceAlsFerien = this.isAlsFerien();
                    Boolean copyAlsFerien = ((Boolean) strategy.copy(LocatorUtils.property(locator, "alsFerien", sourceAlsFerien), sourceAlsFerien, (this.alsFerien!= null)));
                    copy.setAlsFerien(copyAlsFerien);
                } else {
                    if (alsFerienShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alsFerien = null;
                    }
                }
            }
            {
                Boolean gewerblicheNutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewerblicheNutzung!= null));
                if (gewerblicheNutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGewerblicheNutzung;
                    sourceGewerblicheNutzung = this.isGewerblicheNutzung();
                    Boolean copyGewerblicheNutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gewerblicheNutzung", sourceGewerblicheNutzung), sourceGewerblicheNutzung, (this.gewerblicheNutzung!= null)));
                    copy.setGewerblicheNutzung(copyGewerblicheNutzung);
                } else {
                    if (gewerblicheNutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewerblicheNutzung = null;
                    }
                }
            }
            {
                Boolean branchenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.branchen!= null));
                if (branchenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBranchen;
                    sourceBranchen = this.getBranchen();
                    String copyBranchen = ((String) strategy.copy(LocatorUtils.property(locator, "branchen", sourceBranchen), sourceBranchen, (this.branchen!= null)));
                    copy.setBranchen(copyBranchen);
                } else {
                    if (branchenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.branchen = null;
                    }
                }
            }
            {
                Boolean hochhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hochhaus!= null));
                if (hochhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHochhaus;
                    sourceHochhaus = this.isHochhaus();
                    Boolean copyHochhaus = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hochhaus", sourceHochhaus), sourceHochhaus, (this.hochhaus!= null)));
                    copy.setHochhaus(copyHochhaus);
                } else {
                    if (hochhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hochhaus = null;
                    }
                }
            }
            {
                Boolean userDefinedSimplefieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())));
                if (userDefinedSimplefieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                    sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))));
                    copy.userDefinedSimplefield = null;
                    if (copyUserDefinedSimplefield!= null) {
                        List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                        uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                    }
                } else {
                    if (userDefinedSimplefieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedSimplefield = null;
                    }
                }
            }
            {
                Boolean userDefinedAnyfieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())));
                if (userDefinedAnyfieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                    sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))));
                    copy.userDefinedAnyfield = null;
                    if (copyUserDefinedAnyfield!= null) {
                        List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                        uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                    }
                } else {
                    if (userDefinedAnyfieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedAnyfield = null;
                    }
                }
            }
            {
                Boolean userDefinedExtendShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
                if (userDefinedExtendShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedExtend> sourceUserDefinedExtend;
                    sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))));
                    copy.userDefinedExtend = null;
                    if (copyUserDefinedExtend!= null) {
                        List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                        uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                    }
                } else {
                    if (userDefinedExtendShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedExtend = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VerwaltungObjekt();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VerwaltungObjekt that = ((VerwaltungObjekt) object);
        {
            Boolean lhsObjektadresseFreigeben;
            lhsObjektadresseFreigeben = this.isObjektadresseFreigeben();
            Boolean rhsObjektadresseFreigeben;
            rhsObjektadresseFreigeben = that.isObjektadresseFreigeben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektadresseFreigeben", lhsObjektadresseFreigeben), LocatorUtils.property(thatLocator, "objektadresseFreigeben", rhsObjektadresseFreigeben), lhsObjektadresseFreigeben, rhsObjektadresseFreigeben, (this.objektadresseFreigeben!= null), (that.objektadresseFreigeben!= null))) {
                return false;
            }
        }
        {
            String lhsVerfuegbarAb;
            lhsVerfuegbarAb = this.getVerfuegbarAb();
            String rhsVerfuegbarAb;
            rhsVerfuegbarAb = that.getVerfuegbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verfuegbarAb", lhsVerfuegbarAb), LocatorUtils.property(thatLocator, "verfuegbarAb", rhsVerfuegbarAb), lhsVerfuegbarAb, rhsVerfuegbarAb, (this.verfuegbarAb!= null), (that.verfuegbarAb!= null))) {
                return false;
            }
        }
        {
            Calendar lhsAbdatum;
            lhsAbdatum = this.getAbdatum();
            Calendar rhsAbdatum;
            rhsAbdatum = that.getAbdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abdatum", lhsAbdatum), LocatorUtils.property(thatLocator, "abdatum", rhsAbdatum), lhsAbdatum, rhsAbdatum, (this.abdatum!= null), (that.abdatum!= null))) {
                return false;
            }
        }
        {
            Calendar lhsBisdatum;
            lhsBisdatum = this.getBisdatum();
            Calendar rhsBisdatum;
            rhsBisdatum = that.getBisdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bisdatum", lhsBisdatum), LocatorUtils.property(thatLocator, "bisdatum", rhsBisdatum), lhsBisdatum, rhsBisdatum, (this.bisdatum!= null), (that.bisdatum!= null))) {
                return false;
            }
        }
        {
            MinMietdauer lhsMinMietdauer;
            lhsMinMietdauer = this.getMinMietdauer();
            MinMietdauer rhsMinMietdauer;
            rhsMinMietdauer = that.getMinMietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minMietdauer", lhsMinMietdauer), LocatorUtils.property(thatLocator, "minMietdauer", rhsMinMietdauer), lhsMinMietdauer, rhsMinMietdauer, (this.minMietdauer!= null), (that.minMietdauer!= null))) {
                return false;
            }
        }
        {
            MaxMietdauer lhsMaxMietdauer;
            lhsMaxMietdauer = this.getMaxMietdauer();
            MaxMietdauer rhsMaxMietdauer;
            rhsMaxMietdauer = that.getMaxMietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxMietdauer", lhsMaxMietdauer), LocatorUtils.property(thatLocator, "maxMietdauer", rhsMaxMietdauer), lhsMaxMietdauer, rhsMaxMietdauer, (this.maxMietdauer!= null), (that.maxMietdauer!= null))) {
                return false;
            }
        }
        {
            Calendar lhsVersteigerungstermin;
            lhsVersteigerungstermin = this.getVersteigerungstermin();
            Calendar rhsVersteigerungstermin;
            rhsVersteigerungstermin = that.getVersteigerungstermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versteigerungstermin", lhsVersteigerungstermin), LocatorUtils.property(thatLocator, "versteigerungstermin", rhsVersteigerungstermin), lhsVersteigerungstermin, rhsVersteigerungstermin, (this.versteigerungstermin!= null), (that.versteigerungstermin!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWbsSozialwohnung;
            lhsWbsSozialwohnung = this.isWbsSozialwohnung();
            Boolean rhsWbsSozialwohnung;
            rhsWbsSozialwohnung = that.isWbsSozialwohnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wbsSozialwohnung", lhsWbsSozialwohnung), LocatorUtils.property(thatLocator, "wbsSozialwohnung", rhsWbsSozialwohnung), lhsWbsSozialwohnung, rhsWbsSozialwohnung, (this.wbsSozialwohnung!= null), (that.wbsSozialwohnung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVermietet;
            lhsVermietet = this.isVermietet();
            Boolean rhsVermietet;
            rhsVermietet = that.isVermietet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietet", lhsVermietet), LocatorUtils.property(thatLocator, "vermietet", rhsVermietet), lhsVermietet, rhsVermietet, (this.vermietet!= null), (that.vermietet!= null))) {
                return false;
            }
        }
        {
            String lhsGruppennummer;
            lhsGruppennummer = this.getGruppennummer();
            String rhsGruppennummer;
            rhsGruppennummer = that.getGruppennummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppennummer", lhsGruppennummer), LocatorUtils.property(thatLocator, "gruppennummer", rhsGruppennummer), lhsGruppennummer, rhsGruppennummer, (this.gruppennummer!= null), (that.gruppennummer!= null))) {
                return false;
            }
        }
        {
            String lhsZugang;
            lhsZugang = this.getZugang();
            String rhsZugang;
            rhsZugang = that.getZugang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zugang", lhsZugang), LocatorUtils.property(thatLocator, "zugang", rhsZugang), lhsZugang, rhsZugang, (this.zugang!= null), (that.zugang!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLaufzeit;
            lhsLaufzeit = this.getLaufzeit();
            BigDecimal rhsLaufzeit;
            rhsLaufzeit = that.getLaufzeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laufzeit", lhsLaufzeit), LocatorUtils.property(thatLocator, "laufzeit", rhsLaufzeit), lhsLaufzeit, rhsLaufzeit, (this.laufzeit!= null), (that.laufzeit!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsMaxPersonen;
            lhsMaxPersonen = this.getMaxPersonen();
            BigInteger rhsMaxPersonen;
            rhsMaxPersonen = that.getMaxPersonen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxPersonen", lhsMaxPersonen), LocatorUtils.property(thatLocator, "maxPersonen", rhsMaxPersonen), lhsMaxPersonen, rhsMaxPersonen, (this.maxPersonen!= null), (that.maxPersonen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNichtraucher;
            lhsNichtraucher = this.isNichtraucher();
            Boolean rhsNichtraucher;
            rhsNichtraucher = that.isNichtraucher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nichtraucher", lhsNichtraucher), LocatorUtils.property(thatLocator, "nichtraucher", rhsNichtraucher), lhsNichtraucher, rhsNichtraucher, (this.nichtraucher!= null), (that.nichtraucher!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHaustiere;
            lhsHaustiere = this.isHaustiere();
            Boolean rhsHaustiere;
            rhsHaustiere = that.isHaustiere();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustiere", lhsHaustiere), LocatorUtils.property(thatLocator, "haustiere", rhsHaustiere), lhsHaustiere, rhsHaustiere, (this.haustiere!= null), (that.haustiere!= null))) {
                return false;
            }
        }
        {
            Geschlecht lhsGeschlecht;
            lhsGeschlecht = this.getGeschlecht();
            Geschlecht rhsGeschlecht;
            rhsGeschlecht = that.getGeschlecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlecht", lhsGeschlecht), LocatorUtils.property(thatLocator, "geschlecht", rhsGeschlecht), lhsGeschlecht, rhsGeschlecht, (this.geschlecht!= null), (that.geschlecht!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalgeschuetzt;
            lhsDenkmalgeschuetzt = this.isDenkmalgeschuetzt();
            Boolean rhsDenkmalgeschuetzt;
            rhsDenkmalgeschuetzt = that.isDenkmalgeschuetzt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalgeschuetzt", lhsDenkmalgeschuetzt), LocatorUtils.property(thatLocator, "denkmalgeschuetzt", rhsDenkmalgeschuetzt), lhsDenkmalgeschuetzt, rhsDenkmalgeschuetzt, (this.denkmalgeschuetzt!= null), (that.denkmalgeschuetzt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAlsFerien;
            lhsAlsFerien = this.isAlsFerien();
            Boolean rhsAlsFerien;
            rhsAlsFerien = that.isAlsFerien();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alsFerien", lhsAlsFerien), LocatorUtils.property(thatLocator, "alsFerien", rhsAlsFerien), lhsAlsFerien, rhsAlsFerien, (this.alsFerien!= null), (that.alsFerien!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGewerblicheNutzung;
            lhsGewerblicheNutzung = this.isGewerblicheNutzung();
            Boolean rhsGewerblicheNutzung;
            rhsGewerblicheNutzung = that.isGewerblicheNutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerblicheNutzung", lhsGewerblicheNutzung), LocatorUtils.property(thatLocator, "gewerblicheNutzung", rhsGewerblicheNutzung), lhsGewerblicheNutzung, rhsGewerblicheNutzung, (this.gewerblicheNutzung!= null), (that.gewerblicheNutzung!= null))) {
                return false;
            }
        }
        {
            String lhsBranchen;
            lhsBranchen = this.getBranchen();
            String rhsBranchen;
            rhsBranchen = that.getBranchen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchen", lhsBranchen), LocatorUtils.property(thatLocator, "branchen", rhsBranchen), lhsBranchen, rhsBranchen, (this.branchen!= null), (that.branchen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHochhaus;
            lhsHochhaus = this.isHochhaus();
            Boolean rhsHochhaus;
            rhsHochhaus = that.isHochhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hochhaus", lhsHochhaus), LocatorUtils.property(thatLocator, "hochhaus", rhsHochhaus), lhsHochhaus, rhsHochhaus, (this.hochhaus!= null), (that.hochhaus!= null))) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())), ((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty())))) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())), ((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty())))) {
                return false;
            }
        }
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())), ((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
