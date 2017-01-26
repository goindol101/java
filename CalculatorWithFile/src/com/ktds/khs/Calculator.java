package com.ktds.khs;

import com.ktds.khs.helper.*;

public class Calculator {

	public void start() {
		int res = 10 + 70;
		String msg = String.format("%d + %d = %d", 10, 70, res);
		System.out.println(msg);
		
		FileWriteHelper fileWriteHelper = new FileWriteHelper();
		fileWriteHelper.log(msg);

	}

	public static void main(String[] args) {
		new Calculator().start();
	}

}
