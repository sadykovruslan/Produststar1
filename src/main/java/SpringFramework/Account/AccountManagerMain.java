package SpringFramework.Account;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountManagerMain {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(AccountManagerConfig.class);

        var phoneToCardResolver = applicationContext.getBean(PhoneToAccountResolver.class);
        var accountService = applicationContext.getBean(AccountService.class);

        Account account1 = new Account(1, 1000);
        Account account2 = new Account(2, 2000);

        System.out.println(account1);

        var phoneNumber = "1234567";

        phoneToCardResolver.addMaping(phoneNumber, account2);

        accountService.transferByPhonenumber(account1, phoneNumber, 500);

        System.out.println(account1);
        System.out.println(account2);

        accountService.transfer(account1, account2, 250);

        System.out.println(account1);
        System.out.println(account2);

//        accountService.transferByPhonenumber(account1, "1234", 500);

    }
}
