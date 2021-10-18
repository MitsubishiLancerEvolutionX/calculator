package com.company;

public class Calculate {

    private String[] symbols;
    private int ind;
    public int a;
    private int b;
    private int c;
    private int d;
    private int[] massResult;

    public Calculate(String expression) {
        this.symbols = expression.split(" ");
        this.ind = 0;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public int[] calculate() {

        try {
            if (symbols.length > 3) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

        try {
            if (symbols.length < 3) {
                throw new Exception("Cтрока не является математической операцией либо вы пропустили пробел");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

        switch (symbols[ind]) {
            case "I" :
                symbols[ind] = "1";
                a++;
                break;
            case "II" :
                symbols[ind] = "2";
                a++;
                break;
            case "III" :
                symbols[ind] = "3";
                a++;
                break;
            case "IV" :
                symbols[ind] = "4";
                a++;
                break;
            case "V" :
                symbols[ind] = "5";
                a++;
                break;
            case "VI" :
                symbols[ind] = "6";
                a++;
                break;
            case "VII" :
                symbols[ind] = "7";
                a++;
                break;
            case "VIII" :
                symbols[ind] = "8";
                a++;
                break;
            case "IX" :
                symbols[ind] = "9";
                a++;
                break;
            case "X" :
                symbols[ind] = "10";
                a++;
                break;
            case "1" :
                symbols[ind] = "1";
                c++;
                break;
            case "2" :
                symbols[ind] = "2";
                c++;
                break;
            case "3" :
                symbols[ind] = "3";
                c++;
                break;
            case "4" :
                symbols[ind] = "4";
                c++;
                break;
            case "5" :
                symbols[ind] = "5";
                c++;
                break;
            case "6" :
                symbols[ind] = "6";
                c++;
                break;
            case "7" :
                symbols[ind] = "7";
                c++;
                break;
            case "8" :
                symbols[ind] = "8";
                c++;
                break;
            case "9" :
                symbols[ind] = "9";
                c++;
                break;
            case "10" :
                symbols[ind] = "10";
                c++;
                break;
        }

        int first = 0;
        try {
            if (c == 0 && a !=1) {
                throw new Exception("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
            }
            first = Integer.parseInt(symbols[ind++]);
        } catch (Exception ex) {
            System.out.println("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
            System.exit(0);
        }

        while (ind < symbols.length) {

            String operator = symbols[ind];

            try {
                if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                    throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                } else {
                    ind++;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.exit(0);
            }


            switch (symbols[ind]) {
                case "I" :
                    symbols[ind] = "1";
                    b++;
                    break;
                case "II" :
                    symbols[ind] = "2";
                    b++;
                    break;
                case "III" :
                    symbols[ind] = "3";
                    b++;
                    break;
                case "IV" :
                    symbols[ind] = "4";
                    b++;
                    break;
                case "V" :
                    symbols[ind] = "5";
                    b++;
                    break;
                case "VI" :
                    symbols[ind] = "6";
                    b++;
                    break;
                case "VII" :
                    symbols[ind] = "7";
                    b++;
                    break;
                case "VIII" :
                    symbols[ind] = "8";
                    b++;
                    break;
                case "IX" :
                    symbols[ind] = "9";
                    b++;
                    break;
                case "X" :
                    symbols[ind] = "10";
                    b++;
                    break;
                case "1" :
                    symbols[ind] = "1";
                    d++;
                    break;
                case "2" :
                    symbols[ind] = "2";
                    d++;
                    break;
                case "3" :
                    symbols[ind] = "3";
                    d++;
                    break;
                case "4" :
                    symbols[ind] = "4";
                    d++;
                    break;
                case "5" :
                    symbols[ind] = "5";
                    d++;
                    break;
                case "6" :
                    symbols[ind] = "6";
                    d++;
                    break;
                case "7" :
                    symbols[ind] = "7";
                    d++;
                    break;
                case "8" :
                    symbols[ind] = "8";
                    d++;
                    break;
                case "9" :
                    symbols[ind] = "9";
                    d++;
                    break;
                case "10" :
                    symbols[ind] = "10";
                    d++;
                    break;
            }

            try {
                if (a != b) {
                    throw new Exception("Используются одновременно разные системы счисления");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.exit(0);
            }

            int second = 0;
            try {
                if (d == 0 && b != 1) {
                    throw new Exception("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
                }
                second = Integer.parseInt(symbols[ind++]);
            } catch (Exception ex) {
                System.out.println("Калькулятор умеет работать только с арабскими и римскими целыми числами от 0 до 10");
                System.exit(0);
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

            try {
                if (a == 1 && b ==1 && first <= 0){
                    throw new Exception("В римской системе нет отрицательных чисел и нуля");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.exit(0);
            }
        }

        return new int[] {first, a};
    }
}
