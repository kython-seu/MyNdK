package com.kason_zhang.myndk;

/**
 * Created by kason_zhang on 9/7/2016.
 */
public class MyNDK {
    public static native int add(int a, int b);
    static {
        System.loadLibrary("NDKDEMO");
    }
}
