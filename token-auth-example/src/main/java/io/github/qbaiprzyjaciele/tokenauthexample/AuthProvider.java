package io.github.qbaiprzyjaciele.tokenauthexample;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthProvider implements AuthenticationProvider {


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        System.out.println("AuthProvider.authenticate -  do nothing");
        return authentication;
    }

    @Override
    public boolean supports(Class<?> authClass) {
        return TokenAuthentication.class.isAssignableFrom(authClass);
    }
}
