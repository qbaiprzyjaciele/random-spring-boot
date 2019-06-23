package io.github.qbaiprzyjaciele.tokenauthexample;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;
import java.util.Collection;

public class TokenAuthentication implements Authentication {

    private boolean isAuth = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(() -> "USER");
    }

    @Override
    public Object getCredentials() {
        return new TokenCredentials("Andrzej.Smieszek");
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return "Andrzej";
    }

    @Override
    public boolean isAuthenticated() {
        return isAuth;
    }

    @Override
    public void setAuthenticated(boolean auth) throws IllegalArgumentException {
        this.isAuth = auth;
    }

    @Override
    public String getName() {
        return "Andrzej Śmieszek";
    }

    private class TokenCredentials {
        private final String cred;

        public TokenCredentials(String cred) {
            this.cred = cred;
        }

        public String getCred() {
            return cred;
        }

        @Override
        public String toString() {
            return "TokenCredentials{" +
                    "cred='" + cred + '\'' +
                    '}';
        }
    }
}
