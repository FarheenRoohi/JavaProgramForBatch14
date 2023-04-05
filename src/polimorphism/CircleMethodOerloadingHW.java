package polimorphism;

public class CircleMethodOerloadingHW {

	public static void main(String[] args) {
       Shape s = new Shape();
       s.findArea(10,30.3);
       System.out.println(s.findArea(10,30.3));
	}

}
class Shape{
	
	float findArea(float a,double d) {
		return (float) (a*d);
	}
	float findArea(float r) {
		return (float)3.10*r*r;//rectangle
	}
}
 
	 
 