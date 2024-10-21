package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * TODO this implementation
     * @param e the employee to be given raise
     * @param raise the raise
     * @throws IllegalArgumentException when raise is negative
     */
    public void giveRaise(Employee e, double raise) throws IllegalArgumentException {
        if (raise < 0) {
            throw new IllegalArgumentException();
        }


        if (this.equals(e)) {
            e.setSalary(e.getSalary() + raise);
        } else {
            e.setSalary(e.getSalary() + raise);
            double newSalary = e.getSalary();
            this.setSalary(this.getSalary() + (newSalary / 2.0));
        }

    }

    @Override
    public String toString() {
        return "Mgr. " +super.toString();
    }
}
