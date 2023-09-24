package com.example;

public class email {
    
    public static void main(String[] args) {
        
        sender p = new sender();
		
		boolean res=p.sendEmail("vikasdhiman0635@gmail.com", "vikastester000@outlook.com", "Hello from Vikas", "Hi How are you");

		if(res)
		{
			System.out.println("mail send ");
		}
		else {
			System.out.println("error");
		}
    }

}
