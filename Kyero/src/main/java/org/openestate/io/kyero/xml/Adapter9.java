//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.20 at 06:05:44 PM CET 
//


package org.openestate.io.kyero.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseDateType(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.kyero.KyeroUtils.printDateType(value));
    }

}