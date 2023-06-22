package br.com.kalil.object;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ram")
public class RAM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String brand;
	private String memoryFactor;
	private Integer velocity;
	private Byte cl;
	private Boolean isDimm;
	private Boolean isQuadchannel;
	private Float price;
	private Byte PCMasterLevel;
	private String urlImage;
	
	public RAM() {
		super();
	}
	
}
