package bank;
class Account {
   public String name;
   protected String email;
   private String password;

   //getters and setters

   public String getPassword() {
       return this.password;
   } 

   public void setPassword(String password) {
       this.password = password;
   }
}


public class Bank { 
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "savings";
        System.out.println(a1.name);
        a1.email = "hello@gmail.com";
        System.out.println(a1.email);
        a1.setPassword("12345");
        System.out.println(a1.getPassword());
        
    }
}

