package com.company.model;

/**
 * Created by User on 18.07.2017.
 */
public abstract class Figure {
    protected String name;

    public String getName() {
        return name;
    }

    /**
     * Метод вычисления площади фигуры
     * @return площадь фигуры
     */
    public abstract double getSquare();

    /**
     * Метод вычисления периметра фигуры
     * @return периметр фигуры
     */
    public abstract double getPerimeter();

}
