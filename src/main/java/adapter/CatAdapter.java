package adapter;

public class CatAdapter implements Voicable{
    private Meowable cat;
    public CatAdapter(Meowable cat){
        this.cat=cat;
    }
    @Override
    public void voice() {
        cat.meow();
    }
}
