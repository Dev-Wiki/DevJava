package net.devwiki.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleDemo {

    public static void main(String[] args) {
        Apple apple = new Apple("green", 80);
        Apple apple1 = new Apple("red", 160);
        Apple apple2 = new Apple("green", 170);
        Apple apple3 = new Apple("red", 60);
        List<Apple> inventory = new ArrayList<>();
        inventory.add(apple);
        inventory.add(apple1);
        inventory.add(apple2);
        inventory.add(apple3);

        filterGreenApples(inventory).forEach(a -> {
            System.out.println("filterGreenApples:" + a);
        });

        filterHeavyApples(inventory).forEach(a -> {
            System.out.println("filterHeavyApples:" + a);
        });

        filterApples(inventory, Apple::isGreenApple).forEach(apple4 -> {
            System.out.println("lambda filterGreenApples:" + apple4);
        });

        filterApples(inventory, Apple::isHeavyApple).forEach(apple4 -> {
            System.out.println("lambda filterHeavyApples:" + apple4);
        });
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static class Apple {
        private String color;
        private int weight;

        public Apple(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public boolean isGreenApple() {
            return "green".equals(color);
        }

        public boolean isHeavyApple() {
            return weight > 150;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}
