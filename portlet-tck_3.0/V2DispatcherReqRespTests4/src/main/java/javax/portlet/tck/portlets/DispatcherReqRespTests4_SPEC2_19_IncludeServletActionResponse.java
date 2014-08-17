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
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.*;
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
 * portlet DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_event
 *
 */
public class DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse implements Portlet, ResourceServingPortlet {
   private static final String LOG_CLASS = 
         DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse.class.getName();
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

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      StringWriter writer = new StringWriter();

      PortletRequestDispatcher rd = portletConfig.getPortletContext()
            .getRequestDispatcher("/DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_servlet?qparm1=qvalue1&qparm2=qvalue2");
      rd.include(portletReq, portletResp);
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

      PortletSession ps = portletReq.getPortletSession();
      String msg = (String) ps.getAttribute(RESULT_ATTR_PREFIX + "DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse", APPLICATION_SCOPE);
      if (msg != null) {
         writer.write("<p>" + msg + "</p>\n");
         ps.removeAttribute(RESULT_ATTR_PREFIX + "DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse", APPLICATION_SCOPE);
      } else {

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_addCookie */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.addCookie does not perform any        */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_addCookie", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_addDateHeader */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.addDateHeader does not perform any    */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_addDateHeader", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_addHeader */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.addHeader does not perform any        */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_addHeader", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_addIntHeader */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.addIntHeader does not perform any     */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_addIntHeader", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_containsHeader */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.containsHeader must return false"     */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_containsHeader", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_encodeRedirectURL1 */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.encodeRedirectURL must return null"   */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_encodeRedirectURL1", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_encodeRedirectUrl */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.encodeRedirectUrl must return null"   */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_encodeRedirectUrl", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_encodeURL1 */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.encodeURL must provide the same       */
         /* functionality as ActionResponse.encodeURL"                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_encodeURL1", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_encodeUrl */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.encodeUrl must provide the same       */
         /* functionality as ActionResponse.encodeURL"                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_encodeUrl", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_flushBuffer */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.flushBuffer does not perform any      */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_flushBuffer", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getBufferSize */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.getBufferSize must return 0"          */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getBufferSize", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getCharacterEncoding */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.getCharacterEncoding must return      */
         /* null"                                                                */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getCharacterEncoding", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getContentType */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.getContentType must return null"      */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getContentType", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getLocale */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.getLocale must return null"           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getLocale", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getOutputStream */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.getOutputStream must return an        */
         /* output stream that ignores all input"                                */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getOutputStream", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getWriter */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.getWriter must return a writer that   */
         /* ignores all input"                                                   */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_getWriter", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_isCommitted */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.isCommitted must return true"         */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_isCommitted", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_reset */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.reset does not perform any            */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_reset", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_resetBuffer */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.resetBuffer does not perform any      */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_resetBuffer", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_sendError */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.sendError does not perform any        */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_sendError", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_sendRedirect */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.sendRedirect does not perform any     */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_sendRedirect", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setBufferSize */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setBufferSize does not perform any    */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setBufferSize", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setCharacterEncoding */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setCharacterEncoding does not         */
         /* perform any operation"                                               */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setCharacterEncoding", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setContentLength */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setContentLength does not perform     */
         /* any operation"                                                       */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setContentLength", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setContentType */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setContentType does not perform any   */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setContentType", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setDateHeader */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setDateHeader does not perform any    */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setDateHeader", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setHeader */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setHeader does not perform any        */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setHeader", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setIntHeader */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setIntHeader does not perform any     */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setIntHeader", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setLocale */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setLocale does not perform any        */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setLocale", aurl);
            tb.writeTo(writer);
         }

         /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setStatus */
         /* Details: "In a target servlet of a include in the Action phase,      */
         /* the method HttpServletResponse.setStatus does not perform any        */
         /* operation"                                                           */
         {
            PortletURL aurl = portletResp.createActionURL();
            TestButton tb = new TestButton("V2DispatcherReqRespTests4_SPEC2_19_IncludeServletActionResponse_setStatus", aurl);
            tb.writeTo(writer);
         }

      }
   }

}
