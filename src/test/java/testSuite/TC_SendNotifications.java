package testSuite;

import com.codoid.products.exception.FilloException;
import org.testng.annotations.*;
import api.Requests.SendNotificationBody;
import api.Responses.SendNotificationResponse;
import api.lib.APIAction;
import api.lib.HeadersSchemas;
import api.lib.ResponseObjector;
import org.utils.FilloCatcher;
import xRayLayer.Xray;

import org.json.JSONException;
import org.refrences.recruiter.Token;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utils.ConfigDetails;
import api.lib.URI;

public class TC_SendNotifications {

    Token token = new Token();
    APIAction api = new APIAction();
    ConfigDetails prop = new ConfigDetails();

    public TC_SendNotifications() throws FilloException {
    }

    //    @BeforeMethod(firstTimeOnly = true)
    public void generateAT(){
        token.generateToken();

    }
    
	@Xray(test = "NITM-17264")
    @Test
    public void TC_001_sendNotificationforInitated() throws JSONException {
        HeadersSchemas headers = new HeadersSchemas();
        SendNotificationBody notificationBody = new SendNotificationBody();
        SendNotificationBody.ExtraParam notificationExtraParams = new SendNotificationBody.ExtraParam();
        headers.put("Authorization",token.getAuthorization());
        notificationBody.setIntentText("");
        notificationBody.setCallStatus("CALL_INTENT_INITIATED");
        notificationBody.setReceiverId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setSenderMobileNumber("");
        notificationBody.setCallIntentId("");
        notificationBody.setReceiverIdType("CVID");
        notificationBody.setReuse("false");
        notificationBody.setCvDetailId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setCallDuration("0");
        notificationBody.setSystemId("rec");
        notificationBody.setDialingTime(String.valueOf(System.currentTimeMillis()));
        notificationExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        notificationExtraParams.setVersionCode("116");
        notificationBody.setExtraParams(notificationExtraParams);

        ResponseObjector<SendNotificationResponse> response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        if(response.getStatusCode()==401){
            headers.put("rt",token.getRT());
             response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        }
        Assert.assertEquals(response.getStatusCode(),201 );

    }

	
	@Xray(test = "NITM-17264")
    @Test
    public void TC_002_sendNotificationforMissed() throws JSONException {
        HeadersSchemas headers = new HeadersSchemas();
        SendNotificationBody notificationBody = new SendNotificationBody();
        SendNotificationBody.ExtraParam notificationExtraParams = new SendNotificationBody.ExtraParam();
        headers.put("Authorization",token.getAuthorization());
        notificationBody.setIntentText("");
        notificationBody.setCallStatus("CALL_INTENT_MISSED");
        notificationBody.setReceiverId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setSenderMobileNumber("");
        notificationBody.setCallIntentId("");
        notificationBody.setReceiverIdType("CVID");
        notificationBody.setReuse("false");
        notificationBody.setCvDetailId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setCallDuration("0");
        notificationBody.setSystemId("rec");
        notificationBody.setDialingTime(String.valueOf(System.currentTimeMillis()));
        notificationExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        notificationExtraParams.setVersionCode("116");
        notificationBody.setExtraParams(notificationExtraParams);

        ResponseObjector<SendNotificationResponse> response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        if(response.getStatusCode()==401){
            headers.put("rt",token.getRT());
            response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        }
        Assert.assertEquals(response.getStatusCode(),201 );
    }


	@Xray(test = "NITM-17264")
    @Test
    public void TC_003_sendNotificationforConnected() throws JSONException {
        HeadersSchemas headers = new HeadersSchemas();
        SendNotificationBody notificationBody = new SendNotificationBody();
        SendNotificationBody.ExtraParam notificationExtraParams = new SendNotificationBody.ExtraParam();
        headers.put("Authorization",token.getAuthorization());
//        notificationBody.setIntentText("");
        notificationBody.setCallStatus("CALL_INTENT_CONNECTED");
        notificationBody.setReceiverId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setSenderMobileNumber("");
        notificationBody.setCallIntentId("");
        notificationBody.setReceiverIdType("CVID");
        notificationBody.setReuse("false");
        notificationBody.setCvDetailId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setCallDuration("10");
        notificationBody.setSystemId("rec");
        notificationBody.setDialingTime(String.valueOf(System.currentTimeMillis()));
        notificationExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        notificationExtraParams.setVersionCode("116");
        notificationBody.setExtraParams(notificationExtraParams);

        ResponseObjector<SendNotificationResponse> response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        if(response.getStatusCode()==401){
            headers.put("rt",token.getRT());
            response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        }
        Assert.assertEquals(response.getStatusCode(),201 );
    }

	@Xray(test = "NITM-17264")
    @Test
    public void TC_004_sendNotificationforInitatedwithMobileVerified() throws JSONException {
        HeadersSchemas headers = new HeadersSchemas();
        SendNotificationBody notificationBody = new SendNotificationBody();
        SendNotificationBody.ExtraParam notificationExtraParams = new SendNotificationBody.ExtraParam();
        headers.put("Authorization",token.getAuthorization());
        notificationBody.setIntentText("");
        notificationBody.setCallStatus("CALL_INTENT_INITIATED");
        notificationBody.setReceiverId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setSenderMobileNumber("9690226995");
        notificationBody.setCallIntentId("");
        notificationBody.setReceiverIdType("CVID");
        notificationBody.setReuse("false");
        notificationBody.setCvDetailId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setCallDuration("0");
        notificationBody.setSystemId("rec");
        notificationBody.setDialingTime(String.valueOf(System.currentTimeMillis()));
        notificationExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        notificationExtraParams.setVersionCode("116");
        notificationBody.setExtraParams(notificationExtraParams);

        ResponseObjector<SendNotificationResponse> response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        if(response.getStatusCode()==401){
            headers.put("rt",token.getRT());
            response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        }
        Assert.assertEquals(response.getStatusCode(),201 );

    }

	@Xray(test = "NITM-17264")
    @Test
    public void TC_005_sendNotificationforMissedwithMobileVerified() throws JSONException {
        HeadersSchemas headers = new HeadersSchemas();
        SendNotificationBody notificationBody = new SendNotificationBody();
        SendNotificationBody.ExtraParam notificationExtraParams = new SendNotificationBody.ExtraParam();
        headers.put("Authorization",token.getAuthorization());
        notificationBody.setIntentText("");
        notificationBody.setCallStatus("CALL_INTENT_MISSED");
        notificationBody.setReceiverId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setSenderMobileNumber("9690226995");
        notificationBody.setCallIntentId("");
        notificationBody.setReceiverIdType("CVID");
        notificationBody.setReuse("false");
        notificationBody.setCvDetailId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setCallDuration("0");
        notificationBody.setSystemId("rec");
        notificationBody.setDialingTime(String.valueOf(System.currentTimeMillis()));
        notificationExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        notificationExtraParams.setVersionCode("116");
        notificationBody.setExtraParams(notificationExtraParams);

        ResponseObjector<SendNotificationResponse> response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        if(response.getStatusCode()==401){
            headers.put("rt",token.getRT());
            response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY+URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        }
        Assert.assertEquals(response.getStatusCode(),201 );
    }

	@Xray(test = "NITM-17264")
    @Test
    public void TC_006_sendNotificationforConnectedwithMobileVerified() throws JSONException {
        HeadersSchemas headers = new HeadersSchemas();
        SendNotificationBody notificationBody = new SendNotificationBody();
        SendNotificationBody.ExtraParam notificationExtraParams = new SendNotificationBody.ExtraParam();
        headers.put("Authorization",token.getAuthorization());
//        notificationBody.setIntentText("");
        notificationBody.setCallStatus("CALL_INTENT_CONNECTED");
        notificationBody.setReceiverId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setSenderMobileNumber("9690226995");
        notificationBody.setCallIntentId("");
        notificationBody.setReceiverIdType("CVID");
        notificationBody.setReuse("false");
        notificationBody.setCvDetailId("20ce41120cfd4faeb67a16b585d66599");
        notificationBody.setCallDuration("10");
        notificationBody.setSystemId("rec");
        notificationBody.setDialingTime(String.valueOf(System.currentTimeMillis()));
        notificationExtraParams.setJsKey("e74f7c7fb1d89fabbded130fad6b86ab230c5708094b52401d4c1e0f055821034c494c52481d460e560c065f0b120616475b5c0f596");
        notificationExtraParams.setVersionCode("116");
        notificationBody.setExtraParams(notificationExtraParams);

        ResponseObjector<SendNotificationResponse> response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        if(response.getStatusCode()==401){
            headers.put("rt",token.getRT());
            response = api.postAction(URI.RecuiterURI.BASE_URI_LIVE +URI.RecuiterURI.URL_MY_RECRUITER_GATEWAY +URI.RecuiterURI.CALL_INTENT_SEND_NOTIFICATION_ENDPOINT,headers.getHeaders(),notificationBody);

        }
        Assert.assertEquals(response.getStatusCode(),201 );
    }


    @Test
    public void testFillo() throws FilloException {
        System.out.println(prop.filloCatcher.fetchData("select Data,Demo from NotificationData where Demo=1"));


    }












}
