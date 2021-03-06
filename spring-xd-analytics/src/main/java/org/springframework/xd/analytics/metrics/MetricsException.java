/*
 * Copyright 2011-2013 the original author or authors.
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

package org.springframework.xd.analytics.metrics;

/**
 * May be thrown when something goes wrong with the metrics facility.
 * 
 * @author Luke Taylor
 */
public class MetricsException extends RuntimeException {

	private static final long serialVersionUID = 8549760462311130051L;

	public MetricsException(String message) {
		super(message);
	}

	public MetricsException(String message, Throwable cause) {
		super(message, cause);
	}
}
