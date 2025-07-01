package Hashing;

public class AccountNum {
    private String AccountId;

    public AccountNum(String AccountId) {
        this.AccountId = AccountId;
    }

    public int hash(){
        return AccountId.hashCode();
    }

    public boolean equals(Object object){
        if (object instanceof AccountNum){
            return this.AccountId.equals(((AccountNum) object).AccountId);
        }
    }
}
