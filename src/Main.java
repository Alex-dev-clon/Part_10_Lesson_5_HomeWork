/*
1. Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом стоит тарелка спагетти.
2. Вилки лежат на столе между каждой парой ближайших философов.
3. Каждый философ может либо есть, либо размышлять.
4. Философ может есть только тогда, когда держит две вилки — взятую справа и слева.
5. Философ не может есть два раза подряд, не прервавшись на размышления (можно не учитывать)

Описать в виде кода такую ситуацию. Каждый философ должен поесть три раза
 */
public class Main {
    public static void main(String[] args) {
        Forks forks = new Forks();
        Philosopher philosopher1 = new Philosopher("Философ № 1", forks, 4, 0);
        Philosopher philosopher2 = new Philosopher("Философ № 2", forks, 0, 1);
        Philosopher philosopher3 = new Philosopher("Философ № 3", forks, 1, 2);
        Philosopher philosopher4 = new Philosopher("Философ № 4", forks, 2, 3);
        Philosopher philosopher5 = new Philosopher("Философ № 5", forks, 4, 3);

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
    }
}
