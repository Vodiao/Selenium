package api;

import api.dto.UserBuilder;
import api.steps.UserSteps;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserTest {

    UserSteps userSteps = new UserSteps();

    private final UserBuilder user = UserBuilder.builder()
            .id(0)
            .username("user1")
            .build();

    @Test
    public void shouldBeCreateUser() {
        userSteps.createUser(user);

    }

    @Test
    public void shouldBeGetUserAndUsername() {
        var response = userSteps.getUserByUserName(user).extract().path("username");

        assertThat(response)
                .as("Username doesn't match")
                .isEqualTo(user.getUsername());
    }


}
