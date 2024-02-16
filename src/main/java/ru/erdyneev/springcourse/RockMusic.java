package ru.erdyneev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockList = new ArrayList<>();
    @Override
    public List getSong() {
        rockList.add("Lithium");
        rockList.add("Paradise");
        rockList.add("Take on me!");
        return rockList;
    }
}
