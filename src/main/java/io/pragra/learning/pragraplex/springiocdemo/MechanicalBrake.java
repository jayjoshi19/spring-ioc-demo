package io.pragra.learning.pragraplex.springiocdemo;

public class MechanicalBrake implements IBrake {
    public void brake() {
        System.out.println("Applying Mechanical Brake");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
