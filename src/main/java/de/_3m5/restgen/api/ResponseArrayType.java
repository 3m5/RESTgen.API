/**
 * (C) 2014 by 3m5. Media GmbH. http://www.3m5.de
 */
package de._3m5.restgen.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for marking a response array object of a REST endpoint method.
 * 
 * @author osterrath
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ResponseArrayType {
	Class<?>[] value();
}
