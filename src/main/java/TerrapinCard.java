public class TerrapinCard {
  private double balance;

  public TerrapinCard(double theBalance){
    balance = theBalance;
  }
  
  public void payEconomical() {
    if (balance>=2.50){
      balance-=2.50;
    }
    else if (balance<2.50){
      balance = balance; 
    }

}

public void payGourmet() {
    if (balance>=4){
      balance-=4;
    }
    else if (balance<4){
      balance = balance;
    }
}

public void loadMoney(double amount) {
  if(amount < 0){
    balance = balance;
  }
  else if(balance+amount > 150){
    balance = 150;
  }
  else {
    balance = balance+amount;
  }
  
}










  public String toString(){
    return "The card has " + balance +" dollars";
  }




}
