import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements I_MarketBehavior, I_QueueBehaviour {
    List<Buyer> actors = new LinkedList<>();
    Queue<Buyer> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " покинул магазин");
    }

    @Override
    public void update() {
    }


    @Override
    public void takeInQueue(Buyer actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }
}
