package io.github.qbaiprzyjaciele.tokenauthexample;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String authToken = httpServletRequest.getHeader("Authorization");
        System.out.println("AuthFilter.doFilterInternal");
        SecurityContextHolder.getContext().setAuthentication(new TokenAuthentication());
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
