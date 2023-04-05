package constructor;

public class ConstructorDemo1Feb28 {
	int rollNumber;
	String studentName;
	String schoolName;
	ConstructorDemo1Feb28(int rollNumb,String name,String schoolname){
		System.out.println("This is the 3 args constructor with int and string");
		rollNumber = rollNumb;
		studentName = name;
		schoolName = schoolname;
		
	}

	
	void printdata() {
	
		System.out.println("RollNumber = "+rollNumber+ ","+ "Name = "+studentName+"," +"SchoolName = "+schoolName+"." );
		System.out.println("");
	}
	public static void main(String[] args) {
		ConstructorDemo1Feb28 dm = new ConstructorDemo1Feb28(210, "Roohi" , "creekside");
         dm.printdata();
         ConstructorDemo1Feb28 dm1 = new ConstructorDemo1Feb28(211, "Farheen"," Creekside");
         dm1.printdata();
         ConstructorDemo1Feb28 dm2= new ConstructorDemo1Feb28(212,"Anabia","Creekside");
         dm2.printdata();
	}

}
