public class Student {
    private String name;
    private String surname;
    private int age;
    private String birthday;


    public Student(String name, String surname, int age, String birthday) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthday = birthday;
        if (age == 0) {
            System.out.println(name + ":Wrong age:" + age);
        }
        if (age == 22) {
            System.out.println(name + ":Right age:" + age);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

