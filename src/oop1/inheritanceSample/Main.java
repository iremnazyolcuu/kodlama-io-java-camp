package oop1.inheritanceSample;

public class Main {

    public static void main(String[] args) {

        StudentLoanManager studentLoanManager = new StudentLoanManager();
        studentLoanManager.calculateBaseLoan();

        LoanUI loanUI = new LoanUI();
        loanUI.calculateLoanUI(new StudentLoanManager());
        loanUI.calculateLoanUI(new BusinessLoanManager());
        loanUI.calculateLoanUI(new HomeLoanManager());

    }
}
