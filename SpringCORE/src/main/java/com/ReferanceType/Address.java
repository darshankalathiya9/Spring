package com.ReferanceType;

public class Address {

	private int PlotNo;
	private String Society;
	private String City;

	public int getPlotNo() {
		return PlotNo;
	}

	public void setPlotNo(int plotNo) {
		PlotNo = plotNo;
	}

	public String getSociety() {
		return Society;
	}

	public void setSociety(String society) {
		Society = society;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Address [PlotNo=" + PlotNo + ", Society=" + Society + ", City=" + City + "]";
	}

}
