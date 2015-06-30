package test.code.creator.enums;

/**
 * 処理種別	PROC_TYPE
 *
 * @author 宋
 *
 */
public enum ProcType {
	/**
	 * 0:前日残高照会
	 */
	PRE_BALANCE_REFERENCE(0, "前日残高照会", "balancePreDayReference.xls"),
	/**
	 * 1:当日残高照会
	 */
	BALANCE_REFERENCE(1, "当日残高照会", "balanceReference.xls"),
	/**
	 * 2:入出金明細照会
	 */
	DETAIL_REFERENCE(2, "入出金明細照会", "detailsReference.xls"),
	/**
	 * 3:入出金明細再照会
	 */
	RE_DETAIL_REFERENCE(3, "入出金明細再照会", "detailsReReference.xls"), ;

	/** コード*/
	private int code;
	/** 名*/
	private String name;
	/** エミュレーターファイル名*/
	private String emuFileName;

	/**
	 * コンストラクタ
	 * @param code	コード
	 * @param name	名
	 */
	private ProcType(int code, String name, String emuFileName) {
		this.code = code;
		this.name = name;
		this.emuFileName = emuFileName;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getEmuFileName() {
		return emuFileName;
	}

	/**
	 * 名を取得する。
	 * @param code	コード
	 * @return	名
	 */
	public static String getName(int code) {

		for (ProcType type : values()) {
			if (type.getCode() == code) {
				return type.getName();
			}
		}

		return null;
	}

	/**
	 * Enumを取得する。
	 * @param code	コード
	 * @return	Enumクラス
	 */
	public static ProcType getProcType(int code) {

		for (ProcType type : values()) {
			if (type.getCode() == code) {
				return type;
			}
		}

		return null;
	}

	/**
	 * Enumを取得する。
	 * @param emuFileName
	 * @return	Enumクラス
	 */
	public static ProcType getProcType(String emuFileName) {

		for (ProcType type : values()) {
			if (type.getEmuFileName().equals(emuFileName)) {
				return type;
			}
		}

		return null;
	}
}
