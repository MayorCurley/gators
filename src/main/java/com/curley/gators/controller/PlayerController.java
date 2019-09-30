/**
 * 
 */
package com.curley.gators.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curley.gators.model.Player;

/**
 * @author Mayor Curley
 *
 */
@Controller
public class PlayerController {
    @RequestMapping("/player")
    public String handler(Model model) {
        Player p = new Player("Patrick",
                "Mahomes",
                "Kansas City Chiefs",
                "QB",
                98, 94, 81, 87, 88, 69);
        model.addAttribute("player", p);
        return "player";
    }
}
