package com.rayen.SpringBoot_TP01.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genres {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long genreId;
	private String genreName;

	@OneToMany(mappedBy = "genres")
	@JsonIgnore
	private List<Film> films;

	public Genres() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genres(String genreName, List<Film> films) {
		super();
		this.genreName = genreName;
	}

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public List<Film> getCourses() {
		return films;
	}

	public void setCourses(List<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Genres [genreId=" + genreId + ", genreName=" + genreName + ", films="
				+ films + "]";
	}
}
