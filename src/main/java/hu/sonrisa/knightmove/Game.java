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

import hu.sonrisa.knightmove.commands.MoveKnightCommand;
import hu.sonrisa.knightmove.commands.ResetCommand;

import java.util.Scanner;

/**

 * @author joe
 */
public class Game implements Client {
    
    private final Board board;
    private final GameEngine engine;
    
    /**
     * 
     * @param numOfRows
     * @param numOfCols 
     */
    public Game(int numOfRows, int numOfCols) {
        this.board = new Board(numOfRows, numOfCols);
        this.engine = new GameEngine();
    }
    
    /**
     * 
     * @param args 
     */
    public static void main(String [ ] args){
       System.out.print("Size (8x8)? ");
       Scanner in = new Scanner(System.in);
       String boardSize = in.nextLine();
       boardSize = "".equals(boardSize) ? "8x8" : boardSize;
       String[] size = boardSize.split("x");
       
       Game client = new Game(Integer.parseInt(size[0]), Integer.parseInt(size[1]));
       client.playWithConsole();
    }
    
    /**
     * 
     * 
     */
    public void playWithConsole() {
        Scanner in = new Scanner(System.in);

        String input = null;
        
        while (!"e".equalsIgnoreCase(input) && !board.isEverythingCovered()){
            System.out.print("Next step? ");
            input = in.nextLine();
            doStep(input);
            System.out.println(board.print());
            
        }
    }
    
    /**
     * Executes the given steps.
     * 
     * @param steps
     * @return the string representation of the current state of the board
     */
    public String play(String... steps){
        for (String step : steps){
            doStep(step);
        }
        return board.print();
    } 

    /**
     * Converts the string representation of the step
     * to a command object.
     * 
     * 
     * @param step
     * @return 
     */
    private Command stepToCommand(String step) {
        //TODO YOU HAVE TO IMPLEMENT THIS FUNCTION AT THE DOJO!
        //YOU HAVE USE MoveKnightCommand CLASS!
        return null;
    }

    /**
     * It gets the engine to exetute the step.
     * 
     * @param step 
     */
    private void doStep(String step) {
        if("u".equalsIgnoreCase(step)){
            int steps = engine.sizeOfHistory();
            engine.addAndExecuteCommand(new ResetCommand(board));
            engine.replayCommandsAndDiscardOthers(steps-1);
        } else {
            engine.addAndExecuteCommand(stepToCommand(step));
        }
    }
    
}
