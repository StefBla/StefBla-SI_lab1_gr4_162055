class Point {
	String id
	double x,y;


	//TODO add new variable

	String point_colour;
//TODO constructor

	public Point(String id, double x, double y, String point_colour) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.point_colour = point_colour;
	}

	//TODO setters and getters


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getPoint_colour() {
		return point_colour;
	}

	public void setPoint_colour(String point_colour) {
		this.point_colour = point_colour;
	}

	public void move (char xDirection, char yDirection) {
		//TODO

		if (xDirection=='R') {
			this.x++;
		} else if (xDirection=='L') {
			this.y--;
		}

		if (yDirection=='U') {
			this.y++;
		} else if (yDirection=='D') {
			this.y--;
		}
	}

	public void draw () {
		//TODO

		System.out.print("X: " + this.x + ", Y: " + this.y);
	}




}