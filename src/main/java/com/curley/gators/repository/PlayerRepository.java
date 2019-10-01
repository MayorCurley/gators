/**
 * 
 */
package com.curley.gators.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.curley.gators.model.Player;

/**
 * @author Mayor Curley
 *
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
