package api.lib;


public class URI {

    public static class RecuiterURI{
        public static String BASE_URI_LIVE="https://www.nma.mobi";
        public static String BASE_URI_STAGING1="https://www.10.10.220.53";
        public static String BASE_URI_STAGING2="https://www.10.10.220.153";

        public static String URL_MY_RECRUITER_GATEWAY="/cloudgateway-mynaukri-recruiter";

        public static String SESSION_ENDPOINT="/rlogin/v1/user/session";
        public static String CALL_INTENT_SEND_NOTIFICATION_ENDPOINT="/recruiter-js-call-services/v2/call-intent/send-notification";
        public static String RECENT_INTENTS_ENDPOINT="/v0/companies/168613/recruiters/76866977/recent-intents";
        public static String PREFERRED_TIME_ENDPOINT="/v0/preferred-time/save-preferred-time";
        public static String PREFERRED_TIME_REMINDER_ENDPOINT="/taskandreminder-service/preferred/tasks";

    }

    public static class NaukriIndiaURI{
        public static String BASE_URI_LIVE="https://www.nma.mobi";
        public static String URL_MY_NAUKRI_GATEWAY="/cloudgateway-mynaukri";
        public static String PREFERRED_TIME_ENDPOINT="/recruiter-js-call-services/v0/preferred-time/save-preferred-time";

        public static String NAUKRI_LOGIN ="/central-login-services/v1/login";


    }







}
