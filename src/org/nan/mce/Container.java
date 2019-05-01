/**
 * @author Gergely Tóth
 */
package org.nan.mce;

import org.nan.CantTouchThis;

/**
 * A container for illusionists ONLY!
 */
@CantTouchThis
public interface Container {

	void putInside(Illusionist illusionist);

	boolean contains(Illusionist illusionist);

	boolean isEmpty();

}
