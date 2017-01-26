package com.ktds.khs.read;

import java.io.BufferedWriter;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteHelper {

	private final static String LOG_FOLDER_PATH = "D:\\logs";
	private final static String LOG_FILE_PATH = LOG_FOLDER_PATH + "\\Calculator1.log";

	public static void log(String msg) {

		// 1. D:\\logs 폴더를 생성한다.
		makeLogsFolder();

		// 2. D:\\logs\\Calculator.log 파일을 생성한다.
		makeCalculatorLogsFile();

		// 3. D:\\logs\\Calculator.log 파일에 message를 기록한다.
		writeLog(msg);
	}

	private static void makeLogsFolder() {
		File logsFolder = new File(LOG_FOLDER_PATH);

		if (!logsFolder.exists()) {
			logsFolder.mkdirs();
		}
	}

	private static void makeCalculatorLogsFile() {
		File logFile = new File(LOG_FILE_PATH);

		if (!logFile.exists() || !logFile.isFile()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void writeLog(String msg) {
		
		try {
			FileWriter fw = new FileWriter(LOG_FILE_PATH, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			
			out.println(msg);
			
			out.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
