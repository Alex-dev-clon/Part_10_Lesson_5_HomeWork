import java.util.Random;

public class Philosopher extends Thread {
    private final String name;
    private int counterFood = 1;
    private final int leftFork;
    private final int rightFork;
    Forks forks;

    public Philosopher(String name, Forks forks, int rightFork, int leftFork) {
        this.name = name;
        this.forks = forks;
        this.rightFork = rightFork;
        this.leftFork = leftFork;
    }

    @Override
    public void run() {
        try {
            while (counterFood < 4) {
                thinking();
                eating();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private void eating () throws InterruptedException {
        if (forks.getForks().get(rightFork) && forks.getForks().get(leftFork)) {
            forks.getForks().set(rightFork, false);
            forks.getForks().set(leftFork, false);
            System.out.println("Есть свободные вилки. " + name + " ест");
            Thread.sleep(new Random().nextInt(1000, 2000));
            System.out.println(name + " поел " + counterFood + " раз.");
            counterFood++;
            forks.getForks().set(rightFork, true);
            forks.getForks().set(leftFork, true);
            if (counterFood > 3) {
                System.out.println(name + " наелся!");
                this.interrupt();
            }
        } else {
            System.out.println(name + " не имеет рядом свободных вилок.");
        }
    }
    private void thinking() throws InterruptedException {
        System.out.println(name + " начинает думать.");
        Thread.sleep(new Random().nextInt(1000, 2000));
        System.out.println(name + " закончил думать.");
    }
}
