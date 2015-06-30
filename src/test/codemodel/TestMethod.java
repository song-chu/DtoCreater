package test.codemodel;

import java.io.File;
import java.util.List;

import test.code.creator.enums.BookType;
import test.code.creator.record.TestCodeBean;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;

public class TestMethod {

	private String fullClassName;

	public TestMethod(String fullClassName) {
		this.fullClassName = fullClassName;
	}

	public void execute(List<TestCodeBean> beans) throws Exception {

		JCodeModel codeModel = new JCodeModel();

		//生成するクラス定義
		JDefinedClass clazz = codeModel._class(fullClassName);

		for (TestCodeBean bean : beans) {
			test(codeModel, clazz, bean);
		}

		//ソース生成
		codeModel.build(new File(Env.DIR_OUTPUT_SRC.value()));
	}

	private void test(JCodeModel codeModel, JDefinedClass clazz, TestCodeBean bean) {

		String testMethodName = bean.getTestMethodName();
		BookType bookType = bean.getBookType();

		JMethod method = clazz.method(JMod.PUBLIC, codeModel.VOID, testMethodName);
		method.annotate(codeModel.ref("junit.framework.Test"));
		method._throws(Throwable.class);

		JBlock jBlock = method.body();
		jBlock.directStatement("mockSysdate();");

		String bookUserId = "bookUserId(\"%s\", corpIds, bankaccountIds);";
		String reBookUserId = "reBookUserId(\"%s\", sysdate, corpIds, bankaccountIds);";
		String brUserId = "brUserId(\"%s\", corpIds, bankaccountIds);";

		switch (bookType) {
		case BOOK:
			jBlock.directStatement(String.format(bookUserId, testMethodName));
			break;
		case RE_BOOK:
			jBlock.directStatement(String.format(reBookUserId, testMethodName));
			break;
		case BALANCE_REF:
			jBlock.directStatement(String.format(brUserId, testMethodName));
			break;
		}
	}
}
