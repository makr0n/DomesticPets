import java.util.ArrayList;

public class Human implements PetCare {
    public String name;
    ArrayList<Pet> pets = new ArrayList<>();

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setName(String name) {
        this.name = name;
    }

}



