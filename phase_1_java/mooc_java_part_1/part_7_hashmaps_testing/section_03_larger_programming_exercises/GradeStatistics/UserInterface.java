import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }
            register.addGrade(number);
        }

        System.out.println(register.getGrades());
        System.out.printf("Point average (all): %.1f \n", register.averageGrade());
        System.out.printf("Point average (passing): %.1f \n", register.passingGrade());
        System.out.printf("Percentage (passing): %.1f percent \n", register.passPercentage());
        System.out.println("Grade distribution:");
        register.gradeDistribution();
    }
}
