package scrap.heap.refactor;

import scrap.heap.refactor.balloon.Balloon;
import scrap.heap.refactor.balloon.BalloonMaterial;
import scrap.heap.refactor.cake.Cake;
import scrap.heap.refactor.cake.CakeFlavor;
import scrap.heap.refactor.cake.CakeShape;
import scrap.heap.refactor.cake.CakeSize;
import scrap.heap.refactor.cake.FrostingFlavor;
import scrap.heap.refactor.common.Color;

public class App {
    public String getGreeting() {
        return "Welcome. Please place your Party Orders.";
    }
    
    public static void main(String[] args) {
        
        Order order1 = new Order.OrderBuilder()
                                .addOrderLineItem(new Cake.CakeBuilder()
                                                    .withFrosting(FrostingFlavor.CHOCOLATE)
                                                    .withFlavor(CakeFlavor.CHOCOLATE)
                                                    .ofShape(CakeShape.CIRCLE)
                                                    .ofSize(CakeSize.LARGE)
                                                    .ofColor(Color.BROWN)
                                                    .build())
                                .addOrderLineItem(new Balloon.BalloonBuilder(4)
                                                    .withColor(Color.RED)
                                                    .withMaterial(BalloonMaterial.MYLAR)
                                                    .build())
                                .placeOrder();
        
        Order order2 = new Order.OrderBuilder()
                                .addOrderLineItem(new Cake.CakeBuilder()
                                                    .withFrosting(FrostingFlavor.VANILLA)
                                                    .withFlavor(CakeFlavor.CHOCOLATE)
                                                    .ofShape(CakeShape.SQUARE)
                                                    .ofSize(CakeSize.MED)
                                                    .ofColor(Color.BROWN)
                                                    .build())
                                .addOrderLineItem(new Balloon.BalloonBuilder(7)
                                                    .withColor(Color.BLUE)
                                                    .withMaterial(BalloonMaterial.LATEX)
                                                    .build())
                                .placeOrder();
        
        Order order3 = new Order.OrderBuilder()
                                .addOrderLineItem(new Cake.CakeBuilder()
                                                .withFrosting(FrostingFlavor.VANILLA)
                                                .withFlavor(CakeFlavor.VANILLA)
                                                .ofShape(CakeShape.SQUARE)
                                                .ofSize(CakeSize.SMALL)
                                                .ofColor(Color.YELLOW)
                                                .build())
                                .addOrderLineItem(new Balloon.BalloonBuilder(4)
                                                .withColor(Color.YELLOW)
                                                .withMaterial(BalloonMaterial.MYLAR)
                                                .build())
                                .placeOrder();
                                            
                                        
    }

}
