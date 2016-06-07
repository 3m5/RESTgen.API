/**
 * (C) 2014 by 3m5. Media GmbH. http://www.3m5.de
 */
package de._3m5.restgen.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.ws.rs.core.Response.Status;

/**
 * Annotation for marking a http response code of a REST endpoint method for an
 * error.
 * 
 * @author osterrath
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ResponseErrorCode {
	Status[] value();
}
