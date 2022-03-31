package com.example.ejb_servletcall;
import javax.ejb.Stateless;

@Stateless
public class HelloResourceStatelessBean implements HelloResource {
    public String hello() {
        return "Hello, World!";
    }
}