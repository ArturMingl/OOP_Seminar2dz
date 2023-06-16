public class Main {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.name = "Sasha";

        Human hm1 = new Human();
        hm1.name = "ivan";


        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.takeInQueue(hm1);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();
    }
}