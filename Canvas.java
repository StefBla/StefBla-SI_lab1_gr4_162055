class Canvas {
	String pointID;
	List<Student> points = new ArrayList<Point>();

	//TODO constructor
	public Point(){
		this.pointID = pointID;
	}

	//TODO seters & getters
	public void setpointID(String pointID){
		this.pointID = pointID;
	}

	public String getpointID(){
		return pointID;
	}

	public boolean addPoint(Point point){
		if (point==null || points.contains(point)) {
			return false;
		}
		points.add(point);
		return true;
	}


}