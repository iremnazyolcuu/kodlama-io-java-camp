package oop1.inheritanceDemo;

public class Main {

    public static void main(String[] args) {

        TeachersCreditManager teachersCreditManager = new TeachersCreditManager();
        teachersCreditManager.calculate();

        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(new TeachersCreditManager());
        creditUI.calculateCredit(new AgriculturalCreditManager());
    }
}
