package com.company;

public class Calculate {

    private String[] symbols;
    private int ind;
    public int a;
    private int b;

    public Calculate(String expression) {
        this.symbols = expression.split(" ");
        this.ind = 0;
        this.a = 0;
        this.b = 0;
    }

    public int[] calculate() throws Exception {

            if (symbols.length > 3) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }

            if (symbols.length < 3) {
                throw new Exception("Cтрока не является математической операцией либо вы пропустили пробел");
            }

        Convert1 convert1 = new Convert1(symbols[ind++]);
        int first;
        first = Integer.parseInt(convert1.convert1());
        a++;
        if (first > 10) {
            throw new Exception ("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
        }
        if (first == 0) {
            a--;
            try {
                first = Integer.parseInt(symbols[ind - 1]);
            } catch (NumberFormatException e) {
                throw new Exception ("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
            }
            if (first < 0 || first > 10) {
                throw new Exception ("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
            }
        }

        while (ind < symbols.length) {

            String operator = symbols[ind];

                if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                    throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                } else {
                    ind++;
                }

            Convert1 convert2 = new Convert1(symbols[ind++]);
            int second;
            second = Integer.parseInt(convert2.convert1());
            b++;
            if (second > 10) {
                throw new Exception ("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
            }
            if (second == 0) {
                b--;
                try {
                    second = Integer.parseInt(symbols[ind - 1]);
                } catch (NumberFormatException e) {
                    throw new Exception ("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
                }
                if (second < 0 || second > 10) {
                    throw new Exception ("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
                }
            }

            if (a != b) {
                throw new Exception("Используются одновременно разные системы счисления");
            }

            if (operator.equals("+")) {
                first += second;
            } else if (operator.equals("-")) {
                first -= second;
            } else if (operator.equals("*")) {
                first *= second;
            } else {
                first /= second;
            }

                if (a == 1 && b ==1 && first <= 0) {
                    throw new Exception("В римской системе нет отрицательных чисел и нуля");
                }
        }
        return new int[] {first, a};
    }
}
