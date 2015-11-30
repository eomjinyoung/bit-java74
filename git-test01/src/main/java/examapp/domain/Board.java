package examapp.domain;

import java.io.Serializable;

public class Board implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected int no;
	protected String title;
	protected int views;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	
	
}
