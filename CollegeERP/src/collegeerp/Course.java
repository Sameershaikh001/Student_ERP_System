package collegeerp;

public class Course {

    private int courseId;
    private String courseName;
    private String department;
    private int duration;

    public Course(int courseId, String courseName,
                  String department, int duration) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.department = department;
        this.duration = duration;
    }

	public int getCourseId() {
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
    public String toString() {

        return "Course ID: " + courseId +
               " | Course: " + courseName +
               " | Department: " + department +
               " | Duration: " + duration + " Years";
    }
}