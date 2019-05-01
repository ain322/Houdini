/**
 * @author Gergely Tóth
 */
package org.nan.mce;

import org.nan.CantTouchThis;

@CantTouchThis
public interface Container {

	void putInside(Illusionist illusionist);

	boolean contains(Illusionist illusionist);

	boolean isEmpty();

}
