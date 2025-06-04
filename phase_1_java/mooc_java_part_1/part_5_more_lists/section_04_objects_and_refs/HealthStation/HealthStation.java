
public class HealthStation {
    private int weighings;

    public int weigh(Person person) {
        this.weighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }

    public int weighings() {
        return this.weighings;
    }

}
