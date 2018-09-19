package remd.test5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PhoneMapTest {

	public static void main(String[] args) {
		Map<String, Phone> map = new HashMap<String, Phone>();
		// Phone 객체를 3개 생성하여 맵에 모델을 key로 객체를 저장한다.
		Phone p1 = new Phone("galaxy S7", 563500, "삼성", 7);
		Phone p2 = new Phone("iphone 6s", 840000, "애플", 3);
		Phone p3 = new Phone("G5", 563500, "LG", 5);
		
		map.put(p1.getModel(), p1);
		map.put(p2.getModel(), p2);
		map.put(p3.getModel(), p3);
		
		// 맵에 저장된 객체 정보를 연속 출력 한다.– Map.EntrySet<String, Phone> 사용할 것
		Set<Entry<String,Phone>> entry = map.entrySet();
		Iterator<Entry<String,Phone>> iter = entry.iterator();
		
		// 출력부
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		Set<Entry<String,Phone>> entry2 = map.entrySet();
		Iterator<Entry<String,Phone>> iter2 = entry2.iterator();
		Properties prop = new Properties();
		
		while(iter2.hasNext()){
			Phone phone = iter2.next().getValue();
			prop.put(phone.getModel(), phone.toString());
		}

		// 맵에 저장된 객체 정보를 Properties 를 사용해 “phone.xml” 파일에 기록 저장한다.
		try {
			prop.storeToXML(new FileOutputStream("phone.xml"), "phone.xml");
			System.out.println();
			System.out.println("phone.xml 파일에 성공적으로 저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
