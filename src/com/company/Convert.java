package com.company;

public class Convert {


    StringBuffer resultS = new StringBuffer();

    private int[] num1 = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private String[] num2 = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public StringBuffer convert (int result) {

        for (int i = 0; i < num1.length; i++) {

            while (result >= num1[i]) {
                result -= num1[i];
                resultS.append(num2[i]);
            }
        }

        return resultS;
    }
}
