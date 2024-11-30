package SpringFramework.Account;

public interface AccountService {
    void transfer (Account from, Account to, long amount);
    void transferByPhonenumber (Account from, String phoneNumber, long amount);
}
