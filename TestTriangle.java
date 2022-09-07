import java.util.*;
public class TestTriangle {
	
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		double s3=0;
		double s2=0;
		double s1=0;
		Triangle t1 = new Triangle();
		
		System.out.println("Enter the three sides of the triangle ");
		s1=s.nextDouble();
		s2=s.nextDouble();
		s3=s.nextDouble();
		
		
		
		
		System.out.println("Enter the color: ");
		String color=s.next();
		
		System.out.println("Is the color filled? true or false ");
		String filled=s.next();
		
		t1.setSide1(s1);
		t1.setSide2(s2);
		t1.setSide3(s3);
		
		System.out.println("Triangle side1 is "+ s1+" side2 is "+s2+" side3 is"+s3+" and the perimeter is "+t1.getPerimeter());
		}
	
		
	

}
