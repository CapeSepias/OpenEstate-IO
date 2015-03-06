
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 *       &lt;attribute name="parken_typ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="STELLPLATZ"/>
 *             &lt;enumeration value="CARPORT"/>
 *             &lt;enumeration value="DOPPELGARAGE"/>
 *             &lt;enumeration value="DUPLEX"/>
 *             &lt;enumeration value="TIEFGARAGE"/>
 *             &lt;enumeration value="BOOTSLIEGEPLATZ"/>
 *             &lt;enumeration value="EINZELGARAGE"/>
 *             &lt;enumeration value="PARKHAUS"/>
 *             &lt;enumeration value="TIEFGARAGENSTELLPLATZ"/>
 *             &lt;enumeration value="PARKPLATZ_STROM"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "parken")
public class Parken
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "parken_typ")
    protected Parken.ParkenTyp parkenTyp;

    /**
     * Gets the value of the parkenTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Parken.ParkenTyp }
     *     
     */
    public Parken.ParkenTyp getParkenTyp() {
        return parkenTyp;
    }

    /**
     * Sets the value of the parkenTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parken.ParkenTyp }
     *     
     */
    public void setParkenTyp(Parken.ParkenTyp value) {
        this.parkenTyp = value;
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
            Parken.ParkenTyp theParkenTyp;
            theParkenTyp = this.getParkenTyp();
            strategy.appendField(locator, this, "parkenTyp", buffer, theParkenTyp);
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
        if (draftCopy instanceof Parken) {
            final Parken copy = ((Parken) draftCopy);
            if (this.parkenTyp!= null) {
                Parken.ParkenTyp sourceParkenTyp;
                sourceParkenTyp = this.getParkenTyp();
                Parken.ParkenTyp copyParkenTyp = ((Parken.ParkenTyp) strategy.copy(LocatorUtils.property(locator, "parkenTyp", sourceParkenTyp), sourceParkenTyp));
                copy.setParkenTyp(copyParkenTyp);
            } else {
                copy.parkenTyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Parken();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Parken)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Parken that = ((Parken) object);
        {
            Parken.ParkenTyp lhsParkenTyp;
            lhsParkenTyp = this.getParkenTyp();
            Parken.ParkenTyp rhsParkenTyp;
            rhsParkenTyp = that.getParkenTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkenTyp", lhsParkenTyp), LocatorUtils.property(thatLocator, "parkenTyp", rhsParkenTyp), lhsParkenTyp, rhsParkenTyp)) {
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
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="STELLPLATZ"/>
     *     &lt;enumeration value="CARPORT"/>
     *     &lt;enumeration value="DOPPELGARAGE"/>
     *     &lt;enumeration value="DUPLEX"/>
     *     &lt;enumeration value="TIEFGARAGE"/>
     *     &lt;enumeration value="BOOTSLIEGEPLATZ"/>
     *     &lt;enumeration value="EINZELGARAGE"/>
     *     &lt;enumeration value="PARKHAUS"/>
     *     &lt;enumeration value="TIEFGARAGENSTELLPLATZ"/>
     *     &lt;enumeration value="PARKPLATZ_STROM"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ParkenTyp {

        STELLPLATZ,
        CARPORT,
        DOPPELGARAGE,
        DUPLEX,
        TIEFGARAGE,
        BOOTSLIEGEPLATZ,
        EINZELGARAGE,
        PARKHAUS,
        TIEFGARAGENSTELLPLATZ,
        PARKPLATZ_STROM;

        public String value() {
            return name();
        }

        public static Parken.ParkenTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
