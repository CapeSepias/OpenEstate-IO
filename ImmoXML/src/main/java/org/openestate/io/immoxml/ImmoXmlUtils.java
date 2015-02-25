/*
 * Copyright 2015 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.io.immoxml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.core.SilentValidationHandler;
import org.openestate.io.immoxml.xml.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * ImmoXmlUtils.
 *
 * @author Andreas Rudolph
 */
public class ImmoXmlUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( ImmoXmlUtils.class );
  public final static String PACKAGE = "org.openestate.io.immoxml.xml";
  public final static ImmoXmlVersion VERSION = ImmoXmlVersion.V1_1;
  public final static String NAMESPACE = "http://www.immoxml.de";
  private final static ObjectFactory FACTORY = new ObjectFactory();
  private static JAXBContext JAXB = null;

  private ImmoXmlUtils()
  {
  }

  public static ImmoXmlDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( input, true ) );
  }

  public static ImmoXmlDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlFile, true ) );
  }

  public static ImmoXmlDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlString, true ) );
  }

  public static ImmoXmlDocument createDocument( Document doc )
  {
    if (ImmoXmlDocument.isTransferDocument( doc ))
      return new ImmoXmlDocument( doc );
    else
      return null;
  }

  public static Marshaller createMarshaller() throws JAXBException
  {
    return createMarshaller( Charset.defaultCharset().name(), true );
  }

  public static Marshaller createMarshaller( String encoding, boolean formatted ) throws JAXBException
  {
    Marshaller m = getContext().createMarshaller();
    m.setProperty( Marshaller.JAXB_ENCODING, encoding );
    m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, formatted );
    m.setEventHandler( new SilentValidationHandler() );
    return m;
  }

  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    Unmarshaller m = getContext().createUnmarshaller();
    m.setEventHandler( new SilentValidationHandler() );
    return m;
  }

  public static Element createUserDefinedSimplefield( Document doc, String name, String value )
  {
    Element root = DocumentUtils.getRootElement( doc );
    Element node = doc.createElementNS( root.getNamespaceURI(), "user_defined_simplefield" );
    node.setAttribute( "feldname", name );
    node.setTextContent( value );
    return node;
  }

  public synchronized static JAXBContext getContext() throws JAXBException
  {
    if (JAXB==null) initContext( Thread.currentThread().getContextClassLoader() );
    return JAXB;
  }

  public synchronized static ObjectFactory getFactory()
  {
    return FACTORY;
  }

  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( PACKAGE, classloader );
  }

  public static Calendar parseDate( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      return DatatypeConverter.parseDate( value );
    }
    catch (IllegalArgumentException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    try
    {
      Date date = DateUtils.parseDateStrictly( value, new String[]{
        "dd.MM.yyyy", "dd.MM.yy", "dd/MM/yyyy", "dd/MM/yy", "dd-MM-yyyy",
        "dd-MMM-yyyy", "yyyy-MM-dd", "yyyy/MM/dd", "yyyy-D", "MM/yyyy",
        "MMM yyyy", "MMMMM yyyy", "yyyy" } );
      Calendar cal = Calendar.getInstance();
      cal.setTime( date );
      return cal;
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse date value '"+value+"'!" );
  }

  public static Calendar parseDateTime( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      return DatatypeConverter.parseDateTime( value );
    }
    catch (IllegalArgumentException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as datetime!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    try
    {
      Date date = DateUtils.parseDateStrictly( value, new String[]{
        "yyyy-MM-dd'T'hh:mm:ss", "yyyy-MM-dd'T'hh:mm" } );
      Calendar cal = Calendar.getInstance();
      cal.setTime( date );
      return cal;
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as datetime!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse datetime value '"+value+"'!" );
  }

  public static Double parseDecimal( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      //return Double.parseDouble( value );
      return DatatypeConverter.parseDouble( value );
    }
    catch (NumberFormatException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as decimal!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    try
    {
      NumberFormat format = NumberFormat.getNumberInstance( Locale.GERMANY );
      return format.parse( value ).doubleValue();
    }
    catch (NumberFormatException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as decimal!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as decimal!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    //LOGGER.warn( "Can't parse value '" + value + "' as decimal!" );
    throw new IllegalArgumentException( "Can't parse decimal value '"+value+"'!" );
  }

  public static String printDate( Calendar value )
  {
    return (value!=null)? DatatypeConverter.printDate( value ): null;
  }

  public static String printDateTime( Calendar value )
  {
    return (value!=null)? DatatypeConverter.printDateTime(value ): null;
  }

  public static String printDecimal( Double value )
  {
    return (value!=null)? DatatypeConverter.printDouble( value ): null;
  }
}