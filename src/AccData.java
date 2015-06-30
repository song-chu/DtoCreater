import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * 口座データ
 * @author works780
 *
 */
public final class AccData {

	/** スキップする行の先頭文字列 */
	private static final String[] skipStartStrings = { "<?xml", "<dataset", "</dataset" };

	/** 口座XMLファイル */
	private File testFile;

	/**
	 * コンストラクタ
	 * @param testFile	口座XMLファイル
	 */
	public AccData(File testFile) {
		this.testFile = testFile;
	}

	/**
	 * 口座情報をパースして、口座マップリストに変換する
	 * @return	口座マップリスト
	 * @throws Exception
	 */
	public List<Map<String, String>> getTestDataMapList() throws Exception {

		List<Map<String, String>> testDataMapList = new ArrayList<Map<String, String>>();

		BufferedReader inBuffer = null;

		try {
			inBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(testFile), "UTF-8"));

			String row = null;
			while ((row = inBuffer.readLine()) != null) {

				if (isSkipRow(row)) {
					continue;
				}

				Map<String, String> testDataMap = this.getOneTestData(row);
				testDataMapList.add(testDataMap);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				if (inBuffer != null) {
					inBuffer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
		}

		return testDataMapList;
	}

	/**
	 * 1行を口座Mapに変換する
	 * @param row	行
	 * @return	口座Map
	 * @throws Exception
	 */
	private Map<String, String> getOneTestData(String row) throws Exception {

		Map<String, String> testDataMap = new HashMap<String, String>();

		if (!isSkipRow(row)) {

			char[] chrs = row.toCharArray();

			boolean toggle = false;
			String key = "";
			String value = "";

			for (int i = 0; i < chrs.length; i++) {

				char chr = chrs[i];

				if (chr == '"') {
					if (toggle) {
						if (StringUtils.isNotEmpty(key) && StringUtils.isNotEmpty(value)) {
							testDataMap.put(key, value);
						}
						key = "";
						value = "";
					}

					toggle = !(toggle);

				} else if (chr == ' ') {

					if (toggle) {
						value += chr;

					} else {
						key = "";
						value = "";
					}

				} else if (chr == '=') {
					if (toggle) {
						value += chr;
					}

				} else {
					if (toggle) {
						value += chr;
					} else {
						key += chr;
					}
				}
			}
		}

		return testDataMap;
	}

	/**
	 * スキップ対象行なのか
	 * @param row	行
	 * @return	true スキップ
	 */
	private boolean isSkipRow(String row) {

		String trimmedRow = row.trim();

		for (String skipStartString : skipStartStrings) {
			if (trimmedRow.startsWith(skipStartString)) {
				return true;
			}
		}

		return false;
	}
}
