/**
 * 
 */
package com.curley.gators.service;

import org.springframework.stereotype.Service;

import com.curley.gators.model.Player;

/**
 * @author Mayor Curley
 *
 */
@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

    @Override
    public Player getPlayer(long id) {
        Player p = new Player("Patrick",
            "Mahomes",
            "Kansas City Chiefs",
            "QB",
            98, 94, 81, 87, 88, 69);
        return p;
    }

}
