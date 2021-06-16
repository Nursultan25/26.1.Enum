package kg.megacom;

public class Developer extends Employee {
    private DevRang rangs;

    public Developer(String name, int age, int salary) {
        super(name, age, salary);
    }

    public Developer(String name, int age, int salary, DevRang rangs) {
        super(name, age, salary);
        this.rangs = rangs;
    }

    public DevRang getRangs() {
        return rangs;
    }

    public void setRangs(DevRang rangs) {
        this.rangs = rangs;
    }
}
