package scrap.heap.refactor;

import org.junit.Test;
import scrap.heap.refactor.balloon.Balloon;
import scrap.heap.refactor.balloon.BalloonMaterial;
import scrap.heap.refactor.cake.*;
import scrap.heap.refactor.common.Color;

import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void testPlaceOrderWithOnlyOneItem() {
        Order.OrderBuilder orderBuilder = new Order.OrderBuilder();

        Cake.CakeBuilder cakeBuilder = new Cake.CakeBuilder()
                .withFrosting(FrostingFlavor.VANILLA)
                .withFlavor(CakeFlavor.CHOCOLATE)
                .ofShape(CakeShape.SQUARE)
                .ofSize(CakeSize.MED)
                .ofColor(Color.BROWN);

        orderBuilder.addOrderLineItem(cakeBuilder.build());

        Order order = orderBuilder.placeOrder();

        assertNotNull(order);
        assertNotNull(order.getItems());
        assertEquals(1, order.getItems().size());
    }

    @Test
    public void testPlaceOrderWithOnlyMultipleItems() {
        Order.OrderBuilder orderBuilder = new Order.OrderBuilder();

        Cake.CakeBuilder cakeBuilder = new Cake.CakeBuilder()
                .withFrosting(FrostingFlavor.VANILLA)
                .withFlavor(CakeFlavor.CHOCOLATE)
                .ofShape(CakeShape.SQUARE)
                .ofSize(CakeSize.MED)
                .ofColor(Color.BROWN);

        Balloon.BalloonBuilder balloonBuilder = new Balloon.BalloonBuilder(4)
                .withColor(Color.BLUE)
                .withMaterial(BalloonMaterial.LATEX);

        orderBuilder.addOrderLineItem(cakeBuilder.build());
        orderBuilder.addOrderLineItem(balloonBuilder.build());

        Order order = orderBuilder.placeOrder();

        assertNotNull(order);
        assertNotNull(order.getItems());
        assertEquals(2, order.getItems().size());
    }

    @Test
    public void testPlaceOrderWithNoItems() {
        Order.OrderBuilder orderBuilder = new Order.OrderBuilder();

        Order order = orderBuilder.placeOrder();

        assertNotNull(order);
        assertNotNull(order.getItems());
        assertEquals(0, order.getItems().size());
    }
}
