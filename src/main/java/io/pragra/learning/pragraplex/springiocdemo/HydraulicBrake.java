package io.pragra.learning.pragraplex.springiocdemo;

public class HydraulicBrake implements IBrake{
    public void brake() {
        System.out.println("Applying Hydraulic Brake");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void initialize(){
        System.out.println("Init method called for HydraulicBrake");
    }
}
