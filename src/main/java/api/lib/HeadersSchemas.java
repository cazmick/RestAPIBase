package api.lib;

import lombok.Data;
import org.utils.ConfigDetails;

import java.util.HashMap;
import java.util.Map;

@Data
public class HeadersSchemas {
    private ConfigDetails propertyReader= new ConfigDetails();
     Map<String,Object> headers =new HashMap<String,Object>() ;

    public  HeadersSchemas(Map<String, Object> appendtodefault){
        this.defaultHeaders();
        headers.putAll(appendtodefault);

    }
    public  HeadersSchemas(){
        this.defaultHeaders();

    }
    public HeadersSchemas(String key,Object value){
        this.defaultHeaders();
        headers.put(key, value);
    }
    private void defaultHeaders(){
        headers.put("content-type", "application/json");
        headers.put("accept", "application/json");
        headers.put("appId", propertyReader.getPropertyValue("appId"));
        headers.put("clientId", propertyReader.getPropertyValue("clientId"));
        headers.put("User-Agent",propertyReader.getPropertyValue("UserAgent"));
        headers.put("SystemId", propertyReader.getPropertyValue("SystemId"));
        headers.put("deviceId", propertyReader.getPropertyValue("deviceId"));
        headers.put("cvId", propertyReader.getPropertyValue("cvId"));
    }

    public void put(Map<String,Object> addiitionalParams){
        headers.putAll(addiitionalParams);

    }

    public void put(String key, Object value){
        headers.put(key,value);

    }



}
