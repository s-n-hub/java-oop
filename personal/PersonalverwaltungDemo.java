package personal;

/**
 * Übung: Personalverwaltung (Demo)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Hauptklasse mit main-Methode zur Demonstration der Mitarbeiterverwaltung mit einer
 * Methode zur Berechnung der Gesamtkosten für das Personal.
 * Erstellt mehrere Objekte, fügt sie in eine Liste, gibt Informationen aus und
 * zeigt die Gesamtkosten sowie die Aufgabenbeschreibungen.
 *
 * Lernziele:
 * - Polymorphie im Einsatz (getGesamtkosten ohne Casting)
 * - Nutzung von Listen (ArrayList)
 * - Iteration mit for-each und Typprüfung mit instanceof
 *
 * Eigene Erweiterungsideen:
 * - Ausgabe mit NumberFormat für saubere Währungsdarstellung
 * - Einlesen von Mitarbeiterdaten aus Datei oder Konsole
 */


import java.util.ArrayList;
import java.util.List;

public class PersonalverwaltungDemo {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Pauline", "Müller", "Finanzen", 100000, 5000);
        Manager manager2 = new Manager("Sabine", "Schmidt", "Entwicklung", 80000, 3000);
        Entwickler entwickler1 = new Entwickler("Sandra", "Billau", "Software", 60000);
        Entwickler entwickler2 = new Entwickler("Timo", "Grünblatt", "Software", 60000);

        //Personalliste
        List<Mitarbeiter> personal = new ArrayList<>();
        personal.add(manager1);
        personal.add(manager2);
        personal.add(entwickler1);
        personal.add(entwickler2);

        // Ausgabe der Mitarbeiter-Infos
        System.out.println("UNSERE MITARBEITER:");
        for (Mitarbeiter m : personal){
            String beschreibung = m.getVorname() + " " + m.getNachname()
                    + ", Abteilung " + m.getAbteilung()
                    + ", Jahresgehalt: " + m.getJahresgehalt() +  " Euro";
            System.out.println(beschreibung);
            
            // falls Manager: Zugriff auf den Bonus über Typecasting
            if (m instanceof Manager man){
                System.out.println("   Manager-Bonus: " + man.getBonus() + " Euro");
            }
        }

        // Test der berechneGesamtkosten-Funktion und der beschreibePosition-Funktion
        System.out.println("\nGesamtkosten für das Personal: " + berechneGesamtkosten(personal) + " Euro");
        System.out.println("Aufgabenbeschreibung der Manager: " + manager1.beschreibePosition());
        System.out.println("Aufgabenbeschreibung der Entwickler: " + entwickler1.beschreibePosition());
    }


    /**
     * Berechnet die Summe der jährlichen Gesamtkosten aller Mitarbeitenden in der Liste.
     * @param personalliste Liste mit Mitarbeitenden
     * @return Summe aller Gesamtkosten pro Jahr
     */
    public static double berechneGesamtkosten(List<Mitarbeiter> personalliste){
        double summe = 0;
        for (Mitarbeiter m : personalliste){
            summe += m.getGesamtkosten();
        }
        return summe;
    }
}
