package test.code.creator.enums;

public enum BookType {
	BOOK("記帳"), RE_BOOK("再記帳"), BALANCE_REF("残高照会");

	private String name;

	private BookType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static BookType getBookType(String name) {
		for (BookType node : values()) {
			if (node.getName().equals(name)) {
				return node;
			}
		}

		return null;
	}
}
