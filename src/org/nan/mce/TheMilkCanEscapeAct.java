/**
 * @author Gergely Tóth
 */
package org.nan.mce;

import static java.lang.System.setSecurityManager;

import org.nan.CantTouchThis;
import org.nan.mce.Assistant;
import org.nan.mce.MilkCan;

@CantTouchThis
public class TheMilkCanEscapeAct {

	private Escapologist houdini;
	private MilkCan theCan;
	private Assistant bess;

	public TheMilkCanEscapeAct() {
		theCan = new MilkCan();
		announce("The stage hands bring in the totally ordinary milk can");
		
		bess = new Assistant("Bess Houdini");
		announce("Bess Houdini enters the stage");
		
		houdini = new Escapologist("Harry Houdini");
		announce("Please give a warm welcome to Harry Houdini!");
		
		bess.assist(houdini);
	}
	
	public void runTheShow() {
		bess.check(theCan);

		houdini.enter(theCan);
		bess.check(theCan);
		
		houdini.escape(theCan);
		bess.check(theCan);
	}

	public static void main(String[] args) {
		securePremises();
		new TheMilkCanEscapeAct().runTheShow();
	}

	private static void securePremises() {
		setSecurityManager(new SecurityManager());
		announce("The security personel entered the stage");
	}

	private static void announce(String message) {
		System.out.println("Narrator: " + message);
	}
}
