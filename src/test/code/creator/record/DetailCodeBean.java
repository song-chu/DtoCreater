package test.code.creator.record;

import test.code.creator.enums.BookType;
import test.code.creator.enums.DetailCodeType;

public class DetailCodeBean {

	private BookType bookType;
	private boolean dr;
	private boolean reDr;
	private boolean preBr;
	private boolean br;
	private DetailCodeType detailCodeType;
	private String testClassName;
	private String testMethodName;

	public DetailCodeBean() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public boolean isDr() {
		return dr;
	}

	public void setDr(boolean dr) {
		this.dr = dr;
	}

	public boolean isReDr() {
		return reDr;
	}

	public void setReDr(boolean reDr) {
		this.reDr = reDr;
	}

	public boolean isPreBr() {
		return preBr;
	}

	public void setPreBr(boolean preBr) {
		this.preBr = preBr;
	}

	public boolean isBr() {
		return br;
	}

	public void setBr(boolean br) {
		this.br = br;
	}

	public DetailCodeType getDetailCodeType() {
		return detailCodeType;
	}

	public void setDetailCodeType(DetailCodeType detailCodeType) {
		this.detailCodeType = detailCodeType;
	}

	public String getTestClassName() {
		return testClassName;
	}

	public void setTestClassName(String testClassName) {
		this.testClassName = testClassName;
	}

	public String getTestMethodName() {
		return testMethodName;
	}

	public void setTestMethodName(String testMethodName) {
		this.testMethodName = testMethodName;
	}
}
