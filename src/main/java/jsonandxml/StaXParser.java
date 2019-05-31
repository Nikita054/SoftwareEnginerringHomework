package jsonandxml;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaXParser {
    private static final String NAME = "name";
    private static final String AGE = "age";
    private static final String STUDENT = "student";

    public List<Student> readXML() throws Exception {
        List<Student> students = new ArrayList<>();
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            InputStream in = new FileInputStream("D:\\file2.xml");
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            Student student = null;
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    if (startElement.getName().getLocalPart().equals(STUDENT)) {
                        student = new Student();
                    }
                    if (event.isStartElement()) {
                        if (event.asStartElement().getName().getLocalPart()
                                .equals(NAME)) {
                            event = eventReader.nextEvent();
                            student.setName(event.asCharacters().getData());
                            continue;
                        }
                    }
                    if (event.asStartElement().getName().getLocalPart()
                            .equals(AGE)) {
                        event = eventReader.nextEvent();
                        student.setAge(Integer.parseInt(event.asCharacters().getData()));
                        continue;
                    }
                }
                if (event.isEndElement()) {
                    EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart().equals(STUDENT)) {
                        students.add(student);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
