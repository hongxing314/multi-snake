/*
 *  Copyright (C) 2010 Patrick Hulin
 * 
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package multisnake;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author Patrick Hulin
 */
public class ScoreBoardUpdate implements Runnable {
    JTable scoreBoard;
    ScoreBoardModel sbm;

    public ScoreBoardUpdate(JTable scoreBoard, ScoreBoardModel sbm) {
        this.scoreBoard = scoreBoard;
        this.sbm = sbm;
    }

    public void run() {
        scoreBoard.setModel(sbm);

        TableColumn playerColumn = scoreBoard.getColumn("Player");
        playerColumn.setCellRenderer(new PlayerCellRenderer());
        
        scoreBoard.repaint();
    }
}
