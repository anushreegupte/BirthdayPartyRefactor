package scrap.heap.refactor.cake;

import scrap.heap.refactor.common.Color;
import scrap.heap.refactor.common.OrderItem;

/**
 * Class representing cake object
 */
public class Cake implements OrderItem {

    private FrostingFlavor frostingFlavor;
    private CakeFlavor flavor;
    private CakeShape shape;
    private CakeSize size;
    private Color color;

    public FrostingFlavor getFrostingFlavor() {
        return frostingFlavor;
    }

    public CakeFlavor getFlavor() {
        return flavor;
    }

    public CakeShape getShape() {
        return shape;
    }

    public CakeSize getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    private Cake (){
        // Using a private constructor so that Balloons can only be created using the builder
    }

    /**
     * Cake builder to build Cake object
     */
    public static class CakeBuilder{
        
        private FrostingFlavor frostingFlavor;
        private CakeFlavor flavor;
        private CakeShape shape;
        private CakeSize size;
        private Color color;
        
        public CakeBuilder withFrosting(FrostingFlavor frostingFlavor){
            this.frostingFlavor = frostingFlavor;
            return this;
        }
        
        public CakeBuilder withFlavor(CakeFlavor flavor){
            this.flavor = flavor;
            return this;
        }
        
        public CakeBuilder ofShape(CakeShape shape){
            this.shape = shape;
            return this;
        }
        
        public CakeBuilder ofSize(CakeSize size){
            this.size = size;
            return this;
        }
        
        public CakeBuilder ofColor(Color color){
            this.color = color;
            return this;
        }

        /**
         * Method that builds the cake object
         * @return Cake
         */
        public Cake build(){
            Cake cake = new Cake();
            cake.frostingFlavor = this.frostingFlavor;
            cake.flavor = this.flavor;
            cake.shape = this.shape;
            cake.size = this.size;
            cake.color = this.color;
            return cake;
        }
        
        
    }
    
    
}