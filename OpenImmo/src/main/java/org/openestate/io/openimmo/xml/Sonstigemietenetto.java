
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
 *       &lt;attribute name="sonstigemieteust" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
@XmlRootElement(name = "sonstigemietenetto")
public class Sonstigemietenetto
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    protected Double value;
    @XmlAttribute(name = "sonstigemieteust")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    protected Double sonstigemieteust;

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
     * Gets the value of the sonstigemieteust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getSonstigemieteust() {
        return sonstigemieteust;
    }

    /**
     * Sets the value of the sonstigemieteust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonstigemieteust(Double value) {
        this.sonstigemieteust = value;
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
            Double theSonstigemieteust;
            theSonstigemieteust = this.getSonstigemieteust();
            strategy.appendField(locator, this, "sonstigemieteust", buffer, theSonstigemieteust);
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
        if (draftCopy instanceof Sonstigemietenetto) {
            final Sonstigemietenetto copy = ((Sonstigemietenetto) draftCopy);
            if (this.value!= null) {
                Double sourceValue;
                sourceValue = this.getValue();
                Double copyValue = ((Double) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.sonstigemieteust!= null) {
                Double sourceSonstigemieteust;
                sourceSonstigemieteust = this.getSonstigemieteust();
                Double copySonstigemieteust = ((Double) strategy.copy(LocatorUtils.property(locator, "sonstigemieteust", sourceSonstigemieteust), sourceSonstigemieteust));
                copy.setSonstigemieteust(copySonstigemieteust);
            } else {
                copy.sonstigemieteust = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Sonstigemietenetto();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Sonstigemietenetto)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Sonstigemietenetto that = ((Sonstigemietenetto) object);
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
            Double lhsSonstigemieteust;
            lhsSonstigemieteust = this.getSonstigemieteust();
            Double rhsSonstigemieteust;
            rhsSonstigemieteust = that.getSonstigemieteust();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigemieteust", lhsSonstigemieteust), LocatorUtils.property(thatLocator, "sonstigemieteust", rhsSonstigemieteust), lhsSonstigemieteust, rhsSonstigemieteust)) {
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
