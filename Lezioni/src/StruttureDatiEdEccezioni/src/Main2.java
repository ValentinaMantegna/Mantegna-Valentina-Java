package StruttureDatiEdEccezioni.src;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // Creazione della lista di persone
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", "1990-01-15", "Johny"));
        people.add(new Person("Jane", "Smith", "1991-05-20", "Janey"));

        // Modifica del soprannome della prima persona
        if (!people.isEmpty()) {
            people.get(0).setNickname("NewNickname");
        }

        // Creazione della struttura dati per il Paese Italia
        Country italy = new Country("Italy");
        italy.addCity("Lombardy", "Milan");
        italy.addCity("Lazio", "Rome");
        italy.addCity("Veneto", "Venice");

        // Creazione delle materie e inserimento dei voti
        Subject math = new Subject("Math");
        math.addGrade(8);
        math.addGrade(7);
        math.addGrade(6);
        math.addGrade(4);

        Subject history = new Subject("History");
        history.addGrade(9);
        history.addGrade(5);
        history.addGrade(7);
        history.addGrade(3);

        // Calcolo della media dei voti per ogni materia
        System.out.println("Average grades:");
        System.out.println("Math: " + math.calculateAverage());
        System.out.println("History: " + history.calculateAverage());

        // Stampare le materie con voti insufficienti
        System.out.println("\nSubjects with insufficient grades:");
        if (math.calculateAverage() < 6.0) {
            System.out.println("Math");
        }
        if (history.calculateAverage() < 6.0) {
            System.out.println("History");
        }

        // Eliminare i duplicati dai voti
        List<Integer> grades = new ArrayList<>();
        grades.addAll(math.getGrades());
        grades.addAll(history.getGrades());
        grades.removeIf(grade -> grades.indexOf(grade) != grades.lastIndexOf(grade));

        System.out.println("\nUnique grades:");
        System.out.println(grades);
    }
}
