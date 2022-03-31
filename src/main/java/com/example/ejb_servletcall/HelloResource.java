package com.example.ejb_servletcall;
import javax.ejb.Remote;

@Remote
public interface HelloResource {
    public String hello();
}