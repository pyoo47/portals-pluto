<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0"  prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.io.*,java.util.*,java.util.logging.*" %>
<%@ page import="static java.util.logging.Logger.*" %>
<%@ page import="javax.portlet.*,javax.portlet.filter.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="javax.portlet.tck.beans.*,javax.portlet.tck.constants.*" %>
<%@ page import="static javax.portlet.tck.constants.Constants.*" %>
<%@ page import="static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.*" %>
<%

      PortletRequest portletReq = (PortletRequest) request.getAttribute("javax.portlet.request");
      PortletResponse portletResp = (PortletResponse) request.getAttribute("javax.portlet.response");
      PortletConfig portletConfig = (PortletConfig) request.getAttribute("javax.portlet.config");
      long svtTid = Thread.currentThread().getId();
      long reqTid = (Long) portletReq.getAttribute(THREADID_ATTR);

      PrintWriter writer = ((MimeResponse)portletResp).getWriter();

      JSR286DispatcherReqRespTestCaseDetails tcd = new JSR286DispatcherReqRespTestCaseDetails();

      // Create result objects for the tests

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getAttribute */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getAttribute must provide the same         */
      /* functionality as RenderRequest.getAttribute"                         */
      TestResult tr0 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETATTRIBUTE);
      try {
         String ha = (String)request.getAttribute(ATTR_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getAttribute");
         String pa = (String)portletReq.getAttribute(ATTR_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getAttribute");
         CompareUtils.stringsEqual(ha, pa, tr0);
      } catch(Exception e) {tr0.appendTcDetail(e.toString());}
      tr0.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getAttributeNames */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getAttributeNames must provide the same    */
      /* functionality as RenderRequest.getAttributeNames"                    */
      TestResult tr1 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETATTRIBUTENAMES);
      try {
         Enumeration<String> he = request.getAttributeNames();
         Enumeration<String> pe = portletReq.getAttributeNames();
         CompareUtils.enumsEqual("HttpServletRequest attribute names", he, "RenderRequest attribute names", pe,tr1);
      } catch(Exception e) {tr1.appendTcDetail(e.toString());}
      tr1.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getAuthType */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getAuthType must provide the same          */
      /* functionality as RenderRequest.getAuthType"                          */
      TestResult tr2 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETAUTHTYPE);
      /* TODO: implement test */
      tr2.appendTcDetail("Not implemented.");
      tr2.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getCharacterEncoding */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getCharacterEncoding must return null"     */
      TestResult tr3 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETCHARACTERENCODING);
      try {
         String isval = request.getCharacterEncoding();
         CompareUtils.stringsEqual(isval, null, tr3);
      } catch(Exception e) {tr3.appendTcDetail(e.toString());}
      tr3.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getContentLength */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getContentLength must return 0"            */
      TestResult tr4 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETCONTENTLENGTH);
      try {
         int isval = request.getContentLength();
         if (isval != 0) tr4.appendTcDetail("Returned value was: " + isval);
         tr4.setTcSuccess(isval == 0);
      } catch(Exception e) {tr4.appendTcDetail(e.toString());}
      tr4.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getContentType */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getContentType must return null"           */
      TestResult tr5 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETCONTENTTYPE);
      try {
         String isval = request.getContentType();
         CompareUtils.stringsEqual(isval, null, tr5);
      } catch(Exception e) {tr5.appendTcDetail(e.toString());}
      tr5.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getContextPath */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getContextPath must provide the same       */
      /* functionality as RenderRequest.getContextPath"                       */
      TestResult tr6 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETCONTEXTPATH);
      /* TODO: implement test */
      tr6.appendTcDetail("Not implemented.");
      tr6.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getCookies */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getCookies must provide the same           */
      /* functionality as RenderRequest.getCookies"                           */
      TestResult tr7 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETCOOKIES);
      /* TODO: implement test */
      tr7.appendTcDetail("Not implemented.");
      tr7.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getDateHeader */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getDateHeader must return a value          */
      /* corresponding to that returned by RenderRequest.getProperty for      */
      /* the corresponding header name"                                       */
      TestResult tr8 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETDATEHEADER);
      /* TODO: implement test */
      tr8.appendTcDetail("Not implemented.");
      tr8.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getHeader */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getHeader must return a value              */
      /* corresponding to that returned by RenderRequest.getProperty for      */
      /* the corresponding header name"                                       */
      TestResult tr9 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETHEADER);
      /* TODO: implement test */
      tr9.appendTcDetail("Not implemented.");
      tr9.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getHeaderNames */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* Enumeration returned by HttpServletRequest.getHeaderNames must be    */
      /* contained in the Enumeration returned by                             */
      /* RenderRequest.getPropertyNames"                                      */
      TestResult tr10 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETHEADERNAMES);
      /* TODO: implement test */
      tr10.appendTcDetail("Not implemented.");
      tr10.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getHeaders */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getHeaders must return a value             */
      /* corresponding to that returned by RenderRequest.getProperty for      */
      /* the corresponding header name"                                       */
      TestResult tr11 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETHEADERS);
      /* TODO: implement test */
      tr11.appendTcDetail("Not implemented.");
      tr11.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getInputStream */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getInputStream must return null"           */
      TestResult tr12 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETINPUTSTREAM);
      try {
         ServletInputStream isval = request.getInputStream();
         tr12.setTcSuccess(isval == null);
      } catch(Exception e) {tr12.appendTcDetail(e.toString());}
      tr12.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getIntHeader */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getIntHeader must return a value           */
      /* corresponding to that returned by RenderRequest.getProperty for      */
      /* the corresponding header name"                                       */
      TestResult tr13 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETINTHEADER);
      /* TODO: implement test */
      tr13.appendTcDetail("Not implemented.");
      tr13.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getLocalAddr */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getLocalAddr must return null"             */
      TestResult tr14 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETLOCALADDR);
      try {
         String isval = request.getLocalAddr();
         CompareUtils.stringsEqual(isval, null, tr14);
      } catch(Exception e) {tr14.appendTcDetail(e.toString());}
      tr14.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getLocalName */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getLocalName must return null"             */
      TestResult tr15 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETLOCALNAME);
      try {
         String isval = request.getLocalName();
         CompareUtils.stringsEqual(isval, null, tr15);
      } catch(Exception e) {tr15.appendTcDetail(e.toString());}
      tr15.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getLocalPort */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getLocalPort must return 0"                */
      TestResult tr16 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETLOCALPORT);
      try {
         int isval = request.getLocalPort();
         if (isval != 0) tr16.appendTcDetail("Returned value was: " + isval);
         tr16.setTcSuccess(isval == 0);
      } catch(Exception e) {tr16.appendTcDetail(e.toString());}
      tr16.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getLocale */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getLocale must provide the same            */
      /* functionality as RenderRequest.getLocale"                            */
      TestResult tr17 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETLOCALE);
      try {
         Locale hl = request.getLocale();
         Locale pl = portletReq.getLocale();
         CompareUtils.stringsEqual(hl.getDisplayName(), pl.getDisplayName(), tr17);
      } catch(Exception e) {tr17.appendTcDetail(e.toString());}
      tr17.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getLocales */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getLocales must provide the same           */
      /* functionality as RenderRequest.getLocales"                           */
      TestResult tr18 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETLOCALES);
      try {
         Enumeration<Locale> he = request.getLocales();
         Enumeration<Locale> pe = portletReq.getLocales();
         CompareUtils.enumsEqual("HttpServletRequest locales", he, "RenderRequest locales", pe,tr18);
      } catch(Exception e) {tr18.appendTcDetail(e.toString());}
      tr18.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getMethod */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getMethod must return \"GET\""             */
      TestResult tr19 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETMETHOD);
      try {
         String isval = request.getMethod();
         CompareUtils.stringsEqual(isval, "GET", tr19);
      } catch(Exception e) {tr19.appendTcDetail(e.toString());}
      tr19.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameter */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getParameter must provide the same         */
      /* functionality as RenderRequest.getParameter"                         */
      TestResult tr20 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETPARAMETER);
      // TestSetupLink for: DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest
      {
         String val = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameter");
         if (val == null) {
            PortletURL rurl = ((RenderResponse)portletResp).createRenderURL();
            rurl.setParameters(portletReq.getPrivateParameterMap());
            rurl.setParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameter", "Value");
            TestSetupLink tl = new TestSetupLink("V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameter", rurl);
            tl.writeTo(writer);
         }
      }

      try {
         // TestSetupLink
         String val = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameter");
         if (val != null) {
            String hval = request.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameter");
            String pval = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameter");
            CompareUtils.stringsEqual(hval, pval, tr20);
            tr20.writeTo(writer);
         }
      } catch(Exception e) {tr20.appendTcDetail(e.toString());}

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterMap */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getParameterMap must provide the same      */
      /* functionality as RenderRequest.getParameterMap"                      */
      TestResult tr21 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETPARAMETERMAP);
      // TestSetupLink for: DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest
      {
         String val = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterMap");
         if (val == null) {
            PortletURL rurl = ((RenderResponse)portletResp).createRenderURL();
            rurl.setParameters(portletReq.getPrivateParameterMap());
            rurl.setParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterMap", "Value");
            TestSetupLink tl = new TestSetupLink("V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterMap", rurl);
            tl.writeTo(writer);
         }
      }

      try {
         // TestSetupLink
         String val = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterMap");
         if (val != null) {
            Map<String, String[]> hmap = request.getParameterMap();
            Map<String, String[]> pmap = portletReq.getParameterMap();
            CompareUtils.mapsEqual("map from HttpServletRequest", hmap, "map from RenderRequest", pmap, tr21);
            tr21.writeTo(writer);
         }
      } catch(Exception e) {tr21.appendTcDetail(e.toString());}

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterNames */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getParameterNames must provide the same    */
      /* functionality as RenderRequest.getParameterNames"                    */
      TestResult tr22 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETPARAMETERNAMES);
      // TestSetupLink for: DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest
      {
         String val = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterNames");
         if (val == null) {
            PortletURL rurl = ((RenderResponse)portletResp).createRenderURL();
            rurl.setParameters(portletReq.getPrivateParameterMap());
            rurl.setParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterNames", "Value");
            TestSetupLink tl = new TestSetupLink("V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterNames", rurl);
            tl.writeTo(writer);
         }
      }

      try {
         // TestSetupLink
         String val = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterNames");
         if (val != null) {
            Enumeration<String> he = request.getParameterNames();
            Enumeration<String> pe = portletReq.getParameterNames();
            CompareUtils.enumsEqual("HttpServletRequest parameter names", he, "RenderRequest parameter names", pe,tr22);
            tr22.writeTo(writer);
         }
      } catch(Exception e) {tr22.appendTcDetail(e.toString());}

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterValues */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getParameterValues must provide the same   */
      /* functionality as RenderRequest.getParameterValues"                   */
      TestResult tr23 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETPARAMETERVALUES);
      // TestSetupLink for: DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest
      {
         String val = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterValues");
         if (val == null) {
            PortletURL rurl = ((RenderResponse)portletResp).createRenderURL();
            rurl.setParameters(portletReq.getPrivateParameterMap());
            rurl.setParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterValues", "Value");
            TestSetupLink tl = new TestSetupLink("V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterValues", rurl);
            tl.writeTo(writer);
         }
      }

      try {
         // TestSetupLink
         String val = portletReq.getParameter(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterValues");
         if (val != null) {
            String[] hvals = request.getParameterValues(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterValues");
            String[] pvals = portletReq.getParameterValues(PARM_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getParameterValues");
            CompareUtils.stringsEqual(hvals[0], pvals[0], tr23);
            tr23.writeTo(writer);
         }
      } catch(Exception e) {tr23.appendTcDetail(e.toString());}

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getPathInfo */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getPathInfo must a value corresponding     */
      /* to the path used to obtain the PortletRequestDispatcher"             */
      TestResult tr24 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETPATHINFO);
      /* TODO: implement test */
      tr24.appendTcDetail("Not implemented.");
      tr24.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getPathTranslated */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getPathTranslated must a value             */
      /* corresponding to the path used to obtain the                         */
      /* PortletRequestDispatcher"                                            */
      TestResult tr25 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETPATHTRANSLATED);
      /* TODO: implement test */
      tr25.appendTcDetail("Not implemented.");
      tr25.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getProtocol */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getProtocol must return \"HTTP/1.1\""      */
      TestResult tr26 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETPROTOCOL);
      try {
         String isval = request.getProtocol();
         CompareUtils.stringsEqual(isval, "HTTP/1.1", tr26);
      } catch(Exception e) {tr26.appendTcDetail(e.toString());}
      tr26.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getQueryString */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getQueryString must a value                */
      /* corresponding to the query string information used to obtain the     */
      /* PortletRequestDispatcher"                                            */
      TestResult tr27 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETQUERYSTRING);
      /* TODO: implement test */
      tr27.appendTcDetail("Not implemented.");
      tr27.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getReader */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getReader must return null"                */
      TestResult tr28 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREADER);
      try {
         BufferedReader isval = request.getReader();
         tr28.setTcSuccess(isval == null);
      } catch(Exception e) {tr28.appendTcDetail(e.toString());}
      tr28.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRealPath */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRealPath must return null"              */
      TestResult tr29 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREALPATH);
      try {
         String isval = request.getRealPath("/WEB-INF/portlet.xml");
         CompareUtils.stringsEqual(isval, null, tr29);
      } catch(Exception e) {tr29.appendTcDetail(e.toString());}
      tr29.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRemoteAddr */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRemoteAddr must return null"            */
      TestResult tr30 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREMOTEADDR);
      try {
         String isval = request.getRemoteAddr();
         CompareUtils.stringsEqual(isval, null, tr30);
      } catch(Exception e) {tr30.appendTcDetail(e.toString());}
      tr30.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRemoteHost */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRemoteHost must return null"            */
      TestResult tr31 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREMOTEHOST);
      try {
         String isval = request.getRemoteHost();
         CompareUtils.stringsEqual(isval, null, tr31);
      } catch(Exception e) {tr31.appendTcDetail(e.toString());}
      tr31.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRemotePort */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRemotePort must return 0"               */
      TestResult tr32 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREMOTEPORT);
      try {
         int isval = request.getRemotePort();
         if (isval != 0) tr32.appendTcDetail("Returned value was: " + isval);
         tr32.setTcSuccess(isval == 0);
      } catch(Exception e) {tr32.appendTcDetail(e.toString());}
      tr32.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRemoteUser */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRemoteUser must provide the same        */
      /* functionality as RenderRequest.getRemoteUser"                        */
      TestResult tr33 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREMOTEUSER);
      /* TODO: implement test */
      tr33.appendTcDetail("Not implemented.");
      tr33.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRequestDispatcher */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRequestDispatcher must provide          */
      /* functionality as defined in the servlet specification"               */
      TestResult tr34 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREQUESTDISPATCHER);
      /* TODO: implement test */
      tr34.appendTcDetail("Not implemented.");
      tr34.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRequestURI */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRequestURI must a value corresponding   */
      /* to the path and query string information used to obtain the          */
      /* PortletRequestDispatcher"                                            */
      TestResult tr35 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREQUESTURI);
      /* TODO: implement test */
      tr35.appendTcDetail("Not implemented.");
      tr35.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRequestURL */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRequestURL must return null"            */
      TestResult tr36 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREQUESTURL);
      try {
         StringBuffer isval = request.getRequestURL();
         if (isval != null) tr36.appendTcDetail("Request URL is " + isval.toString());
         tr36.setTcSuccess(isval == null);
      } catch(Exception e) {tr36.appendTcDetail(e.toString());}
      tr36.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getRequestedSessionId */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getRequestedSessionId must provide the     */
      /* same functionality as RenderRequest.getRequestedSessionId"           */
      TestResult tr37 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETREQUESTEDSESSIONID);
      /* TODO: implement test */
      tr37.appendTcDetail("Not implemented.");
      tr37.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getScheme */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getScheme must provide the same            */
      /* functionality as RenderRequest.getScheme"                            */
      TestResult tr38 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETSCHEME);
      /* TODO: implement test */
      tr38.appendTcDetail("Not implemented.");
      tr38.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getServerName */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getServerName must provide the same        */
      /* functionality as RenderRequest.getServerName"                        */
      TestResult tr39 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETSERVERNAME);
      /* TODO: implement test */
      tr39.appendTcDetail("Not implemented.");
      tr39.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getServerPort */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getServerPort must provide the same        */
      /* functionality as RenderRequest.getServerPort"                        */
      TestResult tr40 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETSERVERPORT);
      /* TODO: implement test */
      tr40.appendTcDetail("Not implemented.");
      tr40.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getServletPath */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getServletPath must a value                */
      /* corresponding to the path used to obtain the                         */
      /* PortletRequestDispatcher"                                            */
      TestResult tr41 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETSERVLETPATH);
      /* TODO: implement test */
      tr41.appendTcDetail("Not implemented.");
      tr41.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getSession */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getSession must provide the same           */
      /* functionality as                                                     */
      /* RenderRequest.getPortletSession(APPLICATION_SCOPE)"                  */
      TestResult tr42 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETSESSION);
      /* TODO: implement test */
      tr42.appendTcDetail("Not implemented.");
      tr42.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_getUserPrincipal */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.getUserPrincipal must provide the same     */
      /* functionality as RenderRequest.getUserPrincipal"                     */
      TestResult tr43 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_GETUSERPRINCIPAL);
      /* TODO: implement test */
      tr43.appendTcDetail("Not implemented.");
      tr43.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_isRequestedSessionIdFromCookie */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.isRequestedSessionIdFromCookie must        */
      /* provide functionality as defined in the servlet specification"       */
      TestResult tr44 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_ISREQUESTEDSESSIONIDFROMCOOKIE);
      /* TODO: implement test */
      tr44.appendTcDetail("Not implemented.");
      tr44.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_isRequestedSessionIdFromURL1 */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.isRequestedSessionIdFromURL must provide   */
      /* functionality as defined in the servlet specification"               */
      TestResult tr45 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_ISREQUESTEDSESSIONIDFROMURL1);
      /* TODO: implement test */
      tr45.appendTcDetail("Not implemented.");
      tr45.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_isRequestedSessionIdFromUrl */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.isRequestedSessionIdFromUrl must provide   */
      /* functionality as defined in the servlet specification"               */
      TestResult tr46 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_ISREQUESTEDSESSIONIDFROMURL);
      /* TODO: implement test */
      tr46.appendTcDetail("Not implemented.");
      tr46.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_isRequestedSessionIdValid */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.isRequestedSessionIdValid must provide     */
      /* the same functionality as RenderRequest.isRequestedSessionIdValid"   */
      TestResult tr47 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_ISREQUESTEDSESSIONIDVALID);
      /* TODO: implement test */
      tr47.appendTcDetail("Not implemented.");
      tr47.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_isSecure */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.isSecure must provide the same             */
      /* functionality as RenderRequest.isSecure"                             */
      TestResult tr48 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_ISSECURE);
      /* TODO: implement test */
      tr48.appendTcDetail("Not implemented.");
      tr48.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_isUserInRole */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.isUserInRole must provide the same         */
      /* functionality as RenderRequest.isUserInRole"                         */
      TestResult tr49 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_ISUSERINROLE);
      /* TODO: implement test */
      tr49.appendTcDetail("Not implemented.");
      tr49.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_removeAttribute */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.removeAttribute must provide the same      */
      /* functionality as RenderRequest.removeAttribute"                      */
      TestResult tr50 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_REMOVEATTRIBUTE);
      /* TODO: implement test */
      tr50.appendTcDetail("Not implemented.");
      tr50.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_setAttribute */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.setAttribute must provide the same         */
      /* functionality as RenderRequest.setAttribute"                         */
      TestResult tr51 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_SETATTRIBUTE);
      /* TODO: implement test */
      tr51.appendTcDetail("Not implemented.");
      tr51.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPRenderRequest_setCharacterEncoding */
      /* Details: "In a target jsp of a include in the Render phase, the      */
      /* method HttpServletRequest.setCharacterEncoding does not perform      */
      /* any operation"                                                       */
      TestResult tr52 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPRENDERREQUEST_SETCHARACTERENCODING);
      /* TODO: implement test */
      tr52.appendTcDetail("Not implemented.");
      tr52.writeTo(writer);

%>