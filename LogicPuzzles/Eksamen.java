/*
 * Eksempel på besvarelse på Oppgave 1-2 på Eksamenssettet i PGR100 H16.
 */
public class Eksamen
{
    public Eksamen() {
        
    }
    
    public void Oppgave1a() {
        int a = 4;
        int b = 4;
        int c = 8;
        int d = 4;
        int e = a+b/c-d;
        System.out.println(e);
    }
    
    public int Oppgave1b() {
        int x = 1;
        int y = 1;
        return (x/y) + (x-y)/(x+y);
    }

    // Oppgave 2a
    public boolean checkBinary(int[] binArray) {
        for (int i = 0; i < binArray.length; i++) {
            if (binArray[i] < 0 || binArray[i] > 1) {
                return false;
            }
        }
        return true;
    }
    
    // Oppgave 2b
    public int found(int[] searchArray, int luckyNumber) {
        boolean found = false;
        int i = 0;
        while (!found && i < searchArray.length) {
            if (searchArray[i] == luckyNumber) {
                found = true;
                return searchArray[i];
            }
            i++;
        }
        return -1;
    }
}