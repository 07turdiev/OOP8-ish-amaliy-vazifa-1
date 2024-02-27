public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        this.setName(name);
        this.setAddress(address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }


    public int getYear() {
        return year;
    }


    public double getFee() {
        return fee;
    }


    @Override
    public String toString() {
        String s =   "Student[Person[name = " + getName()+ ", address = " + getAddress() + ", program = " + getProgram() + ", year = " + getYear() + ", fee = " + getFee() + "]";
        return s;
    }


}
