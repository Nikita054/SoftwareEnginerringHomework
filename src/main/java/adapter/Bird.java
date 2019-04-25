package adapter;

public class Bird implements Voicable {
    private String name;
    public Bird(String name){
        this.name=name;
    }
    @Override
    public void voice() {
        System.out.println("Ky - ky");
    }
}
