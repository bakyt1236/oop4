public class Main {
    public static void main(String[] args) {
        Student student = new Student("Marko", "Talaibekov", 31, "09.10.2000");

        Course course = new Course("It-kg", 777098765, "Elmirbek", "Oktober-10"
                , student
        );
        System.out.println(course);
    }
}