package ch9_Decorator.starbucks;

public abstract class Beverage {
    String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
