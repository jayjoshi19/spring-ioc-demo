package io.pragra.learning.pragraplex.springiocdemo;

public class HydraulicBrake implements IBrake{
    public void brake() {
        System.out.println("Applying Hydraulic Brake");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
