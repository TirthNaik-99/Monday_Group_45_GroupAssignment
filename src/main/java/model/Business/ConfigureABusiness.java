/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.Random;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
    Random random = new Random();
    
    PersonDirectory personDirectory = business.getPersonDirectory();
    Person person1 = personDirectory.newPerson("Rusahbh");
    Person person2 = personDirectory.newPerson("Tirth");
    Person person3 = personDirectory.newPerson("Harsh");
    Person person4 = personDirectory.newPerson("Vedanshu");
    Person person5 = personDirectory.newPerson("Jajoo");
    Person person6 = personDirectory.newPerson("Aniket");
    
    Person xeroxsalesperson1 = personDirectory.newPerson("sales");
    Person xeroxmarketingperson1 = personDirectory.newPerson("marketing");
    Person xeroxadminperson1 = personDirectory.newPerson("admin");
    
    SalesPersonDirectory sd = business.getSalesPersonDirectory();
    SalesPersonProfile salesp1 = sd.newSalesPersonProfile(xeroxsalesperson1);
    
    MarketingPersonDirectory md = business.getMarketingPersonDirectory();
    MarketingPersonProfile mp1 = md.newMarketingPersonProfile(xeroxmarketingperson1);
    
    EmployeeDirectory ed = business.getEmployeeDirectory();
    EmployeeProfile ep1 = ed.newEmployeeProfile(xeroxadminperson1);
    
    
      UserAccountDirectory ud = business.getUserAccountDirectory();
      UserAccount ua1 = ud.newUserAccount(salesp1,"Sales", "XXXX");
      UserAccount ua2 = ud.newUserAccount(mp1, "Marketing", "XXXX");
    
    
    SupplierDirectory supplierDirectory = business.getSupplierDirectory();
    Supplier supplier1 = supplierDirectory.newSupplier("Lenovo");
    Supplier supplier2 = supplierDirectory.newSupplier("Epson");
    Supplier supplier3 = supplierDirectory.newSupplier("HP");
    Supplier supplier4 = supplierDirectory.newSupplier("Canon");
    Supplier supplier5 = supplierDirectory.newSupplier("Dell");
      
      
    CustomerDirectory customerDirectory = business.getCustomerDirectory();
    CustomerProfile customerProfile1 = customerDirectory.newCustomerProfile(person1);
    CustomerProfile customerProfile2 = customerDirectory.newCustomerProfile(person2);
    CustomerProfile customerProfile3 = customerDirectory.newCustomerProfile(person3);
    CustomerProfile customerProfile4 = customerDirectory.newCustomerProfile(person4);
    CustomerProfile customerProfile5 = customerDirectory.newCustomerProfile(person5);
    CustomerProfile customerProfile6 = customerDirectory.newCustomerProfile(person6);
    
    customerProfile1.setOrdersize(20);
    customerProfile2.setOrdersize(20);
    customerProfile3.setOrdersize(20);
    customerProfile4.setOrdersize(20);
    customerProfile5.setOrdersize(20);
    customerProfile6.setOrdersize(20);
        //Supplier 1: Lenovo
        
        ProductCatalog pc1 = supplier1.getProductCatalog();
        Product products1p1 = pc1.newProduct("Scanner 1", 12000, 14000, 19000);
        Product products1p2 = pc1.newProduct("Scanner 2", 13000, 16000, 20000);
        Product products1p3 = pc1.newProduct("Scanner 3", 24000, 47000, 43000);
        Product products1p4 = pc1.newProduct("Scanner 4", 15000, 18000, 44000);
        Product products1p5 = pc1.newProduct("Scanner 5", 16000, 19000, 54000);
        Product products1p6 = pc1.newProduct("Scanner 6", 17000, 20000, 34000);
        Product products1p7 = pc1.newProduct("Scanner 7", 38000, 84000, 76000);
        Product products1p8 = pc1.newProduct("Scanner 8", 59000, 94000, 88000);

        // Supplier 2: Epson
        
        ProductCatalog pc2 = supplier2.getProductCatalog();
        Product products2p1 = pc2.newProduct("Printer 1", 12345, 34567, 77890);
        Product products2p2 = pc2.newProduct("Printer 2", 12745, 34777, 87890);
        Product products2p3 = pc2.newProduct("Printer 3", 12845, 34787, 97890);
        Product products2p4 = pc2.newProduct("Printer 4", 12945, 34797, 107890);
        Product products2p5 = pc2.newProduct("Printer 5", 15545, 34897, 117890);
        Product products2p6 = pc2.newProduct("Printer 6", 15645, 34907, 127890);
        Product products2p7 = pc2.newProduct("Printer 7", 15745, 34917, 113890);
        Product products2p8 = pc2.newProduct("Printer 8", 15845, 34970, 167890);

        // Supplier 3: HP
       
        ProductCatalog pc3 = supplier3.getProductCatalog();
        Product products3p1 = pc3.newProduct("Laptop 1", 45000, 55000, 75000);
        Product products3p2 = pc3.newProduct("Laptop 2", 48000, 60000, 80000);
        Product products3p3 = pc3.newProduct("Laptop 3", 50000, 62000, 83000);
        Product products3p4 = pc3.newProduct("Laptop 4", 55000, 65000, 87000);
        Product products3p5 = pc3.newProduct("Laptop 5", 58000, 70000, 92000);
        Product products3p6 = pc3.newProduct("Laptop 6", 60000, 72000, 95000);
        Product products3p7 = pc3.newProduct("Laptop 7", 63000, 75000, 98000);
        Product products3p8 = pc3.newProduct("Laptop 8", 65000, 78000, 102000);

        // Supplier 4: Canon
        
        ProductCatalog pc4 = supplier4.getProductCatalog();
        Product products4p1 = pc4.newProduct("Camera 1", 30000, 35000, 50000);
        Product products4p2 = pc4.newProduct("Camera 2", 32000, 37000, 52000);
        Product products4p3 = pc4.newProduct("Camera 3", 35000, 40000, 55000);
        Product products4p4 = pc4.newProduct("Camera 4", 38000, 45000, 58000);
        Product products4p5 = pc4.newProduct("Camera 5", 40000, 47000, 60000);
        Product products4p6 = pc4.newProduct("Camera 6", 42000, 49000, 62000);
        Product products4p7 = pc4.newProduct("Camera 7", 45000, 52000, 65000);
        Product products4p8 = pc4.newProduct("Camera 8", 47000, 54000, 67000);

        // Supplier 5: Dell
        
        ProductCatalog pc5 = supplier5.getProductCatalog();
        Product products5p1 = pc5.newProduct("Monitor 1", 8000, 10000, 15000);
        Product products5p2 = pc5.newProduct("Monitor 2", 8500, 10500, 15500);
        Product products5p3 = pc5.newProduct("Monitor 3", 9000, 11000, 16000);
        Product products5p4 = pc5.newProduct("Monitor 4", 9500, 11500, 17000);
        Product products5p5 = pc5.newProduct("Monitor 5", 10000, 12000, 18000);
        Product products5p6 = pc5.newProduct("Monitor 6", 10500, 12500, 19000);
        Product products5p7 = pc5.newProduct("Monitor 7", 11000, 13000, 20000);
        Product products5p8 = pc5.newProduct("Monitor 8", 11500, 13500, 21000);
    
         MasterOrderList masterorderlist = business.getMasterOrderList();
    
    // Orders for Supplier Lenovo - Order 1
        Order order11 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi111 = order11.newOrderItem(products1p1, 18700, 2);
        OrderItem oi112 = order11.newOrderItem(products1p2, 18900, 3);
        OrderItem oi113 = order11.newOrderItem(products1p3, 19100, 4);
        OrderItem oi114 = order11.newOrderItem(products1p4, 19300, 5);
        OrderItem oi115 = order11.newOrderItem(products1p5, 19500, 6);
        OrderItem oi116 = order11.newOrderItem(products1p6, 19700, 7);
        OrderItem oi117 = order11.newOrderItem(products1p7, 19900, 8);
        OrderItem oi118 = order11.newOrderItem(products1p8, 20100, 9);

        // Orders for Supplier Lenovo - Order 2
        Order order12 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi121 = order12.newOrderItem(products1p1, 19200, 3);
        OrderItem oi122 = order12.newOrderItem(products1p2, 19400, 4);
        OrderItem oi123 = order12.newOrderItem(products1p3, 19600, 5);
        OrderItem oi124 = order12.newOrderItem(products1p4, 19800, 6);
        OrderItem oi125 = order12.newOrderItem(products1p5, 20000, 7);
        OrderItem oi126 = order12.newOrderItem(products1p6, 20200, 8);
        OrderItem oi127 = order12.newOrderItem(products1p7, 20400, 9);
        OrderItem oi128 = order12.newOrderItem(products1p8, 20600, 10);

        // Orders for Supplier Lenovo - Order 3
        Order order13 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi131 = order13.newOrderItem(products1p1, 19700, 4);
        OrderItem oi132 = order13.newOrderItem(products1p2, 19900, 5);
        OrderItem oi133 = order13.newOrderItem(products1p3, 20100, 6);
        OrderItem oi134 = order13.newOrderItem(products1p4, 20300, 7);
        OrderItem oi135 = order13.newOrderItem(products1p5, 20500, 8);
        OrderItem oi136 = order13.newOrderItem(products1p6, 20700, 9);
        OrderItem oi137 = order13.newOrderItem(products1p7, 20900, 10);
        OrderItem oi138 = order13.newOrderItem(products1p8, 21100, 11);

        // Orders for Supplier Lenovo - Order 4
        Order order14 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi141 = order14.newOrderItem(products1p1, 20200, 5);
        OrderItem oi142 = order14.newOrderItem(products1p2, 20400, 6);
        OrderItem oi143 = order14.newOrderItem(products1p3, 20600, 7);
        OrderItem oi144 = order14.newOrderItem(products1p4, 20800, 8);
        OrderItem oi145 = order14.newOrderItem(products1p5, 21000, 9);
        OrderItem oi146 = order14.newOrderItem(products1p6, 21200, 10);
        OrderItem oi147 = order14.newOrderItem(products1p7, 21400, 11);
        OrderItem oi148 = order14.newOrderItem(products1p8, 21600, 12);

        // Orders for Supplier Lenovo - Order 5
        Order order15 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi151 = order15.newOrderItem(products1p1, 20700, 6);
        OrderItem oi152 = order15.newOrderItem(products1p2, 20900, 7);
        OrderItem oi153 = order15.newOrderItem(products1p3, 21100, 8);
        OrderItem oi154 = order15.newOrderItem(products1p4, 21300, 9);
        OrderItem oi155 = order15.newOrderItem(products1p5, 21500, 10);
        OrderItem oi156 = order15.newOrderItem(products1p6, 21700, 11);
        OrderItem oi157 = order15.newOrderItem(products1p7, 21900, 12);
        OrderItem oi158 = order15.newOrderItem(products1p8, 22100, 13);

        
        // Orders for Supplier Epson - Order 1
        Order order21 = masterorderlist.newOrder(customerProfile6, salesp1);
        OrderItem oi211 = order21.newOrderItem(products2p1, 13200, 2);
        OrderItem oi212 = order21.newOrderItem(products2p2, 13400, 3);
        OrderItem oi213 = order21.newOrderItem(products2p3, 13600, 4);
        OrderItem oi214 = order21.newOrderItem(products2p4, 13800, 5);
        OrderItem oi215 = order21.newOrderItem(products2p5, 14000, 6);
        OrderItem oi216 = order21.newOrderItem(products2p6, 14200, 7);
        OrderItem oi217 = order21.newOrderItem(products2p7, 14400, 8);
        OrderItem oi218 = order21.newOrderItem(products2p8, 14600, 9);

        // Orders for Supplier Epson - Order 2
        Order order22 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi221 = order22.newOrderItem(products2p1, 13700, 3);
        OrderItem oi222 = order22.newOrderItem(products2p2, 13900, 4);
        OrderItem oi223 = order22.newOrderItem(products2p3, 14100, 5);
        OrderItem oi224 = order22.newOrderItem(products2p4, 14300, 6);
        OrderItem oi225 = order22.newOrderItem(products2p5, 14500, 7);
        OrderItem oi226 = order22.newOrderItem(products2p6, 14700, 8);
        OrderItem oi227 = order22.newOrderItem(products2p7, 14900, 9);
        OrderItem oi228 = order22.newOrderItem(products2p8, 15100, 10);

        // Orders for Supplier Epson - Order 3
        Order order23 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi231 = order23.newOrderItem(products2p1, 14200, 4);
        OrderItem oi232 = order23.newOrderItem(products2p2, 14400, 5);
        OrderItem oi233 = order23.newOrderItem(products2p3, 14600, 6);
        OrderItem oi234 = order23.newOrderItem(products2p4, 14800, 7);
        OrderItem oi235 = order23.newOrderItem(products2p5, 15000, 8);
        OrderItem oi236 = order23.newOrderItem(products2p6, 15200, 9);
        OrderItem oi237 = order23.newOrderItem(products2p7, 15400, 10);
        OrderItem oi238 = order23.newOrderItem(products2p8, 15600, 11);

        // Orders for Supplier Epson - Order 4
        Order order24 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi241 = order24.newOrderItem(products2p1, 14700, 5);
        OrderItem oi242 = order24.newOrderItem(products2p2, 14900, 6);
        OrderItem oi243 = order24.newOrderItem(products2p3, 15100, 7);
        OrderItem oi244 = order24.newOrderItem(products2p4, 15300, 8);
        OrderItem oi245 = order24.newOrderItem(products2p5, 15500, 9);
        OrderItem oi246 = order24.newOrderItem(products2p6, 15700, 10);
        OrderItem oi247 = order24.newOrderItem(products2p7, 15900, 11);
        OrderItem oi248 = order24.newOrderItem(products2p8, 16100, 12);

        // Orders for Supplier Epson - Order 5
        Order order25 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi251 = order25.newOrderItem(products2p1, 15200, 6);
        OrderItem oi252 = order25.newOrderItem(products2p2, 15400, 7);
        OrderItem oi253 = order25.newOrderItem(products2p3, 15600, 8);
        OrderItem oi254 = order25.newOrderItem(products2p4, 15800, 9);
        OrderItem oi255 = order25.newOrderItem(products2p5, 16000, 10);
        OrderItem oi256 = order25.newOrderItem(products2p6, 16200, 11);
        OrderItem oi257 = order25.newOrderItem(products2p7, 16400, 12);
        OrderItem oi258 = order25.newOrderItem(products2p8, 16600, 13);

        

        // Orders for Supplier Canon - Order 1
        Order order41 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi411 = order41.newOrderItem(products4p1, 30700, 2);
        OrderItem oi412 = order41.newOrderItem(products4p2, 30900, 3);
        OrderItem oi413 = order41.newOrderItem(products4p3, 31100, 4);
        OrderItem oi414 = order41.newOrderItem(products4p4, 31300, 5);
        OrderItem oi415 = order41.newOrderItem(products4p5, 31500, 6);
        OrderItem oi416 = order41.newOrderItem(products4p6, 31700, 7);
        OrderItem oi417 = order41.newOrderItem(products4p7, 31900, 8);
        OrderItem oi418 = order41.newOrderItem(products4p8, 32100, 9);

        // Orders for Supplier Canon - Order 2
        Order order42 = masterorderlist.newOrder(customerProfile6, salesp1);
        OrderItem oi421 = order42.newOrderItem(products4p1, 31200, 3);
        OrderItem oi422 = order42.newOrderItem(products4p2, 31400, 4);
        OrderItem oi423 = order42.newOrderItem(products4p3, 31600, 5);
        OrderItem oi424 = order42.newOrderItem(products4p4, 31800, 6);
        OrderItem oi425 = order42.newOrderItem(products4p5, 32000, 7);
        OrderItem oi426 = order42.newOrderItem(products4p6, 32200, 8);
        OrderItem oi427 = order42.newOrderItem(products4p7, 32400, 9);
        OrderItem oi428 = order42.newOrderItem(products4p8, 32600, 10);

        // Orders for Supplier Canon - Order 3
        Order order43 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi431 = order43.newOrderItem(products4p1, 31700, 4);
        OrderItem oi432 = order43.newOrderItem(products4p2, 31900, 5);
        OrderItem oi433 = order43.newOrderItem(products4p3, 32100, 6);
        OrderItem oi434 = order43.newOrderItem(products4p4, 32300, 7);
        OrderItem oi435 = order43.newOrderItem(products4p5, 32500, 8);
        OrderItem oi436 = order43.newOrderItem(products4p6, 32700, 9);
        OrderItem oi437 = order43.newOrderItem(products4p7, 32900, 10);
        OrderItem oi438 = order43.newOrderItem(products4p8, 33100, 11);

        // Orders for Supplier Canon - Order 4
        Order order44 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi441 = order44.newOrderItem(products4p1, 32200, 5);
        OrderItem oi442 = order44.newOrderItem(products4p2, 32400, 6);
        OrderItem oi443 = order44.newOrderItem(products4p3, 32600, 7);
        OrderItem oi444 = order44.newOrderItem(products4p4, 32800, 8);
        OrderItem oi445 = order44.newOrderItem(products4p5, 33000, 9);
        OrderItem oi446 = order44.newOrderItem(products4p6, 33200, 10);
        OrderItem oi447 = order44.newOrderItem(products4p7, 33400, 11);
        OrderItem oi448 = order44.newOrderItem(products4p8, 33600, 12);

        // Orders for Supplier Canon - Order 5
        Order order45 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi451 = order45.newOrderItem(products4p1, 32700, 6);
        OrderItem oi452 = order45.newOrderItem(products4p2, 32900, 7);
        OrderItem oi453 = order45.newOrderItem(products4p3, 33100, 8);
        OrderItem oi454 = order45.newOrderItem(products4p4, 33300, 9);
        OrderItem oi455 = order45.newOrderItem(products4p5, 33500, 10);
        OrderItem oi456 = order45.newOrderItem(products4p6, 33700, 11);
        OrderItem oi457 = order45.newOrderItem(products4p7, 33900, 12);
        OrderItem oi458 = order45.newOrderItem(products4p8, 34100, 13);

        // Orders for Supplier Dell - Order 1
        Order order51 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi511 = order51.newOrderItem(products5p1, 8700, 2);
        OrderItem oi512 = order51.newOrderItem(products5p2, 8900, 3);
        OrderItem oi513 = order51.newOrderItem(products5p3, 9100, 4);
        OrderItem oi514 = order51.newOrderItem(products5p4, 9300, 5);
        OrderItem oi515 = order51.newOrderItem(products5p5, 9500, 6);
        OrderItem oi516 = order51.newOrderItem(products5p6, 9700, 7);
        OrderItem oi517 = order51.newOrderItem(products5p7, 9900, 8);
        OrderItem oi518 = order51.newOrderItem(products5p8, 10100, 9);

        // Orders for Supplier Dell - Order 2
        Order order52 = masterorderlist.newOrder(customerProfile6, salesp1);
        OrderItem oi521 = order52.newOrderItem(products5p1, 9200, 3);
        OrderItem oi522 = order52.newOrderItem(products5p2, 9400, 4);
        OrderItem oi523 = order52.newOrderItem(products5p3, 9600, 5);
        OrderItem oi524 = order52.newOrderItem(products5p4, 9800, 6);
        OrderItem oi525 = order52.newOrderItem(products5p5, 10000, 7);
        OrderItem oi526 = order52.newOrderItem(products5p6, 10200, 8);
        OrderItem oi527 = order52.newOrderItem(products5p7, 10400, 9);
        OrderItem oi528 = order52.newOrderItem(products5p8, 10600, 10);

        // Orders for Supplier Dell - Order 3
        Order order53 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi531 = order53.newOrderItem(products5p1, 9700, 4);
        OrderItem oi532 = order53.newOrderItem(products5p2, 9900, 5);
        OrderItem oi533 = order53.newOrderItem(products5p3, 10100, 6);
        OrderItem oi534 = order53.newOrderItem(products5p4, 10300, 7);
        OrderItem oi535 = order53.newOrderItem(products5p5, 10500, 8);
        OrderItem oi536 = order53.newOrderItem(products5p6, 10700, 9);
        OrderItem oi537 = order53.newOrderItem(products5p7, 10900, 10);
        OrderItem oi538 = order53.newOrderItem(products5p8, 11100, 11);

        // Orders for Supplier Dell - Order 4
        Order order54 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi541 = order54.newOrderItem(products5p1, 10200, 5);
        OrderItem oi542 = order54.newOrderItem(products5p2, 10400, 6);
        OrderItem oi543 = order54.newOrderItem(products5p3, 10600, 7);
        OrderItem oi544 = order54.newOrderItem(products5p4, 10800, 8);
        OrderItem oi545 = order54.newOrderItem(products5p5, 11000, 9);
        OrderItem oi546 = order54.newOrderItem(products5p6, 11200, 10);
        OrderItem oi547 = order54.newOrderItem(products5p7, 11400, 11);
        OrderItem oi548 = order54.newOrderItem(products5p8, 11600, 12);

        // Orders for Supplier Dell - Order 5
        Order order55 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi551 = order55.newOrderItem(products5p1, 10700, 6);
        OrderItem oi552 = order55.newOrderItem(products5p2, 10900, 7);
        OrderItem oi553 = order55.newOrderItem(products5p3, 11100, 8);
        OrderItem oi554 = order55.newOrderItem(products5p4, 11300, 9);
        OrderItem oi555 = order55.newOrderItem(products5p5, 11500, 10);
        OrderItem oi556 = order55.newOrderItem(products5p6, 11700, 11);
        OrderItem oi557 = order55.newOrderItem(products5p7, 11900, 12);
        OrderItem oi558 = order55.newOrderItem(products5p8, 12100, 13);
        
         MasterOrderList masterOrderList = business.getMasterOrderList();
         Person salesPerson = personDirectory.newPerson("Xerox sales");

    SalesPersonDirectory salesPersonDirectory = business.getSalesPersonDirectory();
         SalesPersonProfile salesPersonProfile = salesPersonDirectory.newSalesPersonProfile(salesPerson);
        for (int supplierIndex = 0; supplierIndex < supplierDirectory.getSuplierList().size(); supplierIndex++) {
        Supplier supplier = supplierDirectory.getSuplierList().get(supplierIndex);

        // Print supplier name
        System.out.println("Supplier: " + supplier.getName());

        // Iterate through each product of the supplier
        for (int productIndex = 0; productIndex < supplier.getProductCatalog().getProductList().size(); productIndex++) {
            Product product = supplier.getProductCatalog().getProductList().get(productIndex);

            // Set unique product name by adding supplier index
            String uniqueProductName = "Product_S" + (supplierIndex + 1) + "_P" + (productIndex + 1);
            product.setName(uniqueProductName);

            ProductSummary productSummary = new ProductSummary(product);
            System.out.println("    Product: " + product.getProductName());
            System.out.println("        Sales Volume: " + productSummary.getSalesRevenues());
            System.out.println("        Profit Margin: " + productSummary.getProductPricePerformance());
            System.out.println("        Frequency above target: " + productSummary.getNumberAboveTarget());
            System.out.println("        Frequency below target: " + productSummary.getNumberBelowTarget());

            // Generate 10 orders per product and display them
            System.out.println("        Orders for " + product.getProductName() + ":");

            for (int i = 0; i < 10; i++) {
                // Get the same customer for this cycle of 10 orders
                CustomerProfile customer = customerDirectory.getCustomerList().get(i % customerDirectory.getCustomerList().size());
                Order order = masterOrderList.newOrder(customer, salesPersonProfile);
                int quantity = random.nextInt(10) + 1;
                int actualPrice = product.getTargetPrice() + random.nextInt(1000) - 500;
                order.newOrderItem(product, actualPrice, quantity);

                System.out.println("            Order " + (i+1) + ": Customer: " + customer.getPerson().getPersonId() + ", Quantity: " + quantity + ", Price: " + actualPrice);
            }
        }

        System.out.println("\n");
    }
        
    return business;
  }
}
