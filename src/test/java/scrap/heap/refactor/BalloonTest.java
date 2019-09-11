package scrap.heap.refactor;

import org.junit.Test;
import scrap.heap.refactor.balloon.Balloon;
import scrap.heap.refactor.balloon.BalloonMaterial;
import scrap.heap.refactor.common.Color;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BalloonTest {

    @Test
    public void testBuildBalloon() {
        Balloon.BalloonBuilder balloonBuilder = new Balloon.BalloonBuilder(4)
                .withMaterial(BalloonMaterial.LATEX)
                .withColor(Color.PINK);

        Balloon balloon = balloonBuilder.build();

        assertNotNull(balloon);
        assertEquals(BalloonMaterial.LATEX, balloon.getMaterial());
        assertEquals(Color.PINK, balloon.getColor());
        assertEquals(4, balloon.getCount());
    }

}
