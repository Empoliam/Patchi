package patchi.patchiLib.math;

import java.text.DecimalFormat;

/**
 * Formats an input number into k, m, b, etc format, with a specified maximum length.
 */
public final class MilliFormatter {

	private static final char[] FORMATS = {'k','m','b','t','q'};

	private MilliFormatter() {

	}

	/**
	 * Format input string.
	 *
	 * @param in input number
	 * @param length max length of output
	 * @return output string
	 */
	public static String format(Float in, int length) {

		String s = new DecimalFormat("##0E0").format(in);
		int exp = Integer.parseInt(s.substring(s.indexOf('E')+1,s.length()));

		System.out.println(s);
		
		char suffix = ' ';

		if(exp != 0) {
			suffix = FORMATS[exp/3 - 1];
		}

		s = s.substring(0,s.indexOf("E"));

		if(s.length() > length-1) {
			s = s.substring(0,length-1);
		}
		
		try {
			if(s.charAt(length-2) == '.') {
				s = s.substring(0,length-2);
			}
		} catch (StringIndexOutOfBoundsException e) {

		}
		s = s + suffix;

		return s;

	}

}

