import adapter.Bird;
import adapter.Cat;
import adapter.CatAdapter;
import adapter.Voicable;
import builder.Smartphone;
import chainOfResponsobilities.Colonel;
import chainOfResponsobilities.Order;
import jsonandxml.StaXParser;
import jsonandxml.JSONWriter;
import jsonandxml.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        JSONWriter jsonWriter = new JSONWriter();
        List<Student> students = new StaXParser().readXML();
        for(Student student : students){
            jsonWriter.writeJson(student);
        }
        System.out.println(students);
        showAdapter();
        showBuilder();
        showChainOfResponsobilities();
    }

    private static void showAdapter() {
        Cat cat = new Cat("Murzik");
        CatAdapter catAdapter = new CatAdapter(cat);
        Bird bird = new Bird("Kesha");
        List<Voicable> voicableList = new ArrayList<>();
        voicableList.add(catAdapter);
        voicableList.add(bird);
        for (Voicable voicable : voicableList) {
            voicable.voice();
        }
    }

    private static void showBuilder() {
        Smartphone iphone = Smartphone.getAppleBuilder()
                .setName("Iphone 5s")
                .setCore(2)
                .setDiag(5)
                .getSmartphone();
        Smartphone samsung = Smartphone.getSamsungBuilder()
                .setName("Samsung galaxy s7")
                .setCore(4)
                .setDiag(6)
                .setOs("Android")
                .getSmartphone();
        System.out.println(iphone);
        System.out.println(samsung);
    }

    private static void showChainOfResponsobilities() {
        Order order = new Order();
        order.setDescriprion("Wash floor!!!");
        order.setLevel(7);
        Colonel colonel = new Colonel();
        colonel.doOrder(order);
    }
}
