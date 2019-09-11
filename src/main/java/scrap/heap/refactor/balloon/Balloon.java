package scrap.heap.refactor.balloon;

import scrap.heap.refactor.common.Color;
import scrap.heap.refactor.common.OrderItem;

/**
 * Class representing a balloon
 */
public class Balloon implements OrderItem {
    
    private Color color;
    private BalloonMaterial material;
    private int count;

    public Color getColor() {
        return color;
    }

    public BalloonMaterial getMaterial() {
        return material;
    }

    public int getCount() {
        return count;
    }

    // Using a private constructor so that Balloon class can only be accessed using the builder
    private Balloon (){
    }

    /**
     * Builder to build a balloon
     */
    public static class BalloonBuilder{
        private int count;
        private Color color;
        private BalloonMaterial material;
        
        public BalloonBuilder(int count) {
            this.count = count;
        }
        
        public BalloonBuilder withColor(Color color){
            this.color = color;
            return this;
        }
        
        public BalloonBuilder withMaterial(BalloonMaterial material){
            this.material = material;
            return this;
        }

        /**
         * Method that builds the Balloon object
         * @return Balloon
         */
        public Balloon build(){
            Balloon balloon = new Balloon();
            balloon.count = this.count;
            balloon.color = this.color;
            balloon.material = this.material;
            return balloon;
        }
        
        
    }
    
    
}