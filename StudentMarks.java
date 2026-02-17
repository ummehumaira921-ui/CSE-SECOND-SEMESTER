import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = sc.nextLine();
            System.out.print("Enter marks of " + name + ": ");
            double marks = sc.nextDouble();
            sc.nextLine(); // clear buffer
            total += marks;
        }

        double average = total / n;
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
