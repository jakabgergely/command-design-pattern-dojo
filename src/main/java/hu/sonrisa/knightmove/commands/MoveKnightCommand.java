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
package hu.sonrisa.knightmove.commands;


import hu.sonrisa.knightmove.Command;
import hu.sonrisa.knightmove.model.CommandResult;
import hu.sonrisa.knightmove.Receiver;

/**
 *
 * @author joe
 */
public class MoveKnightCommand extends AbstractCommand implements Command {

    private int dx;
    private int dy;

    public MoveKnightCommand(int dx, int dy, Receiver board) {
        super(board);
        this.dx = dx;
        this.dy = dy;
    }
    
    @Override
    public CommandResult execute() {
        try {
            board.moveKnight(dx, dy);
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return new CommandResult(CommandResult.Status.INVALID);
        }
        return new CommandResult(CommandResult.Status.OK);
    }
    
    
}
