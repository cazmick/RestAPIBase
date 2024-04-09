package api.lib;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.Data;


import java.util.Map;

@Data
public class APIAction {
    ResponseObjector responseObjector = new ResponseObjector();

    public ResponseObjector getAction(String url, Map<String,Object> headerObj, Object body){
        RestAssured.baseURI =url;
        Response response=RestAssured.given().headers(headerObj).body(body).get();
        responseObjector.setBody(response);
        responseObjector.setHeaders(response.headers());
        responseObjector.setStatusCode(response.getStatusCode());
        return (responseObjector) ;

    }
//
    public ResponseObjector postAction(String url,Map<String,Object> headerObj,Object body){
        RestAssured.baseURI =url;
        Response response=RestAssured.given().headers(headerObj).body(body).post();
        responseObjector.setBody(response);
        responseObjector.setHeaders(response.headers());
        responseObjector.setStatusCode(response.getStatusCode());
        return (responseObjector) ;
    }
//
    public ResponseObjector patchAction(String url,Map<String,Object> headerObj,Object body){
        RestAssured.baseURI =url;
        Response response=RestAssured.given().headers(headerObj).body(body).patch();
        responseObjector.setBody(response);
        responseObjector.setHeaders(response.headers());
        responseObjector.setStatusCode(response.getStatusCode());
        return (responseObjector);
    }
//
    public ResponseObjector deleteAction(String url,Map<String,Object> headerObj,Object body){
        RestAssured.baseURI =url;
        Response response=RestAssured.given().headers(headerObj).body(body).delete();
        responseObjector.setBody(response);
        responseObjector.setHeaders(response.headers());
        responseObjector.setStatusCode(response.getStatusCode());
        return (responseObjector);
    }
}
