package anudip.Assignments.Session3_Lab;

public class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Student student = new Student("Ashish", 25, "Computer Science");
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", Dept: " + student.getDepartment());
    }
}
