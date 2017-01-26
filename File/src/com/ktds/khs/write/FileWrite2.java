package com.ktds.khs.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite2 {

	public void start() {

		String filePath = "D:\\makeFile.txt";

		try {
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(filePath,true)));
			
			// 파일에 데이터를 작성한다.
			printWriter.println("파일에.. 작성합니다.."); 
			printWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new FileWrite2().start();
	}

}
