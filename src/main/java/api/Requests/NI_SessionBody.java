package api.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NI_SessionBody {
    String username;
    String password;
    boolean isLoginByEmail;
}
