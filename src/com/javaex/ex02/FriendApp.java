package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		List<Friend> fList = new ArrayList<Friend>();

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요.");

		String name, hp, school;

		for (int i = 0; i < 3; i++) {
			String data = sc.nextLine();

			name = data.substring(0, 3);
			hp = data.substring(4, 17);
			school = data.substring(18);

			fList.add(new Friend(name, hp, school));

		}

		for (Friend f : fList) {
			f.showInfo();
		}

		sc.close();

	}

}
