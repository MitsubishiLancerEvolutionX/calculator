package com.company;

public class Convert {

    StringBuffer resultS = new StringBuffer();

    public enum ArabicRoman {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        int value;
        ArabicRoman (int value) {
            this.value = value;
        }

    }
    ArabicRoman[] en = ArabicRoman.values();

    public StringBuffer convert (int result) {
        for (int i = 0; i < en.length; i++) {
            while (result >= en[i].value) {
                result -= en[i].value;
                resultS.append(en[i]);
            }
        }

        return resultS;
    }
}
