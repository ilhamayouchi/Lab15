package lab15;

interface Calculateur {
 int calculer(int a, int b);
}

public class LambdaIntro {
 public static void main(String[] args) {
     System.out.println("Bienvenue dans le TP sur les expressions lambda!");

     Calculateur addition = new Calculateur() {
         @Override
         public int calculer(int a, int b) {
             return a + b;
         }
     };

     Calculateur additionLambda = (a, b) -> a + b;

     System.out.println("Addition traditionnelle: " + addition.calculer(5, 3));
     System.out.println("Addition avec lambda: " + additionLambda.calculer(5, 3));
 }
}