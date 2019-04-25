import adapter.Bird;
import adapter.Cat;
import adapter.CatAdapter;
import adapter.Voicable;
import builder.Smartphone;
import chainOfResponsobilities.Polkovnik;
import chainOfResponsobilities.Prikaz;
import json.JSONReader;
import json.JSONWriter;
import json.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("Nikita");
        student.setAge(20);
        JSONWriter jsonWriter = new JSONWriter();
        jsonWriter.writeJson(student);
        student = new JSONReader().readJSON();
        System.out.println(student);
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
        Smartphone smartphone = Smartphone.getBuilder()
                .setCore(6)
                .setDiag(10)
                .setOs("Android")
                .getSmartphone();
        System.out.println(smartphone);
    }

    private static void showChainOfResponsobilities() {
        Prikaz prikaz = new Prikaz();
        prikaz.setDescriprion("Wash floor!!!");
        prikaz.setLevel(7);
        Polkovnik polkovnik=new Polkovnik();
        polkovnik.doPrikaz(prikaz);
    }
}
