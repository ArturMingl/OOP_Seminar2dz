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
            if(market.actorsQueue.contains(hm3)) {
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
    }
}