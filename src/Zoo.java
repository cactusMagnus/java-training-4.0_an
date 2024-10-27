import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static List<Bird> birds = new ArrayList<>();
    /**
     * Feeds different bird sections of the zoo.
     *
     * @param birds list of birds of particular type.
     */
    public static void feed(List<? extends Bird> birds) {
        System.out.println("Feeding birds");
        for (Bird b : birds) {
            b.eat();
        }
    }

    /**
     * Adds birds to a flying section of the zoo.
     *
     * @param birds list of birds of particular type.
     * @param bird a new bird.
     */
    public static void acceptBird(List<? super FlyingBird> birds, FlyingBird bird) {
        System.out.println("Accepting a bird to a section");
        birds.add(bird);
        bird.checkWings();
        for (Object b : birds) {
            System.out.println(b.toString());
        }
    }

    /**
     * Adds bird to the general list.
     *
     * @param birds    list of birds.
     * @param newBird bird to add.
     */
    public static void registerBird(List<Bird> birds, Bird newBird) {
        System.out.println("Adding a bird to the birds list");
        birds.add(newBird);
        for (Bird b : birds) {
            b.toString();
        }
    }
}