import java.util.Scanner;

public class Person {
	
	String name;
	int YearOfBirth;

	
	
	Person(String name, int YearOfBirth){
		this.name=name;
		this.YearOfBirth=YearOfBirth;
		
	}
	
	public String toString() {
		return "Person[name ="+name+"BirthYear = "+YearOfBirth;
	}
	
	public class Student extends Person{
		
		String major;
		
		Student(String name, int YearOfBirth, String major ) {
			super(name, YearOfBirth);
			this.major=major;
		}
		public String toString() {
			return "Student name: "+ name+" Student year of Birth: "+ YearOfBirth+" Student's major "+major;
		}

		
	}
	public class Instructor extends Person{
		
		int salary;
		
		Instructor(String name, int YearOfBirth, int salary ) {
			super(name, YearOfBirth);
			this.salary=salary;
		}
		public String toString() {
			return "Instructor name: "+ name+" Instructor year of Birth: "+ YearOfBirth+" Instructor Salary "+salary;
		}

		
	}
	
	public static  class test{
		public static void main(String[] args) {
			Scanner  s1 =new Scanner(System.in);
			
			System.out.print("Enter the person name: ");
			String name1= s1.next();
			System.out.println("Enter the instructor name: ");
			String name2= s1.next();
			System.out.println("Enter the name of student: ");
			String name3= s1.next();
			
			
			System.out.println("Enter the year of birth of person: ");
			int y1=s1.nextInt();
			System.out.println("Enter the year of birth of Student: ");
			int y3=s1.nextInt();
			System.out.println("Enter the year of birth of person: ");
			int y2=s1.nextInt();
			
			
		System.out.println("Enter the Student's major: ");
		String m=s1.next();
		System.out.println("Enter the Instructor salary: ");
		int salary=s1.nextInt();
		
		Person person =new Person(name1,y1);
		Student student = new Student(name3,y3,m);
		Instructor instructor=new Instructor(name2,y2,salary);
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(instructor);
		
		
		
		}
		
		
	}

	
}
