/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

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
    
    PersonDirectory personDirectory = business.getPersonDirectory();
    Person person1 = personDirectory.newPerson("Harsh");
    Person person2 = personDirectory.newPerson("Rushabh");
    Person person3 = personDirectory.newPerson("Tirth");
    Person person4 = personDirectory.newPerson("Patel");
    Person person5 = personDirectory.newPerson("Darji");
    
    Person xeroxsalesperson1 = personDirectory.newPerson("Xerox sales");
    Person xeroxmarketingperson1 = personDirectory.newPerson("xerox marketing");
    Person xeroxadminperson1 = personDirectory.newPerson("xerox admin");
    
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
    
    customerProfile1.setOrdersize(10);
    customerProfile2.setOrdersize(10);
    customerProfile3.setOrdersize(10);
    customerProfile4.setOrdersize(10);
    customerProfile5.setOrdersize(10);
    
    

    
    
    
        //Supplier 1: Lenovo
        
        ProductCatalog pc1 = supplier1.getProductCatalog();
        Product products1p1 = pc1.newProduct("Scanner 1", 12000, 14000, 19000);
        Product products1p2 = pc1.newProduct("Scanner 2", 13000, 16000, 20000);
        Product products1p3 = pc1.newProduct("Scanner 3", 14000, 17000, 23000);
        Product products1p4 = pc1.newProduct("Scanner 4", 15000, 18000, 44000);
        Product products1p5 = pc1.newProduct("Scanner 5", 16000, 19000, 54000);
        Product products1p6 = pc1.newProduct("Scanner 6", 17000, 20000, 34000);
        Product products1p7 = pc1.newProduct("Scanner 7", 18000, 24000, 76000);
        Product products1p8 = pc1.newProduct("Scanner 8", 19000, 44000, 88000);

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
        Order order12 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi121 = order12.newOrderItem(products1p1, 19200, 3);
        OrderItem oi122 = order12.newOrderItem(products1p2, 19400, 4);
        OrderItem oi123 = order12.newOrderItem(products1p3, 19600, 5);
        OrderItem oi124 = order12.newOrderItem(products1p4, 19800, 6);
        OrderItem oi125 = order12.newOrderItem(products1p5, 20000, 7);
        OrderItem oi126 = order12.newOrderItem(products1p6, 20200, 8);
        OrderItem oi127 = order12.newOrderItem(products1p7, 20400, 9);
        OrderItem oi128 = order12.newOrderItem(products1p8, 20600, 10);

        // Orders for Supplier Lenovo - Order 3
        Order order13 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi131 = order13.newOrderItem(products1p1, 19700, 4);
        OrderItem oi132 = order13.newOrderItem(products1p2, 19900, 5);
        OrderItem oi133 = order13.newOrderItem(products1p3, 20100, 6);
        OrderItem oi134 = order13.newOrderItem(products1p4, 20300, 7);
        OrderItem oi135 = order13.newOrderItem(products1p5, 20500, 8);
        OrderItem oi136 = order13.newOrderItem(products1p6, 20700, 9);
        OrderItem oi137 = order13.newOrderItem(products1p7, 20900, 10);
        OrderItem oi138 = order13.newOrderItem(products1p8, 21100, 11);

        // Orders for Supplier Lenovo - Order 4
        Order order14 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi141 = order14.newOrderItem(products1p1, 20200, 5);
        OrderItem oi142 = order14.newOrderItem(products1p2, 20400, 6);
        OrderItem oi143 = order14.newOrderItem(products1p3, 20600, 7);
        OrderItem oi144 = order14.newOrderItem(products1p4, 20800, 8);
        OrderItem oi145 = order14.newOrderItem(products1p5, 21000, 9);
        OrderItem oi146 = order14.newOrderItem(products1p6, 21200, 10);
        OrderItem oi147 = order14.newOrderItem(products1p7, 21400, 11);
        OrderItem oi148 = order14.newOrderItem(products1p8, 21600, 12);

        // Orders for Supplier Lenovo - Order 5
        Order order15 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi151 = order15.newOrderItem(products1p1, 20700, 6);
        OrderItem oi152 = order15.newOrderItem(products1p2, 20900, 7);
        OrderItem oi153 = order15.newOrderItem(products1p3, 21100, 8);
        OrderItem oi154 = order15.newOrderItem(products1p4, 21300, 9);
        OrderItem oi155 = order15.newOrderItem(products1p5, 21500, 10);
        OrderItem oi156 = order15.newOrderItem(products1p6, 21700, 11);
        OrderItem oi157 = order15.newOrderItem(products1p7, 21900, 12);
        OrderItem oi158 = order15.newOrderItem(products1p8, 22100, 13);

        // Orders for Supplier Lenovo - Order 6
        Order order16 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi161 = order16.newOrderItem(products1p1, 21200, 7);
        OrderItem oi162 = order16.newOrderItem(products1p2, 21400, 8);
        OrderItem oi163 = order16.newOrderItem(products1p3, 21600, 9);
        OrderItem oi164 = order16.newOrderItem(products1p4, 21800, 10);
        OrderItem oi165 = order16.newOrderItem(products1p5, 22000, 11);
        OrderItem oi166 = order16.newOrderItem(products1p6, 22200, 12);
        OrderItem oi167 = order16.newOrderItem(products1p7, 22400, 13);
        OrderItem oi168 = order16.newOrderItem(products1p8, 22600, 14);

        // Orders for Supplier Lenovo - Order 7
        Order order17 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi171 = order17.newOrderItem(products1p1, 21700, 8);
        OrderItem oi172 = order17.newOrderItem(products1p2, 21900, 9);
        OrderItem oi173 = order17.newOrderItem(products1p3, 22100, 10);
        OrderItem oi174 = order17.newOrderItem(products1p4, 22300, 11);
        OrderItem oi175 = order17.newOrderItem(products1p5, 22500, 12);
        OrderItem oi176 = order17.newOrderItem(products1p6, 22700, 13);
        OrderItem oi177 = order17.newOrderItem(products1p7, 22900, 14);
        OrderItem oi178 = order17.newOrderItem(products1p8, 23100, 15);

        // Orders for Supplier Lenovo - Order 8
        Order order18 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi181 = order18.newOrderItem(products1p1, 22200, 9);
        OrderItem oi182 = order18.newOrderItem(products1p2, 22400, 10);
        OrderItem oi183 = order18.newOrderItem(products1p3, 22600, 11);
        OrderItem oi184 = order18.newOrderItem(products1p4, 22800, 12);
        OrderItem oi185 = order18.newOrderItem(products1p5, 23000, 13);
        OrderItem oi186 = order18.newOrderItem(products1p6, 23200, 14);
        OrderItem oi187 = order18.newOrderItem(products1p7, 23400, 15);
        OrderItem oi188 = order18.newOrderItem(products1p8, 23600, 16);

        // Orders for Supplier Lenovo - Order 9
        Order order19 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi191 = order19.newOrderItem(products1p1, 22700, 10);
        OrderItem oi192 = order19.newOrderItem(products1p2, 22900, 11);
        OrderItem oi193 = order19.newOrderItem(products1p3, 23100, 12);
        OrderItem oi194 = order19.newOrderItem(products1p4, 23300, 13);
        OrderItem oi195 = order19.newOrderItem(products1p5, 23500, 14);
        OrderItem oi196 = order19.newOrderItem(products1p6, 23700, 15);
        OrderItem oi197 = order19.newOrderItem(products1p7, 23900, 16);
        OrderItem oi198 = order19.newOrderItem(products1p8, 24100, 17);

        // Orders for Supplier Lenovo - Order 10
        Order order110 = masterorderlist.newOrder(customerProfile1, salesp1);
        OrderItem oi1101 = order110.newOrderItem(products1p1, 23200, 11);
        OrderItem oi1102 = order110.newOrderItem(products1p2, 23400, 12);
        OrderItem oi1103 = order110.newOrderItem(products1p3, 23600, 13);
        OrderItem oi1104 = order110.newOrderItem(products1p4, 23800, 14);
        OrderItem oi1105 = order110.newOrderItem(products1p5, 24000, 15);
        OrderItem oi1106 = order110.newOrderItem(products1p6, 24200, 16);
        OrderItem oi1107 = order110.newOrderItem(products1p7, 24400, 17);
        OrderItem oi1108 = order110.newOrderItem(products1p8, 24600, 18);

        // Orders for Supplier Epson - Order 1
        Order order21 = masterorderlist.newOrder(customerProfile2, salesp1);
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
        Order order23 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi231 = order23.newOrderItem(products2p1, 14200, 4);
        OrderItem oi232 = order23.newOrderItem(products2p2, 14400, 5);
        OrderItem oi233 = order23.newOrderItem(products2p3, 14600, 6);
        OrderItem oi234 = order23.newOrderItem(products2p4, 14800, 7);
        OrderItem oi235 = order23.newOrderItem(products2p5, 15000, 8);
        OrderItem oi236 = order23.newOrderItem(products2p6, 15200, 9);
        OrderItem oi237 = order23.newOrderItem(products2p7, 15400, 10);
        OrderItem oi238 = order23.newOrderItem(products2p8, 15600, 11);

        // Orders for Supplier Epson - Order 4
        Order order24 = masterorderlist.newOrder(customerProfile2, salesp1);
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

        // Orders for Supplier Epson - Order 6
        Order order26 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi261 = order26.newOrderItem(products2p1, 15700, 7);
        OrderItem oi262 = order26.newOrderItem(products2p2, 15900, 8);
        OrderItem oi263 = order26.newOrderItem(products2p3, 16100, 9);
        OrderItem oi264 = order26.newOrderItem(products2p4, 16300, 10);
        OrderItem oi265 = order26.newOrderItem(products2p5, 16500, 11);
        OrderItem oi266 = order26.newOrderItem(products2p6, 16700, 12);
        OrderItem oi267 = order26.newOrderItem(products2p7, 16900, 13);
        OrderItem oi268 = order26.newOrderItem(products2p8, 17100, 14);

        // Orders for Supplier Epson - Order 7
        Order order27 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi271 = order27.newOrderItem(products2p1, 16200, 8);
        OrderItem oi272 = order27.newOrderItem(products2p2, 16400, 9);
        OrderItem oi273 = order27.newOrderItem(products2p3, 16600, 10);
        OrderItem oi274 = order27.newOrderItem(products2p4, 16800, 11);
        OrderItem oi275 = order27.newOrderItem(products2p5, 17000, 12);
        OrderItem oi276 = order27.newOrderItem(products2p6, 17200, 13);
        OrderItem oi277 = order27.newOrderItem(products2p7, 17400, 14);
        OrderItem oi278 = order27.newOrderItem(products2p8, 17600, 15);

        // Orders for Supplier Epson - Order 8
        Order order28 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi281 = order28.newOrderItem(products2p1, 16700, 9);
        OrderItem oi282 = order28.newOrderItem(products2p2, 16900, 10);
        OrderItem oi283 = order28.newOrderItem(products2p3, 17100, 11);
        OrderItem oi284 = order28.newOrderItem(products2p4, 17300, 12);
        OrderItem oi285 = order28.newOrderItem(products2p5, 17500, 13);
        OrderItem oi286 = order28.newOrderItem(products2p6, 17700, 14);
        OrderItem oi287 = order28.newOrderItem(products2p7, 17900, 15);
        OrderItem oi288 = order28.newOrderItem(products2p8, 18100, 16);

        // Orders for Supplier Epson - Order 9
        Order order29 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi291 = order29.newOrderItem(products2p1, 17200, 10);
        OrderItem oi292 = order29.newOrderItem(products2p2, 17400, 11);
        OrderItem oi293 = order29.newOrderItem(products2p3, 17600, 12);
        OrderItem oi294 = order29.newOrderItem(products2p4, 17800, 13);
        OrderItem oi295 = order29.newOrderItem(products2p5, 18000, 14);
        OrderItem oi296 = order29.newOrderItem(products2p6, 18200, 15);
        OrderItem oi297 = order29.newOrderItem(products2p7, 18400, 16);
        OrderItem oi298 = order29.newOrderItem(products2p8, 18600, 17);

        // Orders for Supplier Epson - Order 10
        Order order210 = masterorderlist.newOrder(customerProfile2, salesp1);
        OrderItem oi2101 = order210.newOrderItem(products2p1, 17700, 11);
        OrderItem oi2102 = order210.newOrderItem(products2p2, 17900, 12);
        OrderItem oi2103 = order210.newOrderItem(products2p3, 18100, 13);
        OrderItem oi2104 = order210.newOrderItem(products2p4, 18300, 14);
        OrderItem oi2105 = order210.newOrderItem(products2p5, 18500, 15);
        OrderItem oi2106 = order210.newOrderItem(products2p6, 18700, 16);
        OrderItem oi2107 = order210.newOrderItem(products2p7, 18900, 17);
        OrderItem oi2108 = order210.newOrderItem(products2p8, 19100, 18);

        // Orders for Supplier HP - Order 1
        Order order31 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi311 = order31.newOrderItem(products3p1, 45700, 2);
        OrderItem oi312 = order31.newOrderItem(products3p2, 45900, 3);
        OrderItem oi313 = order31.newOrderItem(products3p3, 46100, 4);
        OrderItem oi314 = order31.newOrderItem(products3p4, 46300, 5);
        OrderItem oi315 = order31.newOrderItem(products3p5, 46500, 6);
        OrderItem oi316 = order31.newOrderItem(products3p6, 46700, 7);
        OrderItem oi317 = order31.newOrderItem(products3p7, 46900, 8);
        OrderItem oi318 = order31.newOrderItem(products3p8, 47100, 9);

        // Orders for Supplier HP - Order 2
        Order order32 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi321 = order32.newOrderItem(products3p1, 46200, 3);
        OrderItem oi322 = order32.newOrderItem(products3p2, 46400, 4);
        OrderItem oi323 = order32.newOrderItem(products3p3, 46600, 5);
        OrderItem oi324 = order32.newOrderItem(products3p4, 46800, 6);
        OrderItem oi325 = order32.newOrderItem(products3p5, 47000, 7);
        OrderItem oi326 = order32.newOrderItem(products3p6, 47200, 8);
        OrderItem oi327 = order32.newOrderItem(products3p7, 47400, 9);
        OrderItem oi328 = order32.newOrderItem(products3p8, 47600, 10);

        // Orders for Supplier HP - Order 3
        Order order33 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi331 = order33.newOrderItem(products3p1, 46700, 4);
        OrderItem oi332 = order33.newOrderItem(products3p2, 46900, 5);
        OrderItem oi333 = order33.newOrderItem(products3p3, 47100, 6);
        OrderItem oi334 = order33.newOrderItem(products3p4, 47300, 7);
        OrderItem oi335 = order33.newOrderItem(products3p5, 47500, 8);
        OrderItem oi336 = order33.newOrderItem(products3p6, 47700, 9);
        OrderItem oi337 = order33.newOrderItem(products3p7, 47900, 10);
        OrderItem oi338 = order33.newOrderItem(products3p8, 48100, 11);

        // Orders for Supplier HP - Order 4
        Order order34 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi341 = order34.newOrderItem(products3p1, 47200, 5);
        OrderItem oi342 = order34.newOrderItem(products3p2, 47400, 6);
        OrderItem oi343 = order34.newOrderItem(products3p3, 47600, 7);
        OrderItem oi344 = order34.newOrderItem(products3p4, 47800, 8);
        OrderItem oi345 = order34.newOrderItem(products3p5, 48000, 9);
        OrderItem oi346 = order34.newOrderItem(products3p6, 48200, 10);
        OrderItem oi347 = order34.newOrderItem(products3p7, 48400, 11);
        OrderItem oi348 = order34.newOrderItem(products3p8, 48600, 12);

        // Orders for Supplier HP - Order 5
        Order order35 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi351 = order35.newOrderItem(products3p1, 47700, 6);
        OrderItem oi352 = order35.newOrderItem(products3p2, 47900, 7);
        OrderItem oi353 = order35.newOrderItem(products3p3, 48100, 8);
        OrderItem oi354 = order35.newOrderItem(products3p4, 48300, 9);
        OrderItem oi355 = order35.newOrderItem(products3p5, 48500, 10);
        OrderItem oi356 = order35.newOrderItem(products3p6, 48700, 11);
        OrderItem oi357 = order35.newOrderItem(products3p7, 48900, 12);
        OrderItem oi358 = order35.newOrderItem(products3p8, 49100, 13);

        // Orders for Supplier HP - Order 6
        Order order36 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi361 = order36.newOrderItem(products3p1, 48200, 7);
        OrderItem oi362 = order36.newOrderItem(products3p2, 48400, 8);
        OrderItem oi363 = order36.newOrderItem(products3p3, 48600, 9);
        OrderItem oi364 = order36.newOrderItem(products3p4, 48800, 10);
        OrderItem oi365 = order36.newOrderItem(products3p5, 49000, 11);
        OrderItem oi366 = order36.newOrderItem(products3p6, 49200, 12);
        OrderItem oi367 = order36.newOrderItem(products3p7, 49400, 13);
        OrderItem oi368 = order36.newOrderItem(products3p8, 49600, 14);

        // Orders for Supplier HP - Order 7
        Order order37 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi371 = order37.newOrderItem(products3p1, 48700, 8);
        OrderItem oi372 = order37.newOrderItem(products3p2, 48900, 9);
        OrderItem oi373 = order37.newOrderItem(products3p3, 49100, 10);
        OrderItem oi374 = order37.newOrderItem(products3p4, 49300, 11);
        OrderItem oi375 = order37.newOrderItem(products3p5, 49500, 12);
        OrderItem oi376 = order37.newOrderItem(products3p6, 49700, 13);
        OrderItem oi377 = order37.newOrderItem(products3p7, 49900, 14);
        OrderItem oi378 = order37.newOrderItem(products3p8, 50100, 15);

        // Orders for Supplier HP - Order 8
        Order order38 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi381 = order38.newOrderItem(products3p1, 49200, 9);
        OrderItem oi382 = order38.newOrderItem(products3p2, 49400, 10);
        OrderItem oi383 = order38.newOrderItem(products3p3, 49600, 11);
        OrderItem oi384 = order38.newOrderItem(products3p4, 49800, 12);
        OrderItem oi385 = order38.newOrderItem(products3p5, 50000, 13);
        OrderItem oi386 = order38.newOrderItem(products3p6, 50200, 14);
        OrderItem oi387 = order38.newOrderItem(products3p7, 50400, 15);
        OrderItem oi388 = order38.newOrderItem(products3p8, 50600, 16);

        // Orders for Supplier HP - Order 9
        Order order39 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi391 = order39.newOrderItem(products3p1, 49700, 10);
        OrderItem oi392 = order39.newOrderItem(products3p2, 49900, 11);
        OrderItem oi393 = order39.newOrderItem(products3p3, 50100, 12);
        OrderItem oi394 = order39.newOrderItem(products3p4, 50300, 13);
        OrderItem oi395 = order39.newOrderItem(products3p5, 50500, 14);
        OrderItem oi396 = order39.newOrderItem(products3p6, 50700, 15);
        OrderItem oi397 = order39.newOrderItem(products3p7, 50900, 16);
        OrderItem oi398 = order39.newOrderItem(products3p8, 51100, 17);

        // Orders for Supplier HP - Order 10
        Order order310 = masterorderlist.newOrder(customerProfile3, salesp1);
        OrderItem oi3101 = order310.newOrderItem(products3p1, 50200, 11);
        OrderItem oi3102 = order310.newOrderItem(products3p2, 50400, 12);
        OrderItem oi3103 = order310.newOrderItem(products3p3, 50600, 13);
        OrderItem oi3104 = order310.newOrderItem(products3p4, 50800, 14);
        OrderItem oi3105 = order310.newOrderItem(products3p5, 51000, 15);
        OrderItem oi3106 = order310.newOrderItem(products3p6, 51200, 16);
        OrderItem oi3107 = order310.newOrderItem(products3p7, 51400, 17);
        OrderItem oi3108 = order310.newOrderItem(products3p8, 51600, 18);

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
        Order order42 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi421 = order42.newOrderItem(products4p1, 31200, 3);
        OrderItem oi422 = order42.newOrderItem(products4p2, 31400, 4);
        OrderItem oi423 = order42.newOrderItem(products4p3, 31600, 5);
        OrderItem oi424 = order42.newOrderItem(products4p4, 31800, 6);
        OrderItem oi425 = order42.newOrderItem(products4p5, 32000, 7);
        OrderItem oi426 = order42.newOrderItem(products4p6, 32200, 8);
        OrderItem oi427 = order42.newOrderItem(products4p7, 32400, 9);
        OrderItem oi428 = order42.newOrderItem(products4p8, 32600, 10);

        // Orders for Supplier Canon - Order 3
        Order order43 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi431 = order43.newOrderItem(products4p1, 31700, 4);
        OrderItem oi432 = order43.newOrderItem(products4p2, 31900, 5);
        OrderItem oi433 = order43.newOrderItem(products4p3, 32100, 6);
        OrderItem oi434 = order43.newOrderItem(products4p4, 32300, 7);
        OrderItem oi435 = order43.newOrderItem(products4p5, 32500, 8);
        OrderItem oi436 = order43.newOrderItem(products4p6, 32700, 9);
        OrderItem oi437 = order43.newOrderItem(products4p7, 32900, 10);
        OrderItem oi438 = order43.newOrderItem(products4p8, 33100, 11);

        // Orders for Supplier Canon - Order 4
        Order order44 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi441 = order44.newOrderItem(products4p1, 32200, 5);
        OrderItem oi442 = order44.newOrderItem(products4p2, 32400, 6);
        OrderItem oi443 = order44.newOrderItem(products4p3, 32600, 7);
        OrderItem oi444 = order44.newOrderItem(products4p4, 32800, 8);
        OrderItem oi445 = order44.newOrderItem(products4p5, 33000, 9);
        OrderItem oi446 = order44.newOrderItem(products4p6, 33200, 10);
        OrderItem oi447 = order44.newOrderItem(products4p7, 33400, 11);
        OrderItem oi448 = order44.newOrderItem(products4p8, 33600, 12);

        // Orders for Supplier Canon - Order 5
        Order order45 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi451 = order45.newOrderItem(products4p1, 32700, 6);
        OrderItem oi452 = order45.newOrderItem(products4p2, 32900, 7);
        OrderItem oi453 = order45.newOrderItem(products4p3, 33100, 8);
        OrderItem oi454 = order45.newOrderItem(products4p4, 33300, 9);
        OrderItem oi455 = order45.newOrderItem(products4p5, 33500, 10);
        OrderItem oi456 = order45.newOrderItem(products4p6, 33700, 11);
        OrderItem oi457 = order45.newOrderItem(products4p7, 33900, 12);
        OrderItem oi458 = order45.newOrderItem(products4p8, 34100, 13);

        // Orders for Supplier Canon - Order 6
        Order order46 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi461 = order46.newOrderItem(products4p1, 33200, 7);
        OrderItem oi462 = order46.newOrderItem(products4p2, 33400, 8);
        OrderItem oi463 = order46.newOrderItem(products4p3, 33600, 9);
        OrderItem oi464 = order46.newOrderItem(products4p4, 33800, 10);
        OrderItem oi465 = order46.newOrderItem(products4p5, 34000, 11);
        OrderItem oi466 = order46.newOrderItem(products4p6, 34200, 12);
        OrderItem oi467 = order46.newOrderItem(products4p7, 34400, 13);
        OrderItem oi468 = order46.newOrderItem(products4p8, 34600, 14);

        // Orders for Supplier Canon - Order 7
        Order order47 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi471 = order47.newOrderItem(products4p1, 33700, 8);
        OrderItem oi472 = order47.newOrderItem(products4p2, 33900, 9);
        OrderItem oi473 = order47.newOrderItem(products4p3, 34100, 10);
        OrderItem oi474 = order47.newOrderItem(products4p4, 34300, 11);
        OrderItem oi475 = order47.newOrderItem(products4p5, 34500, 12);
        OrderItem oi476 = order47.newOrderItem(products4p6, 34700, 13);
        OrderItem oi477 = order47.newOrderItem(products4p7, 34900, 14);
        OrderItem oi478 = order47.newOrderItem(products4p8, 35100, 15);

        // Orders for Supplier Canon - Order 8
        Order order48 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi481 = order48.newOrderItem(products4p1, 34200, 9);
        OrderItem oi482 = order48.newOrderItem(products4p2, 34400, 10);
        OrderItem oi483 = order48.newOrderItem(products4p3, 34600, 11);
        OrderItem oi484 = order48.newOrderItem(products4p4, 34800, 12);
        OrderItem oi485 = order48.newOrderItem(products4p5, 35000, 13);
        OrderItem oi486 = order48.newOrderItem(products4p6, 35200, 14);
        OrderItem oi487 = order48.newOrderItem(products4p7, 35400, 15);
        OrderItem oi488 = order48.newOrderItem(products4p8, 35600, 16);

        // Orders for Supplier Canon - Order 9
        Order order49 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi491 = order49.newOrderItem(products4p1, 34700, 10);
        OrderItem oi492 = order49.newOrderItem(products4p2, 34900, 11);
        OrderItem oi493 = order49.newOrderItem(products4p3, 35100, 12);
        OrderItem oi494 = order49.newOrderItem(products4p4, 35300, 13);
        OrderItem oi495 = order49.newOrderItem(products4p5, 35500, 14);
        OrderItem oi496 = order49.newOrderItem(products4p6, 35700, 15);
        OrderItem oi497 = order49.newOrderItem(products4p7, 35900, 16);
        OrderItem oi498 = order49.newOrderItem(products4p8, 36100, 17);

        // Orders for Supplier Canon - Order 10
        Order order410 = masterorderlist.newOrder(customerProfile4, salesp1);
        OrderItem oi4101 = order410.newOrderItem(products4p1, 35200, 11);
        OrderItem oi4102 = order410.newOrderItem(products4p2, 35400, 12);
        OrderItem oi4103 = order410.newOrderItem(products4p3, 35600, 13);
        OrderItem oi4104 = order410.newOrderItem(products4p4, 35800, 14);
        OrderItem oi4105 = order410.newOrderItem(products4p5, 36000, 15);
        OrderItem oi4106 = order410.newOrderItem(products4p6, 36200, 16);
        OrderItem oi4107 = order410.newOrderItem(products4p7, 36400, 17);
        OrderItem oi4108 = order410.newOrderItem(products4p8, 36600, 18);

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
        Order order52 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi521 = order52.newOrderItem(products5p1, 9200, 3);
        OrderItem oi522 = order52.newOrderItem(products5p2, 9400, 4);
        OrderItem oi523 = order52.newOrderItem(products5p3, 9600, 5);
        OrderItem oi524 = order52.newOrderItem(products5p4, 9800, 6);
        OrderItem oi525 = order52.newOrderItem(products5p5, 10000, 7);
        OrderItem oi526 = order52.newOrderItem(products5p6, 10200, 8);
        OrderItem oi527 = order52.newOrderItem(products5p7, 10400, 9);
        OrderItem oi528 = order52.newOrderItem(products5p8, 10600, 10);

        // Orders for Supplier Dell - Order 3
        Order order53 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi531 = order53.newOrderItem(products5p1, 9700, 4);
        OrderItem oi532 = order53.newOrderItem(products5p2, 9900, 5);
        OrderItem oi533 = order53.newOrderItem(products5p3, 10100, 6);
        OrderItem oi534 = order53.newOrderItem(products5p4, 10300, 7);
        OrderItem oi535 = order53.newOrderItem(products5p5, 10500, 8);
        OrderItem oi536 = order53.newOrderItem(products5p6, 10700, 9);
        OrderItem oi537 = order53.newOrderItem(products5p7, 10900, 10);
        OrderItem oi538 = order53.newOrderItem(products5p8, 11100, 11);

        // Orders for Supplier Dell - Order 4
        Order order54 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi541 = order54.newOrderItem(products5p1, 10200, 5);
        OrderItem oi542 = order54.newOrderItem(products5p2, 10400, 6);
        OrderItem oi543 = order54.newOrderItem(products5p3, 10600, 7);
        OrderItem oi544 = order54.newOrderItem(products5p4, 10800, 8);
        OrderItem oi545 = order54.newOrderItem(products5p5, 11000, 9);
        OrderItem oi546 = order54.newOrderItem(products5p6, 11200, 10);
        OrderItem oi547 = order54.newOrderItem(products5p7, 11400, 11);
        OrderItem oi548 = order54.newOrderItem(products5p8, 11600, 12);

        // Orders for Supplier Dell - Order 5
        Order order55 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi551 = order55.newOrderItem(products5p1, 10700, 6);
        OrderItem oi552 = order55.newOrderItem(products5p2, 10900, 7);
        OrderItem oi553 = order55.newOrderItem(products5p3, 11100, 8);
        OrderItem oi554 = order55.newOrderItem(products5p4, 11300, 9);
        OrderItem oi555 = order55.newOrderItem(products5p5, 11500, 10);
        OrderItem oi556 = order55.newOrderItem(products5p6, 11700, 11);
        OrderItem oi557 = order55.newOrderItem(products5p7, 11900, 12);
        OrderItem oi558 = order55.newOrderItem(products5p8, 12100, 13);

        // Orders for Supplier Dell - Order 6
        Order order56 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi561 = order56.newOrderItem(products5p1, 11200, 7);
        OrderItem oi562 = order56.newOrderItem(products5p2, 11400, 8);
        OrderItem oi563 = order56.newOrderItem(products5p3, 11600, 9);
        OrderItem oi564 = order56.newOrderItem(products5p4, 11800, 10);
        OrderItem oi565 = order56.newOrderItem(products5p5, 12000, 11);
        OrderItem oi566 = order56.newOrderItem(products5p6, 12200, 12);
        OrderItem oi567 = order56.newOrderItem(products5p7, 12400, 13);
        OrderItem oi568 = order56.newOrderItem(products5p8, 12600, 14);

        // Orders for Supplier Dell - Order 7
        Order order57 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi571 = order57.newOrderItem(products5p1, 11700, 8);
        OrderItem oi572 = order57.newOrderItem(products5p2, 11900, 9);
        OrderItem oi573 = order57.newOrderItem(products5p3, 12100, 10);
        OrderItem oi574 = order57.newOrderItem(products5p4, 12300, 11);
        OrderItem oi575 = order57.newOrderItem(products5p5, 12500, 12);
        OrderItem oi576 = order57.newOrderItem(products5p6, 12700, 13);
        OrderItem oi577 = order57.newOrderItem(products5p7, 12900, 14);
        OrderItem oi578 = order57.newOrderItem(products5p8, 13100, 15);

        // Orders for Supplier Dell - Order 8
        Order order58 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi581 = order58.newOrderItem(products5p1, 12200, 9);
        OrderItem oi582 = order58.newOrderItem(products5p2, 12400, 10);
        OrderItem oi583 = order58.newOrderItem(products5p3, 12600, 11);
        OrderItem oi584 = order58.newOrderItem(products5p4, 12800, 12);
        OrderItem oi585 = order58.newOrderItem(products5p5, 13000, 13);
        OrderItem oi586 = order58.newOrderItem(products5p6, 13200, 14);
        OrderItem oi587 = order58.newOrderItem(products5p7, 13400, 15);
        OrderItem oi588 = order58.newOrderItem(products5p8, 13600, 16);

        // Orders for Supplier Dell - Order 9
        Order order59 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi591 = order59.newOrderItem(products5p1, 12700, 10);
        OrderItem oi592 = order59.newOrderItem(products5p2, 12900, 11);
        OrderItem oi593 = order59.newOrderItem(products5p3, 13100, 12);
        OrderItem oi594 = order59.newOrderItem(products5p4, 13300, 13);
        OrderItem oi595 = order59.newOrderItem(products5p5, 13500, 14);
        OrderItem oi596 = order59.newOrderItem(products5p6, 13700, 15);
        OrderItem oi597 = order59.newOrderItem(products5p7, 13900, 16);
        OrderItem oi598 = order59.newOrderItem(products5p8, 14100, 17);

        // Orders for Supplier Dell - Order 10
        Order order510 = masterorderlist.newOrder(customerProfile5, salesp1);
        OrderItem oi5101 = order510.newOrderItem(products5p1, 13200, 11);
        OrderItem oi5102 = order510.newOrderItem(products5p2, 13400, 12);
        OrderItem oi5103 = order510.newOrderItem(products5p3, 13600, 13);
        OrderItem oi5104 = order510.newOrderItem(products5p4, 13800, 14);
        OrderItem oi5105 = order510.newOrderItem(products5p5, 14000, 15);
        OrderItem oi5106 = order510.newOrderItem(products5p6, 14200, 16);
        OrderItem oi5107 = order510.newOrderItem(products5p7, 14400, 17);
        OrderItem oi5108 = order510.newOrderItem(products5p8, 14600, 18);

    

    return business;
    
    
  }
}
