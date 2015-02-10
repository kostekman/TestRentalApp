import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by akoscinski on 2015-02-10.
 */
public class Apartment {
    /**
     * numer apartamentu
     */
    private static int id;
    /**
     * nazwa apartamentu
     */
    private String name;
    /**
     * adres apartamentu
     */
    private String adress;
    /**
     * ilosc osob ktore moze pomiescic apartament
     */
    private int capacity;
    /**
     * przedmioty znajdujace sie w apartamencie
     */
    private LinkedList<ApartmentEquipment> inventory;

    public Apartment(String name, String adress, int capacity){
        this.name = name;
        this.adress = adress;
        this.capacity = capacity;
        inventory = new LinkedList<ApartmentEquipment>();
        id++;
    }

    /**
     * zwraca liste przedmiotow przeniesionych z innego apartamentu
     * @return LinkedList z przedmiotami z innego apartamentu
     */
    public LinkedList<ApartmentEquipment> getItemsFromOtherApartments(){
        LinkedList<ApartmentEquipment> items = new LinkedList<ApartmentEquipment>();
        for(ApartmentEquipment i : inventory){
            if(i.getApartmentId() != id){
                items.add(i);
            }
        }
        return items;
    }
    /**
     * zwraca liste przedmiotow nalezacych do tego apartamentu
     * @return LinkedList z przedmiotami z tego apartamentu
     */
    public LinkedList<ApartmentEquipment> getItemsFromApartment(){
        LinkedList<ApartmentEquipment> items = new LinkedList<ApartmentEquipment>();
        for(ApartmentEquipment i : inventory){
            if(i.getApartmentId() == id){
                items.add(i);
            }
        }
        return items;
    }
    /**
     * funkcja dodajaca przedmioty do apartamentu
     * @param item przedmiot dodany - razem z iloscia
     * @return boolean czy operacja sie powiodla
     */
    public boolean addItem(ApartmentEquipment item){
        boolean isDone = false;
        for(ApartmentEquipment i : inventory){
            if(item.getName().equals(i.getName())){
                i.increaseQuantity(item.getQuantity());
                isDone = true;
                break;
            }
        }
        if(!isDone){
            inventory.add(item);
            isDone = true;
        }
        return isDone;
    }

    /**
     * funkcja usuwajaca przedmioty ze stanu apartamentu
     * @param item przedmiot do usuniecia
     * @return
     */
    public boolean removeItem(ApartmentEquipment item){
        boolean isDone = false;
        for(ApartmentEquipment i : inventory){
            if(item.getName().equals(i.getName())){
                i.decreaseQuantity(item.getQuantity());
                isDone = true;
                break;
            }
        }
        return isDone;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }
}
