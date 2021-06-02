import java.util.List;

import study.java.dao.impl.ImageDaoImpl;
import study.java.model.ImageItem;
import study.util.dao.ImageDao;

public class Main01 {

	public static void main(String[] args) {

		ImageDao dao = new ImageDaoImpl();
		List<ImageItem> list = dao.getImageSearchList("자바프로그래밍");
		
		
		if (list == null) {
			System.out.println("데이터 수신 실패");
			return;
			
		}
		
		// 테스트으으응으으으
		
		for(int i=0;i<list.size(); i++) {
			ImageItem item = list.get(i);
			
			//썸네일 이미지의 주소
			String img_url= item.getThumbnailUrl();
			
			System.out.println(img_url);
		}
		
		
	}

}
