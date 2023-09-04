package api.endpoints;

public enum UserByUserName {

     GET_USER_BY_USER_NAME  ("/user/");

     private final String endpoints;

     UserByUserName(String endpoints){
          this.endpoints = endpoints;
     }

     public String getValue (){
          return  endpoints;
     }
}
