package kg.megacom;

public enum DevRang {
    JUNIOR("I'm junior developer"),
    MIDDLE("I'm middle developer"),
    SENIOR("I'm senior developer"),
    TEAMLEAD("I'm teamlead of the group");

    private String phrase;

    DevRang(String phrase) {
        this.phrase = phrase;
    }

    public void printPhrase() {
        System.out.println(phrase);
    }

}
