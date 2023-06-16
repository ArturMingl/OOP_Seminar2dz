import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        /*
        Урок 3 задание 1:
        В предыдущем ДЗ добавить реализацию собственного функционального
        интерфейса. В первом варианте вам нужно добавить реализацию собственного
        функционального интерфейса к предыдущему ДЗ. Вы можете выбрать любой
        класс или часть кода из предыдущего ДЗ и добавить свой собственный
        функциональный интерфейс, описывающий необходимое поведение.
        */

        Human hm = new Human();
        hm.name = "Sasha";

        Human hm1 = new Human();
        hm1.name = "ivan";

        Market market = new Market();

        I_HumanStatus <Human> status = hm3 -> {
            if(market.getQueue().contains(hm3)) {
                System.out.printf("%s находится в очереди \n", hm3.getName());
            } else {
                System.out.printf("%s Не находится в очереди \n", hm3.getName());
            }
        };

        market.takeInQueue(hm);
        market.takeInQueue(hm1);

        status.inQueue(hm);
        status.inQueue(hm1);

        market.releaseFromQueue();

        status.inQueue(hm);
        status.inQueue(hm1);

        System.out.println("___________________");
        /*
        Урок 3 задание 2:
        Реализовать любой выбранный интерфейс из списка (Iterator<E>,
        Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ,
        предоставив собственную реализацию (нужно реализовать один из выбранных
        интерфейсов (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в
        предыдущем ДЗ. Вы можете выбрать любой интерфейс и предоставить свою
        собственную реализацию методов, соответствующих этому интерфейсу
        */

        Human hm3 = new Human();
        hm3.name = "Masha";

        Human hm4 = new Human();
        hm4.name = "Dasha";

        Market market2 = new Market();

        market2.takeInQueue(hm);
        market2.takeInQueue(hm1);
        market2.takeInQueue(hm3);
        market2.takeInQueue(hm4);

        // вызывается метод compareTo (Описан в классе Market) для сравнения размеров очередей

        int result = market2.compareTo(market.getQueue());
        if (result < 0) {
            System.out.println("Очередь 1 меньше очереди 2");
        } else if (result > 0) {
            System.out.println("Очередь 1 больше очереди 2");
        } else {
            System.out.println("Очереди 1 и 2 имеют одинаковый размер");
        }
    }
}