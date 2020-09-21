package com.xc.xcmcs.utils;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Data
@Component
public class MD5Hellper {
    public static String md5(String password){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            // System.out.println(new BigInteger(1, md.digest()).toString(16));
            return new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        String s = MD5Hellper.md5("123456");
        System.out.println(s);
    }
}