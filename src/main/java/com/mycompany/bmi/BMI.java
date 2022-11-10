/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bmi;

import java.util.Scanner;


public class BMI {

    
    public static void main(String[] args) {
        int berat;
        int tinggi;
        double bmi;
        
       Scanner inputan = new Scanner(System.in);
            System.out.println("Berapakah tinggi badanmu ?");
            System.out.println("masukan dalam satuan CM");
                tinggi=inputan.nextInt();
            System.out.println("Berapakah berat badanmu  ?");
                berat=inputan.nextInt();
                 tinggi/=100; 
        bmi=berat / (tinggi*tinggi);
            System.out.println("hasil Bmi anda:" + bmi);
        
        if(bmi<16){
            System.out.println("kamu kurus");
        }
        else if (bmi<30){
            System.out.println("kamu normal");
        }
        else if (bmi>30){
            System.out.println("kamu gemuk");
        }
       
    }
    
}
