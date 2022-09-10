public class Cat extends Pet {

    public Cat(String name, int age, String breed, boolean isHealthy, boolean isHungry, FeedType feedType) {
        super(name, age, breed, isHealthy, isHungry, feedType);
    }

    public void hungryVoice (){
        System.out.printf("Meeeeow!");
    }

    public void happyVoice(){
        System.out.println("Purrrrr");
    }


}
