package chainOfResponsobilities;

public class Polkovnik implements Army {
    private Prikaz prikaz;
    private Army leitenant=new Leitenant();
    private int level=15;
    private void movePrikaz(Prikaz prikaz) {
        leitenant.doPrikaz(prikaz);
    }

    @Override
    public void doPrikaz(Prikaz prikaz) {
        if(leitenant==null){
            System.out.println(" i am "+this.getClass().getSimpleName());
        }
        if(level<=prikaz.getLevel()){
            System.out.println(" i am "+this.getClass().getSimpleName());
        }
        else {
            movePrikaz(prikaz);
        }
    }
}
