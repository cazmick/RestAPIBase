package api.Responses;

import lombok.Data;

@Data
public class SessionResponse {
    private UserInfo userInfo;
    public static class UserInfo {
        private String companyName;
        private String userName;
        private String userId;
        private String companyId;
        private String superUser;
        private String status;
        private String rights;
        private String roles;
    }
}
