package javaproject;

interface ProgressTrackble{
	void trackProgress();
}
abstract class User{
	private String name;
	private String email;
	private String userID;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	User(String name,String email,String userID){
		this.name=name;
		this.email=email;
		this.userID=userID;
	}
	
	abstract void viewProfile();
	final void displayWelcome() {
		System.out.println("Hello, welcome to the project " + name + " ");
	}
	
}

class Student extends User implements ProgressTrackable{
	 
	 private String enrolledCourse1;
	 private String enrolledCourse2;
	 public String getEnrolledCourse1() {
		return enrolledCourse1;
	}
     public String getEnrolledCourse2() {
		 return enrolledCourse2;
	 }
     Student(String name, String email, String userID) {
 		super(name, email, userID);
 		this.enrolledCourse1 =null;
 		this.enrolledCourse2=null;
 		
 	}
    
//Method:enrollCourse(StringcourseName)→storeinoneoftheavailableslots incomplete	
	void enrollCourse(String courseName) {
		
	}
//OverrideviewProfile() incomplete
	@Override
	void viewProfile() {
		System.out.println("Welcome to the student module in EduSmart Project");
		System.out.println("Name of the student is " + getName());
		System.out.println("The email id of the student is " + getEmail() );
		System.out.println("The userID of the student is " + getUserID());
		
		
	}
	void trackProgress() {
		System.out.println(getName() + " is track progress");
	}
}

class Instructor extends User{
	Instructor(String name, String email, String userID) {
		super(name, email, userID);
		this.createdCourse1=null;
		this.createdCourse2=null;
		
	}
	private String createdCourse1;
	public String getCreatedCourse1() {
		return createdCourse1;
	}
	public String getCreatedCourse2() {
		return createdCourse2;
	}
	private String createdCourse2;
//Method:createCourse(StringcourseName)→storecoursename incomplete	
	void createCourse(String courseName) {
		
	}
//incomplete
@Override
void viewProfile() {
	System.out.println("Welcome to the instructor profile");
	System.out.println("The name of the instructor is " + getName());
	System.out.println("The email id of the instructor is" + getEmail());
	System.out.println("The userID of the instructor is " + getUserID());
	
	
}
	
}

class Admin extends User{
	Admin(String name, String email, String userID) {
		super(name, email, userID);
		
	}

	void removeUser(User user) {
		System.out.println("Removed user is " + user.getName());
		
	}

	@Override
	void viewProfile() {
		System.out.println("Adminn Profile created:");
		System.out.println("Name of Admin: " + getName());
		System.out.println("Email of Admin: " + getEmail());
		System.out.println("userID of Admin: " + getUserID());
		
		
		
	}
	
}

class Course{
	private String title;
	private int durationInHours;
	private final int maxStudents;
	
	
	Course(String title,int durationInHours,int maxStudents){
		this.maxStudents = maxStudents;
		this.title=title;
		this.durationInHours=durationInHours;
		
	}
	Course(String title){
		this.maxStudents = 0;
		this.durationInHours=0;
		this.title=title;
		
	}
	
	void showCourseDetails() {
		System.out.println("title of the course is " + title);
		System.out.println("Duration in hours of the class is: " + durationInHours);
		System.out.println("Maximun students who enrolled the course is: " + maxStudents);
		
	}
}



public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Prem ", "premsheoran111@gmail.com " , "PP101");
		Student s2 = new Student("Premi ", "premsheoran1112@gmail.com " , "PP1011");
		
		
		Instructor i1 = new Instructor("Bittu ","bittu112@gmail.com "," BB101"); 
		Instructor i2 = new Instructor("Kittu ","kittu112@gmail.com "," KK101"); 
		
		Admin admin = new Admin("Butter Mushroom " ,"buttermushroom121@gmail.com ", " AD101");
		
		Course c1 = new Course("Neso Academy", 12, 19);
        Course c2 = new Course("Code with Harry");
		
		i1.createCourse("Apna College");
		i1.createCourse("Code with Harry");
		
		i2.createCourse("Neso Academy");
		i2.createCourse("SDET QA");
		
		s1.enrollCourse("Apna College");
		s1.enrollCourse("Code with Harry");
		
		s2.enrollCourse("GSIT");
		s2.enrollCourse("Neso Academy");
		
		s1.viewProfile();
		s2.viewProfile();
		
		i1.viewProfile();
		i2.viewProfile();
		
		s1.trackProgress();
		s2.trackProgress();
		
		s1.displayWelcome();
		s2.displayWelcome();
		
		i1.displayWelcome();
		i2.displayWelcome();
		admin.displayWelcome();
		
		admin.removeUser(s1);
		admin.removeUser(s2);
		
		c1.showCourseDetails();
		c2.showCourseDetails();
		

	}

}
