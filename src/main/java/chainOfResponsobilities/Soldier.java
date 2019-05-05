package chainOfResponsobilities;

public class Soldier implements Army {
    private Army sold;
    private int level = 5;
    private Order order;

    private void moveOrder(Order order) {
        sold.doOrder(order);
    }

    @Override
    public void doOrder(Order order) {
        if (sold == null) {
            System.out.println(" i am " + this.getClass().getSimpleName());
        } else if (level <= order.getLevel()) {
            System.out.println(" i am " + this.getClass());
        } else {
            moveOrder(order);
        }

    }
}
