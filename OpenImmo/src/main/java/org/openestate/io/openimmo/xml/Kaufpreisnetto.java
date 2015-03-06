
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="kaufpreisust" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "kaufpreisnetto")
public class Kaufpreisnetto
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    protected Double value;
    @XmlAttribute(name = "kaufpreisust")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    protected Double kaufpreisust;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getValue() {
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
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the kaufpreisust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaufpreisust() {
        return kaufpreisust;
    }

    /**
     * Sets the value of the kaufpreisust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreisust(Double value) {
        this.kaufpreisust = value;
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
            Double theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            Double theKaufpreisust;
            theKaufpreisust = this.getKaufpreisust();
            strategy.appendField(locator, this, "kaufpreisust", buffer, theKaufpreisust);
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
        if (draftCopy instanceof Kaufpreisnetto) {
            final Kaufpreisnetto copy = ((Kaufpreisnetto) draftCopy);
            if (this.value!= null) {
                Double sourceValue;
                sourceValue = this.getValue();
                Double copyValue = ((Double) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.kaufpreisust!= null) {
                Double sourceKaufpreisust;
                sourceKaufpreisust = this.getKaufpreisust();
                Double copyKaufpreisust = ((Double) strategy.copy(LocatorUtils.property(locator, "kaufpreisust", sourceKaufpreisust), sourceKaufpreisust));
                copy.setKaufpreisust(copyKaufpreisust);
            } else {
                copy.kaufpreisust = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Kaufpreisnetto();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Kaufpreisnetto)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Kaufpreisnetto that = ((Kaufpreisnetto) object);
        {
            Double lhsValue;
            lhsValue = this.getValue();
            Double rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            Double lhsKaufpreisust;
            lhsKaufpreisust = this.getKaufpreisust();
            Double rhsKaufpreisust;
            rhsKaufpreisust = that.getKaufpreisust();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreisust", lhsKaufpreisust), LocatorUtils.property(thatLocator, "kaufpreisust", rhsKaufpreisust), lhsKaufpreisust, rhsKaufpreisust)) {
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
