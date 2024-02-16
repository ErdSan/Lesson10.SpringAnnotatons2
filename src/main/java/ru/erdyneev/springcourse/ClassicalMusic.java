package ru.erdyneev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalList = new ArrayList<>();
    @Override
    public List getSong() {
        classicalList.add("Mozart");
        classicalList.add("Bethoven");
        classicalList.add("Hungarian Rhapsody");
        return classicalList;
    }
}
