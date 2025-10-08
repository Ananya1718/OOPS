package exercis5;
import java.util.Scanner;
//Base class
class CashTree {
String atmName;
String codeNo;
String location;
CashTree(String atmName, String codeNo, String location) {
this.atmName = atmName;
this.codeNo = codeNo;
this.location = location;
}
void viewBalance() {
System.out.println("Balance info not available in base class.");
}
void withdraw(double amount) {
System.out.println("Withdraw not implemented in base class.");
}
void deposit(double amount) {
System.out.println("Deposit not implemented in base class.");
}
}
// SBI Bank subclass
class SBI_Bank extends CashTree {
String custName;
int accNo;
double balance;
final double serviceCharge = 5;
final double interestRate = 0.06;
SBI_Bank(String atmName, String codeNo, String location,
String custName, int accNo, double balance) {
super(atmName, codeNo, location);
this.custName = custName;
this.accNo = accNo;
this.balance = balance;
}
@Override
void viewBalance() {
System.out.println("Customer: " + custName + " | Balance: " + balance);
}
@Override
void withdraw(double amount) {
if (amount + serviceCharge <= balance) {
balance -= (amount + serviceCharge);
System.out.println("Withdrawn: " + amount + " | Service Charge: " + serviceCharge);
} else {
System.out.println("Insufficient balance.");
}
}
@Override
void deposit(double amount) {
double interest = amount * interestRate;
balance += (amount + interest);
System.out.println("Deposited: " + amount + " | Interest: " + interest);
}
}
// HDFC Bank subclass
class HDFC_Bank extends CashTree {
String custName;
int accNo;
double balance;
final double serviceCharge = 10;
final double interestRate = 0.05;
HDFC_Bank(String atmName, String codeNo, String location,
String custName, int accNo, double balance) {
super(atmName, codeNo, location);
this.custName = custName;
this.accNo = accNo;
this.balance = balance;
}
@Override
void viewBalance() {
System.out.println("Customer: " + custName + " | Balance: " + balance);
}
@Override
void withdraw(double amount) {
if (amount + serviceCharge <= balance) {
balance -= (amount + serviceCharge);
System.out.println("Withdrawn: " + amount + " | Service Charge: " + serviceCharge);
} else {
System.out.println("Insufficient balance.");
}
}
@Override
void deposit(double amount) {
double interest = amount * interestRate;
balance += (amount + interest);
System.out.println("Deposited: " + amount + " | Interest: " + interest);
}
}
// Main app
public class BankATMApp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Choose Bank: 1. SBI 2. HDFC");
int choice = sc.nextInt();
sc.nextLine();
System.out.print("Enter Customer Name: ");
String name = sc.nextLine();
System.out.print("Enter Account Number: ");
int accNo = sc.nextInt();
System.out.print("Enter Initial Balance: ");
double balance = sc.nextDouble();
CashTree atm;
if (choice == 1) {
atm = new SBI_Bank("SBI ATM", "SBI001", "City Center", name, accNo, balance);
} else {
atm = new HDFC_Bank("HDFC ATM", "HDFC001", "City Center", name, accNo, balance);
}
int option;
do {
System.out.println("\n--- ATM Menu ---");
System.out.println("1. View Balance");
System.out.println("2. Withdraw");
System.out.println("3. Deposit");
System.out.println("4. Exit");
option = sc.nextInt();
switch (option) {
case 1:
atm.viewBalance();
break;
case 2:
System.out.print("Enter amount to withdraw: ");
double wAmt = sc.nextDouble();
atm.withdraw(wAmt);
break;
case 3:
	System.out.print("Enter amount to deposit: ");
	double dAmt = sc.nextDouble();
	atm.deposit(dAmt);
	break;
	case 4:
	System.out.println("Exiting... Thank you!");
	break;
	default:
	System.out.println("Invalid choice!");
	}
	} while (option != 4);
	sc.close();
	}
	}