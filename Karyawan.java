public class Karyawan{
	String nama;
	String alamat;
	private int gaji;

	public void setGaji(int gaji){
		this.gaji+=gaji;
	}
	public int getGaji(){
		return gaji;
	}
	public void setNama(String nama){
		System.out.println("Nama : "+nama);
	}
	public void setAlamat(String alamat){
		System.out.println("Alamat : "+alamat);
	}
	public void viewKar(){
		System.out.println(nama);
		System.out.println(alamat);
		System.out.println(gaji);	
	}
	public void setGaji(int gaji, String pesan){
		this.gaji+=gaji;
		System.out.println(gaji);
		System.out.println(pesan);
	}
}
