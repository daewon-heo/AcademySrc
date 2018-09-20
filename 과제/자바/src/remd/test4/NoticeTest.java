package remd.test4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class NoticeTest {

	public static void main(String[] args) {
		Object[] obArray = new Object[3];
		Scanner sc = new Scanner(System.in);
		String[] dateArray = { "2016.03.15", "2016.04.23", "2016.05.12" };

		System.out.println("등록할 공지사항을 입력하시오.(3번 반복 입력 처리함)");
		// 키보드로 Notice 객체의 초기값을 입력받아, 생성자로 초기화한다. – for 사용
		for (int i = 0; i < obArray.length; i++) {
			// no 는 인덱스 + 1
			System.out.print("제목 : ");
			String title = sc.nextLine();

			System.out.print("작성자 : ");
			String writer = sc.nextLine();

			System.out.print("내용 : ");
			String content = sc.nextLine();

			Date date = null;
			try {
				date = new SimpleDateFormat("yyyy.MM.dd").parse(dateArray[i]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			// date 는 직접 값 지정 처리함
			Notice notice = new Notice(i + 1, title, date, writer, content);
			obArray[i] = (Object) notice;
		}

		// fileSave() 메소드 실행
		NoticeTest nt = new NoticeTest();
		nt.fileSave(obArray);

		// fileRead() 메소드 실행
		ArrayList<Notice> list = nt.fileRead();
		// 리턴된 리스트 정보 출력 처리 – for each 문 사용
		for (Notice no : list) {
			System.out.println(no);
		} // toString() 사용 출력
	}

	public void fileSave(Object[] obArr) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("notice.dat"));

			for (int i = 0; i < obArr.length; i++) {
				oos.writeObject(obArr[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Notice> fileRead() {
		ArrayList<Notice> list = new ArrayList<Notice>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("notice.dat"));) {
			while (true) {
				Notice no = (Notice) ois.readObject();
				list.add(no);
			}
		} catch (EOFException e) {
		} catch (IOException | ClassNotFoundException e) {
		}
		return list;
	}

}
