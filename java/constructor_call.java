import java.util.*;
class Student {
        String name;
        int age;

    Scanner scanner = new Scanner(System.in);

    // Constructor with no parameters
    Student() {
        System.out.print("Enter Student Name : ");
        name = scanner.nextLine();
        System.out.print("Enter Student age : ");
        age = scanner.nextInt();

        scanner.close();
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    // Copy Constructor
    Student(Student object) {
        this.name=object.name;
        this.age = object.age;
    }

}

public class constructor_call {
    public static void main(String[] args) {
        
        Student s1 = new Student(); // no parameter

        Student s2 = new Student("Shubhranil karmakar", 20); // with parameter

        Student s3 = new Student(s2); // copy constructor 
        // Displaying details of students
        display(s1);
        display(s2);
        display(s3);

    }
    static void display( Student object)
    {
        System.out.println("Student's name is : "+ object.name + "\nStudent's age is : "+ object.age);
    }
}
