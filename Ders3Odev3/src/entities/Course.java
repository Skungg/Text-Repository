package entities;

public class Course {
    private String courseName;
    private String info;
    private String coursePhoto;
    private double courseUnitePrice;
    public Course(){

    }

    public Course(String courseName, String info, String coursePhoto, double courseUnitePrice) {
        this.courseName = courseName;
        this.info = info;
        this.coursePhoto = coursePhoto;
        this.courseUnitePrice = courseUnitePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCoursePhoto() {
        return coursePhoto;
    }

    public void setCoursePhoto(String coursePhoto) {
        this.coursePhoto = coursePhoto;
    }

    public double getCourseUnitePrice() {
        return courseUnitePrice;
    }

    public void setCourseUnitePrice(double courseUnitePrice) {
        this.courseUnitePrice = courseUnitePrice;
    }
}
