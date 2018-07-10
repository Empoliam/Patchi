package patchi.util;

import java.awt.Color;


/**
 * Color manipulation utility class.
 */
public final class PatchiColor {

	private PatchiColor() {}
	
	/**
	 * Average the rgb components of the given Colors.
	 *
	 * @param colours Colors to average
	 * @return average Color
	 */
	public static Color average(Color ... colours) {
		
		int n = colours.length;
		int r = 0;
		int g = 0;
		int b = 0;
		
		for(int x = 0; x < n; x++) {
			r += colours[x].getRed();
			g += colours[x].getGreen();
			b += colours[x].getBlue();
		}
		
		return new Color(r/n,g/n,b/n);
		
	}
	
	/**
	 * Blend the two given Colors.
	 *
	 * @param A Color A
	 * @param B Color B
	 * @return blended Color
	 */
	public static Color blend(Color A, Color B) {
		
		double aSum = A.getAlpha() + B.getAlpha();
		double aWeight = A.getAlpha() / aSum;
		double bWeight = B.getAlpha() / aSum;
		
		double r = aWeight * A.getRed() + bWeight * B.getRed();
		double g = aWeight * A.getGreen() + bWeight * B.getGreen();
		double b = aWeight * A.getBlue() + bWeight * B.getBlue();
		
		return new Color((int)r,(int)g,(int)b);
		
	}

}
