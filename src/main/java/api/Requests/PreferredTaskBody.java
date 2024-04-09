package api.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreferredTaskBody {
    long preferredStartTime;
    long preferredEndTime;
    String preferredTimeText;
    ExtraParams extraParams;

    @Data
    public static class ExtraParams{
        String jsKey;
        String recruiterId;
        String companyId;

    }

}
