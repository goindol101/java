package com.ktds.khs.test;

import java.io.File;

public class FileTest {

	public static void main(String[] args){
		
//		String folderPath = "D:\\language\\c";
		String folderPath = "D:\\language";
		
		// folderPath 경로를 읽어온다/
		File languagesFolder = new File(folderPath);
		
		// languagesFolder의 경로가 폴더(디렉토리)인지 파일인지 구분한다.
		if(languagesFolder.isDirectory()){
			System.out.println(languagesFolder.getAbsolutePath());// 절대경로를 얻어오는 것
			System.out.println(folderPath + "는 폴더(디렉토리)입니다.");
		}else{
			System.out.println(folderPath + "는 파일입니다.");
		}
		
		File javaFolder = new File(languagesFolder.getAbsolutePath() + File.separator + "java");
	
		if(javaFolder.isDirectory()){
			System.out.println(javaFolder.getAbsolutePath() + "는 폴더(디렉토리)입니다.");// 절대경로를 얻어오는 것
		}else{
			System.out.println(javaFolder + "는 파일입니다.");
		}
		
		//javaFolder 안에 있는 내용물들을 가져온다.
		String[] contents = javaFolder.list();
		for(String content : contents)
			System.out.println(content);
		
		
	}
	
}
