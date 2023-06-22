package br.com.kalil.object;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "storage")
public class Storage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String brand;
	private String size;
	private String type;
	private String factor;
	private Float readVelocity;
	private Float writeVelocity;
	private String urlImage;
	
	public Storage() {
		super();
	}

	public Storage(Integer id, String name, String brand, String size, String type, String factor, Float readVelocity,
			Float writeVelocity, String urlImage) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.type = type;
		this.factor = factor;
		this.readVelocity = readVelocity;
		this.writeVelocity = writeVelocity;
		this.urlImage = urlImage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFactor() {
		return factor;
	}

	public void setFactor(String factor) {
		this.factor = factor;
	}

	public Float getReadVelocity() {
		return readVelocity;
	}

	public void setReadVelocity(Float readVelocity) {
		this.readVelocity = readVelocity;
	}

	public Float getWriteVelocity() {
		return writeVelocity;
	}

	public void setWriteVelocity(Float writeVelocity) {
		this.writeVelocity = writeVelocity;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
}