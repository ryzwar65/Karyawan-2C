public class ProjectManager extends Karyawan{
	public void setGaji(int gaji){
		if(gaji==100){
			System.out.println("Gaji UMR anda : "+gaji);
		}
		else if(gaji<100){
			System.out.println("Gaji di bawah Umr");
		}
		else{
			System.out.println("Gaji di atas UMR, Tidak bisa karena tidak di sepakati");
		}
	}
}