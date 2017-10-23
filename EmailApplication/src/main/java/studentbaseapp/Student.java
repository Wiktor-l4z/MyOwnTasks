package studentbaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private final static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("1\n - Freshmen\n - Sophmore\n - Junior \n - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
        enroll();
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nGrade Year: " + gradeYear +
                "\nStudent ID: " +
                this.studentID);
        showInfo();
    }

    //Generate ID
    private void setStudentID() {
        // Grade Level + ID
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        do {
            System.out.println("Enter course to enroll (0 to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " +payment + "$");
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
