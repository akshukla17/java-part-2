package com.interview.exception;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class TestException3 {

	//JAXBException is checked exception we must handle it,
		// NPE is unchecked exception, so it not mandatory to handle it.
	public static void main(String[] args) {
		try {
			foo();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(JAXBException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void bar(){
		
	}
	
	public static void foo() throws IOException, JAXBException{
		
	}
}
 class TestException4 {

	public void start() throws IOException{		
	}
	
	public void foo() throws NullPointerException{
		
	}
}

class TestException5 extends TestException4{
	
	public void start() {
	}
	
	public void foo() throws RuntimeException{
		
	}
}
