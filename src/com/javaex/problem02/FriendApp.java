package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        List<Friend> friendList = new ArrayList<Friend>();
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            String[] data = line.split(" ");
            
            Friend friend = new Friend();
            friend.setName(data[0]);
            friend.setHp(data[1]);
            friend.setSchool(data[2]);

            // 배열에 추가하기
            friendList.add(friend);
        }

        // 친구정보 출력
        for (int i = 0; i < friendList.size(); i++) {
            friendList.get(i).showInfo();
        }

        sc.close();
    }

}
