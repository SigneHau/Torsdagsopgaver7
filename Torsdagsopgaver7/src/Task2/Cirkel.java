package Task2;

import java.util.Scanner;

public class Cirkel {

   private  double radius;
    private double pi = 3.14;

    public Cirkel() {
        this.radius = 0.0;
    }
    //Exception - Hvis metoden modtager en negativ radius som parameter
    public void setRadius(double radius) throws Exception {

        if (radius < 0.0) {

            throw new Exception("Radius kan ikke være negativ");

        } else {
            this.radius = radius;
        }

    }

        public double getAreal() {
            double areal;
            areal = pi * radius * radius;

            return areal;
        }

}
