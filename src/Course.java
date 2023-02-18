public class Course {
    private String namecourse;
    private int number;
    private String teachername;
    private String courestart;
    private Student student;

    public Course(String namecourse, int number, String teachername, String courestart, Student student) {
        this.namecourse = namecourse;
        this.number = number;
        this.teachername = teachername;
        this.courestart = courestart;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course{" +
                "namecourse='" + namecourse + '\'' +
                ", number=" + number +
                ", teachername='" + teachername + '\'' +
                ", courestart='" + courestart + '\'' +
                ", student=" + student +
                '}';
    }
}
