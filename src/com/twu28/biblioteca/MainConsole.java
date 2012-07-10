package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainConsole implements IConsole{
    @Override
    public String readLine() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = null;
        try{
            message = reader.readLine();
        }catch (IOException error){
            error.printStackTrace();
        }
        return message;
    }

    @Override
    public void writeLine(String message) {
        System.out.println(message);
    }
}
