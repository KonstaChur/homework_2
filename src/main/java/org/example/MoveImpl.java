package org.example;

public class MoveImpl implements Move {
    private Vector position;
    private Vector velocity;

    public MoveImpl(Vector position, Vector velocity) {
        this.position = position;
        this.velocity = velocity;
    }

    @Override
    public Vector getPosition() {
        return position;
    }

    @Override
    public Vector getVelocity() {
        return velocity;
    }

    @Override
    public Vector setPosition(Vector newValue) {
        return Vector.newCoords(getPosition(), getVelocity());
    }

    public void Execute(){
        setPosition(Vector.newCoords(getPosition(), getVelocity()));
    }
}
