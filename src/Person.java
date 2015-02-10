/**
 * Created by akoscinski on 2015-02-10.
 */

/**
 * abstrakcyjna klasa person, bedaca przodkiem wszystkich osob w systemie
 */
public abstract class Person {
    /**
     * id osoby
     */
    private static int id = 0;
    /**
     * imie i nazwisko klienta
     */
    private String name;
    /**
     * numer telefonu klienta
     */
    private String phoneNumber;

    /**
     * konstruktor klasy osoba
     * @param name
     * @param number
     */
    public Person(String name, String number){
        this.name = name;
        this.phoneNumber = number;
        id++;
    }

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }





}
