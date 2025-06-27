/**
 * Übung: Buch-Klasse
 * Erstellt: November 2024
 * Bearbeitet: Juni 2025
 *
 * Beschreibung:
 * In dieser Übung wird eine Klasse Buch mit Attributen wie Titel, Autor,
 * Erscheinungsjahr und ISBN erstellt. Mithilfe einer Methode wird eine formatierte
 * Buchbeschreibung generiert und ausgegeben.
 *
 * Lernziele:
 * - Definition und Verwendung eigener Klassen
 * - Konstruktor mit Parametern
 * - Objektorientiertes Arbeiten mit Attributen und Methoden
 * - Einfache String-Verkettung und Konsolenausgabe
 *
 * Eigene Erweiterungsideen:
 * - Getter/Setter erstellen
 * - Methoden zum Vergleich zweier Bücher, etwa nach Erscheinungsjahr oder Autor:in
 * - Sammlung von Buchobjekten (Array oder ArrayList)
 */


public class Buch {

    private String titel;
    private String autor;
    private int erscheinungsjahr;
    private String isbn;

    /**
     * Konstruktor zur Initialisierung aller Buchattribute.
     * @param titel Titel des Buchs
     * @param autor Autor oder Autorin des Buchs
     * @param erscheinungsjahr Erscheinungsjahr
     * @param isbn ISBN-Nummer
     */
    public Buch(String titel, String autor, int erscheinungsjahr, String isbn){
        this.titel = titel;
        this.autor = autor;
        this.erscheinungsjahr = erscheinungsjahr;
        this.isbn = isbn;
    }

    /**
     * Gibt eine formatierte Beschreibung des Buchs zurück.
     * @return Text mit Titel, Autor, Erscheinungsjahr und ISBN
     */
    public String beschreibungAnzeigen(){
        return "Das Buch " + titel + " von " + autor + " ist im Jahr "
            + erscheinungsjahr + " unter der ISBN " + isbn + " erschienen.";
    }

    /**
     * Hauptmethode: Erstellt zwei Buchobjekte und gibt deren Beschreibungen aus.
     */
    public static void main(String[] args){
        Buch b1 = new Buch("Radio Sarajevo", "Tijan Sila", 2023, "978-3-446-27726-7");
        Buch b2 = new Buch("Im Herzen der Gewalt", "Eduard Louis", 2019, "978-3-596-29735-1");

        System.out.println(b1.beschreibungAnzeigen());
        System.out.println(b2.beschreibungAnzeigen());
    }
}
