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
import hu.sonrisa.knightmove.Receiver;

/**
 * Abstract base class for {@link Command} implementations.
 *
 * @author joe
 */
public abstract class AbstractCommand implements Command {
    
    protected Receiver board;

    /**
     * 
     * @param board 
     */
    public AbstractCommand(Receiver board) {
        this.board = board;
    }
    
}
