public class Human extends Buyer{

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrderClass = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrderClass = true;
    }

    @Override
    public void isMakeOrder() {
    }

    @Override
    public void isTakeOrder() {
    }
}
