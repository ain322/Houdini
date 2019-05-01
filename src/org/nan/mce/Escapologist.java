/**
 * @author Gergely Tóth
 */
package org.nan.mce;

import org.nan.CantTouchThis;

public class Escapologist extends Illusionist {

	@CantTouchThis
	public Escapologist(String name) {
		super(name);
	}

	public void escape(MilkCan can) {
	}

	@CantTouchThis
	public void enter(MilkCan theCan) {
		theCan.putInside(this);
	}
	
}
