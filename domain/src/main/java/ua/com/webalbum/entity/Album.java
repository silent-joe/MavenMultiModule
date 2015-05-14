package ua.com.webalbum.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ALBUM")
public class Album {
	
	public Album() {

	}
	
	public Album(Integer idCatalog, String name) {
		this.idCatalog = idCatalog;
		this.name = name;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NAME", nullable = false)
	private String name;
	
	@NotNull
	@Column(name = "ID_CATALOG")
	private int idCatalog;

	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name = "ID_CATALOG", nullable = false, insertable = false, updatable = false)
	private Catalog catalog;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "album", cascade = CascadeType.REMOVE)
	private List<Foto> fotos;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdCatalog() {
		return idCatalog;
	}

	public void setIdCatalog(int idCatalog) {
		this.idCatalog = idCatalog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
	public List<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

}

