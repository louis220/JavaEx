package com.bit.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "Samsung";
		camera.price = 400000;
		
//		System.out.println("Camera:" + camera);
		System.out.printf("Camera: %s, %d원%n",
				camera.name, camera.price);
		
		Goods notebook = new Goods();
		notebook.name = "LG 그램";
		notebook.price = 900000;
		System.out.printf("notebook: %s, %d원%n",
				notebook.name, notebook.price);
	}

}
