public interface PetCare {

    default void cuddles(Pet pet) {
        pet.happyVoice();
    }

    default void feeding(Pet pet) {
        if (pet.isHungry()) {
            pet.setHungry(false);
            pet.happyVoice();
        } else {
            System.out.println("Pet is not hungry");
        }
    }

    default void vetCheck(Pet pet) {
        if (pet.getAge() >= 7) {
            pet.setFeedType(FeedType.veterinary);
            pet.setHealthy(false);
            System.out.println("Pet is sick");
        } else {
            System.out.println("Pet is healthy");
        }

    }
}
