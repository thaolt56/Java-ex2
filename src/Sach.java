
public class Sach {
	private String tenSach;
	private double giaSach;
	private int namSanXuat;
	private TacGia tacGia;

	public Sach(String tenSach, double giaSach, int namSanXuat, TacGia tacGia) {
		super();
		this.tenSach = tenSach;
		this.giaSach = giaSach;
		this.namSanXuat = namSanXuat;
		this.tacGia = tacGia;
	}

	public String getTenSach() {
		return this.tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaSach() {
		return this.giaSach;
	}

	public void setGiaSach(double giaSach) {
		this.giaSach = giaSach;
	}

	public int getNamSanXuat() {
		return this.namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public TacGia getTacGia() {
		return this.tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}

//	in ten sach
	public void inTenSach() {
		System.out.println(this.tenSach);
	}

	// quyen sach bat ky co cung nam san xuat
	public boolean kTraNam(Sach sachKhac) {
		return this.namSanXuat == sachKhac.namSanXuat;

	}

	// gia sach sau khi giam x phan tram
	public double giaSauGiam(double x) {
		return this.giaSach * (1 - x / 100);
	}

}
