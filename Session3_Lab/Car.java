package anudip.Assignments.Session3_Lab;

    import java.util.Scanner;

    public class Car {
        String make;
        String model;
        short year;
        int price;

        public Car(String make, String model, short year, int price) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Price: $" + price);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter make: ");
            String make = scanner.nextLine();

            System.out.print("Enter model: ");
            String model = scanner.nextLine();

            System.out.print("Enter year: ");
            short year = scanner.nextShort();

            System.out.print("Enter price: ");
            int price = scanner.nextInt();

            Car car = new Car(make, model, year, price);
            System.out.println("\nCar Details:");
            car.displayDetails();
        }
    }


