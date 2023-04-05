package constructor;

public class ConstructorDemo2Feb28 {
	int rollNumber;
	String studentName;

	ConstructorDemo2Feb28(int rollnumber, String studentname) {
		rollNumber = rollnumber;
		studentName = studentname;

	}

	void display() {
		System.out.println("RollNumber =" + rollNumber + ", " + "Name =" + studentName);
	}

	public static void main(String[] args) {
		ConstructorDemo2Feb28 cd = new ConstructorDemo2Feb28(8, "Dolly");
		cd.display();
		ConstructorDemo2Feb28 cd1 = new ConstructorDemo2Feb28(9, "Pinky");
		cd1.display();
	}

}
