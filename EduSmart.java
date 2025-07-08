package javaproject;


//abtract class User for all users(Student,Admin,Instructor)
abstract class User{
//all variables are accessible by using getter/setter method
	private String name;
	private String email;
	private String userID;
//all getter methods 	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUserID() {
		return userID;
	}
//all setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
//Parameterized constructor of the User class to initialize the object
	User(String name,String email,String userID){
		this.name=name;
		this.email=email;
		this.userID=userID;
	}
// Abstract method to be implemented by subclasses for showing profile	
	public abstract void viewProfile();
// Final method in use for constant - cannot be overridden, common to all users
	final void displayWelcome() {
		System.out.println("\nHello, welcome to the EduSmart LMS project " );
	}
	
}

//Interface to be implemented by class that can track course progress
interface ProgressTrackble{
	 abstract void trackProgress();
}

//class Student extends the Parent class User which also implements the interface ProgressTrackable
class Student extends User implements ProgressTrackable{
	 
	 private String enrolledCourse1;
	 private String enrolledCourse2;
// all getter methods 
	 public String getEnrolledCourse1() {
		return enrolledCourse1;
	}
	 
	 public String getEnrolledCourse2() {
		 return enrolledCourse2;
	 }
//all setter methods
     public void setEnrolledCourse1(String enrolledCourse1) {
		 this.enrolledCourse1 = enrolledCourse1;
	 }
     
     public void setEnrolledCourse2(String enrolledCourse2) {
		 this.enrolledCourse2 = enrolledCourse2;
	 }
//Parametrized constructor of child class Student which intialize the User fields	
	 
     Student(String name, String email, String userID) {
 		super(name, email, userID);
 		this.enrolledCourse1 =null;
 		this.enrolledCourse2=null;
 		
 	}
//Method to enroll the course    

	 public void enrollCourse(String courseName) {
		 if (this.enrolledCourse1 == null) {
	            this.enrolledCourse1 = courseName;
	        } else if (this.enrolledCourse2 == null) {
	            this.enrolledCourse2 = courseName;
	        } else {
	            System.out.println("Cannot enroll in more than 2 courses.");
	        }

}
//abstract method only defined in abstract class and we can implement in child class only 
	@Override
	 public void viewProfile() {
		System.out.println("Welcome to the student profile in EduSmart Project");
		System.out.println("\tName of the student is " + getName());
		System.out.println("\tThe email id of the student is " + getEmail());
		System.out.println("\tThe userID of the student is " + getUserID());
		
		
	}
//Implementation of interface method to show progress
	void trackProgress() {
		System.out.println("\tThe progress of the student track is " + getName());
	}
}
//class Ibstructor inherits the all properties of the Parent class User
class Instructor extends User{
	private String createdCourse1;
	private String createdCourse2;
//All getter methods
	public String getCreatedCourse1() {
		return createdCourse1;
	}
	
	public String getCreatedCourse2() {
		return createdCourse2;
	}
//All setter Methods
    public void setCreatedCourse1(String createdCourse1) {
		this.createdCourse1 = createdCourse1;
	}

    public void setCreatedCourse2(String createdCourse2) {
		this.createdCourse2 = createdCourse2;
	}
//Parameterised constructor intialize the field of the Parent class by using super keyword	
	Instructor(String name, String email, String userID) {
		super(name, email, userID);
//this keyword is used to initialize the current class object.
		this.createdCourse1=null;
		this.createdCourse2=null;
		
	}
	
	
	
//Method:createCourse(StringcourseName)→storecoursename incomplete	
	void createCourse(String courseName) {
		 if (this.createdCourse1 == null) {
	            this.createdCourse1 = courseName;
	        } else if (this.createdCourse2 == null) {
	            this.createdCourse2 = courseName;
	        } else {
	            System.out.println("Cannot create more than 2 courses.");
	        }

		
	}

@Override
 public void viewProfile() {
	System.out.println("Welcome to the instructor profile in EduSmart Project");
	System.out.println("\tThe name of the instructor is " + getName());
	System.out.println("\tThe email id of the instructor is " + getEmail());
	System.out.println("\tThe userID of the instructor is " + getUserID());
	
	
}
	
}
//Admin class extends abstract class User (Inheritance)
class Admin extends User{
	
	 // Constructor calls the superclass constructor (super)
	Admin(String name, String email, String userID) {
		super(name, email, userID);
		
	}
	 // Method to simulate removing a user from the system
	 public void removeUser(User user) {
		System.out.println("\tRemoved user is " + user.getName());
		
	}

	@Override
	 public void viewProfile() {
		System.out.println("Welcome to the Admin profile in EduSmart Project");
		System.out.println("\tName of Admin: " + getName());
		System.out.println("\tEmail of Admin: " + getEmail());
		System.out.println("\tuserID of Admin: " + getUserID());
		
		
		
	}
	
}

class Course{
	private String title;
	private int durationInHours;
	final int maxStudents=20;
	
//parametrizzed constructor called Course to initialize the current class object by using this kkeyword	
	Course(String title,int durationInHours,int maxStudents){
		
		this.title=title;
		this.durationInHours=durationInHours;
		
	}
	// Constructor Overloading:
    // Constructor to initialize only title
	Course(String title){
		
		
		this.title=title;
		
	}
	
	void showCourseDetails() {
		System.out.println("\nWelcome to the Course Details in EduSmart Project");
		System.out.println("\tTitle of the course is " + title);
		System.out.println("\tDuration in hours of the class is: " + durationInHours);
		System.out.println("\tMaximun students who enrolled the course is: " + maxStudents);
		
	}
}



public class EduSmart {

	public static void main(String[] args) {
		Student s1 = new Student("Prem ", "premsheoran111@gmail.com " , "PP101");
		Student s2 = new Student("Premi ", "premsheoran1112@gmail.com " , "PP1011");
		
		s1.enrollCourse("Code with Harry");
		s1.enrollCourse("SDET-QA");
		s1.viewProfile();
		s1.trackProgress();
		s1.displayWelcome();
		
		s2.enrollCourse("GSIT");
		s2.enrollCourse("Neso Academy");
		s2.viewProfile();
        s2.trackProgress();
		s2.displayWelcome();
		
		
		
		
		Instructor i1 = new Instructor("Bittu ","bittu112@gmail.com "," BB101"); 
		Instructor i2 = new Instructor("Kittu ","kittu112@gmail.com "," KK101"); 
		
		i1.createCourse("Apna College");
		i1.createCourse("Code with Harry");
		i1.viewProfile();
		i1.displayWelcome();
		
		i2.createCourse("Neso Academy");
		i2.createCourse("SDET QA");
		i2.viewProfile();
		i2.displayWelcome();
		
		Admin admin = new Admin("Butter Mushroom " ,"buttermushroom121@gmail.com ", " AD101");
		admin.viewProfile();
        admin.displayWelcome();
		admin.removeUser(s1);
		admin.removeUser(s2);
		
		Course c1 = new Course("Neso Academy", 12, 19);
		c1.showCourseDetails();
        Course c2 = new Course("Code with Harry");
		c2.showCourseDetails();
		

	}

}
