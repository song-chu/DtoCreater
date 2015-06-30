package test.code.creator.enums;

public enum EmulFileType {
	DR("detailsReference.xls"), RE_DR("detailsReReference.xls"), PRE_BR("balancePreDayReference.xls"), BR(
			"balanceReference.xls");

	private String name;

	private EmulFileType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
