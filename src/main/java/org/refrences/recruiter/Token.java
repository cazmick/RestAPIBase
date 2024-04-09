package org.refrences.recruiter;

import api.Requests.SessionBody;
import api.Responses.SessionResponse;
import api.lib.APIAction;
import api.lib.HeadersSchemas;
import api.lib.ResponseObjector;
import api.lib.URI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.Data;
import org.utils.ConfigDetails;

@Data
public class Token
{
    public static String AT;
    public static String RT;
    APIAction api = new APIAction();

    private ConfigDetails propertyReader = new ConfigDetails();
    static long tokenGenTime;
    static long tokenExpireTeam;



    public void generateToken(){
        SessionBody body = new SessionBody();
        tokenGenTime = System.currentTimeMillis();
        HeadersSchemas header = new HeadersSchemas();
        body.setUsername("ali.mujtaba@naukri.com");
        body.setPassword("Naukri@1");
        ResponseObjector<SessionResponse> response =  api.postAction(URI.RecuiterURI.BASE_URI_LIVE+URI.RecuiterURI.SESSION_ENDPOINT,header.getHeaders(),body);
        tokenExpireTeam= tokenGenTime +response.getTime()+ 3600000;
        AT = response.getHeaders().getValue("accessToken");

    }

    public String getAT(){
        return AT;
    }
    public String getRT(){
        return RT;
    }

    public long getTokenEpireTeaminMS(){
        return tokenExpireTeam;
    }
    public long getTokengenerationTime(){
        return tokenGenTime;
    }

    public String getAuthorization(){
        String Authorization="Oauth oauth_consumer_key=AT,oauth_token="+getAT()+",oauth_signature_method=\"PLAINTEXT\",oauth_timestamp=\"1489651176\",oauth_nonce=\"83VnH4\",oauth_signature=\"%26\"";
        return Authorization;
    }


}
