package com.DigitTestPackage;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
import org.hamcrest.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import com.DigitArrays.*;

/**
 *
 * @author ali.guder
 */
//@RunWith(Parameterized.class)
public class DigitArrtTest {
    
    
    @Parameter(1)
    public int fInput=1;

    @Parameter(2)
    public int fExpected=1;

    
    public DigitArrtTest() {
        
    }
    
 
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         assertEquals("1", "1");
     }
     
     
     @Test
     
    public void testWithParameter(int num2) {
        
        Integer num = 7;
        DigitArray arr = new DigitArray(num);
        
        assertEquals(7, arr.getValue());
        
        Long longNum = 8L;
        arr = new DigitArray(longNum);
        
        assertEquals(9, arr.getLongValue());
    }
}
