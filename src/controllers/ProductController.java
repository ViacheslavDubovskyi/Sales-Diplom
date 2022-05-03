package controllers;

import models.Product;
import utils.Rounder;
import utils.Validator;
import views.SalesView;

// Controller
public class ProductController {

    private Product model;
    private SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String name = model.getName();
        double income = model.calculateIncome(model.getQuantity(), model.getPrice());
        double tax = model.calculateTax(income);
        double netIncome = model.calculateIncome(income, tax);

        Rounder rounder = new Rounder();
        String finalIncome = rounder.getRoundValue(income);
        String finalTax = rounder.getRoundValue(tax);
        String finalNetIncome = rounder.getRoundValue(netIncome);


        String output = "Наименование товара: " + name + '\n' + "Общий доход (в грн): " + finalIncome + '\n' +
                "Сумма налога (в грн): " + finalTax + '\n' + "Чистый доход (в грн): " + finalNetIncome;

        view.getOutput(output);
    }
}
