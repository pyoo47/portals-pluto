/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.blade.samples.applicant.mvcbean.cdi.jsp.controller;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.portlet.PortletPreferences;
import javax.portlet.annotations.RenderMethod;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;

import com.liferay.blade.samples.applicant.mvcbean.cdi.jsp.dto.Preferences;


/**
 * @author  Neil Griffin
 */
@ApplicationScoped
@Controller
public class PreferencesRenderController {

	@Inject
	private Models models;

	@Inject
	private PortletPreferences portletPreferences;

	@RenderMethod(portletNames = { "portlet1" }, portletMode = "edit")
	@ValidateOnExecution(type = ExecutableType.NONE)
	@View("preferences.jspx")
	public void prepareView() {

		Map<String, Object> modelsMap = models.asMap();

		if (!modelsMap.containsKey("preferences")) {
			models.put("preferences", new Preferences(portletPreferences.getValue("datePattern", null)));
		}
	}
}