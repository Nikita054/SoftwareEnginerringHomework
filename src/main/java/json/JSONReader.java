package json;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONReader {
    public Student readJSON() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = objectMapper.readValue(new File("D:\\file1.txt"), Student.class);
        return student;
    }
}
