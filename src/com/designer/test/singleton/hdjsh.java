package com.designer.test.singleton;

public class hdjsh {
    private static hdjsh ourInstance = new hdjsh();

    public static hdjsh getInstance() {
        return ourInstance;
    }

    private hdjsh() {
    }
}
