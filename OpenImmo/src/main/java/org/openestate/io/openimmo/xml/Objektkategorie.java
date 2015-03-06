
package org.openestate.io.openimmo.xml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}nutzungsart"/>
 *         &lt;element ref="{}vermarktungsart"/>
 *         &lt;element ref="{}objektart"/>
 *         &lt;element ref="{}user_defined_simplefield" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}user_defined_anyfield" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}user_defined_extend" maxOccurs="unbounded" minOccurs="0"/>
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
    "nutzungsart",
    "vermarktungsart",
    "objektart",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "objektkategorie")
public class Objektkategorie
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Nutzungsart nutzungsart;
    @XmlElement(required = true)
    protected Vermarktungsart vermarktungsart;
    @XmlElement(required = true)
    protected Objektart objektart;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the nutzungsart property.
     * 
     * @return
     *     possible object is
     *     {@link Nutzungsart }
     *     
     */
    public Nutzungsart getNutzungsart() {
        return nutzungsart;
    }

    /**
     * Sets the value of the nutzungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nutzungsart }
     *     
     */
    public void setNutzungsart(Nutzungsart value) {
        this.nutzungsart = value;
    }

    /**
     * Gets the value of the vermarktungsart property.
     * 
     * @return
     *     possible object is
     *     {@link Vermarktungsart }
     *     
     */
    public Vermarktungsart getVermarktungsart() {
        return vermarktungsart;
    }

    /**
     * Sets the value of the vermarktungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vermarktungsart }
     *     
     */
    public void setVermarktungsart(Vermarktungsart value) {
        this.vermarktungsart = value;
    }

    /**
     * Gets the value of the objektart property.
     * 
     * @return
     *     possible object is
     *     {@link Objektart }
     *     
     */
    public Objektart getObjektart() {
        return objektart;
    }

    /**
     * Sets the value of the objektart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Objektart }
     *     
     */
    public void setObjektart(Objektart value) {
        this.objektart = value;
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
            Nutzungsart theNutzungsart;
            theNutzungsart = this.getNutzungsart();
            strategy.appendField(locator, this, "nutzungsart", buffer, theNutzungsart);
        }
        {
            Vermarktungsart theVermarktungsart;
            theVermarktungsart = this.getVermarktungsart();
            strategy.appendField(locator, this, "vermarktungsart", buffer, theVermarktungsart);
        }
        {
            Objektart theObjektart;
            theObjektart = this.getObjektart();
            strategy.appendField(locator, this, "objektart", buffer, theObjektart);
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield);
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield);
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend);
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
        if (draftCopy instanceof Objektkategorie) {
            final Objektkategorie copy = ((Objektkategorie) draftCopy);
            if (this.nutzungsart!= null) {
                Nutzungsart sourceNutzungsart;
                sourceNutzungsart = this.getNutzungsart();
                Nutzungsart copyNutzungsart = ((Nutzungsart) strategy.copy(LocatorUtils.property(locator, "nutzungsart", sourceNutzungsart), sourceNutzungsart));
                copy.setNutzungsart(copyNutzungsart);
            } else {
                copy.nutzungsart = null;
            }
            if (this.vermarktungsart!= null) {
                Vermarktungsart sourceVermarktungsart;
                sourceVermarktungsart = this.getVermarktungsart();
                Vermarktungsart copyVermarktungsart = ((Vermarktungsart) strategy.copy(LocatorUtils.property(locator, "vermarktungsart", sourceVermarktungsart), sourceVermarktungsart));
                copy.setVermarktungsart(copyVermarktungsart);
            } else {
                copy.vermarktungsart = null;
            }
            if (this.objektart!= null) {
                Objektart sourceObjektart;
                sourceObjektart = this.getObjektart();
                Objektart copyObjektart = ((Objektart) strategy.copy(LocatorUtils.property(locator, "objektart", sourceObjektart), sourceObjektart));
                copy.setObjektart(copyObjektart);
            } else {
                copy.objektart = null;
            }
            if ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())) {
                List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield));
                copy.userDefinedSimplefield = null;
                if (copyUserDefinedSimplefield!= null) {
                    List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                    uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                }
            } else {
                copy.userDefinedSimplefield = null;
            }
            if ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())) {
                List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield));
                copy.userDefinedAnyfield = null;
                if (copyUserDefinedAnyfield!= null) {
                    List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                    uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                }
            } else {
                copy.userDefinedAnyfield = null;
            }
            if ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())) {
                List<UserDefinedExtend> sourceUserDefinedExtend;
                sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend));
                copy.userDefinedExtend = null;
                if (copyUserDefinedExtend!= null) {
                    List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                    uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                }
            } else {
                copy.userDefinedExtend = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Objektkategorie();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Objektkategorie)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Objektkategorie that = ((Objektkategorie) object);
        {
            Nutzungsart lhsNutzungsart;
            lhsNutzungsart = this.getNutzungsart();
            Nutzungsart rhsNutzungsart;
            rhsNutzungsart = that.getNutzungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzungsart", lhsNutzungsart), LocatorUtils.property(thatLocator, "nutzungsart", rhsNutzungsart), lhsNutzungsart, rhsNutzungsart)) {
                return false;
            }
        }
        {
            Vermarktungsart lhsVermarktungsart;
            lhsVermarktungsart = this.getVermarktungsart();
            Vermarktungsart rhsVermarktungsart;
            rhsVermarktungsart = that.getVermarktungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktungsart", lhsVermarktungsart), LocatorUtils.property(thatLocator, "vermarktungsart", rhsVermarktungsart), lhsVermarktungsart, rhsVermarktungsart)) {
                return false;
            }
        }
        {
            Objektart lhsObjektart;
            lhsObjektart = this.getObjektart();
            Objektart rhsObjektart;
            rhsObjektart = that.getObjektart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektart", lhsObjektart), LocatorUtils.property(thatLocator, "objektart", rhsObjektart), lhsObjektart, rhsObjektart)) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield)) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield)) {
                return false;
            }
        }
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend)) {
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
