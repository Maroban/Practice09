package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		List<Goods> gList = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);

		System.out.println("상품을 입력해주세요. (종료 q)");

		
		boolean flag = true;

		while (flag) {
			String data = sc.nextLine();

			if (data.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("====================");
				
				for (Goods g01 : gList) {
					g01.showInfo();
				}
				System.out.println("모든 상품의 갯수는 " + Goods.sum()+"개 입니다.");
			} else {
				String[] gArray = data.split(",");

				Integer price = Integer.parseInt(gArray[1]);
				Integer count = Integer.parseInt(gArray[2]);

				Goods g02 = new Goods(gArray[0], price, count);

				gList.add(g02);
				
			}

		}

		sc.close();

	}

}
