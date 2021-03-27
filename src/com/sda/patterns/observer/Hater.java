package com.sda.patterns.observer;

public class Hater extends Observer {
    public Hater(String name) {
        super(name);
    }

    @Override
    public void notifyOfSubjectUpdate() {
        System.out.println("Sunt " + name + " si am primit o notificare de la "
                + subject.getName() + ": " + subject.getStatus() + " - Huooo! I hate this! Dislike!");
    }
}
