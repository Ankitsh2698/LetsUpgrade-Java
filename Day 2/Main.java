package com.Letsupgrade;

public class Main {

    public static void main(String[] args) {
        Employee e1 =  new Employee();
        Employee e2 =  new Employee();

        e1.name = "Omkar";
        e1.age = 21;
        e1.city = "Bhosari";

        e2.name = "Ankit Sharma";
        e2.age = 22;
        e2.city = "Pimple Gurav";


        e1.displayDetails();
        e2.displayDetails();
    }
}
