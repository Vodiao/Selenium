package api.endpoints;

public enum CreateUser {

    CREATE_USER("/user");


    private final String endpoint;

    CreateUser(String endpoint){
        this.endpoint = endpoint;
    }

    public String getValue(){
        return endpoint;
    }

}
