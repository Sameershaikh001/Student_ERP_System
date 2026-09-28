package collegeerp;

import java.util.Scanner;
public class Main{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ERPService erp = new ERPService();

    int choice;

    do {

        System.out.println("\n=================================");
        System.out.println("        COLLEGE ERP SYSTEM");
        System.out.println("=================================");

        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Add Course");
        System.out.println("6. View Courses");
        System.out.println("7. Student Result");
        System.out.println("0. Exit");

        System.out.print("\nEnter your choice: ");

        try {

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();

                    Student student = new Student(
                            id,
                            name,
                            email,
                            phone,
                            course,
                            year
                    );

                    erp.addStudent(student);

                    break;

                case 2:

                    erp.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    Student foundStudent =
                            erp.findStudent(searchId);

                    if (foundStudent != null) {

                        System.out.println("Student Found:");
                        System.out.println(foundStudent);

                    } else {

                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    erp.deleteStudent(deleteId);

                    break;

                case 5:

                    System.out.print("Enter Course ID: ");
                    int courseId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Duration: ");
                    int duration = sc.nextInt();

                    Course newCourse = new Course(
                            courseId,
                            courseName,
                            department,
                            duration
                    );

                    erp.addCourse(newCourse);

                    break;

                case 6:

                    erp.viewCourses();

                    break;

                case 7:

                    System.out.print("Enter Student ID: ");
                    int resultId = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    erp.addResult(resultId, marks);

                    break;

                case 0:

                    System.out.println(
                            "Thank you for using College ERP."
                    );

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } catch (Exception e) {

            System.out.println(
                    "Invalid input. Please enter the correct value."
            );

            sc.nextLine();

            choice = -1;
        }

    } while (choice != 0);

    sc.close();
}
}