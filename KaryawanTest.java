public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	ProjectManager p = new ProjectManager();
	p.setNama("Jaenal");
	p.setAlamat("Banten");
	p.setGaji(100);
	System.out.println(" ");

	System.out.println("Jabatan Programmer");
	Programmer pr = new Programmer();
	pr.setNama("Ical");
	pr.setAlamat("Bogor");
	pr.setGaji(90);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Designer d = new Designer();
	d.setNama("Kusen");
	d.setAlamat("Lampung");
	d.setGaji(70);
		 }
}
