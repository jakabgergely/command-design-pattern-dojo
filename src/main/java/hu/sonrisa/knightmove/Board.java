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

import hu.sonrisa.knightmove.model.Coordinate;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author joe
 */
public class Board implements Receiver{
    
    private int numOfRows;
    private int numOfColumns;
    
    private Coordinate player;
    
    Set<Coordinate> lepesek = new HashSet<>();

    public Board(int numOfRows, int numOfColumns) {
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
        reset();
    }
    
    
    public String print(){
        StringBuilder board = new StringBuilder();
        for (int row=0; row<numOfRows; row++){
            for (int col=0; col<numOfColumns; col++){
                Coordinate c = new Coordinate(col, row);
                String cellChar = isAlreadyCovered(c) ? "#" : ".";
                board.append(cellChar);
            }
            board.append("\n");
        }
        
        return board.toString();
    }
    
    public boolean isAlreadyCovered(Coordinate c){
        //TODO YOU HAVE TO IMPLEMENT THIS FUNCTION AT THE DOJO!
        return false;
    }
    
    public boolean isEverythingCovered(){
        //TODO YOU HAVE TO IMPLEMENT THIS FUNCTION AT THE DOJO!
        return false;
    }

    @Override
    public void moveKnight(int dx, int dy) {
        //TODO YOU HAVE TO IMPLEMENT THIS FUNCTION AT THE DOJO!
        //YOU HAVE TO USE COORDINATE CLASS!
    }

    @Override
    public void reset() {
        lepesek.clear();
        player = new Coordinate(0, 0);
        lepesek.add(player);
    }
}
