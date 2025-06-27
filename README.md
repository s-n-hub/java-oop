# Java-Übungen zu Objektorientierter Programmierung.

In diesem Repository sammle ich Java-Übungen aus meiner Weiterbildung zur Softwareentwicklerin mit Fokus auf objektorientierte Programmierung (OOP).

Die Programme sind bewusst einfach gehalten. Sie illustrieren grundlegende OOP-Konzepte wie Klassen, Objekte, Vererbung, Polymorphie und Abstraktion. Sie dienen zum Einüben typischer Strukturen und enthalten teilweise Hinweise auf Erweiterungen oder alternative Umsetzungen. Sie spiegeln meinen Lernstand während des Einstiegs in die OOP mit Java wider.


## Inhalt

Im Folgenden entsteht eine Übersicht der Übungen, die ich nach und nach ergänze.


| Übung                       | Thema                            | Beschreibung                                                                  |
|-----------------------------|----------------------------------|-------------------------------------------------------------------------------|
| [Buch-Klasse](#buch-klasse) | Klassen, Konstruktoren, Methoden | Modellierung von Buch-Objekten und Methode zur Ausgabe einer Buchbeschreibung |
| ...                         | ...                              | ...                                                                           |


## Struktur

- Einzelne `.java`-Dateien liegen direkt im Hauptverzeichnis
- Übungen mit mehreren zusammengehörigen Klassen befinden sich in Unterordnern

## Setup
Alle Programme können direkt in einer Java-IDE ausgeführt werden. SDK: Java 21.

---

---
## Buch-Klasse

**Thema:** Klassen, Konstruktoren, Methoden  
**Datei:** `Buch.java`

**Beschreibung:**  
Modelliert ein Buch mit typischen Attributen wie Titel, Autor, Erscheinungsjahr und ISBN. Die Methode `beschreibungAnzeigen()` liefert eine formatierte Beschreibung des Buchs. In der `main()`-Methode werden zwei Buchobjekte erstellt und ausgegeben.

**Lernziele:**
- Definition eigener Klassen und Attribute
- Konstruktor mit Parametern
- Objektorientiertes Arbeiten mit Methoden
- String-Verkettung und Konsolenausgabe

**Erweiterungsideen:**
- Getter/Setter erstellen
- Vergleich von Büchern (z.B. nach Erscheinungsjahr)
- Speicherung mehrerer Bücher in einem Array oder einer Liste
---
...