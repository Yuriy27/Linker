package com.github.yuriy27.util;

import java.util.Random;

public class CutUtil {

    private static final int CODE_SIZE = 7;

    private static final String LETTERS_SET = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";

    private static volatile CutUtil instance;

    private CutUtil() {}

    public static CutUtil getInstance() {
        if (instance == null) {
            synchronized (CutUtil.class) {
                if (instance == null) {
                    instance = new CutUtil();
                }
            }
        }
        return instance;
    }

    public String getRandomString() {
        int size = LETTERS_SET.length();
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < CODE_SIZE; i++) {
            int ind = Math.abs(random.nextInt()) % size;
            str.append(LETTERS_SET.charAt(ind));
        }

        return str.toString();
    }

}
