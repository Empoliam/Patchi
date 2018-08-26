package patchi.patchiLib.math.space;

/**
 *	Describes a vector with a given direction and origin
 */
public class Ray {

	/** The origin. */
	private final Vector origin;
	
	/** The direction. */
	private final Vector direction;
	
	/**
	 * Instantiates a new ray.
	 *
	 * @param origin origin
	 * @param direction direction
	 */
	public Ray(Vector origin, Vector direction) {
		
		this.origin = origin;
		this.direction = direction.normalize();
		
	}

	/**
	 * Returns a point from the given parameter
	 *
	 * @param t the t
	 * @return resultant point
	 */
	public Vector getPointFromParameter(double t) {
		return new Vector(origin.add(direction.scalarMult(t)));
	}
		
	/**
	 * Gets the origin.
	 *
	 * @return origin
	 */
	public Vector getOrigin() {
		return origin;
	}

	/**
	 * Gets the direction.
	 *
	 * @return direction
	 */
	public Vector getDirection() {
		return direction;
	}

}
