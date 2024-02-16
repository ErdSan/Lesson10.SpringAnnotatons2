package ru.erdyneev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("do init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("do destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
