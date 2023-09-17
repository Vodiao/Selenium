package api.config;

import api.dto.request.UserRequestBuilder;
import api.endpoints.Endpoints;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static api.utils.Utils.getPropertyFromFile;
import static api.utils.Utils.toJson;
import static java.lang.System.getProperty;

public class BaseRequestSpecification {

    private final String APPLICATION_JSON = "application/json";
    private final String CONTENT_TYPE = "Content-type";
    private final String url = (String) getPropertyFromFile("url");

    private final String bookAccURL = (String) getPropertyFromFile("url_Account");
    private final String addBookUrl = (String) getPropertyFromFile ("url_BookStore");




    private final Request request = new Request();

    private final BaseResponseSpecification response = new BaseResponseSpecification();


    public String getToken(){
        return request.post(requestBook(), toJson(new UserRequestBuilder("vadim","Vadim21!")), Endpoints.GET_TOKEN.getValue(),
                response.OK()).extract().body().path("token");
    }



    public RequestSpecification request() {

        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setBasePath("v2")
                .addHeader(CONTENT_TYPE, APPLICATION_JSON)
                .build();

    }

    public RequestSpecification requestBook() {

        return new RequestSpecBuilder()
                .setBaseUri(bookAccURL)
                .setBasePath("v1")
                .addHeader(CONTENT_TYPE, APPLICATION_JSON)
                .build();

    }

    public RequestSpecification requestWithToken() {

        return new RequestSpecBuilder()
                .setBaseUri(bookAccURL)
                .setBasePath("v1")
                .addHeader(CONTENT_TYPE, APPLICATION_JSON)
                .addHeader("Authorization", "Bearer " + getToken())
                .build();

    }

    public RequestSpecification addBook() {
        return  new RequestSpecBuilder()
                .setBaseUri(addBookUrl)
                .setBasePath("v1")
                .addHeader(CONTENT_TYPE, APPLICATION_JSON)
                .addHeader("Authorization", "Bearer " + getToken())
                .build();
    }

}
