package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.entities.MyUser;
import com.bankapp.model.repositories.AccountRepository;
import com.bankapp.model.repositories.AccountTransactionRepository;
import com.bankapp.model.repositories.CustomerRepository;
import com.bankapp.model.repositories.TransactionLogRepository;
import com.bankapp.model.repositories.UserRepository;
import com.bankapp.services.AccountService;

@EnableTransactionManagement
@SpringBootApplication
public class BankappSpringbootApplication implements CommandLineRunner {
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TransactionLogRepository transactionLogRepository;

	public static void main(String[] args) {
		SpringApplication.run(BankappSpringbootApplication.class, args);
	}
	@Autowired
	private AccountService accountService;
	

	@Override
	public void run(String... args) throws Exception {
		
		//accountService.deposit(2L, 100);
		
		
	
		/*Account account=accountRepository.findById(1L).orElseThrow(RuntimeException::new);
		accountRepository.delete(account);*/
		
		/*Customer customer=new Customer("rithu", "rithu@gmail.com", "9876543210", "btm", "bangalore", "karnataka",678321);
		Customer customer2=new Customer("rama", "rama@gmail.com", "8765432109", "nehrustreet", "noida", "UP",654987);
		Customer customer3=new Customer("sudharsan", "sudharsan@gmail.com","7654321098", "thillainagar", "trichy", "Tamilnadu",600245);*/
		
		/*Account account=new Account(123L,"rithu",2000.0,false);
		Account account2=new Account(234L,"rama",1000.0, false);
		Account account3=new Account(456L,"sudharsan",2500.0, false);
		
		/*customer.setAccount(account);
		customer2.setAccount(account2);
		customer3.setAccount(account3);
		
		accountRepository.save(account);
		accountRepository.save(account2);
		accountRepository.save(account3);*/
		
		/*MyUser user1=new MyUser("rama", "rama123", "rama@gmail.com",  new String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_CUSTOMER"}, true);

		MyUser user2=new MyUser("rithu", "rithu123", "rithu@gmail.com",new String[]{"ROLE_MGR","ROLE_CUSTOMER"}, true);
		
		MyUser user3=new MyUser("sudharsan", "sudhar123", "sudharsan@gmail.com",  new String[]{"ROLE_CUSTOMER"}, true);

		MyUser user4=new MyUser("lakshmi", "lakshmi", "lakshmi@gmail.com",new String[]{"ROLE_CUSTOMER"}, true);
		
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);
		userRepository.save(user4);*/
		
		
	}

}
