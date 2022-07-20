package aula7;

import java.util.Scanner;

public class executor{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Delta d1 = new Delta();
        System.out.println("Escreva valor de A: ");
        d1.setA(scan.nextDouble());
        System.out.println("Escreva valor de B: ");
        d1.setB(scan.nextDouble());
        System.out.println("Escreva valor de C: ");
        d1.setC(scan.nextDouble());
        double delta = d1.calculaDelta();
        if(delta <= 0){
            System.out.println("Delta Inválido");
        }else{
            Eqxn equa = new Eqxn(d1.getA(), d1.getB(), d1.getC());
            System.out.println("Valor de delta: "+delta);
            System.out.println("XP vale : "+equa.calculaXp(delta));
            System.out.println("XN vale : "+equa.calculaXn(delta));
        }
    }
}
