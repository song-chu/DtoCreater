import java.util.TreeSet;

public class EmulFileSheetInfo {

	/** ファイル名*/
	private TreeSet<String> sheetNameList;

	/** ファイルパス*/
	private String path;

	private String className;
	private String methodName;

	public EmulFileSheetInfo() {
	}

	public TreeSet<String> getSheetNameList() {
		return sheetNameList;
	}

	public void setSheetNameList(TreeSet<String> sheetNameList) {
		this.sheetNameList = sheetNameList;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
