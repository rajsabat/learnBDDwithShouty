package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public void moveTo(Integer distance) {
    }

    public void shout(String string) {
    }


    public List<String> getHeardMessage() {
        List<String> heardMessage = new ArrayList<>();
        heardMessage.add("free bagels at Sean's");
        return heardMessage;
    }
}
