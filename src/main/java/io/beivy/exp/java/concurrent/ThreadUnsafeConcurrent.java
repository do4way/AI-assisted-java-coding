package io.beivy.exp.java.concurrent;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadUnsafeConcurrent {

    private ConcurrentHashMap<String, Object> someHashmap = new ConcurrentHashMap<>();

    public void CheckAndInitial(String aKeyToCheck) {

        if (someHashmap.contains(aKeyToCheck)) {
            someHashmap.remove(aKeyToCheck);
        }

        someHashmap.put(aKeyToCheck, new Date());
    }

}
