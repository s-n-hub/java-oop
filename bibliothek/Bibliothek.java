/**
 * Übung: Bibliotheks-Klasse
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * In dieser Übung wird eine Klasse Bibliothek mit einem Array von Buch-Objekten erstellt.
 * Mithilfe einer Methode können Bücher hinzugefügt werden. Eine weitere Methode gibt den
 * aktuellen Buchbestand formatiert aus.
 *
 * Lernziele:
 * - Arbeiten mit Klassen und Objekten in einem Paket
 * - Zusammenspiel mehrerer Klassen (Bibliothek ↔ Buch)
 * - Nutzung eines Arrays zur Verwaltung von Objekten
 * - Methoden für Hinzufügen und Ausgabe
 *
 * Eigene Erweiterungsideen:
 * - Fehlerbehandlung im Konstruktor (Anzahl <= 0)
 * - Methode zum Entfernen oder Suchen von Büchern
 * - statische Variablen für die Gesamtzahl der Bücher und freie Plätze
 * - Umstieg von Array auf ArrayList zur flexibleren Verwaltung
 * - Sortierung und Ausgabe nach Kriterien (Titel, Erscheinungsjahr, Autor:in)
 */

package bibliothek;

/**
 * Repräsentiert eine einfache Bibliothek mit fester Kapazität.
 */
public class Bibliothek {

    // Fester Speicher für Buch-Objekte (Kapazität der Bibliothek)
    private final Buch[] buecher;

    /**
     * Konstruktor erzeugt eine Bibliothek mit der angegebenen Kapazität.
     * @param anzahl Anzahl der verfügbaren Plätze (Kapazität)
     */
    public Bibliothek(int anzahl){
        this.buecher = new Buch[anzahl];
    }

    /**
     * Fügt ein Buch an der ersten freien Position ein.
     * @param bu Buch, das hinzugefügt werden soll (nicht null)
     * @return true, wenn erfolgreich; false, wenn voll oder bu == null
     */
    public boolean hinzufuegen(Buch bu){
        if (bu == null) {
            System.out.println("Kein Buch übergeben (null).");
            return false;
        }
        for (int i = 0; i < buecher.length; i++){
            if (buecher[i] == null){
                buecher[i] = bu;
                System.out.println("Buch hinzugefügt: " + bu.getAutor() + ", " + bu.getTitel());
                return true;
            }
        }
        System.out.println("Bibliothek ist voll. Buch kann nicht hinzugefügt werden.");
        return false;
    }


    /**
     * Gibt alle vorhandenen Bücher formatiert auf der Konsole aus.
     * Wenn keine Bücher vorhanden sind, wird ein Hinweis ausgegeben.
     */
    public void zeigeBuecher(){
        int buchAnzahl = 0;

        for (Buch b: buecher){
            if (b != null) {    // Überschrift nur ausgeben, wenn mind. 1 Buch vorhanden ist
                if (buchAnzahl == 0) {
                    System.out.println("AKTUELLER BUCHBESTAND:");
                }
                buchAnzahl ++;
                System.out.println(buchAnzahl + ". " + b.getAutor() + ": " + b.getTitel()
                        + " (" + b.getErscheinungsjahr() + ")");
            }
        }

        if (buchAnzahl == 0){
            System.out.println("Keine Bücher im Bestand.");
        }
    }

    /**
     * Hauptmethode: Erzeugt die Bibliothek und einige Bücher, fügt sie hinzu und zeigt den Bestand.
     */
    public static void main(String[] args) {
        Bibliothek privateBib = new Bibliothek(2);
        privateBib.zeigeBuecher();
        
        Buch buch1 = new Buch("All das zu verlieren", "Leila Slimani", 2003, "978-3-442-71969-3");
        Buch buch2 = new Buch("Die Freiheit einer Frau", "Edouard Louis", 2020, "978-3-10-000064-4");
        Buch buch3 = new Buch("Die Scham", "Annie Ernaux", 2009, "978-3-518-22517-2");

        privateBib.hinzufuegen(buch1);
        privateBib.hinzufuegen(buch2);
        privateBib.hinzufuegen(buch3);    //sollte 'voll' melden

        privateBib.zeigeBuecher();
    }
}


