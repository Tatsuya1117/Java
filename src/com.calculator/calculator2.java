package com.calculator;

class calculator2 {
    public static void main(String[] args) {
        int val1 = 0;
        int val2 = 0;
        String ope;

        if (args.length != 3) {
            System.out.println("Usage: java calculator 数値 演算子 数値");
            System.out.println("演算子は kake waru tasu hiku の4つです");
            System.exit(0);  // プログラムを終了する
        }
        val1 = Integer.parseInt(args[0]);
        val2 = Integer.parseInt(args[2]);
        ope = args[1];
        
        boolean errFlag = true;
        
        if(ope.equals("kake")) {
        	errFlag = false;
        }
        
        if(ope.equals("waru")) {
        	errFlag = false;
        }
        
        if(ope.equals("tasu")) {
        	errFlag = false;
        }
        
        if(ope.equals("hiku")) {
        	errFlag = false;
        }
        // 拡張for文で回したい……
        String equal[] = {"kake", "waru", "tasu", "hiku"};
        for(String equals: equal) {
        	if(!ope.equals(equal)) {
        		errFlag = true;
        		System.out.println(equal);
        	}
        }
        
        
        if(errFlag == true) {
        	System.out.println("");
        	System.out.println("演算子は kake waru tasu hiku の4つです");
            System.exit(0);  /* プログラムを終了する */
        }
        

        System.out.println("入力された式は" + val1 + " " + ope + " " + val2 + " です");
        
    }
}