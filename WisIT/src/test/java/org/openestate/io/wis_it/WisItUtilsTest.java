/*
 * Copyright 2015-2017 OpenEstate.org.
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
package org.openestate.io.wis_it;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class WisItUtilsTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger(WisItUtilsTest.class );

  @Test
  public void testCreateDocument()
  {
    String transferXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
      + "<WIS>\n"
      + "  <OBJEKTE>\n"
      + "    <ANZAHL>2</ANZAHL>\n"
      + "    <OBJEKT>\n"
      + "    </OBJEKT>\n"
      + "    <OBJEKT>\n"
      + "    </OBJEKT>\n"
      + "  </OBJEKTE>\n"
      + "</WIS>";

    WisItDocument doc;
    try
    {
      doc = WisItUtils.createDocument( transferXml );
      Assert.assertNotNull(
        "Transfer was processed.", doc );
      Assert.assertTrue(
        "Transfer was processed as TransferDocument.", doc instanceof WisItDocument );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of TrovitUtils.createDocument failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of TrovitUtils.createDocument failed!" );
    }
  }

  @Test
  public void testGetContext()
  {
    try
    {
      Assert.assertNotNull("JAXB context must be creatable.", WisItUtils.getContext() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of TrovitUtils.getContext failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of TrovitUtils.getContext failed!" );
    }
  }
}