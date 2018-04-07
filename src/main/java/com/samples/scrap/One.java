package com.samples.scrap;

public class One {
	String message = "foo";
	private String primary;
	private String secondary;
	private String primary1;
	private String secondary1;
	private String primary2;
	private String secondary2;
	private String primary3;
	private String secondary4;
	
	public One(){
		message = "foo";
	}
	public String getMessage() {
		return message;
	}

	public final void setMessage(final String message) {
		this.message = message;
	}

	public String getPrimary() {
		return primary;
	}

	public final void setPrimary(final String primary) {
		this.primary = primary;
	}

	public String getSecondary() {
		return secondary;
	}

	public final void setSecondary(final String secondary) {
		this.secondary = secondary;
	}

	public String getPrimary1() {
		return primary1;
	}

	public final void setPrimary1(final String primary1) {
		this.primary1 = primary1;
	}

	public String getSecondary1() {
		return secondary1;
	}

	public final void setSecondary1(final String secondary1) {
		this.secondary1 = secondary1;
	}

	public String getPrimary2() {
		return primary2;
	}

	public final void setPrimary2(final String primary2) {
		this.primary2 = primary2;
	}

	public String getSecondary2() {
		return secondary2;
	}

	public final void setSecondary2(final String secondary2) {
		this.secondary2 = secondary2;
	}

	public String getPrimary3() {
		return primary3;
	}

	public final void setPrimary3(final String primary3) {
		this.primary3 = primary3;
	}

	public String getSecondary4() {
		return secondary4;
	}

	public final void setSecondary4(final String secondary4) {
		this.secondary4 = secondary4;
	}

	public String foo() {
		return message;
	}

	public void uncoveredMethod() {
		System.out.println(foo());
	}
	
	
	// Cookie c = new Cookie(SECRET, secret); // Noncompliant; cookie is not
	// secure
	// response.addCookie(c);
}
