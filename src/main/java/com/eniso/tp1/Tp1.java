/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;
import static java.lang.Math.log;
import java.util.Scanner ;


/**
 *
 * @author LENOVO
 */
public class Tp1 {
       public static double [] CalculateProbability(int[][] image ) {
        double [] tp =new double[256];
        for(int i=0;i<256;i++){
            double p;
            p=0;
            for (int j=0;j<image.length;j++) {
                for(int k=0;k<image[0].length;k++){
                    if (image [j][k]==i){
                        p++;
                    }
                    
                }
            }
            p=(p/((image.length)*(image[0].length)));
            System.out.println("le probabilté de"+i+"est"+p);
            tp[i]=p;
        }
        return tp;
        
    }
          public static double  CalculateEntropy(int[][] image ){
        double sum ;
        sum=0;
         for(int i=0;i<256;i++){
            double p;
            p=0;
            for (int j=0;j<image.length;j++) {
                for(int k=0;k<image[0].length;k++){
                    if (image [j][k]==i){
                        p++;
                    }
                    
                }
            }
             p=(p/((image.length)*(image[0].length)));
             if (p>0){
           sum+=-(p*log(p));
        }
         }
        System.out.println("Entropie de l'image = "+sum);
        return sum ;
    }
    public static double  CalculateEntropy2 (int[][] image ){
        double sum = 0;
        double [] prob= CalculateProbability(image);
        for(int i=0;i<256;i++){
             if (prob[i] > 0) {
            sum += -(prob[i] * log(prob[i]));
        }
        }
        
        System.out.println("Entropie de l'image = "+sum);
         return sum;
       
        
    }



    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        System.out.println("Bonjour,mon premier TP en POO");
        //lecture du nom 
         System.out.println("Quelle est votre nom");
         Scanner read = new Scanner (System.in);
         String name = read.next();
         //lecture du nom
         System.out.println("");
         System.out.println("Bonjour "+name);
         System.out.println("Quel est votre age "+name+" ?");
         int a;
         a=read.nextInt();
         System.out.println(name+" votre age est "+a);
         int [][] img = {{1,2,3,4},{5,6,7,8},{10,10,10,13}};
    
         double [] kol = CalculateProbability(img);
         double so =CalculateEntropy(img);
         double so2 =CalculateEntropy2(img);
         
         
        
    }
 
      
}
