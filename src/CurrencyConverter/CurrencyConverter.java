package CurrencyConverter;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CurrencyConverter {

    public static void main(String[] args) {

        Currency [] currencyArr = new Currency[3];
        Currency usd = new Currency("USD", 0.39);
        Currency eur = new Currency("EUR", 0.33);
        Currency rub = new Currency("RUB", 28.77);

        currencyArr[0] = usd;
        currencyArr[1] = eur;
        currencyArr[2] = rub;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму в BYN");
        int number = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите валюту (USD, EUR, RUB)");
        String name = sc2.nextLine();

        double result = 0.0;
        String finalResult = "";

        for (int i = 0; i < currencyArr.length; i++) {

            if (name.equals(currencyArr[i].code)) {

                result = number * currencyArr[i].rate;
                finalResult = currencyArr[i].code;

                System.out.println(result + " " + finalResult);

            }

        }

    }

}


