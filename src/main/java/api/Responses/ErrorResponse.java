package api.Responses;

import lombok.Data;
@Data
public class ErrorResponse {

    Error error;

    @Data
    public static class Error{
        private int status;
        private String message;
        private int code;
    }
}
