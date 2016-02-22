
package org.openestate.io.openimmo.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * Java class for &lt;betriebskostennetto&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "betriebskostennetto")
public class Betriebskostennetto implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal value;
    @XmlAttribute(name = "betriebskostenust")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal betriebskostenust;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the betriebskostenust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getBetriebskostenust() {
        return betriebskostenust;
    }

    /**
     * Sets the value of the betriebskostenust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetriebskostenust(BigDecimal value) {
        this.betriebskostenust = value;
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
            BigDecimal theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            BigDecimal theBetriebskostenust;
            theBetriebskostenust = this.getBetriebskostenust();
            strategy.appendField(locator, this, "betriebskostenust", buffer, theBetriebskostenust, (this.betriebskostenust!= null));
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
        if (draftCopy instanceof Betriebskostennetto) {
            final Betriebskostennetto copy = ((Betriebskostennetto) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceValue;
                    sourceValue = this.getValue();
                    BigDecimal copyValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean betriebskostenustShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betriebskostenust!= null));
                if (betriebskostenustShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBetriebskostenust;
                    sourceBetriebskostenust = this.getBetriebskostenust();
                    BigDecimal copyBetriebskostenust = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "betriebskostenust", sourceBetriebskostenust), sourceBetriebskostenust, (this.betriebskostenust!= null)));
                    copy.setBetriebskostenust(copyBetriebskostenust);
                } else {
                    if (betriebskostenustShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betriebskostenust = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Betriebskostennetto();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Betriebskostennetto that = ((Betriebskostennetto) object);
        {
            BigDecimal lhsValue;
            lhsValue = this.getValue();
            BigDecimal rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBetriebskostenust;
            lhsBetriebskostenust = this.getBetriebskostenust();
            BigDecimal rhsBetriebskostenust;
            rhsBetriebskostenust = that.getBetriebskostenust();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebskostenust", lhsBetriebskostenust), LocatorUtils.property(thatLocator, "betriebskostenust", rhsBetriebskostenust), lhsBetriebskostenust, rhsBetriebskostenust, (this.betriebskostenust!= null), (that.betriebskostenust!= null))) {
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
