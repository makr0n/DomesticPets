public class Parrot extends Pet{

    public Parrot(String name, int age, String breed, boolean isHealthy, boolean isHungry, FeedType feedType) {
        super(name, age, breed, isHealthy, isHungry, feedType);
    }

    public void hungryVoice (){
        System.out.printf("GRRRAAAA!");
    }

    public void happyVoice(){
        System.out.println("Thank you"); //говорящий попугай :)
    }
}
