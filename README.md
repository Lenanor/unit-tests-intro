# unit-tests-intro

**Uppgift**

**Skriv en klass** Calculator **som kan utföra olika matematiska operationer på heltal.**
**Klassen ska ha metoder för addition, subtraktion, multiplikation, division, beräkning**
**av absolutvärde, kontroll om ett tal är jämnt, samt beräkning av maxvärde i en lista.**

**Krav:**

**1\. Addition ska returnera korrekt summa**

- add(2, 3) ska ge 5.

**2\. Subtraktion ska fungera med både positiva och negativa tal**

- subtract(10, 3) ska ge 7.

- subtract(3, 10) ska ge \-7.

**3\. Multiplikation ska hantera noll korrekt**

- multiply(0, 10) ska ge 0.

- multiply(5, 0) ska ge 0.

**4\. Division ska returnera korrekt resultat vid heltalsdivision**

- divide(10, 2) ska ge 5.

**5\. Division med noll ska kasta** ArithmeticException

- divide(10, 0) ska kasta fel.

- Fundera på hur man använder assertThrows(...) i JUnit för att verifiera att en metod kastar ett visst undantag. 
Testet ska anropa divide(10, 0) och förvänta sig en ArithmeticException.

**6\. Absolutvärde-metoden ska alltid returnera positivt tal**

- abs(-5) ska ge 5.

- abs(5) ska fortfarande ge 5.

**7\. Kontroll om tal är jämnt ska fungera**

- isEven(4) ska ge true.

- isEven(5) ska ge false.

**8\. Metoden för maxvärde i lista ska hitta rätt värde**

- För listan \[1, 5, 3\] ska resultatet bli 5.

**9\. Maxvärde-metoden ska kasta undantag för tom lista**

- Skicka in \[\] ska kasta IllegalArgumentException.

- Fundera på hur man använder assertThrows(...) i JUnit för att verifiera att en
metod kastar ett visst undantag.

**10\. Samtliga metoder ska vara deterministiska**

- Upprepade anrop med samma argument ska alltid ge samma resultat.

**11\. Addition ska hantera integer overflow**

- add(Integer.MAX\_VALUE, 1) ska kasta ett undantag eller hanteras på definierat
sätt.

**12\. Subtraktion ska hantera integer underflow**

- subtract(Integer.MIN\_VALUE, 1) ska detektera overflow eller hanteras
korrekt.

**13\. Multiplikation med negativa tal**

- multiply(-2, 5) → \-10

- multiply(-2, 2) → 4

**14\. Division med negativa tal**

- divide(-10, 2) → \-5

- divide(-10, \-2) → 5

**15\. Absolutvärde av Integer.MIN_VALUE**

- abs(Integer.MIN\_VALUE) är ett speciellt fall som inte får plats i en positiv int.

- Ska antingen kasta ett undantag eller returnera Integer.MAX\_VALUE beroende på
design.
