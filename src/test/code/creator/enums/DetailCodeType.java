package test.code.creator.enums;

public enum DetailCodeType {
	OK("正常の詳細コード"), LOCK("口座ロック"), NO_LOCK("口座ロック以外の詳細コードエラー");

	private String name;

	private DetailCodeType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static DetailCodeType getDetailCodeType(String name) {
		for (DetailCodeType node : values()) {
			if (node.getName().equals(name)) {
				return node;
			}
		}

		return null;
	}
}
