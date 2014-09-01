/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package javax.portlet.tck.portlets;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import static java.util.logging.Logger.*;
import javax.xml.namespace.QName;
import javax.portlet.*;
import javax.portlet.filter.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.portlet.tck.beans.*;
import javax.portlet.tck.constants.*;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.*;
import static javax.portlet.tck.constants.Constants.*;
import static javax.portlet.PortletSession.*;
import static javax.portlet.ResourceURL.*;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 *
 * This is the main portlet for the test cases. If the test cases call for events, this portlet
 * will initiate the events, but not process them. The processing is done in the companion 
 * portlet URLTests_BaseURL_ApiRenderActurl_event
 *
 */
public class URLTests_BaseURL_ApiRenderActurl implements Portlet, ResourceServingPortlet {
   private static final String LOG_CLASS = 
         URLTests_BaseURL_ApiRenderActurl.class.getName();
   private final Logger LOGGER = Logger.getLogger(LOG_CLASS);
   
   private PortletConfig portletConfig = null;

   @Override
   public void init(PortletConfig config) throws PortletException {
      this.portletConfig = config;
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest portletReq, ActionResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet processAction entry");

      portletResp.setRenderParameters(portletReq.getParameterMap());
      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      StringWriter writer = new StringWriter();

   }

   @Override
   public void serveResource(ResourceRequest portletReq, ResourceResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet serveResource entry");

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      PrintWriter writer = portletResp.getWriter();

   }

   @Override
   public void render(RenderRequest portletReq, RenderResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet render entry");

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      PrintWriter writer = portletResp.getWriter();

      JSR286ApiTestCaseDetails tcd = new JSR286ApiTestCaseDetails();

      // Create result objects for the tests

      PortletURL url = portletResp.createActionURL();
      ClassChecker cc = new ClassChecker(url.getClass());

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterA1          */
      /* Details: "Method setParameter(String, String): Sets the parameter    */
      /* value for the specified name"                                        */
      TestResult tr0 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERA1);
      /* TODO: implement test */
      tr0.appendTcDetail("Not implemented.");
      tr0.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterA2          */
      /* Details: "Method setParameter(String, String): For a render URL, a   */
      /* private parameter can be set"                                        */
      TestResult tr1 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERA2);
      /* TODO: implement test */
      tr1.appendTcDetail("Not implemented.");
      tr1.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterA3          */
      /* Details: "Method setParameter(String, String): For a render URL, a   */
      /* public parameter can be set"                                         */
      TestResult tr2 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERA3);
      /* TODO: implement test */
      tr2.appendTcDetail("Not implemented.");
      tr2.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterA4          */
      /* Details: "Method setParameter(String, String): For an action URL,    */
      /* an action parameter can be set"                                      */
      TestResult tr3 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERA4);
      /* TODO: implement test */
      tr3.appendTcDetail("Not implemented.");
      tr3.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterA5          */
      /* Details: "Method setParameter(String, String): For a resource URL,   */
      /* a resource parameter can be set"                                     */
      TestResult tr4 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERA5);
      /* TODO: implement test */
      tr4.appendTcDetail("Not implemented.");
      tr4.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterA6          */
      /* Details: "Method setParameter(String, String): All previously        */
      /* existing values for the specified key are removed"                   */
      TestResult tr5 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERA6);
      /* TODO: implement test */
      tr5.appendTcDetail("Not implemented.");
      tr5.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterA7          */
      /* Details: "Method setParameter(String, String): If the value is       */
      /* null, all values for the specified key are removed"                  */
      TestResult tr6 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERA7);
      /* TODO: implement test */
      tr6.appendTcDetail("Not implemented.");
      tr6.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterA8          */
      /* Details: "Method setParameter(String, String): Throws                */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr7 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERA8);
      try {
         try {
            PortletURL turl = portletResp.createActionURL();
            turl.setParameter(null, "value");
            tr7.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr7.setTcSuccess(true);
         } catch (Exception e) {
            tr7.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr7.appendTcDetail(e.toString());}
      tr7.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterB1          */
      /* Details: "Method setParameter(String, String[]): Sets the            */
      /* parameter value array for the specified name"                        */
      TestResult tr8 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERB1);
      /* TODO: implement test */
      tr8.appendTcDetail("Not implemented.");
      tr8.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterB2          */
      /* Details: "Method setParameter(String, String[]): For a render URL,   */
      /* a private parameter can be set"                                      */
      TestResult tr9 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERB2);
      /* TODO: implement test */
      tr9.appendTcDetail("Not implemented.");
      tr9.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterB3          */
      /* Details: "Method setParameter(String, String[]): For a render URL,   */
      /* a public parameter can be set"                                       */
      TestResult tr10 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERB3);
      /* TODO: implement test */
      tr10.appendTcDetail("Not implemented.");
      tr10.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterB4          */
      /* Details: "Method setParameter(String, String[]): For an action       */
      /* URL, an action parameter can be set"                                 */
      TestResult tr11 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERB4);
      /* TODO: implement test */
      tr11.appendTcDetail("Not implemented.");
      tr11.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterB5          */
      /* Details: "Method setParameter(String, String[]): For a resource      */
      /* URL, a resource parameter can be set"                                */
      TestResult tr12 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERB5);
      /* TODO: implement test */
      tr12.appendTcDetail("Not implemented.");
      tr12.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterB6          */
      /* Details: "Method setParameter(String, String[]): All previously      */
      /* existing values for the specified key are removed"                   */
      TestResult tr13 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERB6);
      /* TODO: implement test */
      tr13.appendTcDetail("Not implemented.");
      tr13.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterB7          */
      /* Details: "Method setParameter(String, String[]): If the value is     */
      /* null, all values for the specified key are removed"                  */
      TestResult tr14 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERB7);
      /* TODO: implement test */
      tr14.appendTcDetail("Not implemented.");
      tr14.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameterB8          */
      /* Details: "Method setParameter(String, String[]): Throws              */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr15 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERB8);
      try {
         try {
            PortletURL turl = portletResp.createActionURL();
            turl.setParameter(null, new String[]{"val1-1", "val1-2"});
            tr15.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr15.setTcSuccess(true);
         } catch (Exception e) {
            tr15.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr15.appendTcDetail(e.toString());}
      tr15.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters1          */
      /* Details: "Method setParameters(java.util.Map): Sets the parameter    */
      /* map to the specified value"                                          */
      TestResult tr16 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS1);
      /* TODO: implement test */
      tr16.appendTcDetail("Not implemented.");
      tr16.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters2          */
      /* Details: "Method setParameters(java.util.Map): For a render URL,     */
      /* public parameters can be set through the map"                        */
      TestResult tr17 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS2);
      /* TODO: implement test */
      tr17.appendTcDetail("Not implemented.");
      tr17.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters3          */
      /* Details: "Method setParameters(java.util.Map): For a render URL,     */
      /* private parameters can be set through the map"                       */
      TestResult tr18 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS3);
      /* TODO: implement test */
      tr18.appendTcDetail("Not implemented.");
      tr18.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters4          */
      /* Details: "Method setParameters(java.util.Map): For an action URL,    */
      /* action parameters can be set through the map"                        */
      TestResult tr19 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS4);
      /* TODO: implement test */
      tr19.appendTcDetail("Not implemented.");
      tr19.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters5          */
      /* Details: "Method setParameters(java.util.Map): For a resource URL,   */
      /* resource parameters can be set through the map"                      */
      TestResult tr20 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS5);
      /* TODO: implement test */
      tr20.appendTcDetail("Not implemented.");
      tr20.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters6          */
      /* Details: "Method setParameters(java.util.Map): Previously existing   */
      /* private, action, or resource parameters not contained in the         */
      /* specified input map are removed"                                     */
      TestResult tr21 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS6);
      /* TODO: implement test */
      tr21.appendTcDetail("Not implemented.");
      tr21.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters7          */
      /* Details: "Method setParameters(java.util.Map): Previously existing   */
      /* public parameters not contained in the specified input map remain    */
      /* unchanged"                                                           */
      TestResult tr22 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS7);
      /* TODO: implement test */
      tr22.appendTcDetail("Not implemented.");
      tr22.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters8          */
      /* Details: "Method setParameters(java.util.Map): Parameters that are   */
      /* set are available in requests initiated through the URL"             */
      TestResult tr23 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS8);
      /* TODO: implement test */
      tr23.appendTcDetail("Not implemented.");
      tr23.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters9          */
      /* Details: "Method setParameters(java.util.Map): Throws                */
      /* IllegalArgumentException if the input map is null"                   */
      TestResult tr24 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS9);
      try {
         try {
            PortletURL turl = portletResp.createActionURL();
            turl.setParameters((Map<String, String[]>)null);
            tr24.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr24.setTcSuccess(true);
         } catch (Exception e) {
            tr24.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr24.appendTcDetail(e.toString());}
      tr24.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters10         */
      /* Details: "Method setParameters(java.util.Map): Throws                */
      /* IllegalArgumentException if any key in the map is null"              */
      TestResult tr25 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS10);
      try {
         try {
            PortletURL turl = portletResp.createActionURL();
            tr25.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr25.setTcSuccess(true);
         } catch (Exception e) {
            tr25.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr25.appendTcDetail(e.toString());}
      tr25.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters11         */
      /* Details: "Method setParameters(java.util.Map): Throws                */
      /* IllegalArgumentException if any key in the map is the empty string   */
      /* (\"\") "                                                             */
      TestResult tr26 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS11);
      /* TODO: implement test */
      tr26.appendTcDetail("Not implemented.");
      tr26.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters12         */
      /* Details: "Method setParameters(java.util.Map): Throws                */
      /* IllegalArgumentException if the values array for any key is null "   */
      TestResult tr27 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS12);
      try {
         try {
            PortletURL turl = portletResp.createActionURL();
            tr27.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr27.setTcSuccess(true);
         } catch (Exception e) {
            tr27.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr27.appendTcDetail(e.toString());}
      tr27.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters13         */
      /* Details: "Method setParameters(java.util.Map): Throws                */
      /* IllegalArgumentException if any element in any values array is       */
      /* null "                                                               */
      TestResult tr28 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS13);
      try {
         try {
            PortletURL turl = portletResp.createActionURL();
            tr28.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr28.setTcSuccess(true);
         } catch (Exception e) {
            tr28.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr28.appendTcDetail(e.toString());}
      tr28.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setParameters14         */
      /* Details: "Method setParameters(java.util.Map): Throws                */
      /* IllegalStateException if the method is invoked after the             */
      /* sendRedirect method has been called"                                 */
      TestResult tr29 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPARAMETERS14);
      /* TODO: implement test */
      tr29.appendTcDetail("Not implemented.");
      tr29.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setSecure2              */
      /* Details: "Method setSecure(boolean): If the input parameter is       */
      /* true, the resulting URL uses a secure connection (HTTPS)"            */
      TestResult tr30 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETSECURE2);
      /* TODO: implement test */
      tr30.appendTcDetail("Not implemented.");
      tr30.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setSecure3              */
      /* Details: "Method setSecure(boolean): If the input parameter is       */
      /* false, the resulting URL can use either a secure or non-secure       */
      /* connection"                                                          */
      TestResult tr31 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETSECURE3);
      /* TODO: implement test */
      tr31.appendTcDetail("Not implemented.");
      tr31.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setSecure4              */
      /* Details: "Method setSecure(boolean): Throws a                        */
      /* PortletSecurityException if the run-time environment does not        */
      /* support the setting"                                                 */
      TestResult tr32 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETSECURE4);
      /* TODO: implement test */
      tr32.appendTcDetail("Not implemented.");
      tr32.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_toString                */
      /* Details: "Method toString(): Returns a String containing the         */
      /* portlet URL representation to be included in the markup"             */
      TestResult tr33 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_TOSTRING);
      /* TODO: implement test */
      tr33.appendTcDetail("Not implemented.");
      tr33.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_getParameterMap1        */
      /* Details: "Method getParameterMap(): Returns an                       */
      /* java.util.Map&lt;java.lang.String,java.lang.String[]&gt; object      */
      /* for the parameter names and values if parameters are available"      */
      TestResult tr34 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_GETPARAMETERMAP1);
      /* TODO: implement test */
      tr34.appendTcDetail("Not implemented.");
      tr34.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_getParameterMap2        */
      /* Details: "Method getParameterMap(): For a render URL, the returned   */
      /* map contains all public and private parameters for the request"      */
      TestResult tr35 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_GETPARAMETERMAP2);
      /* TODO: implement test */
      tr35.appendTcDetail("Not implemented.");
      tr35.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_getParameterMap3        */
      /* Details: "Method getParameterMap(): For an action URL, the           */
      /* returned map contains all action parameters for the request"         */
      TestResult tr36 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_GETPARAMETERMAP3);
      /* TODO: implement test */
      tr36.appendTcDetail("Not implemented.");
      tr36.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_getParameterMap4        */
      /* Details: "Method getParameterMap(): For a resource URL, the          */
      /* returned map contains all resource parameters for the request"       */
      TestResult tr37 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_GETPARAMETERMAP4);
      /* TODO: implement test */
      tr37.appendTcDetail("Not implemented.");
      tr37.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_getParameterMap5        */
      /* Details: "Method getParameterMap(): For a resource URL, the          */
      /* returned map does not contain any render parameters for the          */
      /* request"                                                             */
      TestResult tr38 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_GETPARAMETERMAP5);
      /* TODO: implement test */
      tr38.appendTcDetail("Not implemented.");
      tr38.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_getParameterMap6        */
      /* Details: "Method getParameterMap(): Returns an empty map if no       */
      /* parameters exist"                                                    */
      TestResult tr39 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_GETPARAMETERMAP6);
      /* TODO: implement test */
      tr39.appendTcDetail("Not implemented.");
      tr39.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_writeA1                 */
      /* Details: "Method write(): Writes the URL to the output stream        */
      /* through the provided Writer"                                         */
      TestResult tr40 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_WRITEA1);
      /* TODO: implement test */
      tr40.appendTcDetail("Not implemented.");
      tr40.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_writeA2                 */
      /* Details: "Method write(): The written URL is XML escaped (although   */
      /* it may be a token rather than a valid URL)"                          */
      TestResult tr41 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_WRITEA2);
      /* TODO: implement test */
      tr41.appendTcDetail("Not implemented.");
      tr41.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_writeB1                 */
      /* Details: "Method write(): Writes the URL to the output stream        */
      /* through the provided Writer"                                         */
      TestResult tr42 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_WRITEB1);
      /* TODO: implement test */
      tr42.appendTcDetail("Not implemented.");
      tr42.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_writeB2                 */
      /* Details: "Method write(): If the escapeXML parameter is true, the    */
      /* written URL is XML escaped (although it may be a token rather than   */
      /* a valid URL)"                                                        */
      TestResult tr43 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_WRITEB2);
      /* TODO: implement test */
      tr43.appendTcDetail("Not implemented.");
      tr43.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_writeB3                 */
      /* Details: "Method write(): If the escapeXML parameter is false, no    */
      /* excaping is performed"                                               */
      TestResult tr44 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_WRITEB3);
      /* TODO: implement test */
      tr44.appendTcDetail("Not implemented.");
      tr44.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_addProperty1            */
      /* Details: "Method addProperty(String, String): Adds a property        */
      /* value to an existing key"                                            */
      TestResult tr45 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_ADDPROPERTY1);
      /* TODO: implement test */
      tr45.appendTcDetail("Not implemented.");
      tr45.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_addProperty2            */
      /* Details: "Method addProperty(String, String): Existing property      */
      /* values for the key are retained"                                     */
      TestResult tr46 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_ADDPROPERTY2);
      /* TODO: implement test */
      tr46.appendTcDetail("Not implemented.");
      tr46.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_addProperty3            */
      /* Details: "Method addProperty(String, String): Throws                 */
      /* IllegalArgumentException if the specified key is null"               */
      TestResult tr47 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_ADDPROPERTY3);
      try {
         try {
            PortletURL turl = portletResp.createActionURL();
            turl.addProperty(null, "value");
            tr47.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr47.setTcSuccess(true);
         } catch (Exception e) {
            tr47.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr47.appendTcDetail(e.toString());}
      tr47.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setProperty1            */
      /* Details: "Method setProperty(String, String): Sets a property        */
      /* value for the specified key"                                         */
      TestResult tr48 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPROPERTY1);
      /* TODO: implement test */
      tr48.appendTcDetail("Not implemented.");
      tr48.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setProperty2            */
      /* Details: "Method setProperty(String, String): Resets any existing    */
      /* property values for the specified key"                               */
      TestResult tr49 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPROPERTY2);
      /* TODO: implement test */
      tr49.appendTcDetail("Not implemented.");
      tr49.writeTo(writer);

      /* TestCase: V2URLTests_BaseURL_ApiRenderActurl_setProperty3            */
      /* Details: "Method setProperty(String, String): Throws                 */
      /* IllegalArgumentException if the specified key is null"               */
      TestResult tr50 = tcd.getTestResultFailed(V2URLTESTS_BASEURL_APIRENDERACTURL_SETPROPERTY3);
      try {
         try {
            PortletURL turl = portletResp.createActionURL();
            turl.setProperty(null, "value");
            tr50.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr50.setTcSuccess(true);
         } catch (Exception e) {
            tr50.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr50.appendTcDetail(e.toString());}
      tr50.writeTo(writer);

   }

}