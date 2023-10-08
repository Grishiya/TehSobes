package pro.sky.java.course2;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        if (age < 7) {
            throw new RuntimeException("Тебе рано в школу");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name " + this.name
                + " , Age " + this.age;
    }
}
