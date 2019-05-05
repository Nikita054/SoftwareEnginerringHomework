package chainOfResponsobilities;

public class Colonel implements Army {
    private Order order;
    private Army lieutenant = new Lieutenant();
    private int level = 15;

    private void moveOrder(Order order) {
        lieutenant.doOrder(order);
    }

    @Override
    public void doOrder(Order order) {
        if (lieutenant == null) {
            System.out.println(" i am " + this.getClass().getSimpleName());
        }
        if (level <= order.getLevel()) {
            System.out.println(" i am " + this.getClass().getSimpleName());
        } else {
            moveOrder(order);
        }
    }
}
