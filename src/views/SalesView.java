package views;

import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {

    private String title;
    private String name;
    private int quantity;
    private double price;
    private Scanner scanner;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    private Product model;

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        Validator validator = new Validator();
        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        name = validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        quantity = validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);


        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        price = validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
