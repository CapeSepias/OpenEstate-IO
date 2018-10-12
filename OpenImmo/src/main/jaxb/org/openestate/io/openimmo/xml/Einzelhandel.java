
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
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
 * Java class for &lt;einzelhandel&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "einzelhandel")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class Einzelhandel implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "handel_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Einzelhandel.HandelTyp handelTyp;

    /**
     * Gets the value of the handelTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Einzelhandel.HandelTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Einzelhandel.HandelTyp getHandelTyp() {
        return handelTyp;
    }

    /**
     * Sets the value of the handelTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Einzelhandel.HandelTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setHandelTyp(Einzelhandel.HandelTyp value) {
        this.handelTyp = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Einzelhandel.HandelTyp theHandelTyp;
            theHandelTyp = this.getHandelTyp();
            strategy.appendField(locator, this, "handelTyp", buffer, theHandelTyp, (this.handelTyp!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Einzelhandel) {
            final Einzelhandel copy = ((Einzelhandel) draftCopy);
            {
                Boolean handelTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handelTyp!= null));
                if (handelTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Einzelhandel.HandelTyp sourceHandelTyp;
                    sourceHandelTyp = this.getHandelTyp();
                    Einzelhandel.HandelTyp copyHandelTyp = ((Einzelhandel.HandelTyp) strategy.copy(LocatorUtils.property(locator, "handelTyp", sourceHandelTyp), sourceHandelTyp, (this.handelTyp!= null)));
                    copy.setHandelTyp(copyHandelTyp);
                } else {
                    if (handelTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handelTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Einzelhandel();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Einzelhandel that = ((Einzelhandel) object);
        {
            Einzelhandel.HandelTyp lhsHandelTyp;
            lhsHandelTyp = this.getHandelTyp();
            Einzelhandel.HandelTyp rhsHandelTyp;
            rhsHandelTyp = that.getHandelTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handelTyp", lhsHandelTyp), LocatorUtils.property(thatLocator, "handelTyp", rhsHandelTyp), lhsHandelTyp, rhsHandelTyp, (this.handelTyp!= null), (that.handelTyp!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>handel_typ</em> attribute in &lt;einzelhandel&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="LADENLOKAL"/&gt;
     *     &lt;enumeration value="EINZELHANDELSLADEN"/&gt;
     *     &lt;enumeration value="VERBRAUCHERMARKT"/&gt;
     *     &lt;enumeration value="EINKAUFSZENTRUM"/&gt;
     *     &lt;enumeration value="KAUFHAUS"/&gt;
     *     &lt;enumeration value="FACTORY_OUTLET"/&gt;
     *     &lt;enumeration value="KIOSK"/&gt;
     *     &lt;enumeration value="VERKAUFSFLAECHE"/&gt;
     *     &lt;enumeration value="AUSSTELLUNGSFLAECHE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public enum HandelTyp {

        LADENLOKAL,
        EINZELHANDELSLADEN,
        VERBRAUCHERMARKT,
        EINKAUFSZENTRUM,
        KAUFHAUS,
        FACTORY_OUTLET,
        KIOSK,
        VERKAUFSFLAECHE,
        AUSSTELLUNGSFLAECHE;

        public String value() {
            return name();
        }

        public static Einzelhandel.HandelTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
