package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseMain {
    public static void main(String[] args) {
        System.out.println("How many students will be enrolled: ");
        Scanner kbd = new Scanner(System.in);
        int numOfStudents = kbd.nextInt();
        Student [] students = new Student[numOfStudents];

        // creates instance of student and goes through enrollment process for each student
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payBalance();
            System.out.println( students[i].toString());
        }

    }
}
