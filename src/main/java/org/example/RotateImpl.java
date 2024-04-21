package org.example;

public class RotateImpl {

    private Rotate m;

    public RotateImpl(Rotate m) {
        this.m = m;
    }

    public void execute() {
        int newDirection = (this.m.getDirection() + this.m.getAngularVelocity()) % this.m.getDirectionsNumber();
        this.m.setDirection(newDirection);
    }
}
