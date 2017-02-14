package learnEnum;

import sun.applet.Main;

/**
 * Created by dafu on 2017/2/7.
 */
public enum  Light {
    RED("red",1),GREEN("green",2),YELLOW("yellow",3);

    private int nCode;

    private String color;

    Light(String color,int nCode ) {
        this.nCode = nCode;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Light{" +
                "nCode=" + nCode +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Light.RED);
        System.out.println(Light.YELLOW);
        System.out.println(Light.GREEN);
    }
}
