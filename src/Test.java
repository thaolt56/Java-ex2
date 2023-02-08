
public class Test {
	public static void main(String[] args) {
		Date ngay_1 = new Date(1, 2, 1999);
		Date ngay_2 = new Date(1, 2, 1998);
		Date ngay_3 = new Date(1, 2, 1997);
		
		
		TacGia tGia_1 = new TacGia("abc", ngay_1);
		TacGia tGia_2 = new TacGia("abcd", ngay_2);
		TacGia tGia_3 = new TacGia("abcde", ngay_3);
		
		Sach sach_1 = new Sach("Java", 100, 2020, tGia_1);
		Sach sach_2 = new Sach("PHP", 100, 2021, tGia_2);
		Sach sach_3 = new Sach("JS", 100, 2022, tGia_3);
		
		sach_1.inTenSach();
		sach_2.inTenSach();
		sach_3.inTenSach();
		
		System.out.println("Sách có cùng năm sản xuất: " + sach_1.kTraNam(sach_2));
		System.out.println("Giá sách khi giảm 10%: " + sach_2.giaSauGiam(10));
		
	}
}
