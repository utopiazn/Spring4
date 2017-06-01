package net.madvirus.spring4.chap06.board;


import java.util.HashMap;
import java.util.Map;

public class MemoryArticleDao implements ArticleDao {

	private int articleNo=0;
	private Map<Integer, Article> articleMap = new HashMap<Integer, Article>();
	
	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		System.out.println("MomoryArticelDao.insert() 호출됨");
		
		articleNo++;
		
		article.setId(articleNo);
		articleMap.put(articleNo, article);	
		
		
	}

	@Override
	public Article selectById(Integer id) {
		// TODO Auto-generated method stub
		return articleMap.get(id);
	}

}
