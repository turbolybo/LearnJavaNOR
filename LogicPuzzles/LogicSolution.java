/*
 * Løsningsforslag. Husk at det kan løses på forskjellige måter, og det kan
 * godt hende at dere har løst det på en bedre måte enn meg.
 */
public class LogicSolution
{
    // Brukes til oppgave 4. Test med egne tall.
    int[] testArray = {0,1,1,2,4};
    public LogicSolution() {
        // Oppgave 1
        System.out.println(caughtSpeeding(70, false));
        // Oppgave 2
        mario(5);
        // Oppgave 3
        hardMario(5);
        // Oppgave 4
        System.out.println(countEven(testArray));
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        System.out.println("Oppgave 1:");
        int ticketMultiplier = 0;   // 1 = 5km/t over, 2 = 10km/t over, osv.
        int ticketSize = 0;         // Totalpris på boten
        int minTicket = 1000;       // Minstepris på boten
        // Sjekker at hastigheten er over 50, og at man ikke har bursdag
        if (speed > 50 && !isBirthday) {
            /* Hastighet minus 50, så får vi differansen og deler på 5.
             * Da får vi antall ganger vi skal gi 1000kr i bot.
             * Eks: 65 km/t = 15 km /t over. 3*1000 i bot.
             */
            ticketMultiplier = (speed - 50) / 5;
            ticketSize = ticketMultiplier * minTicket;
            return ticketSize;
        }
        // Hvis ikke, returnerer vi 0
        return 0;
    }
    
    /*
     * Denne kan virke vanskelig, siden det er to løkker inni hverandre.
     * Bruk tid på å forstå hva som skjer.
     */
    public void mario(int steps) {
        System.out.println("\nOppgave 2:");
        for(int i = 1; i <= steps; i++) {
            for(int j = 0; j < i; j++) {
                /*
                 * Mens j er mindre enn i skal vi printe ut "#".
                 * Eks i = 1, da skal vi bare printe ut "#"
                 * Hvis i = 3, så skal vi printe ut "###"
                 */
                System.out.print("#");     // Merk print, og ikke println
            }
            /*
             * Siden vi må bruke print, og ikke println over, så ønsker
             * vi et linjeskift i mellom.
             */
            System.out.println("");
        }
    }
    
    /*
     * Vi bygger videre på mario. Her blir det vrient.
     * Her har vi 1 løkke med 2 løkker inni seg.
     */
    public void hardMario(int steps) {
        System.out.println("\nOppgave 3:");
        for(int i = 0; i < steps; i++) {
            // Her printer vi alle mellomrommene
            for(int j = 0; j < steps-i-1; j++) {
                System.out.print(" ");
            }
            // Her printer vi "#"
            for(int k = 0; k < i+1; k++) {
                System.out.print("#");
            }
            // Og vi avslutter med linjeskift
            System.out.println("");
        }
    }
 
    public int countEven(int[] nums) {
        System.out.println("\nOppgave 4:");
        // Initialiserer en teller
        int count = 0;
        
        // Går gjennom array element for element.
        for(int i = 0; i < nums.length; i++) {
            /* Modulu operator. Hvis vi kan dele på 2 er tallet partall.
             * Modulu returnerer resten av delingen. Så vi sjekker her at
             * restverdien = 0. Hadde vi delt 11/2, hadde vi fått restverdi.
             * Til slutt sjekker vi at vi ikke prøver å dele på 0
             */
            if(nums[i] % 2 == 0 && nums[i] != 0) {
                // Hvis vi kan dele med 2, så øker vi telleren  med 1
                count++;
            }
        }
        // Til slutt returnerer vi telleren vår.
        return count;
    }
}
