package net.madvirus.spring4.chap06.board;

public class WriteArticleServiceImpl implements WriteArticleService {

	private ArticleDao articleDao;
	
	
	public WriteArticleServiceImpl(ArticleDao articleDao){
		this.articleDao = articleDao;
	}
	
	
	@Override
	public void write(NewArticleRequest newArticleReq) {
		// TODO Auto-generated method stub
	
		System.out.println("WriteArticleServiceImpl.write() 호출됨");
		
		Article article = toArticle(newArticleReq);
		articleDao.insert(article);
	}

	private Article toArticle(NewArticleRequest newArticleReq) {
		// TODO Auto-generated method stub
				
		return new Article(newArticleReq.getWriterName(),
						   newArticleReq.getTitle(),
						   newArticleReq.getContent());					   
				
	}
	
	

}
