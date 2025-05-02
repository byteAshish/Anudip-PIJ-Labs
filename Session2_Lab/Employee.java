package anudip.Assignments.Session2_Lab;

public class Employee {
        protected int id;
        protected int age;
        protected String name;
        protected boolean isPermanent;

        public static void main(String[] args) {
            // Uncomment to see the error
            // age = 35.5; // Error: incompatible types

            int correctedAge = (int) 35.5; // Casting to int
            System.out.println("Successfully started");
        }
    }
