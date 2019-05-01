/**
 * @author Gergely Tóth
 */
package org.nan;

@CantTouchThis("Recursive out-of-context retro-hip-hop-annotation")
public @interface CantTouchThis {
	String value() default "Stop: Hammer time!";
}
