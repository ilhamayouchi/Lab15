package lab15;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparateurCompose {
 public static void main(String[] args) {
     List<PersonneTri> personnes = Arrays.asList(
             new PersonneTri("Jean", "Dupont", 30),
             new PersonneTri("Marie", "Martin", 25),
             new PersonneTri("Pierre", "Dupont", 40),
             new PersonneTri("Sophie", "Martin", 35),
             new PersonneTri("Paul", "Dupont", 20)
     );

    
     Comparator<PersonneTri> comparateur = Comparator
             .comparing(PersonneTri::getNom)
             .thenComparing(PersonneTri::getPrenom)
             .thenComparingInt(PersonneTri::getAge);

     System.out.println("Liste triée:");
     personnes.stream()
             .sorted(comparateur)
             .forEach(System.out::println);

     Comparator<PersonneTri> comparateurVariante = Comparator
             .comparing(PersonneTri::getNom)
             .thenComparing(PersonneTri::getAge, Comparator.reverseOrder());

     System.out.println("\nListe triée (variante):");
     personnes.stream()
             .sorted(comparateurVariante)
             .forEach(System.out::println);
 }
}