import controllers.ProductController;
import models.Product;
import utils.Validator;
import views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        Product model=new Product();
        SalesView view=new SalesView();
        ProductController controller=new ProductController();
        controller.runApp();

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
//        Product model = создать экземпляр
//        SalesView view = создать экземпляр
//        ProductController controller = создать экземпляр

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
        // controller.runApp();
    }
}
