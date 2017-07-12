package com.javaex.problem01;

import java.util.*;

public class CalcApp {

    public static void main(String[] args) {
    	String operator;
    	Scanner sc = new Scanner(System.in);
    	boolean c= true;
    	while(c) {
    		System.out.print(">> ");
    		operator = sc.nextLine();
    		if(operator.equals("/q")) {
    			System.out.println("종료합니다.");
    			c=false;
    		}
    		String[] cal =operator.split(" ");
    		int a = Integer.parseInt(cal[0]);
    		int b = Integer.parseInt(cal[2]);
    		if("+".equals(cal[1])){
    			Add add = new Add();
    			System.out.println(add.calculate(a, b));
    		} else if("-".equals(cal[1])) {
    			Sub sub = new Sub();
    			System.out.println(sub.calculate(a, b));
    		} else if("*".equals(cal[1])) {
    			Mul mul = new Mul();
    			System.out.println(mul.calculate(a, b));
    		} else if("/".equals(cal[1])) {
    			Div div = new Div();
    			System.out.println(div.calculate(a, b));
    		} else {
    			System.out.println("알 수 없는 연산입니다.");
    		}
    	}
    }
}
