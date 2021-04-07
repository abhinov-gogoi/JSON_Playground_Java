package org.example.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.*;

import java.util.HashMap;
import java.util.Map;

public class JsonEncode {
    public static void main(String[] args) {
        Map object = new HashMap();
        object.put("id", 101);
        object.put("name", "Mike");
        object.put("Age", 26);
        object.put("City", "Gurgaon");
        object.put("Job", "Dev");

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(object);
            System.out.println("json = "+json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println("object "+object);

    }
}
