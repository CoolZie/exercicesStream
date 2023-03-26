import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.java.exercices.core.Voiture;

public class App {
    public static void main(String[] args) throws Exception {
        List<Voiture> voituresDisponibles = new ArrayList<>();
        Runnable getStarted = () -> {
            voituresDisponibles.add(new Voiture("Peugeot", "308", "rouge", 49.99, true, 6.2));
            voituresDisponibles.add(new Voiture("Renault", "Clio", "noir", 39.99, true, 5.9));
            voituresDisponibles.add(new Voiture("Volkswagen", "Golf", "blanc", 59.99, true, 5.8));
            voituresDisponibles.add(new Voiture("Fiat", "500", "rouge", 29.99, false, 6.8));
            voituresDisponibles.add(new Voiture("BMW", "X1", "gris", 89.99, true, 6.6));
        };
        getStarted.run();

        question1(voituresDisponibles);
        question2(voituresDisponibles);
        question3(voituresDisponibles, 0);
        question4(voituresDisponibles);
        question5(voituresDisponibles, 0);
        
        
        
    }
    public static void question1(List<Voiture> voituresDisponibles) {
        System.out.println("========= Q1 ========");
        voituresDisponibles.
        stream()
        .sorted(Comparator.comparing(Voiture::getMarque))
        .forEach(t->System.out.println(t.toString()));
    }
    public static void question2(List<Voiture> voituresDisponibles) {
        System.out.println("========= Q2 ========");
        voituresDisponibles.stream()
        .sorted(Comparator.comparing(Voiture::getPrixLocationJournalier)
        .reversed())
        .forEach(t->System.out.println(t.toString()));
    }
    public static void question3(List<Voiture> voituresDisponibles,double currentPrice) {
        System.out.println("========= Q3 ========");
        voituresDisponibles.stream()
        .filter(t->t.getPrixLocationJournalier() < currentPrice)
        .sorted(Comparator.comparing(Voiture::getPrixLocationJournalier))
        .forEach(t->System.out.println(t.toString()));
    }
    public static void question4(List<Voiture> voituresDisponibles) {
        System.out.println("========= Q4 ========");
        voituresDisponibles.stream()
        .filter(t->t.getAutomatique() == true)
        .forEach(t->System.out.println(t.toString()));
    }
    public static void question5(List<Voiture> voituresDisponibles,double seuil) {
        System.out.println("========= Q5 ========");
        voituresDisponibles.stream()
        .filter(t->t.getConsommationCarburant() < seuil)
        .forEach(t->System.out.println(t.toString()));
    }
   
    
}
