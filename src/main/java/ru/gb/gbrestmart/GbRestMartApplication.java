package ru.gb.gbrestmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.gb.gbrestmart.dao.ManufacturerDao;
import ru.gb.gbrestmart.dao.ProductDao;
import ru.gb.gbrestmart.entity.Manufacturer;
import ru.gb.gbrestmart.entity.Product;
import ru.gb.gbrestmart.service.ProductService;

import java.util.HashSet;
/*1. Создать микросервис для работы с заказами. Данный микросервис должен уметь создавать заказ, удалять заказ, добавлять
        в заказ товары, удалять товары из заказа
        2. Проект приложенный в архиве запустить и коммитить по схеме описанной в схеме по работе с гитом в 8 уроке
        3. Доработать код из архива gb-rest-mart так, что пользователю было предоставлено API по работе с заказом*/

@SpringBootApplication
public class GbRestMartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GbRestMartApplication.class, args);
//        context.getBean(ProductService.class).init();
    }

}
