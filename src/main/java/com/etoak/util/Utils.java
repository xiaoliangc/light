package com.etoak.util;

import java.util.concurrent.TimeUnit;

/**
 * Utils
 * Created by xiao1 on 2017/8/2.
 */
public class Utils {

    public static void sleep(long milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void separator() {
        System.out.println("----------------------------");
        System.out.println("****************************");
        System.out.println("----------------------------");
    }
}
