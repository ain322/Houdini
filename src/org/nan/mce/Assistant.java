/**
 * @author Gergely Tóth
 */
package org.nan.mce;

import org.nan.CantTouchThis;

@CantTouchThis
public final class Assistant {

	public final String name;
	private Illusionist theIllusionist;

	public Assistant(String name) {
		this.name = name;
	}

	public void assist(Illusionist theIllusionist) {
		this.theIllusionist = theIllusionist;
	}	
	
	public void check(Container theContainer) {
		if (theContainer.isEmpty()) {
			System.out.println(name + ": The " + theContainer + " is empty!");
		} else if (theContainer.contains(theIllusionist)) {
			System.out.println(name + ": " + theIllusionist + " is in the " + theContainer + "!");
		} else {
			System.out.println(name + ": " + theIllusionist + " escaped!");
		}
	}

	@Override
	public String toString() {
		return name;
	}

}
