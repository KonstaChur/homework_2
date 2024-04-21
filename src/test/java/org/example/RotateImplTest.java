package org.example;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RotateImplTest {

    @Mock
    private Rotate m;

    @Test
    public void execute() {

        when(m.getDirection()).thenReturn(2);
        when(m.getAngularVelocity()).thenReturn(1);
        when(m.getDirectionsNumber()).thenReturn(4);

        RotateImpl rotateImpl = new RotateImpl(m);

        rotateImpl.execute();

        verify(m).setDirection(3);
    }
}

