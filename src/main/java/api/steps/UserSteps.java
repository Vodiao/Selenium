package api.steps;

import api.config.BaseRequestSpecification;
import api.config.BaseResponseSpecification;
import api.config.Request;
import api.dto.UserBuilder;
import api.endpoints.CreateUser;
import api.endpoints.UserByUserName;
import io.restassured.response.ValidatableResponse;


import static api.utils.Utils.toJson;

public class UserSteps extends Request {

    BaseRequestSpecification baseRequest = new BaseRequestSpecification();
    BaseResponseSpecification baseResponse = new BaseResponseSpecification();



    public ValidatableResponse createUser(UserBuilder user){
        return  post(baseRequest.request(), toJson(user), CreateUser.CREATE_USER.getValue(), baseResponse.OK());

    }


    public ValidatableResponse getUserByUserName(UserBuilder user){
        String username = user.getUsername();  // Получаем имя пользователя из билдера
        return  get(baseRequest.request(), UserByUserName.GET_USER_BY_USER_NAME.getValue(), username, baseResponse.OK());
    }





}
