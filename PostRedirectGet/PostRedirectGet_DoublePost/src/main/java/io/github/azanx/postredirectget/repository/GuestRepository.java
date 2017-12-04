/**
 * 
 */
package io.github.azanx.postredirectget.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.github.azanx.postredirectget.model.Guest;

/**
 * @author Kamil Piwowarski
 *
 */
public interface GuestRepository extends CrudRepository<Guest, Long> {
	List<Guest> findAll();
}
