package api.config;


import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;

public class BaseResponseSpecification {


  public ResponseSpecification OK(){
      return new ResponseSpecBuilder()
              .expectStatusCode(HttpStatus.SC_OK)
              .build();
  }

  public ResponseSpecification responseNotFound(){
      return new ResponseSpecBuilder()
              .expectStatusCode(HttpStatus.SC_NOT_FOUND)
              .build();
  }

  public ResponseSpecification responseUnauthorized(){
      return new ResponseSpecBuilder()
              .expectStatusCode(HttpStatus.SC_UNAUTHORIZED)
              .build();
  }





}