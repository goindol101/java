package com.ktds.khs.make;

import java.io.File;

public class MakeDirectory {

	public void start() {

		String directoryPath = "D:\\game";

		// 폴더만들기
		File game = new File(directoryPath);
		
		// 폴더를 생성한다.
		if (!game.exists()) { // 존재하지 않는다면 만들어라!
			game.mkdir();// 위에 path에서 가장 마지막 폴더만 만든다.
		}

	}

	public static void main(String[] args) {

		new MakeDirectory().start();

	}

}
