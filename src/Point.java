public class Point {
	private double x;
	private double y;
	
	public Point(){
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setLocation(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Point getLocation(){
		return this;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y	;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	
	public void setY(double y){
		this.y = y;
	}
	
	public void move(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x = " + this.x + ", y = " + this.y;
	}
}
