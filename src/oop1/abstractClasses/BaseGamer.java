package oop1.abstractClasses;

public abstract class BaseGamer {
    public abstract void calculate();

    public final void gameOver() {
        System.out.println("Game over!");
    }
}
