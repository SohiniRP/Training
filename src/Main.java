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

        System.out.println("Employee "+ newEmp.getName() + " has salary "+ newEmp.getSalary());

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
        AnimalAssignment1 lion = new LionAssignment1("Has a huge mane");
        lion.sleep();
        lion.drinks();
        lion.hunts();
        lion.eats();

        AnimalAssignment1 cow = new CowAssignment1("Cow gives milk");
        cow.sleep();
        cow.drinks();
        cow.hunts();
        cow.eats();

        //Assignment2
        PersonAssignment2 person1 = new PersonAssignment2("A", 10, "Pune");
        PersonAssignment2 person2 = new PersonAssignment2("B", 20, "Pune");
        PersonAssignment2 person3 = new PersonAssignment2("C", 30, "Pune");
        PersonAssignment2 person4 = new PersonAssignment2("D", 40, "Pune");
        PersonAssignment2 person5 = new PersonAssignment2("E", 50, "Pune");

        System.out.println("Count = " + PersonAssignment2.getCount());

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

