package patchi.patchiLib;

import patchi.patchiLib.math.MilliFormatter;

public abstract class Sandbox {

	public static void main(String[] args) {
		
		float f = 511111f;
		String s = MilliFormatter.format(f, 8);

		System.out.println(s);
		
	}

}
