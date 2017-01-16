/**
 * Created by nedwaldie on 1/12/17.
 */
public class TrafficLightApp {
    public static void main(String[] args) {
        TrafficLightColor color1 = TrafficLightColor.RED;
        TrafficLightColor color2 = TrafficLightColor.YELLOW;
        TrafficLightColor color3 = TrafficLightColor.GREEN;

        colorInstructions(color1);
        colorInstructions(color2);
        colorInstructions(color3);
    }
    public static void colorInstructions(TrafficLightColor color) {
        switch (color) {
            case RED:
                System.out.println("Stop at Red.");
                break;
            case YELLOW:
                System.out.println("Slow down at Yellow.");
                break;
            default:
                System.out.println("Go at Green.");
        }
    }
}
