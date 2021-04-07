package org.example.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParseExample {
    public static final String payload ="{\n" +
            "       \"pageInfo\": {\n" +
            "             \"pageName\": \"abc\",\n" +
            "             \"pagePic\": \"http://example.com/content.jpg\"\n" +
            "        },\n" +
            "        \"posts\": [\n" +
            "             {\n" +
            "                  \"post_id\": \"123456789012_123456789012\",\n" +
            "                  \"actor_id\": \"1234567890\",\n" +
            "                  \"picOfPersonWhoPosted\": \"http://example.com/photo.jpg\",\n" +
            "                  \"nameOfPersonWhoPosted\": \"Jane Doe\",\n" +
            "                  \"message\": \"Sounds cool. Can't wait to see it!\",\n" +
            "                  \"likesCount\": \"2\",\n" +
            "                  \"comments\": [],\n" +
            "                  \"timeOfPost\": \"1234567890\"\n" +
            "             }\n" +
            "        ]\n" +
            "    }";

    // PROBLEM : parse the payload to get the values of pageName, pagePic, post_id
    public static void main(String[] args) {
        JSONObject json_object = new JSONObject(payload);
        System.out.println(json_object);

        String page_name = json_object.getJSONObject("pageInfo").getString("pageName");
        System.out.println("page_name = "+page_name);

        String page_pic = json_object.getJSONObject("pageInfo").getString("pagePic");
        System.out.println("page_pic = "+page_pic);

        String post_id = json_object.getJSONArray("posts").getJSONObject(0).getString("post_id");
        System.out.println("post_id = "+post_id);

        // OR if we dont know the index of the json object in the json array
        JSONArray array = json_object.getJSONArray("posts");
        for(int i=0; i<array.length(); i++) {
            String post_id1 = array.getJSONObject(i).getString("post_id");
            System.out.println("post_id = "+post_id1);
        }
    }
}
