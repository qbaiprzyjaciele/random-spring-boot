package io.github.qbaiprzyjaciele.tokenauthexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthProvider authProvider;

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.addFilterBefore(new AuthFilter(), BasicAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers("/secured/*").hasAuthority("USER");
    }

    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder){
        authenticationManagerBuilder.authenticationProvider(authProvider);
    }

}
