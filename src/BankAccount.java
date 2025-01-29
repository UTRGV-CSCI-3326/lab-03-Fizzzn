//new balance must be 1961.90
public class BankAccount {

    public static void main (String[] args){
        double checking_acct = 2175.37;
        checking_acct -= 302.50;
        checking_acct += 50.03;
        checking_acct /= 2;
        checking_acct += 20.00;
        checking_acct -= 1.00;
        checking_acct *= 2.00;
        checking_acct += 1.00;
       double final_checking = (checking_acct/1.0);
        System.out.println(String.format("%.2f", final_checking));
    }

}
