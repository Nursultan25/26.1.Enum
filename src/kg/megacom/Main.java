package kg.megacom;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Developer james = new Developer("James", 32, 4500, DevRang.SENIOR);
        Developer diana = new Developer("Diana", 22, 3600, DevRang.MIDDLE);
        Developer bruce = new Developer("Bruce", 41, 6800, DevRang.TEAMLEAD);
        Developer barry = new Developer("Barry", 19, 3100, DevRang.JUNIOR);

        Developer[] developers = {james, diana, bruce, barry};

        for (Developer developer : developers) {
            developer.getRangs().printPhrase();
        }
    }


    /*public static void printDeveloperGrade(Developer developer) {
        switch (developer.getRangs()) {
            case JUNIOR:
                System.out.println("I'm junior developer");
                break;
            case MIDDLE:
                System.out.println("I'm middle developer");
                break;
            case SENIOR:
                System.out.println("i'm senior developer");
                break;
            case TEAMLEAD:
                System.out.println("i'm teamlead of the group");
                break;
        }
    }*/
}
