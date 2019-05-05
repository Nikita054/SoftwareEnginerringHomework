package chainOfResponsobilities;

public class Order {
    private int level;
    private String descriprion;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    public void doPrikaz() {
        System.out.println("Done");
    }
}
