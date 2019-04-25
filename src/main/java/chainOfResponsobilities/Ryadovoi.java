package chainOfResponsobilities;

public class Ryadovoi implements Army {
    private Army sold;
    private int level=5;
    private Prikaz prikaz;

    private void movePrikaz(Prikaz prikaz){
        sold.doPrikaz(prikaz);
    }

    @Override
    public void doPrikaz(Prikaz prikaz) {
        if(sold==null){
            System.out.println(" i am "+this.getClass().getSimpleName());
        }
        else if(level<=prikaz.getLevel()){
            System.out.println(" i am "+this.getClass());
        }
        else {
            movePrikaz(prikaz);
        }

    }
}
