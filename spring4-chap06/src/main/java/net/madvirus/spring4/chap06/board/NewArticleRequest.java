package net.madvirus.spring4.chap06.board;

public class NewArticleRequest {
	
	private String writerName;
	private String title;
	private String content;
	
	public NewArticleRequest(String writeName,String title, String content){
		
		this.writerName = writeName;
		this.title = title;
		this.content = content;
	}

	public String getWriterName() {
		return writerName;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
	

}
