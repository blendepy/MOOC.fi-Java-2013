
public class Main {

    public static void main(String[] args) {
        Reformatory house = new Reformatory();
        
        Person Alex = new Person("Alex", 30, 180, 85);
        
        System.out.println("total weights measured "+house.totalWeightsMeasured());
        
        house.weight(Alex);
        house.weight(Alex);
        house.weight(Alex);
        
        System.out.println("total weights measured "+house.totalWeightsMeasured());
    }
}
