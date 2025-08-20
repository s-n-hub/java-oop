# Java-Übungen zu Objektorientierter Programmierung.

In diesem Repository sammle ich Java-Übungen aus meiner Weiterbildung zur Softwareentwicklerin mit Fokus auf objektorientierte Programmierung (OOP).

Die Programme sind bewusst einfach gehalten. Sie illustrieren grundlegende OOP-Konzepte wie Klassen, Objekte, Vererbung, Polymorphie und Abstraktion. Sie dienen zum Einüben typischer Strukturen und enthalten teilweise Hinweise auf Erweiterungen oder alternative Umsetzungen. Sie spiegeln meinen Lernstand während des Einstiegs in die OOP mit Java wider.


## Inhalt

Im Folgenden entsteht eine Übersicht der Übungen, die ich nach und nach ergänze.


| Übung                                   | Thema                                          | Beschreibung                                                                            |
|-----------------------------------------|------------------------------------------------|-----------------------------------------------------------------------------------------|
| [Auto-Klasse](#auto-klasse)             | Klassen, Konstruktoren, Methoden               | Modellierung von Auto-Objekten und Methode zur Berechnung des Fahrzeugalters            |
| [Bibliotheks-Paket](#bibliotheks-paket) | Zusammenspiel mehrerer Klassen, Array          | Modellierung einer einfachen Bibliothek: Bücher hinzufügen und Bestand ausgeben         |
| [Fahrzeug-Paket](#fahrzeug-paket)       | Vererbung, abstrakte Klassen, Überschreiben    | Abstrakte Oberklasse `Fahrzeug` vererbt an Unterklasse `Elektroauto`, Demo der Methoden |
| [Tier-Paket](#tier-paket)               | Vererbung, abstrakte Klassen, Klassenvariablen | Abstrakte Oberklasse `Tier` vererbt an Unterklasse `Katze` und zählt alle Tier-Objekte  |
| ...                                     | ...                                            | ...                                                                                     |


## Struktur

- Einzelne `.java`-Dateien liegen direkt im Hauptverzeichnis
- Übungen mit mehreren zusammengehörigen Klassen befinden sich in Unterordnern

## Setup
Alle Programme können direkt in einer Java-IDE ausgeführt werden. SDK: Java 21.

---

---
## Auto-Klasse

**Thema:** Klassen, Konstruktoren, Methoden  
**Datei:** `Auto.java`

**Beschreibung:**  
Modelliert ein Auto mit den Attributen Marke, Modell, Baujahr und Kilometerstand. Mithilfe einer Methode wird das Alter des Autos basierend auf einem festen Bezugsjahr (2024) berechnet. In der `main()`-Methode werden zwei Autoobjekte erstellt und das Fahrzeug-Alter ausgegeben.

**Lernziele:**
- Definition und Initialisierung eigener Klassen mit Attributen
- Konstruktor mit mehreren Parametern
- Einfache Berechnung anhand von Attributwerten
- Verwendung einer nicht-statischen Methode und Ausgabe über `System.out.println`

**Erweiterungsideen:**
- Dynamische Altersberechnung mit `LocalDate.now().getYear()`
- Methode zur Bewertung des Kilometerstands
- Vergleichsmethode für zwei Autos (z.B. welches älter ist)
---
## Bibliotheks-Paket

**Thema:** Zusammenspiel mehrerer Klassen in einem Paket, Array-basierte Verwaltung  
**Dateien:** `bibliothek/Buch.java`, `bibliothek/Bibliothek.java`

**Beschreibung:**  
`Buch` modelliert ein Buch mit typischen Attributen wie Titel, Autor, Erscheinungsjahr und ISBN. Eine Methode gibt eine formatierte Buchbeschreibung aus.  
`Bibliothek` verwaltet ein Array von `Buch`-Objekten mit fester Kapazität. Bücher können an der ersten freien Position hinzugefügt werden; der aktuelle Bestand wird nummeriert ausgegeben. 

**Lernziele:**
- Definition eigener Klassen und Arbeiten mit Methoden
- Zusammenspiel zwischen Klassen in einem Paket
- Nutzung eines Arrays zur Verwaltung von Objekten



**Erweiterungsideen:**
- Validierung im Konstruktor (Anzahl > 0), robustere Fehlerbehandlung
- Methoden zum Suchen/Entfernen (z.B. per ISBN oder Autor:in)
- Duplikatprüfung (ISBN)
- Umstieg auf `ArrayList` für flexible Kapazität
- Sortierte Ausgabe (Titel, Jahr, Autor:in) oder Export (z. B. CSV)
---
## Fahrzeug-Paket

**Thema:** Vererbung & Abstraktion  
**Dateien:** `fahrzeug/Fahrzeug.java`, `fahrzeug/Elektroauto.java`, `fahrzeug/FahrzeugDemo.java`

**Beschreibung:**  
`Fahrzeug` definiert gemeinsame Attribute (`marke`, `modell`, `farbe`) und zwei abstrakte Methoden: `zeigeInformationen()` und `berechneReichweite()`.  
`Elektroauto` erbt von `Fahrzeug`, ergänzt `batteriekapazitaet` (kWh) und berechnet eine einfache Reichweite über eine Konstante (`KM_PRO_KWH`).  
`FahrzeugDemo` erstellt ein `Elektroauto`, gibt die Daten aus und zeigt die berechnete Reichweite.

**Lernziele:**
- Abstrakte Klassen und Methoden
- Vererbung und Konstruktorverkettung (`super`)
- Methodenüberschreibung (`@Override`)
- Einsatz einer Konstanten zur einfachen Berechnungslogik

**Erweiterungsideen:**
- Realistischere Formel (z. B. Verbrauch in kWh/100 km)
- Weitere Subtypen (Verbrenner, Hybrid)
- Konsistente Formatierung mit `String.format()` oder `toString()`
- Einfache Validierung (keine negativen Werte) und einheitliche Einheitenangaben
---
## Tier-Paket

**Thema:** Vererbung & Abstraktion 
**Dateien:** `tier/Tier.java`, `tier/Katze.java`

**Beschreibung:**
`Tier` definiert gemeinsame Attribute (`name`, `alter`) und zählt die Gesamtzahl aller erzeugten Tier-Instanzen über ein statisches Klassenmitglied (`anzahlTiere`). 
Es stellt eine abstrakte Methode `gibLaut()` bereit sowie Zugriffsmethoden (`getName()`, `getAlter()`, `setAlter(int)`) und die statische Methode `getAnzahlTiere()`.
`Katze` erbt von `Tier`, implementiert `gibLaut()` und enthält eine einfache main-Methode, die zwei Katzen erzeugt, deren Laute ausgibt und die Gesamtzahl der Tiere anzeigt.

**Lernziele:**
- abstrakte Klassen und Methoden
- Sichtbarkeit mit public, protected, private
- Vererbung und Konstruktorverkettung (super)
- Methodenüberschreibung (@Override)
- statische Klassenmitglieder und static-Methoden als globaler Zähler

**Erweiterungsideen:**
- einfache Validierung (kein negatives Alter, Name nicht leer)
- weitere Subtypen (Hund, Fisch, Maus)
- gemeinsame Hilfsmethode toString() zur formatierten Ausgabe
- Alter dynamisch über Geburtsdatum und aktuelles Datum
- separate Demo-Klasse statt main in Katze
- erste JUnit-Tests für gibLaut() und den Zähler
---