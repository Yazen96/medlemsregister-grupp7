## Gruppmedlemmar och arbetsfördelning

- Victoria: Medlem.java
- Julio: Register.java
- Yazan: Main.java och menyn


## Att göra

- [ ] Skapa klassen Medlem med namn och medlemsnummer. – Victoria
- [ ] Skapa ett register som kan lägga till, visa och söka medlemmar. – Julio
- [Y] Skapa en meny som körs tills användaren väljer att avsluta. – Yazan
- [ ] Koppla ihop menyn med medlemsregistret. – Yazan, tillsammans med gruppen
- [ ] Testa funktionerna och hantera felaktig inmatning. – Alla
- [ ] Skriva klart README tillsammans. – Alla

## Svar på frågor: 

# Datalogiskt tänkande: Hur bröt ni ner uppgiften i delsteg och en att-göra-lista innan ni började skriva Java-koden?

Vi valde att dela upp projektet för att matcha alla i gruppens schema, så vi arbetade på egen hand men var tillgängliga för kontakt genom dagen om något problem skulle komma att uppstå. Vi hade också ett gemensamt stand-up möte varje morgon för att se vart vi låg i processen samt om vi behövde göra några ändringar.

# Klass vs Objekt: Varför är Medlem en egen klass och inte bara variabler i Main? Vad representerar ett objekt i er app?

Medlem har en egen klass för att på ett ställe samla de uppgifter som hör till en medlem. Klassen beskriver vilka uppgifter som varje medlem har, i vårt fall är det namn och medlemsnummer. Det gör koden mer strukturerad och betyder att vi inte behöver samla alla uppgifter i Main, vilket gör koden mer strukturerad. Ett objekt är en specifik medlem som skapas utifrån klassen medlem, till exempel (Julia, 56). Det objektet representerar medlemmen Julia med medlemsnummer 56. När programmet körs igång så får varje medlemsobjekt en plats att representeras som en person i klubbens medlemsregister.

# Samarbete i Git: Vilken samarbetsstrategi valde ni (parprogrammering eller branches) och hur gjorde ni för att inte skriva över varandras arbete?

Vi använde oss av separata branches för att kunna arbeta med olika delar av projektet var för sig. När en del var klar slog vi ihop den med huvudbranchen och på så sätt undvek vi att skriva över varandras arbete och inte skapa problem i Main.

# Ett problem ni löste: Beskriv ett problem som uppstod och hur ni löste det tillsammans. Det kan vara en bugg/krock i koden eller Git, men även en utmaning kring planering och samarbete.

När vi hade kopplat ihop delarna hittade vi att registret sökte på medlemsnummer, men uppgiften krävde sökning på medlemsnamn. Vi lade därför till en metod för namnsökning och kopplade den till menyn. Vi testade sedan befintliga och saknade namn samt stora och små bokstäver, så att sökningen fungerade utan att programmet kraschade.

# Reflektion kring AI och externa hjälpmedel (ca 3–5 meningar): Har ni använt AI-verktyg eller andra källor under arbetet?

- Om ja: Beskriv hur ni använde verktyget och ge ett konkret exempel: vad frågade ni om, och behövde ni ändra eller anpassa förslaget för att det skulle passa er app?

- Om nej: Hur resonerade ni kring att lösa uppgiften helt på egen hand och var det något moment där ni funderade på att ta hjälp?

Yazan: Jag använde AI så att förstå hur ska kopplingen mellan Main.java och Register.java innan att Register.java var alls skapat, eftersom jag hade ansvar på atta skriva Main.java koden så frågade jag AI hur jag skulle kunna tänka kring kopplingen mellan delarna. Jag använde alltså AI för att få en förklaring och förstå upplägget. Själva koden skrev jag sedan själv.

Victoria: Jag använde inte AI-verktyg eller externa hjälpmedel när jag arbetade med Medlem. Utan utgick istället från kursmaterialet som vi haft tidigare veckor. Jag ville försöka lösa min del själv och förstå hur klassen fungerar. När jag blev osäker gick jag igenom koden och funderade på upplägget samt hur get-metoderna hänger ihop. Hade uppgiften varit något större så hade jag kunnat använda AI för att få ett hum om hur jag skulle kunna gå vidare om jag körde fast, eller ge mig idéer för olika eventuella tillägg för att kunna utöka projektet.

Julio:

