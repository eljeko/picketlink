package org.jboss.picketlink.cdi.permission.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marks the field of an @ACLStore annotated entity bean as containing the identifier value for the
 * resource.
 * 
 * @author Shane Bryzak
 *
 */
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
@Documented
public @interface ACLIdentifier
{

}
