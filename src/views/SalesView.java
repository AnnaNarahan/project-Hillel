package views;


import utils.Validator;

import java.util.Scanner;

// View
public class SalesView extends Validator {

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    public SalesView(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.


    public void getInputs() {

        scanner = new Scanner(System.in);


SalesView salesView=new SalesView(name,quantity,price);
        title = "Введите наименование товара: ";
        System.out.println("Введите наименование товара: ");
        name=validateName(scanner);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.


        title = "Введите количество: ";
        System.out.println("Введите количество: ");
        quantity=validateQuantityInput(scanner);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        title = "Введите цену: ";
        System.out.println("Введите цену: ");
        price=validatePriceInput(scanner);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
