package edu.wctc.controller;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author J-Tron
 */
@Named
@SessionScoped
public class DateBean implements Serializable{
   private Date date;
   
   public DateBean(){
       init();
   }

   @PostConstruct 
   private void init(){
       date = Calendar.getInstance().getTime();
   }
    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
  
}
