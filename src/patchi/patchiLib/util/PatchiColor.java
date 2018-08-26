package patchi.patchiLib.util;

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
	public static Color average(Color ... colors) {
		
		int n = colors.length;
		int r = 0;
		int g = 0;
		int b = 0;
		
		for(int x = 0; x < n; x++) {
			r += colors[x].getRed();
			g += colors[x].getGreen();
			b += colors[x].getBlue();
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
	
	/**
	 * Multiply the individual RGB values of A and B by each other.
	 *
	 * @param A Color A
	 * @param B Color B
	 * @return blended Color
	 */
	public static Color multiply(Color A, Color B) {
		
		float[] rgbA = A.getRGBColorComponents(null);
		float[] rgbB = B.getRGBColorComponents(null);
		
		float r = rgbA[0] * rgbB[0];
		float g = rgbA[1] * rgbB[1];
		float b = rgbA[2] * rgbB[2];
		
		return new Color(r,g,b);
		
	}
	
	/**
	 * Multiply all of the components of Color A by a given float greater than 0f.
	 *
	 * @param A Color A
	 * @param x scalar multiplier (0.0 - 1.0)
	 * @return scaled color
	 */
	public static Color scalarMultiply(Color A, float x) {
		
		if(x < 0) x = 0;
		float[] rgb = A.getRGBColorComponents(null);
		
		return new Color(
				Math.min(x * rgb[0], 1.0f),
				Math.min(x * rgb[1], 1.0f),
				Math.min(x * rgb[2], 1.0f));
		
	}
	
	/**
	 * Linear dodge. Sums components of all input colours and clamps to 1.
	 *
	 * @param colors Input colors
	 * @return blended color
	 */
	public static Color linearDodge(Color ... colors) {
		
		int n = colors.length;
		int r = 0;
		int g = 0;
		int b = 0;
		
		for(int x = 0; x < n; x++) {
			r += colors[x].getRed();
			g += colors[x].getGreen();
			b += colors[x].getBlue();
		}
		
		if(r > 255) r = 255;
		if(g > 255) g = 255;
		if(b > 255) b = 255;
		
		return new Color(r,g,b);
		
	}

}
