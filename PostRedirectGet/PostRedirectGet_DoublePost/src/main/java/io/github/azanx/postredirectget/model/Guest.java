/**
 * 
 */
package io.github.azanx.postredirectget.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Kamil Piwowarski
 *
 */
@Entity
public class Guest {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String surname;
	
	public Guest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
