# Salary Calculator App (India - New Tax Regime 2025-26)

A Java-based CLI application designed to help salaried employees in India calculate their **Net Take-Home Salary** based on the latest **New Tax Regime** slabs. The app provides a detailed breakdown of deductions, including EPF, Professional Tax, and Income Tax.

---

## 🚀 Features

* **Updated Tax Slabs:** Calculated according to the latest New Tax Regime (₹4L, ₹8L, ₹12L, ₹16L, ₹20L, ₹24L).
* **Detailed Deductions:** Automatic calculation of Standard Deduction (₹75,000), Professional Tax (₹3,600), and Health & Education Cess (4%).
* **Flexible PF Logic:** Supports both scenarios where Employer PF is included or excluded from the Gross CTC.
* **Clean Table UI:** Uses formatted ASCII tables for a professional and readable console output.
* **Annual & Monthly Breakdown:** Displays both total annual savings and your estimated monthly in-hand salary.

---

## 📊 New Regime Tax Slabs

| Income Range | Tax Rate |
| :--- | :--- |
| Up to ₹4 Lakhs | 0% |
| ₹4 Lakhs - ₹8 Lakhs | 5% |
| ₹8 Lakhs - ₹12 Lakhs | 10% |
| ₹12 Lakhs - ₹16 Lakhs | 15% |
| ₹16 Lakhs - ₹20 Lakhs | 20% |
| ₹20 Lakhs - ₹24 Lakhs | 25% |
| Above ₹24 Lakhs | 30% |

---

## 🛠️ Installation & Usage

### Prerequisites
* **JDK 11** or higher installed on your system.

### Steps to Run
1. **Navigate to the project directory:**
   cd path/to/your/project
2. Compile the files:
   javac utils/CalcFunctions.java App.java
3. Run the App:
   java App
## 📝 Calculation Logic
The app follows these steps to determine your net pay:

Gross CTC is adjusted by the Standard Deduction (₹75,000).

Employer PF is subtracted if included in the CTC.

Taxable Income is calculated.

Income Tax is calculated progressively across 7 different slabs.

Cess, Professional Tax, and Employee PF are deducted to arrive at the Net Salary.
## ⚠️ Disclaimer
This tool is for estimation purposes based on the standard New Tax Regime rules. It does not account for specific individual exemptions, surcharges for high-income earners (above ₹50L), or custom voluntary PF contributions.
