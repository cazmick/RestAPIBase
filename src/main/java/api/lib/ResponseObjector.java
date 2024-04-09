package api.lib;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.concurrent.Callable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseObjector<Respo> implements Callable<ResponseObjector<Respo>> {
    private Respo body;
    Headers headers;
    private ObjectMapper mapper = new ObjectMapper();
    private int statusCode;
    private long time;
    public ResponseObjector<Respo> call(){
        return this;
    }

    public void setResponseObjectorponse(Response response, Class<Respo> r) {
        this.statusCode = response.statusCode();
        this.headers = response.getHeaders();
        this.time=response.getTime();
        this.body = response.as((Type) r);
        

    }



}
