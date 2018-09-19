package remd.test4;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4925720026823139090L;
	private int no;
	private String title;
	private Date date;
	private String writer;
	private String content;
	
	public Notice(){
		
	}

	public Notice(int no, String title, Date date, String writer, String content) {
		this.no = no;
		this.title = title;
		this.date = date;
		this.writer = writer;
		this.content = content;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return no + "\t" + title + "\t" + sdf.format(date) + "\t" + writer + "\t" + content;
	}
	
	
}
