package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javaex.problem02.Friend;

public class GoodsApp {

    public static void main(String[] args) {

        List<Goods> GoodsList = new ArrayList<Goods>();
        Scanner sc = new Scanner(System.in);
        int all_count = 0;

        System.out.println("상품 3개를 입력해 주세요");

        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            String[] data = line.split(" ");
            
            Goods goods = new Goods();
            goods.setName(data[0]);
            goods.setPrice(Integer.parseInt(data[1]));
            goods.setCount(Integer.parseInt(data[2]));
            all_count+=Integer.parseInt(data[2]);
            // 배열에 추가하기
            GoodsList.add(goods);
        }

        // 친구정보 출력
        for (int i = 0; i < GoodsList.size(); i++) {
        	GoodsList.get(i).showInfo();
        }
        System.out.println("모든 상품의 갯수는 "+all_count+"입니다.");

        sc.close();

       
    }

}
