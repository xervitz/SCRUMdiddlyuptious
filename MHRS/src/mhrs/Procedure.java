/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mhrs;
import java.util.Date;

/**
 *
 * @author Benjamin
 */
public class Procedure {
    String name;
    Date date;
    String notes;
    public Procedure(){}
    void setName(String n){
        name = n;
    }
    void setDate(Date d){
        date = d;
    }
    void setNotes(String n){
        notes = n;
    }
}