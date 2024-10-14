public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Student class
    static class Student extends Person {
        private String studentID;
        private String course;
        private int units;
        private final int feePerUnit = 1000;

        public Student(String name, int age, String studentID, String course, int units) {
            super(name, age);
            this.studentID = studentID;
            this.course = course;
            this.units = units;
        }

        public double calculateFees() {
            return units * feePerUnit;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Student ID: " + studentID);
            System.out.println("Course: " + course);
            System.out.println("Units: " + units);
            System.out.println("Total Fee: " + calculateFees());
        }


    // Instructor class
    static class Instructor extends Person {
        private String employeeID;
        private String department;
        private double salary;

        public Instructor(String name, int age, String employeeID, String department, double salary) {
            super(name, age);
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        }
    

    // Method to print details
    public static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Shane Agregado", 18, "S12345", "Computer Engineering", 1);
        Student student2 = new Student("Relyn Agregado", 19, "S67890", "Computer Science", 1);

        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Engr. Jovillano", 25, "E12345", "Computer Engineering", 20000.00);
        Instructor instructor2 = new Instructor("Engr. Smith", 28, "E67890", "Computer Science", 20000.00);

        // Print information for each person
        System.out.println("Student 1:");
        printDetails(student1);
        System.out.println("\nStudent 2:");
        printDetails(student2);
        System.out.println("\nInstructor 1:");
        printDetails(instructor1);
        System.out.println("\nInstructor 2:");
        printDetails(instructor2);
    }
     
}

}
}