package api.endpoints;

public enum Schemas {
    CREATE_USER_SCHEMA("user/CreateUserShema.json"),
    GET_USER_SCHEMA("user/GetUserSchema.json"),

    PUT_USER_SCHEMA("user/PutUserSchema.json");


    private final String schema;

    Schemas(String schema) {
        this.schema = schema;
    }

    public String getValue(){
        return schema;
    }
}
