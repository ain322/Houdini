/**
 * @author Gergely Tóth
 */
package org.nan;

@CantTouchThis("Recursive, double-negate-able, out-of-context, retro-hip-hop annotation")
public @interface CantTouchThis {
	String value() default "Stop: Hammer time!";
}
