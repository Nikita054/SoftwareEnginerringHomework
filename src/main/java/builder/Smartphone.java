package builder;

public class Smartphone {
    private String name;
    private String os;
    private int cores;
    private double diag;
    private String producer;
    private Smartphone(){}

    public class Builder {
        private Smartphone smartphone=new Smartphone();
        public Builder setName(String name){
            smartphone.name=name;
            return this;
        }
        public Builder setProducer(String producer){
            smartphone.producer=producer;
            return this;
        }
        public Builder setOs(String os){
            smartphone.os=os;
            return this;
        }
        public Builder setCore(int cores){
            smartphone.cores=cores;
            return this;
        }
        public Builder setDiag(double diag){
            smartphone.diag=diag;
            return this;
        }
        public Smartphone getSmartphone(){
            return smartphone;

        }

    }
    public static Builder getBuilder(){
        return new Smartphone().new Builder();
    }
    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", os='" + os + '\'' +
                ", cores=" + cores +
                ", diag=" + diag +
                ", producer='" + producer + '\'' +
                '}';
    }
}
