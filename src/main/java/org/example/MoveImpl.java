package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MoveImpl implements Move {
    private Vector position;
    private Vector velocity;

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
}
