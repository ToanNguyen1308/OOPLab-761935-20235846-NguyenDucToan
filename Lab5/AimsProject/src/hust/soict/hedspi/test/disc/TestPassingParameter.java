package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
	        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

	        swap(jungleDVD, cinderellaDVD);
	        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
	        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());

	        changeTitle(jungleDVD, cinderellaDVD.getTitle());
	        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
	    }

	    public static void swap(Object o1, Object o2) {
	        Object tmp = o1;
	        o1 = o2;
	        o2 = tmp;
	    }

	    public static void changeTitle(DigitalVideoDisc dvd, String title) {
	        String oldTitle = dvd.getTitle();
	        dvd.setTitle(title);
	        dvd = new DigitalVideoDisc(oldTitle);
	    }
	    
	    /* ans: 
	     * Phương thức swap(Object o1, Object o2)

				Trong Java, tham số được truyền theo cơ chế pass-by-value, 
				nghĩa là o1 và o2 chỉ là bản sao của tham chiếu, 
				nên việc hoán đổi sẽ không ảnh hưởng đến giá trị thực tế bên ngoài phương thức.

			Kết quả: jungleDVD và cinderellaDVD vẫn giữ nguyên giá trị sau khi gọi swap().


		* Phương thức changeTitle(DigitalVideoDisc dvd, String title)

		Dòng dvd.setTitle(title); sẽ thay đổi trực tiếp tiêu đề của jungleDVD
		vì tham chiếu đến cùng một đối tượng.
		
		Tuy nhiên, dòng dvd = new DigitalVideoDisc(oldTitle); tạo một đối tượng mới nhưng 
		chỉ ảnh hưởng đến biến dvd trong phương thức, không thay đổi jungleDVD bên ngoài. */
}