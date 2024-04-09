package org.refrences.naukri;

import api.Requests.NI_SessionBody;
import api.Responses.NI_SessionReponse;
import api.lib.APIAction;
import api.lib.HeadersSchemas;
import api.lib.ResponseObjector;
import api.lib.URI;

public class NaukriIndiaToken {
    APIAction api = new APIAction();
    public static String AT;

    NI_SessionBody ni_sessionBody = new NI_SessionBody();

    public void generateNaukriAT(String username, String password)
    {
        NI_SessionReponse sessionReponse = new NI_SessionReponse();
        HeadersSchemas header = new HeadersSchemas();
        header.put("appId", "11");
        header.put("SystemId", "jobseeker");
        ni_sessionBody.setUsername(username);
        ni_sessionBody.setPassword(password);
        ni_sessionBody.setLoginByEmail(true);

        ResponseObjector<NI_SessionReponse> response = api.postAction(URI.NaukriIndiaURI.BASE_URI_LIVE+URI.NaukriIndiaURI.NAUKRI_LOGIN,header.getHeaders(),ni_sessionBody);
        AT= response.getHeaders().getValues("Set-Cookie").get(0).split(";")[0].substring(8);

    }
    public String getAT(){
        return AT;
    }


    public String getAuthorization(){
        String Authorization="ACCESSTOKEN = "+getAT();
        return Authorization;
    }



}
