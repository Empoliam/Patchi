package patchi.math.space;

/**
 *	A Vector in 3D space.
 */
public class Vector {

	/**  X coordinate. */
	private double x;
	
	/**  Y coordinate. */
	private double y;
	
	/**  Z cordinate. */
	private double z;

	@Override
	public String toString() {
		return x + "," + y + "," + z;
	}
	
	/**
	 * Create a new Vector with the specified direction.
	 *
	 * @param x x-direction
	 * @param y y-direction
	 * @param z z-direction
	 */
	public Vector(double x, double y, double z) {

		this.x = x;
		this.y = y;
		this.z = z;

	}
	
	/**
	 * Clones a new Vector from the given Vector.
	 *
	 * @param C Vector to clone
	 */
	public Vector(Vector C) {
		this.x = C.getX();
		this.y = C.getY();
		this.z = C.getZ();
	}
	
	/**
	 * Creates a new Vector from A to B.
	 *
	 * @param A
	 * @param B
	 */
	public Vector(Vector A, Vector B) {
		this(B.Subtract(A));
	}
	
	/**
	 * Adds two Vectors.
	 *
	 * @param B Vector to add
	 * @return sum of Vectors
	 */
	public Vector add(Vector B) {
		return new Vector(
				x + B.getX(),
				y + B.getY(),
				z + B.getZ());
	}
		
	/**
	 * Subtract the paramater Vector from this Vector.
	 *
	 * @param B Vector to subtract
	 * @return the Vector
	 */
	public Vector Subtract(Vector B) {
		return this.add(B.negate());
	}
	
	/**
	 * Negate this Vector.
	 *
	 * @return negated Vector.
	 */
	public Vector negate() {
		return new Vector(-x,-y,-z);
	}	
	
	/**
	 * Multiply this Vector by a scalar.
	 *
	 * @param m scalar
	 * @return resultant Vector
	 */
	public Vector scalarMult(double m) {
		return new Vector(
				x * m,
				y * m,
				z * m);
	}
	
	/**
	 * Dot this Vector with the parameter Vector.
	 *
	 * @param B Vector to dot with
	 * @return resultant dot product
	 */
	public double dot(Vector B) {
		
		return (x*B.getX()) + (y*B.getY()) + (z*B.getZ());
		
	}
	
	/**
	 * Cross this Vector with the parameter Vector.
	 *
	 * @param B Vector to cross with
	 * @return resultant Vector
	 */
	public Vector cross(Vector B) {
		
		double cx = (y * B.getZ()) - (z * B.getY());
		double cy = -((x*B.getZ()) - (z * B.getX()));
		double cz = (x * B.getY()) - (y * B.getX());
		
		return new Vector(cx,cy,cz);
		
	}
	
	/**
	 * Calculate the length of this Vector.
	 *
	 * @return vector length
	 */
	public double mod() {
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	/**
	 * Normalize the given Vector.
	 *
	 * @return normalized Vector
	 */
	public Vector normalize() {
		
		double n = 1 / mod();
		return new Vector(scalarMult(n));
		
	}
	
	/**
	 * Sets the x-direction.
	 *
	 * @param x the new x
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * Returns the x-direction.
	 *
	 * @return x-direction
	 */
	public double getX() {
		return x;
	}

	/**
	 * Sets the y-direction.
	 *
	 * @param y y-direction
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Returns the y-direction.
	 *
	 * @return y-direction
	 */
	public double getY() {
		return y;
	}

	/**
	 * Sets the z-direction.
	 *
	 * @param z z-direction
	 */
	public void setZ(double z) {
		this.z = z;
	}
	
	/**
	 * Returns the z-direction.
	 *
	 * @return z-direction
	 */
	public double getZ() {
		return z;
	}

}
