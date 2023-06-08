package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dogBean")

public class Dog extends Animal {

    public Dog() {
    }
    @Override
    public String toString() {
        return "I`m a Dog";
    }
}
