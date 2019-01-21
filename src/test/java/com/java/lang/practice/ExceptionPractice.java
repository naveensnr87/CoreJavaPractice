package com.java.lang.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.junit.Test;

public class ExceptionPractice {

	@Test
	public void createUncheckedException() {
		RuntimeException rte = new RuntimeException();
		System.out.println(rte);

		RuntimeException rte1 = new RuntimeException("Run Time Exception");
		System.out.println(rte1);

		rte1.printStackTrace();
	}

	@Test
	public void createCheckedException() {
		Exception e = new Exception();
		Exception e1 = new Exception("Checked Exception");
		System.out.println(e);
		System.out.println(e1);
		e1.printStackTrace();
	}

	@Test
	public void handleException() {
		try {
			throwCheckedException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//throwUncheckedException();

		try {
			divideByZero();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void throwCheckedException() throws Exception {
		Exception e = new Exception();
		throw e;
	}

	private void throwUncheckedException() {
		RuntimeException rte = new RuntimeException();
		throw rte;
	}

	private void divideByZero() {
		int i = 10 / 0;
	}

	@Test
	public void closeFileReader() {
		URL url = ExceptionPractice.class.getClassLoader().getResource("file1.txt");
		File file = new File(url.getPath());

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = "";
			while (null != (line = bufferedReader.readLine())) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != fileReader)
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			if (null != bufferedReader)
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	@Test
	public void closeFileUsingTry() {
		URL url = ExceptionPractice.class.getClassLoader().getResource("file1.txt");
		File file = new File(url.getPath());
		//Only place a resources which will implements Closable or AutoClosable Interfaces
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {

			String line = "";
			while (null != (line = bufferedReader.readLine())) {
				System.out.println(line);
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void customExceptionExmp() {
		try {
			int i = 1 / 0;
			throw new CustomException("Custom Exception Occured");
		} catch (CustomException e) {
			System.out.println("i am in catch");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("i am in catch");
			e.printStackTrace();
		} /*catch (CustomException | ArithmeticException e) {
			System.out.println("i am in catch");
			e.printStackTrace();
			}*/ /*catch (ArithmeticException e1) {
					System.out.println("I am arithmaticEXP catch block");
					e1.printStackTrace();
					
					}*/
	}
}
