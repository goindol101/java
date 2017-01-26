package com.ktds.khs.make;

import java.io.File;

public class MakeDirectories {

	public void start() {

		String directoryPath = "D:\\game\\mobile\\poketmon\\go";
		// 폴더만들기
		File game = new File(directoryPath);
		
		if (!game.exists()) { // 존재하지 않는다면 만들어라!
			game.mkdirs(); // 한번에 여러개의 폴더를 다 만든다.
		}

	}

	public static void main(String[] args) {

		new MakeDirectories().start();

	}

}
