package SpringFramework.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InMemoryAccountService implements AccountService {

    private final PhoneToAccountResolver phoneToAccountResolver;

    @Autowired
    public InMemoryAccountService(PhoneToAccountResolver phoneToAccountResolver) {
        this.phoneToAccountResolver = phoneToAccountResolver;
    }


    @Override
    public void transfer(Account from, Account to, long amount) {
        if (from.getAmount() < amount){
            throw new IllegalArgumentException("Not enough money: " + from);
        }
        from.setAmount(from.getAmount() - amount);
        to.setAmount(to.getAmount()+amount);
    }

    @Override
    public void transferByPhonenumber(Account from, String phoneNumber, long amount) {
        var to = phoneToAccountResolver.findAccountByPhoneNumber(phoneNumber)
                .orElseThrow(()-> new IllegalArgumentException("Account not found by phone: " + phoneNumber));
        transfer(from, to, amount);
    }
}
