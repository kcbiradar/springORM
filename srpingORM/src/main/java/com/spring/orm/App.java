package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StoreDao;
import com.spring.orm.entity.Store;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StoreDao x = context.getBean("sto" , StoreDao.class);
        Scanner sc = new Scanner(System.in);
        int shop_id;
        String shopName;
        String city;
        Store store = new Store();
        System.out.println("Enter number of shopes want to add DataBase : ");
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
        	System.out.println("Enter ShopDetails");
        	System.out.println("Enter shopID please : ");
        	shop_id = sc.nextInt();
        	System.out.println("Enter shopName please : ");
        	shopName = sc.next();
        	System.out.println("Enter city please : ");
        	city = sc.next();
        	store.setCity(city);
        	store.setShopName(shopName);
        	store.setShopID(shop_id);
        	x.insert(store);
        }
        System.out.println("All the stores added database successfully!!!");
    }
}
