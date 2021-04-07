package org.example.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayExample {
    public static void main(String[] args) {

        JSONArray json_array = new JSONArray();
        json_array.put("Hello");
        json_array.put(21);
        json_array.put(true);

        JSONObject obj = new JSONObject();
        obj.put("name", "Abhi");
        obj.put("lang", "java");
        obj.put("age", 24);
        json_array.put(obj);

        System.out.println(obj.get("age"));
        System.out.println(json_array.getJSONObject(3));
        System.out.println(json_array);




    }
}
