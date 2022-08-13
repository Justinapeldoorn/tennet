<h1>Tennet application</h1>

****

**Prerequisites**

- Je hebt een java 17 jdk nodig. 
- Mongodb moet lokaal als een service draaien (zie application.properties voor db configuratie)

**How to: opstarten**

- Gebruik de meegeleverde maven wrapper en start de springboot applactie vanuit de IDE of via de commandline `./mvnw spring-boot:run`

**Gekozen technieken**

Ter illustratie/discussie heb ik iets meer gedaan dan de opdracht vroeg.
Ik heb gekozen voor een oplossing met springboot + mongodb (vond ik leuk, want heb ik de afgelopen tijd weinig mee gedaan).
Als bonus heb ik de volgende tools ook toegevoegd:
- openapi, ik heb de api in deze documentatie toegevoegd en laat daar Java objecten bij genereren voor de controller/DTO's
Ook zorgt dit voor validatie van inkomende berichten. 
- Spotless, dit is een tool die ervoor zorgt dat de syntax van een project gehandhaafd blijft tijdens een build. 
Bijvoorbeeld, een used import zal ervoor zorgen dat de `mvnw install` faalt.
- Mapstruct, dit is een tool die Java mappers (dto naar entity en visa versa) genereerd.
- AsserJ, springboot komt standaard met J-unit 5, maar ik gebruik zelf graag AssertJ als fluent assertions library.

**Nog ontbrekende features**

- Ik heb nu overal doubles gebruikt om de outputPower vast te leggen, maar hier is mogelijk precision loss.
Is misschien belangrijk in het geval van tennet. 
- Ter illustratie heb ik alleen even een simpele unittest toegevoegd, maar als dit een volwasse applicatie was zou
ik ook nog iets van RestAssured testen toevoegen. 
- Afhankelijk van een gekozen database oplossing wil je ook nog iets van een liquibase toevoegen voor database updates.
- Ik heb echt een super simpel database concept neergezet met mongodb. Gezien de vraag in de opdracht leent een 
relationele database zich hier echter beter voor. Ik heb nog weinig tot niks met indexen/constraints o.i.d. gedaan. 

**discussie punten**
- keuze mongodb en huidige documents structuur.


