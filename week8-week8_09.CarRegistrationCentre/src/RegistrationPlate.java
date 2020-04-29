
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public int hashCode() {
        int a = 7;
        if (this.country == null || this.regCode == null) {
            return a;
        }
        return this.country.hashCode() + this.regCode.hashCode() + a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RegistrationPlate other = (RegistrationPlate) obj;
        if (!this.regCode.equals(other.regCode)) {
            return false;
        }
        if (this.country == null || !this.country.equals(other.country)) {
            return false;
        }
        return true;
    }

}
