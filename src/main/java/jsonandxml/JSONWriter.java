package jsonandxml;

import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JSONWriter {
    public void writeJson(Student student) throws Exception {
        JSONObject obj = new JSONObject();
        obj.put("name", student.getName());
        obj.put("age", student.getAge());
        try (FileWriter file = new FileWriter("D:\\file1.txt")) {
            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        }
    }

}
