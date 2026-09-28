package collegeerp;

import java.util.ArrayList;
import java.util.HashMap;

public class ERPService {

    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private HashMap<Integer, AcademicRecord> records;

    public ERPService() {

        students = new ArrayList<>();
        courses = new ArrayList<>();
        records = new HashMap<>();
    }

    // ================= STUDENT =================

    public void addStudent(Student student) {

        if (findStudent(student.getStudentId()) != null) {

            System.out.println("Student ID already exists.");
            return;
        }

        students.add(student);

        System.out.println("Student added successfully.");
    }

    public void viewStudents() {

        if (students.isEmpty()) {

            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {

            System.out.println(student);
        }
    }

    public Student findStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {

                return student;
            }
        }

        return null;
    }

    public void deleteStudent(int studentId) {

        Student student = findStudent(studentId);

        if (student == null) {

            System.out.println("Student not found.");
            return;
        }

        students.remove(student);

        records.remove(studentId);

        System.out.println("Student deleted successfully.");
    }

    // ================= COURSE =================

    public void addCourse(Course course) {

        for (Course c : courses) {

            if (c.getCourseId() == course.getCourseId()) {

                System.out.println("Course ID already exists.");
                return;
            }
        }

        courses.add(course);

        System.out.println("Course added successfully.");
    }

    public void viewCourses() {

        if (courses.isEmpty()) {

            System.out.println("No courses available.");
            return;
        }

        for (Course course : courses) {

            System.out.println(course);
        }
    }

    // ================= RESULT =================

    public void addResult(int studentId, double marks) {

        Student student = findStudent(studentId);

        if (student == null) {

            System.out.println("Student not found.");
            return;
        }

        if (marks < 0 || marks > 100) {

            System.out.println("Marks must be between 0 and 100.");
            return;
        }

        AcademicRecord record =
                new AcademicRecord(studentId, marks);

        records.put(studentId, record);

        System.out.println("Result added successfully.");
        System.out.println(record);
    }
}