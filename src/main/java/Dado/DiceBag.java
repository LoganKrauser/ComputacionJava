package Dado;



    import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class DiceBag {
        private List<Die> dice = new ArrayList<>();

        public DiceBag(int numberOfDice, int faces) {
            for (int i = 0; i < numberOfDice; i++) {
                dice.add(new Die(faces));
            }
        }

        public void rollAll() {
            for (Die die : dice) {
                die.roll();
            }
            System.out.println("Todos los dados fueron lanzados.");
        }

        public void showFirstDie() {
            if (!dice.isEmpty()) {
                Die firstDie = dice.get(0);
                System.out.println(firstDie);
            }
        }

        public void pickRandomDie() {
            if (!dice.isEmpty()) {
                Random random = new Random();
                int index = random.nextInt(dice.size());
                Die randomDie = dice.get(index);
                System.out.println(randomDie);
            }
        }

        public void rollRandomDice(int count) {
            Random random = new Random();
            for (int i = 0; i < count && !dice.isEmpty(); i++) {
                int index = random.nextInt(dice.size());
                Die die = dice.get(index);
                die.roll();
                System.out.println(die);
            }
            System.out.println("Quedan " + dice.size() + " dados en la bolsa.");
        }
    }


