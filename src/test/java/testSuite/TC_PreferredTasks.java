package testSuite;


import api.lib.*;
import org.testng.annotations.*;
import api.Requests.PreferredTaskBody;
import api.Responses.PreferredTaskResponse;
import xRayLayer.Xray;

import org.refrences.naukri.NaukriIndiaToken;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utils.ConfigDetails;

public class TC_PreferredTasks {
    NaukriIndiaToken naukToken = new NaukriIndiaToken();
    ConfigDetails propertyReader = new ConfigDetails();
    APIAction api = new APIAction();

    @BeforeMethod(firstTimeOnly = true)
    public void generateNaukrToken(){
        naukToken.generateNaukriAT("kanishka.mogha@yopmail.com","naukri");
    }

	@Xray(test = "NITM-40109")
    @Test
    public void TC_001_PreferredTaskforAnytime(){
        HeadersSchemas headers = new HeadersSchemas();
        PreferredTaskBody preferredTaskBody = new PreferredTaskBody();
        PreferredTaskBody.ExtraParams preferredTaskExtraParams = new PreferredTaskBody.ExtraParams();
        headers.put("appId",11);
        headers.put("AppVersion", 347);
        headers.put("Authorization",naukToken.getAuthorization());
        headers.put("SystemId","jobseeker");
        headers.put("cvId","20ce41120cfd4faeb67a16b585d66599");
        preferredTaskBody.setPreferredStartTime(System.currentTimeMillis()+180000);
        preferredTaskBody.setPreferredTimeText("Anytime Task");
        preferredTaskExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        preferredTaskExtraParams.setRecruiterId("Ky6TygIFEOhS1p9V/wZm9g==:E75qo8013O9OeO1FLpwhpw==");
        preferredTaskExtraParams.setCompanyId("1QOQCU9GWDrmx5oPa8lICQ==:JeCj6uZqfoNjSielOtHtlw==");
        preferredTaskBody.setExtraParams(preferredTaskExtraParams);
        ResponseObjector<PreferredTaskResponse> response = api.postAction(URI.NaukriIndiaURI.BASE_URI_LIVE+URI.NaukriIndiaURI.URL_MY_NAUKRI_GATEWAY+URI.NaukriIndiaURI.PREFERRED_TIME_ENDPOINT,headers.getHeaders(),preferredTaskBody);
        Assert.assertEquals(response.getStatusCode(),201);

    }

	@Xray(test = "NITM-40110")
    @Test
    public void TC_002_PreferredTaskforTomorrowwithTime(){
        HeadersSchemas headers = new HeadersSchemas();
        PreferredTaskBody preferredTaskBody = new PreferredTaskBody();
        PreferredTaskBody.ExtraParams preferredTaskExtraParams = new PreferredTaskBody.ExtraParams();
        headers.put("appId",11);
        headers.put("AppVersion", 347);
        headers.put("Authorization",naukToken.getAuthorization());
        headers.put("SystemId","jobseeker");
        headers.put("cvId","20ce41120cfd4faeb67a16b585d66599");
        preferredTaskBody.setPreferredStartTime(System.currentTimeMillis()+43200000);
        preferredTaskBody.setPreferredTimeText("Next day Task");
        preferredTaskExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        preferredTaskExtraParams.setRecruiterId("Ky6TygIFEOhS1p9V/wZm9g==:E75qo8013O9OeO1FLpwhpw==");
        preferredTaskExtraParams.setCompanyId("1QOQCU9GWDrmx5oPa8lICQ==:JeCj6uZqfoNjSielOtHtlw==");
        preferredTaskBody.setExtraParams(preferredTaskExtraParams);
        ResponseObjector<PreferredTaskResponse> response = api.postAction(URI.NaukriIndiaURI.BASE_URI_LIVE+URI.NaukriIndiaURI.URL_MY_NAUKRI_GATEWAY+URI.NaukriIndiaURI.PREFERRED_TIME_ENDPOINT,headers.getHeaders(),preferredTaskBody);
        Assert.assertEquals(response.getStatusCode(),201);

    }




    @Xray(test = "NITM-40110")
    @Test
    public void TC_002(){
        HeadersSchemas headers = new HeadersSchemas();
        RequestObjector<PreferredTaskBody> bodyRequestObjector =new RequestObjector<PreferredTaskBody>();
        PreferredTaskBody preferredTaskBody = new PreferredTaskBody();
        PreferredTaskBody.ExtraParams preferredTaskExtraParams = new PreferredTaskBody.ExtraParams();
        headers.put("appId",11);
        headers.put("AppVersion", 347);
        headers.put("Authorization",naukToken.getAuthorization());
        headers.put("SystemId","jobseeker");
        headers.put("cvId","20ce41120cfd4faeb67a16b585d66599");
        preferredTaskBody.setPreferredStartTime(System.currentTimeMillis()+43200000);
        preferredTaskBody.setPreferredTimeText("Next day Task");
        preferredTaskExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        preferredTaskExtraParams.setRecruiterId("Ky6TygIFEOhS1p9V/wZm9g==:E75qo8013O9OeO1FLpwhpw==");
        preferredTaskExtraParams.setCompanyId("1QOQCU9GWDrmx5oPa8lICQ==:JeCj6uZqfoNjSielOtHtlw==");
        preferredTaskBody.setExtraParams(preferredTaskExtraParams);
        ResponseObjector<PreferredTaskResponse> response = api.postAction(URI.NaukriIndiaURI.BASE_URI_LIVE+URI.NaukriIndiaURI.URL_MY_NAUKRI_GATEWAY+URI.NaukriIndiaURI.PREFERRED_TIME_ENDPOINT,headers.getHeaders(),preferredTaskBody);
        Assert.assertEquals(response.getStatusCode(),201);

    }
}
