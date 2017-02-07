package com.example.download;

public class BookInfo {
	String anthor;
	String pubdate;
	String publisher;
	String title;
	String author_intro;
	public BookInfo(String anthor, String pubdate, String publisher,
			String title, String author_intro) {
		super();
		this.anthor = anthor;
		this.pubdate = pubdate;
		this.publisher = publisher;
		this.title = title;
		this.author_intro = author_intro;
	}
	@Override
	public String toString() {
		return "BookInfo [anthor=" + anthor + ", pubdate=" + pubdate
				+ ", publisher=" + publisher + ", title=" + title
				+ ", author_intro=" + author_intro + "]";
	}
	
}
