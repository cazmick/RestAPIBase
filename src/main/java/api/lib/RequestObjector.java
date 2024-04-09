package api.lib;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.Callable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestObjector<Req> implements Callable<RequestObjector<Req>> {

    private Req request;
    private HashMap <String,Object> queryParams ;
    Headers headers;
    private ObjectMapper mapper = new ObjectMapper();
    public RequestObjector<Req> call(){
        return this;
    }

    public void setRequestObjectorponse(RequestSpecification requestbody, Class<Req> r) {
        this.request = requestbody.get().as((Type) r);
        this.headers=requestbody.get().getHeaders();

    }


}
