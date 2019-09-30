/**
 * 
 */
package com.curley.gators.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curley.gators.model.Player;
import com.curley.gators.service.PlayerService;

/**
 * @author Mayor Curley
 *
 */
@Controller
public class PlayerController {
    
    @Autowired
    private PlayerService playerService;
    
    @RequestMapping("/player")
    public String handler(Model model) {
        /*
         * Player p = new Player("Patrick", "Mahomes", "Kansas City Chiefs", "QB", 98,
         * 94, 81, 87, 88, 69);
         */
        Player p = playerService.getPlayer(0); 
        model.addAttribute("player", p);
        
        return "player";
    }
}
