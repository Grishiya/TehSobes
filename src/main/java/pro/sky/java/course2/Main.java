package pro.sky.java.course2;



public class Main {
    public static void main(String[] args) {
        Student student = new Student("Grisha", 16);
        try {

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (RuntimeException e) {
            System.out.println(e);
        }finally {
            System.out.println("Все отличыно "+ student);
        }
    }

}