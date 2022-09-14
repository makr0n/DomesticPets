public abstract class Pet {
    private String name;
    private int age;
    private String breed;
    private boolean isHealthy;
    public boolean isHungry;
    public FeedType feedType;


    public Pet(String name, int age, String breed, boolean isHealthy, boolean isHungry, FeedType feedType) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isHealthy = isHealthy;
        this.isHungry = isHungry;
        this.feedType = feedType;
    }


    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void hungryVoice() {
        System.out.println("Pet hungry voice");
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public void setFeedType(FeedType feedType) {
        this.feedType = feedType;
    }

    public void happyVoice() {
        System.out.println("Pet happy voice");
    }

}
