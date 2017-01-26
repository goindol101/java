package com.ktds.khs.make;

import java.io.File;
import java.io.IOException;

public class MakeFile {

	public void start() {

		String filePath = "D:\\makeFile.txt";
		// shift + ctrl + o -> 자동 import
		File textFile = new File(filePath);

		try {
			if (!textFile.exists()) {
				// 파일을 실제 저장소에 생성한다.
				textFile.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new MakeFile().start();
	}

}
