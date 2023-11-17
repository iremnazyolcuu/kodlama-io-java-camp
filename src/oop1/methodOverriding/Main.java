package oop1.methodOverriding;

public class Main {

    public static void main(String[] args) {

//        TeachersCreditManager teachersCreditManager = new TeachersCreditManager();
//        System.out.println(teachersCreditManager.calculate(1000));

        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{new TeachersCreditManager(), new AgriculturalCreditManager(), new StudentsCreditManager()};

        for (BaseCreditManager baseCreditManager : baseCreditManagers) {
            System.out.println(baseCreditManager.calculate(1000));
        }
    }
}
