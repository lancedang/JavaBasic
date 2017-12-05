package delegate.service.impl;

import delegate.service.IForumService;

/**
 * ForumService 这可是名副其实的业务逻辑类
 * @author Dangdang
 *
 */
public class ForumServiceImpl implements IForumService {
	
	/**
	 * 业务逻辑，纯粹的业务逻辑是指不包括 横切代码的
	 */
	public void removeTopic(int topicId) {
		/*
		 * 此处原本可存放横切代码，如日志，若放的话与 每一个Service业务逻辑分散交织在一起
		 */
		
		System.out.println("模拟删除 topic记录 " + topicId);
		try {
			Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * 此处原本可存放横切代码，如日志
		 */
	}

	
	public void removeForum(int forumId) {
		
		/*
		 * 此处原本可存放横切代码，如日志，若放的话与 每一个Service业务逻辑分散交织在一起
		 */
		System.out.println("模拟删除 forum记录 " + forumId);

		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * 此处原本可存放横切代码，如日志
		 */

	}
}
