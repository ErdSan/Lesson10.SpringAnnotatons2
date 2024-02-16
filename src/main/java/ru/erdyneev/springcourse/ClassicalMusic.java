package ru.erdyneev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalList = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        classicalList.add("Hungarian Rhapsody");
        classicalList.add("Symphony no. 5 in C Minor, op. 67");
        classicalList.add("Night on Bald Mountain");
    }
    @Override
    public List<String> getSong() {
        return classicalList;
    }
}
