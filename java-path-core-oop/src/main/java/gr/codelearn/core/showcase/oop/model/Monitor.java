package gr.codelearn.core.showcase.oop.model;

import java.math.BigDecimal;

public class Monitor extends Product{
	private ScreenType screenType;
	private String resolution;
	private String refreshRate;
	private Integer responseTime;
	private String screenSize;

	public Monitor() {
	}

	public Monitor(final String name, final String serial, final BigDecimal price, final ScreenType screenType,
				   final String resolution, final String refreshRate, final Integer responseTime,
				   final String screenSize) {
		super(name, serial, price);
		this.screenType = screenType;
		this.resolution = resolution;
		this.refreshRate = refreshRate;
		this.responseTime = responseTime;
		this.screenSize = screenSize;
	}

	public ScreenType getScreenType() {
		return screenType;
	}

	public void setScreenType(final ScreenType screenType) {
		this.screenType = screenType;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(final String resolution) {
		this.resolution = resolution;
	}

	public String getRefreshRate() {
		return refreshRate;
	}

	public void setRefreshRate(final String refreshRate) {
		this.refreshRate = refreshRate;
	}

	public Integer getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(final Integer responseTime) {
		this.responseTime = responseTime;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(final String screenSize) {
		this.screenSize = screenSize;
	}



	@Override
	public String toString() {
		return super.toString() + ", Monitor{" + "screenType='" + screenType + '\'' + ", resolution='" + resolution + '\'' +
				", refreshRate='" + refreshRate + '\'' + ", responseTime=" + responseTime + ", screenSize='" +
				screenSize + '\'' + '}';
	}
}
