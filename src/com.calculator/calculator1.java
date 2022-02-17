package com.calculator;

class calculator1 {
    public static void main(String[] args) {
        int val1 = 0;
        int val2 = 0;
        String ope;

        if (args.length != 3) {
            System.out.println("Usage: java calculator 数値 演算子 数値");
            System.out.println("演算子は kake waru tasu hiku の4つです");
            System.exit(0);
        }
        val1 = Integer.parseInt(args[0]);
        val2 = Integer.parseInt(args[2]);
        ope = args[1];

        System.out.println("入力された式は" + val1 + " " + ope + " " + val2 + " です");
    }
}