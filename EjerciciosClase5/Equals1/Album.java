package EjerciciosClase5.Equals1;

import java.util.Objects;

public class Album {
	public String artista;
	public String titulo;

	public Album(String artista, String titulo) {
		this.artista = artista;
		this.titulo = titulo;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || o.getClass() != getClass()) return false;
		Album album = (Album) o;
		return this.artista == album.artista && Objects.equals(titulo, album.titulo);
	}
}
