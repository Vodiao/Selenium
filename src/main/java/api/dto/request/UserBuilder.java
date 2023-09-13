package api.dto.request;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBuilder {

    Integer id;

    String username;

    String firstName;

    String lastName;

    String email;

    String password;

    String phone;

    String userStatus;



}
