
public class HealthStation {
    private int weighings;

    public int weigh(Person Person) {
        this.weighings++;
        return Person.getWeight();
    }

    public void feed(Person Person) {
        int currentWeight = Person.getWeight();
        Person.setWeight(currentWeight + 1);
    }

    public int weighings() {
        return this.weighings;
    }

}
