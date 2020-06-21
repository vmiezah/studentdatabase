package studentdatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLvl;
    private String studentID;
    private String classes = null;
    private int tuition;
    //class price is static since all classes are the same
    private static int classPrice = 1000;
    // static id representation for student
    private static int id = 1000 ;

    //static bc those variables are always true for the object, but name etc, remain true for instance of student

    public Student(){
        //constructor for Student
        //upon creation, user is prompted to set name, class year, etc.
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        this.firstName = kbd.nextLine();

        System.out.println("Enter your last name: ");
        this.lastName = kbd.nextLine();

        System.out.println("Select your class year: \n1- FirstYear\n2- Sophomore\n3- Junior\n4- Senior");
        this.gradeLvl = kbd.nextInt();
        setStudentID();
        // id is incremented every time a student is created

    }
    private void setStudentID(){
        id++;
        this.studentID = gradeLvl + ""+ id;
    }

    public void enroll(){
        do {
            System.out.print("What classes would you like to enroll in? \nPress Q to finalize your decision.");
            Scanner kbd = new Scanner(System.in);
            String course = kbd.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                classes = classes + "\n  " + course;
                tuition += classPrice;
            } else {
                break;
            }
        }
            while(1 != 0);

    }

    public void viewBalance(){
        System.out.println("YOUR BALANCE IS : $"+tuition);
    }
    public void payBalance(){
        viewBalance();
        System.out.print("HOW MUCH WILL YOU LIKE TO PAY? : $");
        Scanner kbd = new Scanner(System.in);
        int payment = kbd.nextInt();
        tuition -= payment;
        System.out.println("WE HAVE RECEIVED YOUR PAYMENT OF : $" + payment);
        viewBalance();
    }
    public String toString(){
        return "NAME : " + firstName + " "+ lastName +
                "\nGRADE LEVEL : " + gradeLvl+
                "\nSTUDENT ID : "+ studentID+
                "\nCLASSES : "+ classes +
                "\nBALANCE : $" + tuition;
    }
}
