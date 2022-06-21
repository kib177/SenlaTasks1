package Zadanie1;

public class SumOfDigits {
    private Input input = new Input();

    public void Sum(){
        int sum = 0;
        for (int i= 0; i<input.convertToNumber().size(); i++){
            sum += input.convertToNumber().get(i);
        }
        if (input.convertToNumber().size()>0)  System.out.println("Сумма ваших цифр = "+sum);
        else  System.out.println("Вы не ввели цифр = "+0);
    }
}
