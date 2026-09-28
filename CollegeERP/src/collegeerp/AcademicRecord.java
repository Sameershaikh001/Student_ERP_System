package collegeerp;

public class AcademicRecord {

    private int studentId;
    private double marks;

    public AcademicRecord(int studentId, double marks) {

        this.studentId = studentId;
        this.marks = marks;
    }

    public int getStudentId() {

        return studentId;
    }

    public double getMarks() {

        return marks;
    }

    public String getGrade() {

        if (marks >= 90) {

            return "A+";

        } else if (marks >= 80) {

            return "A";

        } else if (marks >= 70) {

            return "B";

        } else if (marks >= 60) {

            return "C";

        } else if (marks >= 50) {

            return "D";

        } else {

            return "F";
        }
    }

    @Override
    public String toString() {

        return "Student ID: " + studentId +
               " | Marks: " + marks +
               " | Grade: " + getGrade();
    }
}