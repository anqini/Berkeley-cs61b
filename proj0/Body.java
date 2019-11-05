public class Body {
	// variables 
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;
	/* constructor 1 */
	public Body(double xP, double yP, double xV,
              double yV, double m, String img) {
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass = m;
		imgFileName = img;
	}
	/* constructor 2 */
	public Body(Body b) {
		xxPos = b.xxPos;
		yyPos = b.yyPos;
		xxVel = b.xxVel;
		yyVel = b.yyVel;
		mass = b.mass;
		imgFileName = b.imgFileName;
	}
	/** calculate distance */
	public double calcDistance(Body b) {
		double dx = b.xxPos - this.xxPos;
		double dy = b.yyPos - this.yyPos;
		return Math.sqrt(dx * dx + dy * dy);
	}

	/** calculate force */
	public double calcForceExertedBy(Body b) {
		double r = this.calcDistance(b);
		double G = 6.67 * Math.pow(10, -11);
		return G * this.mass * b.mass / (r * r);
	}

	/** calcForceExertedByX and calcForceExertedByY */
	public double calcForceExertedByX(Body b) {
		double force = this.calcForceExertedBy(b);
		double r = this.calcDistance(b);
		return force * (b.xxPos - this.xxPos) / r;
	}

	/** calcForceExertedByX and calcForceExertedByY */
	public double calcForceExertedByY(Body b) {
		double force = this.calcForceExertedBy(b);
		double r = this.calcDistance(b);
		return force * (b.yyPos - this.yyPos) / r;
	}

	/** calcNetForceExertedByX and calcNetForceExertedByY */
	public double calcNetForceExertedByX(Body[] arr) {
		double res = 0;
		arr.remove(this);
		for (Body b: arr) {
			res += this.calcForceExertedByX(b);
		}
		return res;
	}

	/** calcNetForceExertedByX and calcNetForceExertedByY */
	public double calcNetForceExertedByY(Body[] arr) {
		double res = 0;
		arr.remove(this);
		for (Body b: arr) {
			res += this.calcForceExertedByY(b);
		}
		return res;
	}

}