import java.util.Scanner;
public class LoanSystemSimple {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Borrower Name: ");
String name = sc.nextLine();
System.out.print("Enter Loan Amount: ");
double amount = sc.nextDouble();
System.out.print("Enter Interest Rate (%): ");
double rate = sc.nextDouble();
System.out.print("Enter Duration (months): ");
int months = sc.nextInt();
// Calculate total repayment
double interest = amount * rate / 100 * months / 12;
double total = amount + interest;
System.out.println("\nBorrower: " + name);
System.out.println("Total Repayment: " + total);
sc.close();
}
}
