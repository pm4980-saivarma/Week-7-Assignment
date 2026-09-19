public class Cart {
    private final String cartId;
    private final int[] prices;
    private int itemCount;

    public Cart(String cartId, int maximumItems) {
        if (cartId == null || cartId.isEmpty()) {
            throw new IllegalArgumentException("Cart ID cannot be empty.");
        }
        if (maximumItems <= 0) {
            throw new IllegalArgumentException("Cart size must be positive.");
        }
        this.cartId = cartId;
        prices = new int[maximumItems];
    }

    public void addItem(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Item price cannot be negative.");
        }
        if (itemCount == prices.length) {
            throw new IllegalStateException("Cart is full.");
        }
        prices[itemCount++] = price;
    }

    public int getTotal() {
        int total = 0;
        for (int index = 0; index < itemCount; index++) {
            total += prices[index];
        }
        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getCartId() {
        return cartId;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}
