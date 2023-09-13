package api;

import api.dto.request.UserBuilder;
import api.steps.UserSteps;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserTest {

    UserSteps userSteps = new UserSteps();

    private final UserBuilder user = UserBuilder.builder()
            .id(0)
            .username("Mateusz")
            .build();

    private final UserBuilder user2 = UserBuilder.builder()
            .id(0)
            .username("Magda")
            .lastName("Kuj")
            .build();

    @Test
    void shouldBeCreateUser() {
        userSteps.createUser(user);
        var username = userSteps.getUser(user.getUsername());

        assertThat(username.getUsername()).as("Username not found")
                .isEqualTo(user.getUsername());

        userSteps.putUser(user2);
        var username2 = userSteps.getUser(user2.getUsername());
        assertThat(username2.getUsername())
                .as("Username not found")
                .isEqualTo(user2.getUsername());

    }

    @Test
    void shouldBeCreateUser1() {
        var response = userSteps.createUser(UserBuilder.builder()
                .id(0)
                .username("Slava")
                .build());

        assertThat(response.getCode()).as("wrong status")
                .isEqualTo(200);

    }


    @Test
    void userShouldBeDeleted() {
        userSteps.createUser(user);
        var username = userSteps.getUser(user.getUsername());

        assertThat(username.getUsername())
                .as("User name not equals")
                .isEqualTo(user.getUsername());

        userSteps.putUser(user2);
        var username2 = userSteps.getUser(user2.getUsername());

        assertThat(username2.getUsername())
                .as("Username not equals")
                .isEqualTo(user2.getUsername());

        var response = userSteps.deleteUser(user2);

        assertThat(response.getCode())
                .as("User not deleted")
                .isEqualTo(200);

        var userNF = userSteps.getNFUser(user2.getUsername());
        assertThat(userNF.getMessage())
                .as("User not deleted")
                .isEqualTo("User not found");

    }


}
