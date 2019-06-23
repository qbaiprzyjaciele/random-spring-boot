package io.github.qbaiprzyjaciele.tokenauthexample;

import java.util.Set;

public class Token {

    private String userName;
    private String userEmail;
    private Set<String> userAuth;
    private String userRegion;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<String> getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(Set<String> userAuth) {
        this.userAuth = userAuth;
    }

    public String getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
