/**
 * @author Gergely Tóth
 */
package org.nan.mce;

import static java.util.Objects.hash;

import java.util.Objects;

import org.nan.CantTouchThis;

@CantTouchThis
public class Illusionist {

	public final String name;

	public Illusionist(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !this.getClass().isAssignableFrom(obj.getClass()))
			return false;

		Illusionist other = (Illusionist) obj;
		return Objects.equals(name, other.name);
	}

}
