package builder;

import pageobject.LoginPage;

public class LoginPageBuilder {

    private String username;

    private String password;

    public LoginPageBuilder withUsername (String username){
        this.username = username;
        return this;
    }

    public LoginPageBuilder withPassword (String password){
        this.password = password;
        return this;
    }

    public LoginPage builder (){
        return new LoginPage()
                .inputLogin(username)
                .inputPassword(password);
    }

}
