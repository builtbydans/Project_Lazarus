
public class HealthStation {
    private int weighings;

    public int weigh(HeightPerson Person) {
        this.weighings++;
        return Person.getWeight();
    }

    public void feed(HeightPerson Person) {
        int currentWeight = Person.getWeight();
        Person.setWeight(currentWeight + 1);
    }

    public int weighings() {
        return this.weighings;
    }

}
