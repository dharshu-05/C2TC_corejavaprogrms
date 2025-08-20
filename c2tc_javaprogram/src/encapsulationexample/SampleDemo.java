package encapsulationexample;

public class SampleDemo {
    public static void main(String[] args) {
        // Create object of student
        student s = new student();

        // Set values using setter methods
        s.setName("Dharshini");
        s.setAge(21);
        s.setCourse("Computer Science");

        // Get values using getter methods
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
        System.out.println("Student Course: " + s.getCourse());
    }
}
