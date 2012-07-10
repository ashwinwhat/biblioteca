package com.twu28.biblioteca;

import java.util.ArrayList;

public class FakeConsole implements IConsole {
    private ArrayList<String> inputs = new ArrayList<String>();
    private StringBuilder outputs = new StringBuilder();

    @Override
    public String readLine() {
        if(!inputs.isEmpty()){
            return inputs.remove(0);
        }else{
            throw new IllegalStateException();
        }
    }

    @Override
    public void writeLine(String message) {
        outputs.append(message);
    }

    public String getOutput(){
        return outputs.toString();
    }

    public void addInputs(String... inputs){
        for(String input : inputs){
            this.inputs.add(input);
        }
    }
}
