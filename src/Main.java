import com.one.assignment.assignmentOop.Animal;
import com.one.assignment.assignmentOop.Cow;
import com.one.assignment.assignmentOop.Lion;
import com.one.assignment.assignmentAbstract.Person;
import com.one.oop.abstraction.Car;
import com.one.oop.abstraction.Vehicle;
import com.one.oop.encapsulation.*;
import com.one.oop.inheritance.Child;
import com.one.oop.inheritance.Parent;

public class Main {
    public static void main(String[] args) {
        // Object Example
        Employee e = new Employee("Sohini", 1000);
        e.displayDetails();

        // abstract class + inheritance
        Vehicle car = new Car();
        car.startEngine();
        car.accelerate();
        car.brake();

        // encapsulation
        Employee newEmp = new Employee();
        newEmp.setName("Akash");
        newEmp.setSalary(2000);

        System.out.println("OOPs.Employee "+ newEmp.getName() + " has salary "+ newEmp.getSalary());

        //Polymorphism
        Parent p = new Parent();
        Child c = new Child();

        Parent parent = new Child();

        //overloading
        p.startEngine();
        p.startEngine(5);

        c.startEngine();

        //overriding
        parent.startEngine(6);
        parent.startEngine();

        //Automatic type promotion
        method('a');

        method(2.5f);

        method("Sohini");

        //Assignment 1
        Animal lion = new Lion("Has a huge mane");
        lion.sleep();
        lion.drinks();
        lion.hunts();
        lion.eats();

        Animal cow = new Cow("Cow gives milk");
        cow.sleep();
        cow.drinks();
        cow.hunts();
        cow.eats();

        //com.one.assignment.Assignment2
        Person person1 = new Person("A", 10, "Pune");
        Person person2 = new Person("B", 20, "Pune");
        Person person3 = new Person("C", 30, "Pune");
        Person person4 = new Person("D", 40, "Pune");
        Person person5 = new Person("E", 50, "Pune");

        Person.printCount();

//        EmpAssignment2 emp = new EmpAssignment2();
//        emp.noOverride(" 5");
    }

    public static void method(int i){
        System.out.println("Promoted to Integer - " + i);
    }

    public static void method(double d){
        System.out.println("Promoted to double - " +d);
    }

    public static void method(Object o){
        System.out.println("Promoted to Object - " +o);
    }
}

