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

package org.springframework.xd.dirt.module;

/**
 * Thrown when attempting to refer to a module that does not exist.
 * 
 * @author Eric Bottard
 */
@SuppressWarnings("serial")
public class NoSuchModuleException extends ResourceDefinitionException {

	/**
	 * Create a new exception.
	 * @param name the module name that was referenced, but could not be found
	 */
	public NoSuchModuleException(String name) {
		super("Could not find module with name '" + name + "'");
	}

}
