package patchi.patchiLib.math;

import java.util.Random;

/** Maths utility class. */

public final class PatchiMath {

	private PatchiMath() {
				
	}
	
	/**
	 * Generates an int with binomial probability distribution.
	 *
	 * @param n Number of trials
	 * @param p Probability of sucess
	 * @param RANDOM util.Random to be used
	 * @return Generated int
	 */
	public static int generateBinomialInt(int n, double p, Random RANDOM) {

		int x = 0;
		for(int k = 0; k < n; k ++) {
			if(RANDOM.nextDouble() < p) x++;
		}

		return x;

	}
	
	/**
	 * Generates an int with binomial probability distribution. Uses a randomly generated seed.
	 *
	 * @param n Number of trials
	 * @param p Probability of sucess
	 * @return Generated int
	 */
	public static int generateBinomialInt(int n, double p) {

		int x = generateBinomialInt(n, p, new Random());
		return x;

	}
	
	/**
	 * If the double d is outside the interval [l,u], round to the nearest boundary.
	 *
	 * @param d value to truncate
	 * @param l lower bound
	 * @param u upper bound
	 * @return truncated value
	 */
	public static double cutDoubleToRange(double d, double l, double u) {
		
		double o = d;
		
		if(o > 1.0) o = 1.0;
		else if(o < 0.0) o = 0.0;
		
		return o;
		
	}
	
}
