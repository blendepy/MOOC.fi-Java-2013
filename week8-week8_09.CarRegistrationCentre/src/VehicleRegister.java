
import java.util.*;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if (plate == null) {
            return null;
        }
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate count : owners.keySet()) {
            System.out.println(count.toString());
        }
    }

    public void printOwners() {
        ArrayList<String> allOwners = new ArrayList<String>();

        for (RegistrationPlate plate : owners.keySet()) {
            allOwners.add(owners.get(plate));
        }

        String helper = "";

        for (String name : allOwners) {
            if (!helper.equals(name)) {
                helper = name;
                System.out.println(helper);
            }
        }
    }
}
