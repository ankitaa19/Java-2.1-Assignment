class Person {
    String name;


    Person(String name) {
        this.name = name;
    }

 
    void display() {
        System.out.println("Name: " + name);
    }
}


class Employee extends Person {
    double salary;


    Employee(String name, double salary) {
        super(name); 
        this.salary = salary;
    }

  
    @Override
    void display() {
        super.display(); 
        System.out.println("Salary: " + salary);
    }
}


public class SuperKeywordDemo {
    public static void main(String[] args) {
        
        Employee emp = new Employee("John Doe", 50000);

      
        emp.display();
    }
}
