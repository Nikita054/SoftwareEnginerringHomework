package chainOfResponsobilities;

public class Leitenant implements Army {
    private Prikaz prikaz;
    private int level=10;
    private Army ryadovoi=new Ryadovoi();
    private void movePrikaz(Prikaz prikaz) {
        ryadovoi.doPrikaz(prikaz);
    }

    @Override
    public void doPrikaz(Prikaz prikaz) {
        if(ryadovoi==null){
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
