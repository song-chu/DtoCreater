package test.code.creator.record;

import test.code.creator.enums.BookType;

public class TestCodeBean {

	private BookType bookType;
	private String testMethodName;

	public TestCodeBean() {
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public String getTestMethodName() {
		return testMethodName;
	}

	public void setTestMethodName(String testMethodName) {
		this.testMethodName = testMethodName;
	}
}
