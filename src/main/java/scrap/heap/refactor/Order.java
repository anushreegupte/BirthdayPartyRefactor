package scrap.heap.refactor;

import java.util.ArrayList;
import java.util.List;
import scrap.heap.refactor.common.OrderItem;

/**
 * Class representing order that contains order items
 */
public class Order {

    /**
     * Items list to contain order items
     */
    private List<OrderItem> items;

    public List<OrderItem> getItems() {
        return items;
    }

    private Order(){
        // Using a private constructor so that Order class can only be accessed using the builder
    }


    /**
     * Order Builder to create order with order items
     */
    public static class OrderBuilder{
        private List<OrderItem> items = new ArrayList<OrderItem>();

        /**
         * Add order line item
         * @param item
         * @return OrderBuilder
         */
        public OrderBuilder addOrderLineItem(OrderItem item){
            this.items.add(item);
            return this;
        }

        /**
         * Place order based on order line items
         * @return Order
         */
        public Order placeOrder() {
            Order order = new Order();
            order.items = this.items;
            return order;
        }
    }
}