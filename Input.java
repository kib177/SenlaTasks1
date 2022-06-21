package Zadanie1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
    private String vvod;

    public Input(){
        getScanner();
        this.vvod = vvod;
    }

    private void getScanner(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цифры: ");
        vvod = in.nextLine();
        in.close();
    }

    public ArrayList<Integer> convertToNumber () {
        ArrayList<Integer> numb = new ArrayList<>();
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(vvod);
        while (matcher.find()) {
            String value = vvod.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            numb.add(result);
        }
        return numb;
    }
}
