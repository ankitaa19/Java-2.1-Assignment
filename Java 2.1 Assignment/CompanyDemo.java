
class Employee {
    
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

   
    Employee() {
        this.name = "Unknown";
        this.address = "Unknown";
        this.salary = 0.0;
        this.jobTitle = "Unknown";
    }

  
    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

   
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

   
    public double calculateBonus() {
        return 0.0; 
    }


    public String generatePerformanceReport() {
        return "No performance report available."; 
    }
}


class Manager extends Employee {
  
    private int numberOfSubordinates;

  
    Manager() {
        super();
        this.numberOfSubordinates = 0;
    }

    Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    
    @Override
    public double calculateBonus() {
        return 0.15 * getSalary(); 
    }

    @Override
    public String generatePerformanceReport() {
        return "Manager " + getName() + " has an Excellent performance rating.";
    }

   
    public void manageProject() {
        System.out.println("Manager " + getName() + " is managing the project.");
    }
}


class Developer extends Employee {
   
    private String programmingLanguage;

  
    
    Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }

  
    Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return 0.10 * getSalary(); 
    }

    
    @Override
    public String generatePerformanceReport() {
        return "Developer " + getName() + " has a Good performance rating.";
    }

   
    public void writeCode() {
        System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage + ".");
    }
}


public class CompanyDemo {
    public static void main(String[] args) {
      
        Manager manager = new Manager("Alice", "123 Main St", 80000, "Manager", 5);
        Developer developer = new Developer("Bob", "456 Elm St", 60000, "Developer", "Java");

        
        System.out.println(manager.getName() + "'s Bonus: " + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        manager.manageProject();

        System.out.println(developer.getName() + "'s Bonus: " + developer.calculateBonus());
        System.out.println(developer.generatePerformanceReport());
        developer.writeCode();
    }
}
