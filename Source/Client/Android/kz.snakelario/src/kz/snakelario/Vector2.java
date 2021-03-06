package kz.snakelario;

public class Vector2 {
	public float x;
	public float y;
	
	public Vector2() {
		x = 0;
		y = 0;
	}
	
	public Vector2(float ax, float ay) {
		x = ax;
		y = ay;
	}
	
	public Vector2 copy() {
		return new Vector2(x, y);
	}
	
	public void set(Vector2 v) {
		x = v.x;
		y = v.y;
	}
	
	public Vector2 mul(float k) {
		Vector2 result = new Vector2(x * k, y * k);
		return result;
	}
	
	public void add(Vector2 b) {
		x += b.x;
		y += b.y;
	}
	
	public float getAngle() {
		float angle = (float)Math.atan2(x, y);
		angle += Math.PI/2.0;
		angle = (float)Math.toDegrees(angle);
		
		if (angle < 0) {
	        angle += 360;
	    }
		
		return angle;
	}
	
	public static boolean opposite(Vector2 a, Vector2 b) {
		return a.x == -b.x || a.y == -b.y;
	}
	
	public static Vector2 add(Vector2 a, Vector2 b) {
		Vector2 c = new Vector2();
		c.x = a.x + b.x;
		c.y = a.y + b.y;
		return c;
	}
	
	public static Vector2 sub(Vector2 a, Vector2 b) {
		Vector2 c = new Vector2();
		c.x = a.x - b.x;
		c.y = a.y - b.y;
		return c;
	}
}
