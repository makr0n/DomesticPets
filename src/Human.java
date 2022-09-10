import java.util.ArrayList;

public class Human {
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

    public void cuddles(Pet pet){
        pet.happyVoice();
    }

    public void feeding(Pet pet){
        if(pet.isHungry()){
            pet.setHungry(false);
            pet.happyVoice();
        } else {
            System.out.println("Pet is not hungry");
        }
    }

    public void vetCheck(Pet pet){
        if(pet.getAge()>=7){
            pet.setFeedType(FeedType.veterinary);
            pet.setHealthy(false);
            System.out.println("Pet is sick");
        } else {
            System.out.println("Pet is healthy");
        }

    }
}



