import java.util.Scanner;
import utils.CalcFunctions;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("This is a Salary Calculator App");
        System.out.println("Please enter your salary details to calculate your net salary.");
        System.out.println("This app will help you understand your deductions and net income.");
        System.out.println("This only works with new incometax regime and does not consider any tax exemptions or deductions.");
        System.out.println("Let's get started!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gross salary(CTC):");
        double grossSalary = scanner.nextDouble();
        System.out.println("Please enter your basic salary percentage (e.g., 50 for 50%):");
        double basicSalaryPercentage = scanner.nextDouble();
        System.out.println("Please confirm if employer pf contribution is included in the gross salary (true/false):");
        boolean isEmployerPfIncluded = scanner.nextBoolean();
        scanner.close();
        CalcFunctions calcFunctions = new CalcFunctions();
        CalcFunctions.printIncomeTaxSlabs();
        CalcFunctions.printCess();
        CalcFunctions.printStandardDeduction();
        CalcFunctions.printProfessionalTax();
        double ctc = calcFunctions.printCTC(grossSalary);
        double basicSalary = calcFunctions.printBasicSalary(grossSalary, basicSalaryPercentage);
        double employerPfContribution = calcFunctions.printEmployerPfContribution(basicSalary, isEmployerPfIncluded);
        double employeePfContribution = calcFunctions.printEmployeePfContribution(basicSalary);
        double totalDeductions = calcFunctions.printTotalDeductions(employerPfContribution);
        double taxableIncome = calcFunctions.printTaxableIncome(grossSalary, totalDeductions);
        double incomeTax = calcFunctions.printIncomeTax(taxableIncome);
        double cess = calcFunctions.printHealthAndEducationCess(incomeTax);
        calcFunctions.printNetSalary(grossSalary, totalDeductions, incomeTax, cess, employeePfContribution);
        calcFunctions.printNetSalaryMonthly(grossSalary, totalDeductions, incomeTax, cess, employeePfContribution);


    }
}
