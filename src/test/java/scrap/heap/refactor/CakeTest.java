package scrap.heap.refactor;

import org.junit.Test;
import scrap.heap.refactor.cake.Cake;
import scrap.heap.refactor.cake.CakeFlavor;
import scrap.heap.refactor.cake.CakeShape;
import scrap.heap.refactor.cake.CakeSize;
import scrap.heap.refactor.cake.FrostingFlavor;
import scrap.heap.refactor.common.Color;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CakeTest {

    @Test
    public void testBuildCake() {
        Cake cake = new Cake.CakeBuilder ()
                .withFrosting(FrostingFlavor.VANILLA)
                .withFlavor(CakeFlavor.CHOCOLATE)
                .ofShape(CakeShape.SQUARE)
                .ofSize(CakeSize.MED)
                .ofColor(Color.BROWN)
                .build();

        assertNotNull(cake);
        assertEquals(FrostingFlavor.VANILLA, cake.getFrostingFlavor());
        assertEquals(CakeFlavor.CHOCOLATE, cake.getFlavor());
        assertEquals(CakeShape.SQUARE, cake.getShape());
        assertEquals(CakeSize.MED, cake.getSize());
        assertEquals(Color.BROWN, cake.getColor());
    }
}
