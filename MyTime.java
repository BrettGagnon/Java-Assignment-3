/*
 * Intro to Java Assignment 3
 * Brett Gagnon
 * 9/27/2018
 * Source Code
 */

package assignment3mytime;


/**
 * MyTime - a simple time class
 *
 * Add code to replace the temporary 'return' statements in the methods,
 * and additional parameter checking code in the setTime method, etc.
 * The temporary 'return' statements are needed to compile OK until
 * you replace them with the actual code.
 */
public class MyTime
{
    // Instance variables holding the time (in 24 hour universal form).
    private int mHour;      // 0 - 23
    private int mMinute;    // 0 - 59
    private int mSecond;    // 0 - 59

    /**
     * Sets the time value for this MyTime object. If *any* of the parameter
     * values are out of range, the time is set to 00:00:00.
     *
     * @param hour      the hour (0 to 23).
     * @param minute    the minute (0 to 59).
     * @param second    the second (0 to 59).
     */
    public void setTime(int hour, int minute, int second)
    {

        // TODO - add parameter checking code, and set the instance variables.
        // If any of the parameters are out of range, set all the instance variables to zero.
        
          // if mHour is greater than 23 or less than 0, reset it to 0. else, keep it the same
          
        if (hour > 23 || hour < 0)
        {
            mHour = 0; mMinute = 0; mSecond = 0;
        }
        
        else if (minute > 59 || minute < 0)
        {
            mHour = 0; mMinute = 0; mSecond = 0;
        }
        
        else if (second > 59 || second < 0 )
        {
            mHour = 0; mMinute = 0; mSecond = 0;
        }
        else 
        {
            mHour = hour; mMinute = minute; mSecond = second;
        }
    }

    /**
     * Returns the hour value represented by this MyTime.
     *
     * @return the hour value of this object as an int.
     */
    public int getHour()
    {
        return mHour;  // TODO - replace --- replaced 0 with mHour
    }

    /**
     * Returns the minute value represented by this MyTime.
     *
     * @return the minute value of this object as an int.
     */
    public int getMinute()
    {
        return mMinute;  // replaced 0 with mMinute
    }

    /**
     * Returns the second value represented by this MyTime.
     *
     * @return  the second value of this object as an int.
     */
    public int getSecond()
    {
        return mSecond;  // replaced 0 with mSecond
    }

    /**
     * Compares this MyTime object against another MyTime object.
     * The result is true if and only if the argument is not null
     * and represents a time that is the same time as represented
     * by this object
     *
     * @param  other    the object to be compared.
     * @returns  true if both objects represent the same time value,
     *           false otherwise.
     */
    public boolean equals(MyTime other)
    {
        // TODO - add code to return 'true' if 'this' MyTime matches
        // the time values in the 'other' MyTime object, else return false.
       
        if (mHour == other.mHour &&
           mMinute == other.mMinute &&
           mSecond == other.mSecond)
       return true;

        return false;
    }

    /**
     * Returns the time of this MyTime object in HH:MM:SS AM/PM form.
     * Ex: time values of 9,15,0 returns:  9:15:00 AM
     * Ex: time values of 23,30,0 returns:  11:30:00 PM
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS AM/PM .
     */
    public String toString()
    {
        String result = "";
        int hour;
        String time = "";

        // TODO - add code to format the time in the instance variables
        // into HH:MM:SS AM/PM time (hour ranges from 1 to 12, AM or PM)
        // as a string and return it. Call the twoDigits() method to
        // convert each int value to String.
        
        if (mHour == 0 || mHour == 12)   //if the mHour instance value is 0 or 12, 
                                         //the formatted hour is 12 (either midnight or noon).
            hour = 12;
        else
                                         // the formatted hour is mHour modulo 12
            hour = mHour %12;

        if (mHour < 12)       //if the mHour instance value is less than 12
    
        //the time is AM (00:00:00 is 12 o'clock AM - midnight)
        time = "AM";
    
        else
        // the time is PM (12:00:00 is 12 o'clock PM - noon)
        time = "PM";

//Format the string to be returned using the hour value calculated above, the mMinute
//and mSecond instance values, and the AM/PM calculated above. Call twoDigits() on the mMinute and mSecond 
//values to ensure they are formatted as two digits.

result = "" + hour + ":" + twoDigits(mMinute) + ":" + twoDigits(mSecond) + " " + time;

        return result;
    }

    /**
     * Returns the time of this MyTime object in 24 hour universal form.
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS universal time.
     */
    public String toUniversalString()
    {
        String result = "";

        // TODO - add code to format the time in the instance variables
        // into HH:MM:SS universal time (hour ranges from 0 to 23)
        // as a string and return it. Call the twoDigits() method to
        // convert each int value to String.
        
        result = twoDigits(mHour) + ":" + twoDigits(mMinute) + ":" + twoDigits(mSecond);

        return result;
    }

    /**
     * Returns the parameter value as a two digit String (with leading 0 if needed)
     *
     * @return the parameter 'value' formatted as a two digit String
     *         (with leading zero if needed).
     */
    private String twoDigits(int value)
    {
        String result = "";

        // TODO - Use the Integer.toString(int) method to convert
        // 'value' to String format, and add a leading "0" if
        // value is less than 10 in order to return a string with
        // two digits.
        
        
        if (value < 10)
            
           result = 0 + Integer.toString(value);
       
        else
            
           result = Integer.toString(value);

        return result;
    }

}


