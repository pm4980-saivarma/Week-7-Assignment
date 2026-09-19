public class TrafficLight {
    private static final String[] COLORS = {"RED", "GREEN", "YELLOW"};
    private final String id;
    private int colorIndex;

    public TrafficLight(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Traffic light ID cannot be empty.");
        }
        this.id = id;
        colorIndex = 0;
    }

    public void next() {
        colorIndex = (colorIndex + 1) % COLORS.length;
    }

    public String getColor() {
        return COLORS[colorIndex];
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("TL-9");
        System.out.println(light.getColor());
        light.next();
        System.out.println(light.getColor());
        light.next();
        System.out.println(light.getColor());
        light.next();
        System.out.println(light.getColor());
    }
}
