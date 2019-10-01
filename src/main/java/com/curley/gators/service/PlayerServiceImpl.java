/**
 * 
 */
package com.curley.gators.service;

//import java.util.List;
//import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curley.gators.model.Player;
//import com.curley.gators.repository.PlayerRepository;

/**
 * @author Mayor Curley
 *
 */
@Service
public class PlayerServiceImpl implements PlayerService {

//    @Autowired
//    private PlayerRepository playerRepository;
    
    @Override
    public Player getPlayer(long id) {
        Player p = new Player("Patrick",
            "Mahomes",
            "Kansas City Chiefs",
            "QB",
            98, 94, 81, 87, 88, 69);
        return p;
    }

    /*
     * @Override public void add(Player p) { playerRepository.save(p); }
     * 
     * @Override public void remove(long id) { playerRepository.deleteById(id); }
     * 
     * @Override public List<Player> getPlayers() { return (List<Player>)
     * playerRepository.findAll(); }
     * 
     * @Override public Player getPlayerById(long id) { Optional<Player> p =
     * playerRepository.findById(id); return p.isPresent() ? p.get() : null; }
     */

}
