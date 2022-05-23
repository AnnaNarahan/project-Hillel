package controllers;

import models.Product;
import views.SalesView;

// Controller
public class ProductController extends Product{

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        model.getName();
        getIncome();
        getIncomeTax();
        getNetProfit();
        rounder(getIncome());
        rounder(getIncomeTax());
        rounder(getNetProfit());

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = "[\"Наименование товара:\"+name+\n" +
                "\"Общий доход (грн.):\"+income+\n" +
                "\"Сумма налога (грн.):\"+incomeTax+\n" +
                "\"Чистый доход (грн.):\"+netProfit ]";

        view.getOutput(output);
    }
}

