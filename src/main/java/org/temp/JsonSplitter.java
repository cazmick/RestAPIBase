package org.temp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonSplitter {
    static JsonSplitter splitter= new JsonSplitter();
    public void splitJson(String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String childJson = jsonObject.toString();
            System.out.println(childJson);
        }
    }
    public static void main(String[] args) throws JSONException {
        List<String> json = new ArrayList<String>();
        String jsonString="{\"countries\":[{\"name\":\"USA\",\"grandfathers\":[{\"gFName\":\"Steve\",\"grandfathersKid\":[{\"kid\":[{\"name\":\"Steve JR\",\"friends\":[{\"name\":\"Kriss|John|Martin|Steven\"}]}],\"gFKName\":\"Linda\"}]}]}]}\n" +
                "{\"author\":\"F. Scott Fitzgerald\",\"title\":\"The Great Gatsby\"}";
        json.add(jsonString);
        splitter.splitJson(json.toString());
    }


}
