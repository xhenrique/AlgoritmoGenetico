/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.genetico;
import java.util.Random;
import java.math.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author CISCO
 */
public class AlgGen {
    
public static void main (String args[]){
    System.out.println("rodando");
    double aptidaoIndividual[] = new double[4];
    double aptidaoTotal = 0;
    double r[] = new double[4];
    int x[] = new int[16];
    int i=0;
    Random random = new Random();
    int maxGen= 10000;
    //Preenchendo vetor com os valores;
    while(i<16){
        x[i]=i;
        i++;
    }
    i = 0;
    System.out.println(i);
    System.out.println(Arrays.toString(x));
    //Definindo a quantidade de individuos;
    int populacaoSel[] = new int[4];
    int populacaoSelApt[] = new int[4];
    double pai1=0;
    double pai2=0;
    do{
        i=0;
        //Selecionando aleatoriamente individuos que vão compor a população selecionada
        do{
            populacaoSel[i]=x[random.nextInt(16)];
            i++;
        }while(i<4);
        i=0;
        //Calculo aptidao Individual
        do{
           populacaoSelApt[i] = populacaoSel[i];
           populacaoSelApt[i]= (int)Math.pow(i,2)-12*i+40;
           i++;
        }while(i<4);
        //System.out.println(Arrays.toString(populacaoSelApt));
        i=0;
        aptidaoTotal = populacaoSelApt[0]+populacaoSelApt[1]+populacaoSelApt[2]+populacaoSelApt[3];
        //System.out.println(aptidaoTotal);
        //Calculo do percentual da Roleta
        do{
           r[i] = populacaoSelApt[i]/aptidaoTotal;
           i++;
            //System.out.println(Arrays.toString(r));
        }while(i<4);
        i=0;
        //selecao dos pais
        while(i!=4){
            double aux = random.nextDouble();
            double aux2 = random.nextDouble();
            if(r[i]>=aux) {
                pai1 = r[i];
            }
            if(r[i]>=aux2){
                pai2 = r[i];
            }
              
            i++;
        }
         System.out.println(pai1 + pai2);
        
        
        maxGen++;  
        
        
        
    }while(maxGen!=10000);

    

}    
    
}
