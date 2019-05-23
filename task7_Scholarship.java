import java.util.Scanner;

public class task7_Scholarship{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double MinSalary = Double.parseDouble(scanner.nextLine());
        double socScholarship = 0.35 * MinSalary;
        double excellentScholarship = 25 * grade;

        if (grade >= 5.5 & income < MinSalary & socScholarship >= excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socScholarship));
        }  else if (grade >= 5.5 & income < MinSalary & socScholarship < excellentScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarship));
        }  else if (grade > 4.5 & income < MinSalary) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socScholarship));
        }  else if (grade >= 5.5){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarship));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}