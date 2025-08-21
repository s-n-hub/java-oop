package personal;

/**
 * Übung: Personalverwaltung (Subklasse Manager)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Subklasse von Mitarbeiter mit zusätzlichem Attribut Bonus.
 * Überschreibt die Positionsbeschreibung und die Gesamtkostenberechnung.
 *
 * Lernziele:
 * - Konstruktorverkettung mit super
 * - Methodenüberschreibung (@Override)
 * - Polymorphie (Kostenberechnung inkl. Bonus)
 *
 * Eigene Erweiterungsideen:
 * - Validierung des Bonus (nicht negativ)
 */

public class Manager extends Mitarbeiter {
    private double bonus;

    /**
     * Erzeugt einen Manager.
     * @param vorname Vorname
     * @param nachname Nachname
     * @param abteilung Abteilung
     * @param jahresgehalt Jahresgehalt
     * @param bonus Bonus pro Jahr
     */
    public Manager(String vorname, String nachname, String abteilung, double jahresgehalt, double bonus){
        super(vorname, nachname, abteilung, jahresgehalt);
        this.bonus = bonus;
    }

    /**
     * Liefert den aktuellen Bonus des Managers.
     * @return Bonus in Euro
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Erhöht den Bonus um den angegebenen Betrag.
     * @param betrag Positiver Betrag, um den der Bonus erhöht werden soll
     */
    public void erhoeheBonus(double betrag){
        bonus += betrag;
    }

    /**
     * Gibt die Aufgabenbeschreibung für die Position Manager zurück.
     * @return Beschreibung der typischen Management-Aufgaben
     */
    @Override
    public String beschreibePosition(){
        return "Leitung von Teams, Umsetzung strategischer Ziele";
    }

    /**
     * Berechnet die Gesamtkosten für diesen Manager (Jahresgehalt + Bonus).
     * @return Gesamtkosten für diesen Manager pro Jahr
     */
    @Override public double getGesamtkosten() {
        return getJahresgehalt() + bonus;
    }
}
