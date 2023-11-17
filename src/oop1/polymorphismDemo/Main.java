package oop1.polymorphismDemo;

public class Main {

    public static void main(String[] args) {
//        EmailLogger emailLogger = new EmailLogger();
//        emailLogger.log(" Log details");
//
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
//        for (BaseLogger logger : loggers) {
//            logger.log(" Log message");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
