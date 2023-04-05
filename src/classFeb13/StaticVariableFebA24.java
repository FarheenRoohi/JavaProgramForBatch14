package classFeb13;

public class StaticVariableFebA24 {
        int rollNumber;
        static String schoolName;
        String studentName;
        void hallTicket() {
        	studentName = "Roohi";
        	rollNumber = 235;
        String	dateOfBirth = "21-3-2009";
        	schoolName = "Meadowview";
        	System.out.println("Student Name ="+" "+studentName+", "+"Roll Number ="+rollNumber +", "+"School Name ="+" " + schoolName +
        			", "+"Date Of Birth = "+dateOfBirth);
        }
	public static void main(String[] args) {
           StaticVariableFebA24 svf = new StaticVariableFebA24();
           svf.hallTicket();
	}

}
