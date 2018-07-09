package patchi;

import patchi.math.space.Ray;
import patchi.math.space.Vector;

public class Sandbox {

	public static void main(String[] args) {
		
		Ray A = new Ray(new Vector(0,0,0), new Vector(1.2,0.3,0.4));
		
		System.out.println(A.getDirection().mod());

	}

}
