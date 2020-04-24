interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService {
    Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts.clone();
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        Account account = null;

        for(int i = 0 ; i < accounts.length; i++) {
            if(accounts[i].getOwner().getId() ==id) {
                 account =  accounts[i];
            }

        }
//        Arrays.stream(accounts)
//                .filter(account -> account.getOwner().getId() == id)
//                .findFirst()
//                .orElse(null);
        return account;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int count = 0;
        for(int i = 0; i < accounts.length ; i++){
            if (accounts[i].getBalance() > value) {
                count++;
            }
        }
//        Arrays.stream(accounts)
//                .map(Account::getBalance)
//                .filter(balance -> balance > value)
//                .count();
        return count;
    }

}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() { 
        return id; 
    }

    public long getBalance() { 
        return balance; 
    }

    public User getOwner() { 
        return owner; 
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() { 
        return id; 
    }

    public String getFirstName() { 
        return firstName; 
    }

    public String getLastName() { 
        return lastName; 
    }
}