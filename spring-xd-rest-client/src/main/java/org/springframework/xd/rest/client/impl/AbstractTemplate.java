/*
 * Copyright 2013 the original author or authors.
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

package org.springframework.xd.rest.client.impl;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

/**
 * Base class for sub-parts of the API, allows sharing configured objects like the {@link RestTemplate}.
 * 
 * @author Eric Bottard
 * 
 */
/* default */class AbstractTemplate {

	/**
	 * A template used for http interaction.
	 */
	protected RestTemplate restTemplate;

	/**
	 * Holds discovered URLs of the API.
	 */
	protected Map<String, URI> resources = new HashMap<String, URI>();

	/**
	 * Copy constructor.
	 */
	AbstractTemplate(AbstractTemplate other) {
		this.restTemplate = other.restTemplate;
		this.resources = other.resources;
	}

	/**
	 * No arg constructor, used solely by entry point to the API, namely {@link SpringXDTemplate}.
	 */
	AbstractTemplate() {
		restTemplate = new RestTemplate();
		restTemplate.setErrorHandler(new VndErrorResponseErrorHandler(restTemplate.getMessageConverters()));
	}

}
