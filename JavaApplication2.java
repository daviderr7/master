/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author David
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String plate = "PDI-0078";
        String date= "2016-08-04";
        Time time = Time.valueOf("16:30:00");
        
        if(predictor(plate,date,time)==true)
        {
            System.out.print("The car can't be on the street");
        }else
        {
            System.out.print("The car ccould be on street");
        }



    }

    private static boolean predictor(String plate, String date, Time time) {
        
        int day = dateToDay(date);
        Boolean infraction=false;
        switch(day){
            case 2:
            {
                if(plate.charAt(7)== '1' ||plate.charAt(7)=='2')
                {
                    infraction =verifyTime(time);
                    
                }
                   
                                             
             
                break;
            }
                case 3:
            {
                if(plate.charAt(7)== '3' ||plate.charAt(7)=='4')
                {
                    infraction =verifyTime(time);
                    
                }
                   
                                             
             
                break;
            }
                    case 4:
            {
                if(plate.charAt(7)== '5' ||plate.charAt(7)=='6')
                {
                    infraction =verifyTime(time);
                    
                }
                   
                                             
             
                break;
            }
                        case 5:
            {
                if(plate.charAt(7)== '7' ||plate.charAt(7)=='8')
                {
                    infraction =verifyTime(time);
                    
                }
                   
                                             
             
                break;
            }
                            case 6:
            {
                if(plate.charAt(7)== '9' ||plate.charAt(7)=='0')
                {
                    infraction =verifyTime(time);
                    
                }
                   
                                             
             
                break;
            }
      
            default :{
            System.out.print("You can relax, It's weekend !!!"+plate.charAt(7));}
        
        
        
        
        }
        return infraction;
        
    }

    private static int dateToDay(String date) {

        GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(Date.valueOf(date));
	return cal.get(Calendar.DAY_OF_WEEK);	
      
    }

    private static Boolean verifyTime(Time time) {
        Time sevenAM = Time.valueOf("07:00:00");
        Time nineAM = Time.valueOf("09:30:00");
        Time fourPM = Time.valueOf("16:00:00");
        Time sevenPM = Time.valueOf("19:30:00");
        Boolean infraction =false;
        if(time.after(sevenAM)&&time.before(nineAM))
        {
            infraction =true;
        }
        else if (time.after(fourPM)&&time.before(sevenPM))
        {
            infraction= true;
        }
      return infraction;
    }

   
    
}
