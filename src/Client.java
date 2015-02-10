/**
 * Created by akoscinski on 2015-02-10.
 */
public class Client extends Person {
    /**
     * kraj pochodzenia klienta
     */
    private String country;
    /**
     * konstruktor klasy osoba
     *
     * @param name imie i nazwisko
     * @param number numer telefonu
     */
    public Client(String name, String number, String country) {
        super(name, number);
        this.country = country;
    }
}
