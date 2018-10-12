
package org.openestate.io.kyero.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for langType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="langType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="da" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="es" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "langType", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
public class LangType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String ca;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String de;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String da;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String en;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String es;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String fi;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String fr;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String it;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String nl;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String no;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String pt;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String ru;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected String sv;

    /**
     * Gets the value of the ca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getCa() {
        return ca;
    }

    /**
     * Sets the value of the ca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setCa(String value) {
        this.ca = value;
    }

    /**
     * Gets the value of the de property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getDe() {
        return de;
    }

    /**
     * Sets the value of the de property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setDe(String value) {
        this.de = value;
    }

    /**
     * Gets the value of the da property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getDa() {
        return da;
    }

    /**
     * Sets the value of the da property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setDa(String value) {
        this.da = value;
    }

    /**
     * Gets the value of the en property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getEn() {
        return en;
    }

    /**
     * Sets the value of the en property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setEn(String value) {
        this.en = value;
    }

    /**
     * Gets the value of the es property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getEs() {
        return es;
    }

    /**
     * Sets the value of the es property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setEs(String value) {
        this.es = value;
    }

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getFi() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setFi(String value) {
        this.fi = value;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setFr(String value) {
        this.fr = value;
    }

    /**
     * Gets the value of the it property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getIt() {
        return it;
    }

    /**
     * Sets the value of the it property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setIt(String value) {
        this.it = value;
    }

    /**
     * Gets the value of the nl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getNl() {
        return nl;
    }

    /**
     * Sets the value of the nl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setNl(String value) {
        this.nl = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the pt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getPt() {
        return pt;
    }

    /**
     * Sets the value of the pt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setPt(String value) {
        this.pt = value;
    }

    /**
     * Gets the value of the ru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getRu() {
        return ru;
    }

    /**
     * Sets the value of the ru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setRu(String value) {
        this.ru = value;
    }

    /**
     * Gets the value of the sv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String getSv() {
        return sv;
    }

    /**
     * Sets the value of the sv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setSv(String value) {
        this.sv = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theCa;
            theCa = this.getCa();
            strategy.appendField(locator, this, "ca", buffer, theCa, (this.ca!= null));
        }
        {
            String theDe;
            theDe = this.getDe();
            strategy.appendField(locator, this, "de", buffer, theDe, (this.de!= null));
        }
        {
            String theDa;
            theDa = this.getDa();
            strategy.appendField(locator, this, "da", buffer, theDa, (this.da!= null));
        }
        {
            String theEn;
            theEn = this.getEn();
            strategy.appendField(locator, this, "en", buffer, theEn, (this.en!= null));
        }
        {
            String theEs;
            theEs = this.getEs();
            strategy.appendField(locator, this, "es", buffer, theEs, (this.es!= null));
        }
        {
            String theFi;
            theFi = this.getFi();
            strategy.appendField(locator, this, "fi", buffer, theFi, (this.fi!= null));
        }
        {
            String theFr;
            theFr = this.getFr();
            strategy.appendField(locator, this, "fr", buffer, theFr, (this.fr!= null));
        }
        {
            String theIt;
            theIt = this.getIt();
            strategy.appendField(locator, this, "it", buffer, theIt, (this.it!= null));
        }
        {
            String theNl;
            theNl = this.getNl();
            strategy.appendField(locator, this, "nl", buffer, theNl, (this.nl!= null));
        }
        {
            String theNo;
            theNo = this.getNo();
            strategy.appendField(locator, this, "no", buffer, theNo, (this.no!= null));
        }
        {
            String thePt;
            thePt = this.getPt();
            strategy.appendField(locator, this, "pt", buffer, thePt, (this.pt!= null));
        }
        {
            String theRu;
            theRu = this.getRu();
            strategy.appendField(locator, this, "ru", buffer, theRu, (this.ru!= null));
        }
        {
            String theSv;
            theSv = this.getSv();
            strategy.appendField(locator, this, "sv", buffer, theSv, (this.sv!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof LangType) {
            final LangType copy = ((LangType) draftCopy);
            {
                Boolean caShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ca!= null));
                if (caShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCa;
                    sourceCa = this.getCa();
                    String copyCa = ((String) strategy.copy(LocatorUtils.property(locator, "ca", sourceCa), sourceCa, (this.ca!= null)));
                    copy.setCa(copyCa);
                } else {
                    if (caShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ca = null;
                    }
                }
            }
            {
                Boolean deShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.de!= null));
                if (deShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDe;
                    sourceDe = this.getDe();
                    String copyDe = ((String) strategy.copy(LocatorUtils.property(locator, "de", sourceDe), sourceDe, (this.de!= null)));
                    copy.setDe(copyDe);
                } else {
                    if (deShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.de = null;
                    }
                }
            }
            {
                Boolean daShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.da!= null));
                if (daShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDa;
                    sourceDa = this.getDa();
                    String copyDa = ((String) strategy.copy(LocatorUtils.property(locator, "da", sourceDa), sourceDa, (this.da!= null)));
                    copy.setDa(copyDa);
                } else {
                    if (daShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.da = null;
                    }
                }
            }
            {
                Boolean enShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.en!= null));
                if (enShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEn;
                    sourceEn = this.getEn();
                    String copyEn = ((String) strategy.copy(LocatorUtils.property(locator, "en", sourceEn), sourceEn, (this.en!= null)));
                    copy.setEn(copyEn);
                } else {
                    if (enShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.en = null;
                    }
                }
            }
            {
                Boolean esShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.es!= null));
                if (esShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEs;
                    sourceEs = this.getEs();
                    String copyEs = ((String) strategy.copy(LocatorUtils.property(locator, "es", sourceEs), sourceEs, (this.es!= null)));
                    copy.setEs(copyEs);
                } else {
                    if (esShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.es = null;
                    }
                }
            }
            {
                Boolean fiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fi!= null));
                if (fiShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFi;
                    sourceFi = this.getFi();
                    String copyFi = ((String) strategy.copy(LocatorUtils.property(locator, "fi", sourceFi), sourceFi, (this.fi!= null)));
                    copy.setFi(copyFi);
                } else {
                    if (fiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fi = null;
                    }
                }
            }
            {
                Boolean frShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fr!= null));
                if (frShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFr;
                    sourceFr = this.getFr();
                    String copyFr = ((String) strategy.copy(LocatorUtils.property(locator, "fr", sourceFr), sourceFr, (this.fr!= null)));
                    copy.setFr(copyFr);
                } else {
                    if (frShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fr = null;
                    }
                }
            }
            {
                Boolean itShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.it!= null));
                if (itShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIt;
                    sourceIt = this.getIt();
                    String copyIt = ((String) strategy.copy(LocatorUtils.property(locator, "it", sourceIt), sourceIt, (this.it!= null)));
                    copy.setIt(copyIt);
                } else {
                    if (itShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.it = null;
                    }
                }
            }
            {
                Boolean nlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nl!= null));
                if (nlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNl;
                    sourceNl = this.getNl();
                    String copyNl = ((String) strategy.copy(LocatorUtils.property(locator, "nl", sourceNl), sourceNl, (this.nl!= null)));
                    copy.setNl(copyNl);
                } else {
                    if (nlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nl = null;
                    }
                }
            }
            {
                Boolean noShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.no!= null));
                if (noShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNo;
                    sourceNo = this.getNo();
                    String copyNo = ((String) strategy.copy(LocatorUtils.property(locator, "no", sourceNo), sourceNo, (this.no!= null)));
                    copy.setNo(copyNo);
                } else {
                    if (noShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.no = null;
                    }
                }
            }
            {
                Boolean ptShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pt!= null));
                if (ptShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePt;
                    sourcePt = this.getPt();
                    String copyPt = ((String) strategy.copy(LocatorUtils.property(locator, "pt", sourcePt), sourcePt, (this.pt!= null)));
                    copy.setPt(copyPt);
                } else {
                    if (ptShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pt = null;
                    }
                }
            }
            {
                Boolean ruShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ru!= null));
                if (ruShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRu;
                    sourceRu = this.getRu();
                    String copyRu = ((String) strategy.copy(LocatorUtils.property(locator, "ru", sourceRu), sourceRu, (this.ru!= null)));
                    copy.setRu(copyRu);
                } else {
                    if (ruShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ru = null;
                    }
                }
            }
            {
                Boolean svShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sv!= null));
                if (svShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSv;
                    sourceSv = this.getSv();
                    String copySv = ((String) strategy.copy(LocatorUtils.property(locator, "sv", sourceSv), sourceSv, (this.sv!= null)));
                    copy.setSv(copySv);
                } else {
                    if (svShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sv = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new LangType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LangType that = ((LangType) object);
        {
            String lhsCa;
            lhsCa = this.getCa();
            String rhsCa;
            rhsCa = that.getCa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ca", lhsCa), LocatorUtils.property(thatLocator, "ca", rhsCa), lhsCa, rhsCa, (this.ca!= null), (that.ca!= null))) {
                return false;
            }
        }
        {
            String lhsDe;
            lhsDe = this.getDe();
            String rhsDe;
            rhsDe = that.getDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "de", lhsDe), LocatorUtils.property(thatLocator, "de", rhsDe), lhsDe, rhsDe, (this.de!= null), (that.de!= null))) {
                return false;
            }
        }
        {
            String lhsDa;
            lhsDa = this.getDa();
            String rhsDa;
            rhsDa = that.getDa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "da", lhsDa), LocatorUtils.property(thatLocator, "da", rhsDa), lhsDa, rhsDa, (this.da!= null), (that.da!= null))) {
                return false;
            }
        }
        {
            String lhsEn;
            lhsEn = this.getEn();
            String rhsEn;
            rhsEn = that.getEn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "en", lhsEn), LocatorUtils.property(thatLocator, "en", rhsEn), lhsEn, rhsEn, (this.en!= null), (that.en!= null))) {
                return false;
            }
        }
        {
            String lhsEs;
            lhsEs = this.getEs();
            String rhsEs;
            rhsEs = that.getEs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "es", lhsEs), LocatorUtils.property(thatLocator, "es", rhsEs), lhsEs, rhsEs, (this.es!= null), (that.es!= null))) {
                return false;
            }
        }
        {
            String lhsFi;
            lhsFi = this.getFi();
            String rhsFi;
            rhsFi = that.getFi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fi", lhsFi), LocatorUtils.property(thatLocator, "fi", rhsFi), lhsFi, rhsFi, (this.fi!= null), (that.fi!= null))) {
                return false;
            }
        }
        {
            String lhsFr;
            lhsFr = this.getFr();
            String rhsFr;
            rhsFr = that.getFr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fr", lhsFr), LocatorUtils.property(thatLocator, "fr", rhsFr), lhsFr, rhsFr, (this.fr!= null), (that.fr!= null))) {
                return false;
            }
        }
        {
            String lhsIt;
            lhsIt = this.getIt();
            String rhsIt;
            rhsIt = that.getIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "it", lhsIt), LocatorUtils.property(thatLocator, "it", rhsIt), lhsIt, rhsIt, (this.it!= null), (that.it!= null))) {
                return false;
            }
        }
        {
            String lhsNl;
            lhsNl = this.getNl();
            String rhsNl;
            rhsNl = that.getNl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nl", lhsNl), LocatorUtils.property(thatLocator, "nl", rhsNl), lhsNl, rhsNl, (this.nl!= null), (that.nl!= null))) {
                return false;
            }
        }
        {
            String lhsNo;
            lhsNo = this.getNo();
            String rhsNo;
            rhsNo = that.getNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "no", lhsNo), LocatorUtils.property(thatLocator, "no", rhsNo), lhsNo, rhsNo, (this.no!= null), (that.no!= null))) {
                return false;
            }
        }
        {
            String lhsPt;
            lhsPt = this.getPt();
            String rhsPt;
            rhsPt = that.getPt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pt", lhsPt), LocatorUtils.property(thatLocator, "pt", rhsPt), lhsPt, rhsPt, (this.pt!= null), (that.pt!= null))) {
                return false;
            }
        }
        {
            String lhsRu;
            lhsRu = this.getRu();
            String rhsRu;
            rhsRu = that.getRu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ru", lhsRu), LocatorUtils.property(thatLocator, "ru", rhsRu), lhsRu, rhsRu, (this.ru!= null), (that.ru!= null))) {
                return false;
            }
        }
        {
            String lhsSv;
            lhsSv = this.getSv();
            String rhsSv;
            rhsSv = that.getSv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sv", lhsSv), LocatorUtils.property(thatLocator, "sv", rhsSv), lhsSv, rhsSv, (this.sv!= null), (that.sv!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
