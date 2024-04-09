package api.Responses;

import lombok.Data;

@Data
public class SendNotificationResponse {
     private ErrorResponse.Error errorResponse = new ErrorResponse.Error();
     public ErrorResponse.Error error = errorResponse;


}
