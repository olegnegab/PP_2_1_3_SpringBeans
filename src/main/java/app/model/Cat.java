package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat extends Animal {

    public Cat() {
    }

    @Override
    public String toString() {

        return "I`m a Cat";
    }
}
