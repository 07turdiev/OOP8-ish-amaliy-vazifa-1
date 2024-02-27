public class Staff extends Person {
    private String School;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        this.setName(name);
        this.setAddress(address);
        this.School = school;
        this.pay = pay;
    }

    public String getSchool() {
        return School;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        String a = "Staff[Person[name = " + getName() + ", address = " + getAddress() + ", School = " + getSchool() + ", pay = " + getPay() + "]";
        return a;
    }
}
