package api.Responses;

import lombok.Data;

import java.util.List;
@Data
public class NI_SessionReponse {
    List<NICookie> cookies;
    private UserInfo userInfo;
    private UserStateinfo userStateInfo;

    @Data
    public static class NICookie{
        String name;
        String value;
        long expiry;
        boolean httpOnly;
        boolean secure;
        String domain;
    }

    public static class UserInfo{
        long userId;
        String userType;
        String userRole;
        String deviceType;
        String ipAddress;
        String userAgent;
        private Userdata userData;

        public class Userdata{
            String username;
            String email;
            String serviceType;
            long resId;
            boolean isTechOpsLogin;
            boolean isEmail;
            boolean isPaidClient;
            boolean emailVerified;
        }

    }

    public  static  class UserStateinfo{
        String userState;
        boolean validState;

    }


}
