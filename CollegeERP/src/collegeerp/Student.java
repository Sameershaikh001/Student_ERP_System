package collegeerp;

public class Student {

    private int studentId;
    private String name;
    private String email;
    private String phone;
    private String course;
    private int year;

    public Student(int studentId, String name, String email,
                   String phone, String course, int year) {

        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.course = course;
        this.year = year;
    }

    public int getStudentId() {

        return studentId;
    }

    public String getName() {

        return name;
    }

    public String getEmail() {

        return email;
    }

    public String getPhone() {

        return phone;
    }

    public String getCourse() {

        return course;
    }

    public int getYear() {

        return year;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public void setCourse(String course) {

        this.course = course;
    }

    public void setYear(int year) {

        this.year = year;
    }

    @Override
    public String toString() {

        return "ID: " + studentId +
               " | Name: " + name +
               " | Email: " + email +
               " | Phone: " + phone +
               " | Course: " + course +
               " | Year: " + year;
    }
}