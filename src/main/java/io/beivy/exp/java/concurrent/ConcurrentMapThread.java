package io.beivy.exp.java.concurrent;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapThread extends Thread{

    private ConcurrentHashMap<String, Object> someHashmap = new ConcurrentHashMap<>();
    private String aKeyToCheck;

    @Override
    public void run() {
        super.run();
        if (someHashmap.contains(aKeyToCheck)) {
            someHashmap.remove(aKeyToCheck);
        }

        someHashmap.put(aKeyToCheck, new Date());
    }

    public void setKeyToCheck(String key) {
        this.aKeyToCheck = key;
    }
}
