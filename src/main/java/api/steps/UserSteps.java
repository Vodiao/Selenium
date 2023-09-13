package api.steps;

import api.config.BaseRequestSpecification;
import api.config.BaseResponseSpecification;
import api.config.Request;
import api.dto.request.UserBuilder;
import api.dto.response.DeleteUserResponseBuilder;
import api.dto.response.GetDeletedUserBuilder;
import api.dto.response.GetUserResponseBuilder;
import api.dto.response.UserCreateResponseBuilder;
//import api.endpoints.CreateUser;
import api.endpoints.Endpoints;
//import api.endpoints.UserByUserName;
import api.endpoints.Schemas;
import api.utils.Utils;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


import static api.utils.Utils.toJson;
import static java.nio.file.Files.delete;

public class UserSteps extends Request {

    BaseRequestSpecification baseRequest = new BaseRequestSpecification();
    BaseResponseSpecification baseResponse = new BaseResponseSpecification();


//    public ValidatableResponse createUser(UserBuilder user) {
//        return post(baseRequest.request(), toJson(user), Endpoints.CREATE_USER.getValue(), baseResponse.OK());
//
//    }
//
//    public UserCreateResponseBuilder createUserResponse(UserBuilder user) {
//        var response = post(baseRequest.request(), toJson(user), Endpoints.CREATE_USER.getValue(), baseResponse.OK(),
//                Schemas.CREATE_USER_SCHEMA.getValue())
//                .extract()
//                .body()
//                .asString();
//
//        return Utils.fromJson(response, UserCreateResponseBuilder.class);
//
//    }

    public UserCreateResponseBuilder createUser(UserBuilder user) {

        var response = post(baseRequest.request(), toJson(user), Endpoints.CREATE_USER.getValue(), baseResponse.OK(),
                Schemas.CREATE_USER_SCHEMA.getValue())
                .extract()
                .body()
                .asString();

        return Utils.fromJson(response, UserCreateResponseBuilder.class);
    }


    public GetUserResponseBuilder getUser(String username) {

        var response = get(baseRequest.request(), Endpoints.USER_WITH_PARAM.getValue(), username, baseResponse.OK(),
                Schemas.GET_USER_SCHEMA.getValue())
                .extract()
                .body()
                .asString();
        return Utils.fromJson(response, GetUserResponseBuilder.class);
    }


    public UserCreateResponseBuilder putUser(UserBuilder user) {
        var response = put(baseRequest.request(), toJson(user), Endpoints.USER_WITH_PARAM.getValue(),
                user.getUsername(), baseResponse.OK(), Schemas.PUT_USER_SCHEMA.getValue())
                .extract()
                .body()
                .asString();

        return Utils.fromJson(response, UserCreateResponseBuilder.class);
    }


    public DeleteUserResponseBuilder deleteUser(UserBuilder user) {
        var response = delete(baseRequest.request(), Endpoints.USER_WITH_PARAM.getValue(), user.getUsername(),
                baseResponse.OK())
                .extract()
                .body()
                .asString();
        return Utils.fromJson(response, DeleteUserResponseBuilder.class);
    }


    public GetDeletedUserBuilder getNFUser(String username) {

        var response = get(baseRequest.request(), Endpoints.USER_WITH_PARAM.getValue(), username,
                baseResponse.NotFound())
                .extract()
                .body()
                .asString();
        return Utils.fromJson(response, GetDeletedUserBuilder.class);
    }


}
