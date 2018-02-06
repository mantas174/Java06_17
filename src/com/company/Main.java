package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String sakinys;

        Main obj = new Main();

        System.out.println("Iveskite sakinys ar zodi kuri tikrinskim");
        sakinys = in.nextLine();

        if(obj.arPolindromas(sakinys)){
            System.out.print("Ivestas sakinys ar zodis yra polindromas");
        }else {
            System.out.print("Ivestas sakinys ar zodis nera polindromas");
        }

    }
    public boolean arPolindromas(String z){
        boolean arPolindromas = true;
        char pradzia, galas;

        String [] beTarpu = z.split(" ");
        z = sakinysBeTarpu(beTarpu);

        for (int i = 0; i < (z.length() / 2); i++){
            pradzia = z.charAt(i);
            galas = z.charAt(z.length() - 1 - i);
            if(pradzia != galas){
                arPolindromas = false;
            }
        }
        return arPolindromas;
    }
    public String sakinysBeTarpu(String [] beTarpu){
        String eilute = "";

        for (int i = 0; i < beTarpu.length; i++){
            eilute += beTarpu[i];
        }
        return eilute;
    }
}
