package homeworks.hw4.shapes.factory;

import homeworks.hw4.shapes.model.AbstractShape;

public abstract class ShapeFactory {

    /**
    А вот тут в конкретной реализации нужно запросить
    у пользователя все параметры для конкретной фигуры
    B можно реализовать общий метод получения параметра,
    используя Scanner.
    **/
    public abstract AbstractShape getShape();

}
