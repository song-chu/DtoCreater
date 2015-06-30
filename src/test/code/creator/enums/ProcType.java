package test.code.creator.enums;

/**
 * �������	PROC_TYPE
 *
 * @author �v
 *
 */
public enum ProcType {
	/**
	 * 0:�O���c���Ɖ�
	 */
	PRE_BALANCE_REFERENCE(0, "�O���c���Ɖ�", "balancePreDayReference.xls"),
	/**
	 * 1:�����c���Ɖ�
	 */
	BALANCE_REFERENCE(1, "�����c���Ɖ�", "balanceReference.xls"),
	/**
	 * 2:���o�����׏Ɖ�
	 */
	DETAIL_REFERENCE(2, "���o�����׏Ɖ�", "detailsReference.xls"),
	/**
	 * 3:���o�����׍ďƉ�
	 */
	RE_DETAIL_REFERENCE(3, "���o�����׍ďƉ�", "detailsReReference.xls"), ;

	/** �R�[�h*/
	private int code;
	/** ��*/
	private String name;
	/** �G�~�����[�^�[�t�@�C����*/
	private String emuFileName;

	/**
	 * �R���X�g���N�^
	 * @param code	�R�[�h
	 * @param name	��
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
	 * �����擾����B
	 * @param code	�R�[�h
	 * @return	��
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
	 * Enum���擾����B
	 * @param code	�R�[�h
	 * @return	Enum�N���X
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
	 * Enum���擾����B
	 * @param emuFileName
	 * @return	Enum�N���X
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
