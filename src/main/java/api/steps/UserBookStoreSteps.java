package api.steps;

import api.config.BaseRequestSpecification;
import api.config.BaseResponseSpecification;
import api.config.Request;
import api.dto.request.AddBookBuilder;
import api.dto.request.CollectionOfIsbns;
import api.dto.response.UserBookStoreResponseBuilder;

import api.endpoints.Endpoints;
import io.restassured.response.ValidatableResponse;

import java.util.List;

import static api.utils.Utils.fromJson;
import static api.utils.Utils.toJson;

public class UserBookStoreSteps extends Request {
    BaseRequestSpecification baseRequest = new BaseRequestSpecification();
    BaseResponseSpecification baseResponse = new BaseResponseSpecification();

    public UserBookStoreResponseBuilder getUser(){
        var response = get(baseRequest.requestWithToken(), Endpoints.USER_WITH_PARAM.getValue(),
                "1066798c-6b7f-416b-9eb7-0baf4aa39f6d", baseResponse.OK()).extract().body().asString();

        return fromJson(response, UserBookStoreResponseBuilder.class);
    }

    public ValidatableResponse addBook(AddBookBuilder userAndBook) {
        return post(baseRequest.addBook(), toJson(userAndBook), Endpoints.BOOKS.getValue(), baseResponse.CREATED());
    }





}
