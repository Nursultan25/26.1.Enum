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
}
