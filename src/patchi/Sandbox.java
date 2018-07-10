package patchi;

import java.awt.Color;

import patchi.util.PatchiColor;

public class Sandbox {

	public static void main(String[] args) {
		
		Color A = Color.BLUE;
		Color B = Color.RED;
		
		System.out.println(PatchiColor.blend(A,B));
		
	}

}
