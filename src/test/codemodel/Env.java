package test.codemodel;

import java.util.ResourceBundle;

/**
 * 設定項目値取得
 * @author 宋
 *
 */
public enum Env {
	DIR_OUTPUT_SRC, DIR_RESOURCE, DIR_TEST_DATA_SOURCE, FILE_TEST_DATA_SETTING, FILE_TEST_DATA_DETAIL_CODE;

	/** 設定ファイル */
	private static ResourceBundle bundle = ResourceBundle.getBundle("env");

	/**
	 * 値取得
	 * @param key	キー
	 * @return	値
	 */
	public static String value(String key) {
		String value = bundle.getString(key);
		return value;
	}

	/**
	 * 値取得
	 * @return	値
	 */
	public String value() {
		String value = bundle.getString(name());
		return value;
	}
}
