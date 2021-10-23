package com.company;

public class Convert1 {

    private String[] roman;

    public Convert1(String symbols) {
        this.roman = symbols.split("");
    }

    String resultSS = new String();

    public enum ArabicRoman1 {
        M(1000),
        D(500),
        C(100),
        L(50),
        X(10),
        V(5),
        I(1);

        int value;
        ArabicRoman1 (int value) {
            this.value = value;
        }
    }

    ArabicRoman1[] en = ArabicRoman1.values();

    public String convert1 () {

        int[] res = new int[roman.length];
        int n = 0;
        int k = 0;

        for (int i = 0; i < roman.length; i++) {
            for (ArabicRoman1 obj : en) {
                if (roman[i].equals(obj.name())) {
                    res[i] = obj.value;
                }
            }
        }


        for (int i = 0; i < res.length - 1; i++) {
            if (res[i+1] > res[i]) {
                n += res[i];
            }
        }

        for (int i = 0; i < res.length; i++) {
            k += res[i];
        }

        int sum = k - (2 * n);

        resultSS = Integer.toString(sum);

        return resultSS;
    }
}
