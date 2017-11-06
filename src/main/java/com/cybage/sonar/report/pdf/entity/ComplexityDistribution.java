package com.cybage.sonar.report.pdf.entity;

/**
 * This class provides the complexity distribution graphic.
 */
public class ComplexityDistribution {

	private String[] xValues;
	private String[] yValues;

	public ComplexityDistribution(final String data) {
		String[] unitData = data.split(";");
		xValues = new String[unitData.length];
		yValues = new String[unitData.length];
		if (!data.equals("N/A")) {
			for (int i = 0; i < unitData.length; i++) {
				String[] values = unitData[i].split("=");
				xValues[i] = values[0];
				yValues[i] = values[1];
			}
		}
	}

	public String formatYValues() {
		String formatValues = "";
		for (int i = 0; i < yValues.length; i++) {
			if (i != yValues.length - 1) {
				formatValues += yValues[i] + ",";
			} else {
				formatValues += yValues[i];
			}
		}
		return formatValues;
	}

	public String formatXValues() {
		String formatValues = "";
		for (int i = 0; i < xValues.length; i++) {
			if (i != xValues.length - 1) {
				formatValues += xValues[i] + "%2b,";
			} else {
				formatValues += xValues[i] + "%2b";
			}
		}
		return formatValues;
	}

	public String[] getxValues() {
		return xValues;
	}

	public void setxValues(final String[] xValues) {
		this.xValues = xValues;
	}

	public String[] getyValues() {
		return yValues;
	}

	public void setyValues(final String[] yValues) {
		this.yValues = yValues;
	}
}
