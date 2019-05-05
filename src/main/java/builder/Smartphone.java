package builder;

public class Smartphone {
    private String name;
    private String os;
    private int cores;
    private double diag;
    private Producer producer;

    private Smartphone() {
    }

    public class SamsungBuilder {
        private Smartphone smartphone = new Smartphone();

        public SamsungBuilder setName(String name) {
            smartphone.name = name;
            return this;
        }

        private SamsungBuilder setProducer(Producer producer) {
            smartphone.producer = producer;
            return this;
        }

        public SamsungBuilder setOs(String os) {
            smartphone.os = os;
            return this;
        }

        public SamsungBuilder setCore(int cores) {
            smartphone.cores = cores;
            return this;
        }

        public SamsungBuilder setDiag(double diag) {
            smartphone.diag = diag;
            return this;
        }

        public Smartphone getSmartphone() {
            return smartphone;

        }
    }

    public static SamsungBuilder getSamsungBuilder() {
        return new Smartphone().new SamsungBuilder()
                .setProducer(Producer.SAMSUNG);
    }

    public class AppleBuilder {
        private Smartphone smartphone = new Smartphone();

        public AppleBuilder setName(String name) {
            smartphone.name = name;
            return this;
        }

        private AppleBuilder setProducer(Producer producer) {
            smartphone.producer = producer;
            return this;
        }

        private AppleBuilder setOs(String os) {
            smartphone.os = os;
            return this;
        }

        public AppleBuilder setCore(int cores) {
            smartphone.cores = cores;
            return this;
        }

        public AppleBuilder setDiag(double diag) {
            smartphone.diag = diag;
            return this;
        }

        public Smartphone getSmartphone() {
            return smartphone;

        }
    }

    public static AppleBuilder getAppleBuilder() {
        return new Smartphone().new AppleBuilder()
                .setProducer(Producer.APPLE)
                .setOs("IoS");
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
