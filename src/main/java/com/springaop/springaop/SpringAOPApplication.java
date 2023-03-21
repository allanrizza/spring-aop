package com.springaop.springaop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAOPApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAOPApplication.class, args);
		SpringAOPApplication app = context.getBean(SpringAOPApplication.class);
		app.accountTransfeer();
	}

	public void accountTransfeer() {
		System.out.println("Starting application...");

		Account account = new Account();
		account.setAccountNumber("1");
		account.setAccountHolderName("ALlan");
		account.setBalance(1000.0);

		Account account2 = new Account();
		account.setAccountNumber("2");
		account.setAccountHolderName("Kim");
		account.setBalance(1000.0);

		AccountService accountService = new AccountService();
		accountService.transfer(account, account2, 500.0);

		System.out.println("Application finished.");
	}
}
