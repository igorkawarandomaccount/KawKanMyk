package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Interfejsik a = new Klasunia();
        System.out.println(a.getSalary());

        int[] tab = {4,7,-1,3,15};
        Arrays.sort(tab);
        for(int val : tab) {
            System.out.println(val);
            System.out.println("Kod czerwony uruchomiony. Leci rakieta.");
        }
    }
}
interface Interfejsik
{
    double number = 3.54;
    double getSalary();
}
class Klasunia implements Interfejsik
{
    double salary = 5200;

    @Override
    public double getSalary() {
        return salary+number;
    }
}
