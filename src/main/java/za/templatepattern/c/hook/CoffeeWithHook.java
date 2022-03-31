package za.templatepattern.c.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shivam.si on 31/03/22 11:16 am
 */

public class CoffeeWithHook extends CoffeeBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filters.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO Error trying to read your answer");
        }
        if(answer == null)
            answer = "no";
        return answer;
    }
}
