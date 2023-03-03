public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int income = 600;

        int bonus;
        int newBalance;
        if (income > 1000) {
            bonus = income / 100;
            newBalance = startBalance + income + bonus;
            System.out.println("Your bonus = " + bonus);
            System.out.println("Now your balance is  = " + newBalance);
        } else {
            bonus = 0;
            newBalance = startBalance + income + bonus;
            System.out.println("Your bonus = " + bonus);
            System.out.println("Now your balance is  = " + newBalance);
        }


    }
}