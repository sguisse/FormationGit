package com.sgu.formation.customers.biz.customer.entity;

import java.time.LocalDate;

public class Customer {
   
   private Integer id;
   private String name;
   private LocalDate birthday;
   
   
   public Customer() {
      super();
      // TODO Auto-generated constructor stub
   }


   public Integer getId() {
      return id;
   }


   public void setId(Integer id) {
      this.id = id;
   }


   public String getName() {
      return name;
   }


   public void setName(String name) {
      this.name = name;
   }


   public LocalDate getBirthday() {
      return birthday;
   }


   public void setBirthday(LocalDate birthday) {
      this.birthday = birthday;
   }
   
   

}
