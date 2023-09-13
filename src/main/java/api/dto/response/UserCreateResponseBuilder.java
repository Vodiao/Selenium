package api.dto.response;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor


public class UserCreateResponseBuilder {
    
    Integer code;

    String type;

    String message;
}
