/*
 *   Copyright (c) 2014 Sonrisa Informatikai Kft. All Rights Reserved.
 * 
 *  This software is the confidential and proprietary information of
 *  Sonrisa Informatikai Kft. ("Confidential Information").
 *  You shall not disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Sonrisa.
 * 
 *  SONRISA MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 *  THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 *  TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 *  PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SONRISA SHALL NOT BE LIABLE FOR
 *  ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 *  DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package hu.sonrisa.knightmove;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joe
 */
public class GameTest {
    
    
    @Test
    public void oneStepTest() {
        // ---- arrange
        final String expBoard = "#..\n"
                              + "..#\n";
        Game c = new Game(2, 3);
        
        // ---- act
        final String result = c.play("rd");
        
        // ---- assert
        assertEquals(expBoard, result);
    }
    
    
    @Test
    public void threeStepTest() {
        // ---- arrange
        final String expBoard = "#.#\n"
                              + "#..\n"
                              + ".#.\n";
        Game c = new Game(3, 3);
        
        // ---- act
        final String result = c.play("dr", "ur", "ld");
        
        // ---- assert
        assertEquals(expBoard, result);
    }
    
     @Test
    public void threeStepAndThreeUndoTest() {
        // ---- arrange
        final String expBoard = "#..\n"
                              + "...\n"
                              + "...\n";
        Game c = new Game(3, 3);
        
        // ---- act
        final String result = c.play("dr", "ur", "ld", "u", "u", "u", "u", "u");
        
        // ---- assert
        assertEquals(expBoard, result);
    }
}