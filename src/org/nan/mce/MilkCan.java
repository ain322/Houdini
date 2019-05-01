/**
 * @author Gergely Tóth
 */
package org.nan.mce;

import java.util.HashSet;
import java.util.Set;

import org.nan.CantTouchThis;

@CantTouchThis
public final class MilkCan implements Container {

	private Set<Illusionist> interior = new HashSet<>();
	
	@Override
	public void putInside(Illusionist illusionist) {
		if (interior.size() >= 1)
			throw new MilkCanIsFull();
		
		interior.add(illusionist);
	}

	@Override
	public boolean contains(Illusionist illusionist) {
		return interior.contains(illusionist);
	}

	@Override
	public boolean isEmpty() {
		return interior.isEmpty();
	}
	
	@Override
	public String toString() {
		return "totally ordinary milk can";
	}
}
