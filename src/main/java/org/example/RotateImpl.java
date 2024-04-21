package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RotateImpl {

    private final Rotate m;

    public void execute() {
        int newDirection = (this.m.getDirection() + this.m.getAngularVelocity()) % this.m.getDirectionsNumber();
        this.m.setDirection(newDirection);
    }
}
