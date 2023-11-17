package oop1.abstractClasses;

public class Main {

    public static void main(String[] args) {

        FemaleGamer femaleGamer = new FemaleGamer();
        femaleGamer.calculate();
        femaleGamer.gameOver();

        BaseGamer baseGamer = new FemaleGamer();
//      BaseGamer baseGamer = new MaleGamer();
//      BaseGamer baseGamer = new ChildGamer();
    }
}
