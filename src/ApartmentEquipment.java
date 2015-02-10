/**
 * Created by akoscinski on 2015-02-10.
 */
public class ApartmentEquipment {
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * funkcja zwiekszajaca ilosc przedmiotow
     * @param quantity ilosc dodanych przedmiotow
     */
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }
    /**
     * funkcja zmniejszajaca ilosc przedmiotow
     * @param quantity ilosc odjetych przedmiotow
     */
    public void decreaseQuantity(int quantity) {
        this.quantity -= quantity;
    }

    /**
     * nazwa przedmiotu
     */
    private String name;
    /**
     * ilosc przedmiotow w apartamencie
     */
    private int quantity;

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    /**
     * numer apartamentu do ktorego przedmiot jest przydzielony
     */
    private int apartmentId;

    public ApartmentEquipment(String name, int quantity, int apartmentId){
        this.name = name;
        this.quantity = quantity;
        this.apartmentId = apartmentId;
    }
}
