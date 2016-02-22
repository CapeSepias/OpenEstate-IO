
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
 * Java class for &lt;heizkostennetto&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "heizkostennetto")
public class Heizkostennetto implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal value;
    @XmlAttribute(name = "heizkostenust")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal heizkostenust;

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
     * Gets the value of the heizkostenust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getHeizkostenust() {
        return heizkostenust;
    }

    /**
     * Sets the value of the heizkostenust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeizkostenust(BigDecimal value) {
        this.heizkostenust = value;
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
            BigDecimal theHeizkostenust;
            theHeizkostenust = this.getHeizkostenust();
            strategy.appendField(locator, this, "heizkostenust", buffer, theHeizkostenust, (this.heizkostenust!= null));
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
        if (draftCopy instanceof Heizkostennetto) {
            final Heizkostennetto copy = ((Heizkostennetto) draftCopy);
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
                Boolean heizkostenustShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizkostenust!= null));
                if (heizkostenustShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHeizkostenust;
                    sourceHeizkostenust = this.getHeizkostenust();
                    BigDecimal copyHeizkostenust = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heizkostenust", sourceHeizkostenust), sourceHeizkostenust, (this.heizkostenust!= null)));
                    copy.setHeizkostenust(copyHeizkostenust);
                } else {
                    if (heizkostenustShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizkostenust = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Heizkostennetto();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Heizkostennetto that = ((Heizkostennetto) object);
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
            BigDecimal lhsHeizkostenust;
            lhsHeizkostenust = this.getHeizkostenust();
            BigDecimal rhsHeizkostenust;
            rhsHeizkostenust = that.getHeizkostenust();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkostenust", lhsHeizkostenust), LocatorUtils.property(thatLocator, "heizkostenust", rhsHeizkostenust), lhsHeizkostenust, rhsHeizkostenust, (this.heizkostenust!= null), (that.heizkostenust!= null))) {
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
