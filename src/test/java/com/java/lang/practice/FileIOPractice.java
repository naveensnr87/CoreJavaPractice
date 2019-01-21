package com.java.lang.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.junit.Test;

public class FileIOPractice {

	@Test
	public void readFileWithRelativePath() {
		URL url = getClass().getClassLoader().getResource("file1.txt");
		//File file = new File(url.getPath());
		File file = new File(
				"E:\\practice-projects\\core-java-projects\\core-java-practice\\src\\main\\resources\\file1.txt");
		System.out.println(file.getAbsolutePath());

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {

		}

		try (InputStream ip = getClass().getClassLoader().getResourceAsStream("file1.txt");
				BufferedReader reader = new BufferedReader(new InputStreamReader(ip))) {
			String line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void convertFileToInputStream() {
		URL url = getClass().getClassLoader().getResource("file1.txt");
		File file = new File(url.getPath());
		try {
			InputStream stream = new FileInputStream(file);
			System.out.println(stream.available());
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			InputStream ip = getClass().getClassLoader().getResourceAsStream("file1.txt");
			System.out.println(ip.available());
			ip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
