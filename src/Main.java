public class Main {
    public static void main(String[] args) {
        Human owner = new Human("Jack");
        Cat cat = new Cat("Fluffy", 5, "Maine Coon", true, true,FeedType.ordinary);
        Parrot parrot = new Parrot("Joji", 7, "Cockatiel", true, false, FeedType.veterinary);
        owner.pets.add(cat);
        owner.pets.add(parrot);

        owner.feeding(cat);
        owner.cuddles(parrot);
        owner.feeding(parrot);

        System.out.println(parrot.isHealthy());
        owner.vetCheck(parrot);
        System.out.println(parrot.isHealthy());

    }
}
