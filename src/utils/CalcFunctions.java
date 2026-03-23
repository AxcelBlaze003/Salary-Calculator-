package utils;

public class CalcFunctions {
    
    // Formatting constants to ensure the table looks the same in every method
    private static final String TABLE_LINE = "+------------------------------------------+------------------------+";
    private static final String TABLE_FORMAT = "| %-40s | Rs %18.2f |\n";

    public static void printIncomeTaxSlabs() {
        System.out.println(TABLE_LINE);
        System.out.println("| Income Tax Slabs for New Regime                                   |");
        System.out.println(TABLE_LINE);
        System.out.println("| Up to Rs4 lakhs                          | 0%                     |");
        System.out.println("| Rs4 lakhs to Rs8 lakhs                   | 5%                     |");
        System.out.println("| Rs8 lakhs to Rs12 lakhs                  | 10%                    |");
        System.out.println("| Rs12 lakhs to Rs16 lakhs                 | 15%                    |");
        System.out.println("| Rs16 lakhs to Rs20 lakhs                 | 20%                    |");
        System.out.println("| 20 lakhs to Rs24 lakhs                   | 25%                    |");
        System.out.println("| Above Rs24 lakhs                         | 30%                    |");
        System.out.println(TABLE_LINE);
    }

    public static void printCess() {
        System.out.printf("| %-40s | %-22s |\n", "Health and Education Cess", "4% on income tax");
    }

    public static void printStandardDeduction() {
        System.out.printf(TABLE_FORMAT, "Standard Deduction", 75000.00);
    }

    public static void printProfessionalTax() {
        System.out.printf(TABLE_FORMAT, "Professional Tax (Annual)", 3600.00);
    }

    public double printCTC(double grossSalary){
        System.out.printf(TABLE_FORMAT, "Gross Salary (CTC)", grossSalary);
        return grossSalary;
    }

    public double printBasicSalary(double grossSalary, double basicSalaryPercentage) {
        double basicSalary = (grossSalary * basicSalaryPercentage) / 100;
        System.out.printf(TABLE_FORMAT, "Basic Salary", basicSalary);
        return basicSalary;
    }

    public double printEmployerPfContribution(double basicSalary, boolean isEmployerPfIncluded) {
        double employerPfContribution = 0;
        if (isEmployerPfIncluded) {
            employerPfContribution = (basicSalary * 12) / 100;
            System.out.printf(TABLE_FORMAT, "Employer PF Contribution", employerPfContribution);
        } else {
            System.out.println("| Employer PF Contribution                 | Not Included in Gross  |");
        }
        return employerPfContribution;
    }

    public double printEmployeePfContribution(double basicSalary) {
        double employeePfContribution = (basicSalary * 12) / 100;
        System.out.printf(TABLE_FORMAT, "Employee PF Contribution", employeePfContribution);
        return employeePfContribution;
    }

    public double printTotalDeductions(double employerPfContribution) {
        double totalDeductions = employerPfContribution + 75000;
        System.out.printf(TABLE_FORMAT, "Total Deductions", totalDeductions);
        return totalDeductions;
    }

    public double printTaxableIncome(double grossSalary, double totalDeductions) {
        double taxableIncome = grossSalary - totalDeductions;
        System.out.printf(TABLE_FORMAT, "Taxable Income", taxableIncome);
        return taxableIncome;
    }

    public double printIncomeTax(double taxableIncome) {
        double incomeTax = 0;
        if (taxableIncome <= 400000) {
            incomeTax = 0;
            System.out.printf(TABLE_FORMAT, "Income Tax", incomeTax);
            return incomeTax;
        } else if (taxableIncome > 400000){
            // Logic starts here - kept exactly as you provided
            if (taxableIncome > 400000) {
                if (taxableIncome > 400000){
                    incomeTax = incomeTax + (400000 * 0.0);
                    taxableIncome = taxableIncome - 400000;
                } else {
                    incomeTax = incomeTax + (taxableIncome * 0.0);
                    taxableIncome = 0;
                }
            }
            if (taxableIncome > 0){
                if (taxableIncome > 400000) {
                    incomeTax = incomeTax + (400000 * 0.05);
                    taxableIncome = taxableIncome - 400000;
                } else {
                    incomeTax = incomeTax + (taxableIncome * 0.05);
                    taxableIncome = 0;
                }
            }
            if (taxableIncome > 0){
                if (taxableIncome > 400000) {
                    incomeTax = incomeTax + (400000 * 0.1);
                    taxableIncome = taxableIncome - 400000;
                } else {
                    incomeTax = incomeTax + (taxableIncome * 0.1);
                    taxableIncome = 0;
                }
            }
            if (taxableIncome > 0){
                if (taxableIncome > 400000) {
                    incomeTax = incomeTax + (400000 * 0.15);
                    taxableIncome = taxableIncome - 400000;
                } else {
                    incomeTax = incomeTax + (taxableIncome * 0.15);
                    taxableIncome = 0;
                }
            }
            if (taxableIncome > 0){
                if (taxableIncome > 400000) {
                    incomeTax = incomeTax + (400000 * 0.2);
                    taxableIncome = taxableIncome - 400000;
                } else {
                    incomeTax = incomeTax + (taxableIncome * 0.2);
                    taxableIncome = 0;
                }
            }
            if (taxableIncome > 0){
                if (taxableIncome > 400000) {
                    incomeTax = incomeTax + (400000 * 0.25);
                    taxableIncome = taxableIncome - 400000;
                } else {
                    incomeTax = incomeTax + (taxableIncome * 0.25);
                    taxableIncome = 0;
                }
            }
            if (taxableIncome > 0){
                incomeTax = incomeTax + (taxableIncome * 0.3);
            }                       
        }
        System.out.printf(TABLE_FORMAT, "Total Income Tax", incomeTax);
        return incomeTax;
    }

    public double printHealthAndEducationCess(double incomeTax) {
        double cess = incomeTax * 0.04;
        System.out.printf(TABLE_FORMAT, "Health and Education Cess", cess);
        return cess;
    }

    public void printNetSalary(double grossSalary, double totalDeductions, double incomeTax, double cess, double employeePfContribution) {
        double netSalary = grossSalary - totalDeductions + 75000 - incomeTax - cess - 3600 - employeePfContribution;
        System.out.println(TABLE_LINE);
        System.out.printf(TABLE_FORMAT, "Net Salary Annually", netSalary);
        System.out.println(TABLE_LINE);
    }

    public void printNetSalaryMonthly(double grossSalary, double totalDeductions, double incomeTax, double cess, double employeePfContribution) {
        double netSalary = grossSalary - totalDeductions + 75000 - incomeTax - cess - 3600 - employeePfContribution;
        System.out.printf(TABLE_FORMAT, "Net Salary Monthly", (netSalary / 12));
        System.out.println(TABLE_LINE);
    }    
}