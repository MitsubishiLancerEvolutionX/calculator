package com.company;

public class Convert1 {

    private String[] roman;

    public Convert1(String symbols) {
        this.roman = symbols.split("");
    }

    String resultSS = new String();

    private int[] num1 = new int[] {1000,500,100,50,10,5,1};
    private String[] num2 = new String[] {"M","D","C","L","X","V","I"};

    public String convert1 () {

        int[] res = new int[roman.length];
        int n = 0;
        int k = 0;

        for (int i = 0; i < roman.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (roman[i].equals(num2[j])) {
                    res[i] = num1[j];
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
