
package org.openestate.io.kyero.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for energyRatingMarkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="energyRatingMarkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "energyRatingMarkType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
public enum EnergyRatingMarkType {

    A,
    B,
    C,
    D,
    E,
    F,
    G,
    X;

    public String value() {
        return name();
    }

    public static EnergyRatingMarkType fromValue(String v) {
        return valueOf(v);
    }

}
