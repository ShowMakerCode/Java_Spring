/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 98tae
 */
public class Xdate {
    public Date prase(String StringDate , String partern) throws ParseException{
        SimpleDateFormat sldf = new SimpleDateFormat();
        sldf.applyPattern(partern);
      return  sldf.parse(StringDate);
   
    }
    
}
