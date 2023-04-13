package com.develhope.RevertString.services;

import org.springframework.stereotype.Service;

@Service
public class RevertStringService {


    public String revertStringName(String name){
       StringBuilder sb=new StringBuilder(name);
       String s= String.valueOf(sb.reverse());

        return s;
    }
}
