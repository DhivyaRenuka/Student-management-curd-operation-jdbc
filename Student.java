package StudentManagementApp;

public class Student {
	private int studentID;
	private String StudentName;
	private int StudentPhone;
	private String StudnetCity;
	private String Course;
public Student(int studentID, String studentName, int studentPhone, String studnetCity, String course) {
		super();
		this.studentID = studentID;
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudnetCity = studnetCity;
		Course = course;
	}
public Student(String studentName,int studentPhone, String studnetCity, String course) {
	super();
	StudentName = studentName;
	StudentPhone = studentPhone;
	StudnetCity = studnetCity;
	Course = course;
}
public Student() {
	super();
}
public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public int getStudentPhone() {
	return StudentPhone;
}
public void setStudentPhone(int studentPhone) {
	StudentPhone = studentPhone;
}
public String getStudnetCity() {
	return StudnetCity;
}
public void setStudnetCity(String studnetCity) {
	StudnetCity = studnetCity;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}
@Override
public String toString() {
	return "Student [studentID=" + studentID + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
			+ ", StudnetCity=" + StudnetCity + ", Course=" + Course + "]";
}



}
