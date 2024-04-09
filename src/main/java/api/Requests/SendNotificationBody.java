package api.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendNotificationBody {
    String intentText;
    String callStatus;
    String receiverId;
    String senderMobileNumber;
    String callIntentId;
    String receiverIdType;
    String reuse;
    String cvDetailId;
    String callDuration;
    String systemId;
    String dialingTime;
    ExtraParam extraParams;
    @Data
    public static class ExtraParam{
        String jsKey;
        String versionCode;
    }



}
