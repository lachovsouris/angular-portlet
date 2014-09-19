package be.aca.liferay.angular.portlet;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Resource {

	public String id() default "";
}