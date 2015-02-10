/**
 * Created by akoscinski on 2015-02-10.
 */
public class Employee extends Person {
    /**
     * id osoby która jest przelozonym pracownika
     */
    private int supervisor;

    /**
     * konstruktor klasy employee
     * @param name
     * @param number
     * @param supervisor
     */
    public Employee(String name, String number, int supervisor) {
        super(name, number);
        this.supervisor = supervisor;
    }

    public int getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(int supervisor) {
        this.supervisor = supervisor;
    }
}
