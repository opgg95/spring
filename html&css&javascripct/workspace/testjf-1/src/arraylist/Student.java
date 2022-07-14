package arraylist;

public class Student {
	private String StudentName;
	private int PhoneNumber;
	private int Address;
	
	
	public Student(String studentName, int phoneNumber, int address) {
		super();
		StudentName = studentName;
		PhoneNumber = phoneNumber;
		Address = address;
	}


	public String getStudentName() {
		return StudentName;
	}





	public void setStudentName(String studentName) {
		StudentName = studentName;
	}





	public int getPhoneNumber() {
		return PhoneNumber;
	}





	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}





	public int getAddress() {
		return Address;
	}





	public void setAddress(int address) {
		Address = address;
	}


	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + "]";
	}


	public static void main(String[] args) {
	
		
	}

}
