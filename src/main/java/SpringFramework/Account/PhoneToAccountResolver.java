package SpringFramework.Account;

import java.util.Optional;

public interface PhoneToAccountResolver {

    Optional<Account> findAccountByPhoneNumber (String phoneNumber);
    void addMaping (String phone, Account account);
    void removeMapping (String phone);
}
