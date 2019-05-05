package chainOfResponsobilities;

public class Lieutenant implements Army {
    private Order order;
    private int level = 10;
    private Army soldier = new Soldier();

    private void moveOrder(Order order) {
        soldier.doOrder(order);
    }

    @Override
    public void doOrder(Order order) {
        if (soldier == null) {
            System.out.println(" i am " + this.getClass().getSimpleName());
        }
        if (level <= order.getLevel()) {
            System.out.println(" i am " + this.getClass().getSimpleName());
        } else {
            moveOrder(order);
        }
    }

}
