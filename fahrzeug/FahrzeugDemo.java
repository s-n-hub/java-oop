package fahrzeug;

/**
 * Übung: Fahrzeug-Package (Demo)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Startklasse mit main-Methode: erzeugt ein Elektroauto, gibt Informationen aus
 * und zeigt die berechnete Reichweite.
 *
 * Lernziele:
 * - main-Methode und Programmstart
 * - Objekterzeugung und Aufruf überschreibender Methoden
 * - Einfache Ausgabe mit System.out.println
 *
 * Eigene Erweiterungsideen:
 * - Mehrere Fahrzeuginstanzen (Liste/Array) und Ausgabe per Schleife
 * - Formatierter Output (String.format)
 */

/**
 * Startklasse der Übung mit einem kurzen Konsolenbeispiel.
 */
public class FahrzeugDemo {
    public static void main(String[] args) {
        Elektroauto eAuto = new Elektroauto("Tesla", "Model S", "schwarz", 100);
        System.out.println(eAuto.zeigeInformationen());
        System.out.println("Reichweite: " + eAuto.berechneReichweite() + " km");
    }
}
