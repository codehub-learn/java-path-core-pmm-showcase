package gr.codelearn.core.showcase.oop.model;

import java.math.BigDecimal;

public class Gpu extends Product {
	private Integer vRam;
	private String clockSpeed;
	private Integer watt;
	private Integer numOfPorts;

	public Gpu() {
	}

	public Gpu(final String name, final String serial, final BigDecimal price, final Integer vRam,
			   final String clockSpeed, final Integer watt, final Integer numOfPorts) {
		super(name, serial, price);
		this.vRam = vRam;
		this.clockSpeed = clockSpeed;
		this.watt = watt;
		this.numOfPorts = numOfPorts;
	}

	public Integer getvRam() {
		return vRam;
	}

	public void setvRam(final Integer vRam) {
		this.vRam = vRam;
	}

	public String getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(final String clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

	public Integer getWatt() {
		return watt;
	}

	public void setWatt(final Integer watt) {
		this.watt = watt;
	}

	public Integer getNumOfPorts() {
		return numOfPorts;
	}

	public void setNumOfPorts(final Integer numOfPorts) {
		this.numOfPorts = numOfPorts;
	}

	@Override
	public String toString() {
		return super.toString() + ",Gpu{" + "vRam=" + vRam + ", clockSpeed='" + clockSpeed + '\'' + ", watt=" + watt +
				", numOfPorts=" + numOfPorts + '}';
	}
}
