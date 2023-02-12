/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

package HomeWorks.HomeWork_6;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private String brand;
    private String name;
    private Double price;
    private List<Specifications> specifications = new ArrayList<>();

    public Notebook(String brand, String name, Double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }


    public void addSpecifications(Specifications specifications) {
        this.specifications.add(specifications);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Specifications> getSpecifications() {
        return this.specifications;
    }


    @Override
    public String toString() {
        return "Notebook {" +
            " brand='" + brand + "'" +
            ", name='" + name + "'" +
            ", price='" + price + "'" +
            ", specifications='" + specifications + "'" +
            "}";
    }

}
