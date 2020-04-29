
public class Reformatory {
    
    private int timesWeighted;

    public int weight(Person person) {
        this.timesWeighted++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured(){
        return this.timesWeighted;
    }

}
