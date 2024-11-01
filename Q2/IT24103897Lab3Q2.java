import java.util.Scanner;
public class IT24103897Lab3Q2
{
public static void main(String[]args)
{
double otAmount,otHours,otHourlyrate,monthlySalary,totalSalary;
Scanner input = new Scanner(System.in);

System.out.println("Enter the monthly salary :");
monthlySalary = input.nextDouble();

System.out.println("Enter the number of OT hours :");
otHours = input.nextDouble();

System.out.println("Enter the OT hourly rate :");
otHourlyrate = input.nextDouble();

otAmount = otHours*otHourlyrate;
totalSalary = monthlySalary+otAmount;

System.out.printf("Total salary including OT is :%.2f\n",totalSalary);
}
}