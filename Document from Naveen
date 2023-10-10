import java.util.Scanner;

public class EmployeeMessages {
    public static final String[] ERROR_MESSAGES = {
        "Employee number must be numeric, between 1000 and 9999.",
        "Hourly pay rate must be numeric, between $9.00 and $25.00."
    };
}

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

public class EmployeeDataEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter employee number: ");
            int employeeNumber = Integer.parseInt(scanner.nextLine());

            if (employeeNumber < 1000 || employeeNumber > 9999) {
                throw new EmployeeException(EmployeeMessages.ERROR_MESSAGES[0]);
            }

            System.out.print("Enter hourly pay rate ($9.00 - $25.00): ");
            double hourlyPayRate = Double.parseDouble(scanner.nextLine());

            if (hourlyPayRate < 9.00 || hourlyPayRate > 25.00) {
                throw new EmployeeException(EmployeeMessages.ERROR_MESSAGES[1]);
            }

            System.out.println("Valid employee data");
        } catch (NumberFormatException e) {
            System.out.println("Error: Employee number or hourly pay rate is not numeric.");
        } catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
