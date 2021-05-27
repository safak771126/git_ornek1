package tr.edu.medipol.yazilimaraclari.ders10;
import java.util.*;

public final class OgrenciDepo {

	private static final List<Ogrenci> OGRENCILER = new ArrayList<>();
	static 
	{
		OGRENCILER.add(new Ogrenci("Ali Kalyoncu","Hr5151250"));
		OGRENCILER.add(new Ogrenci("Şafak Sezer","H5190050"));
		OGRENCILER.add(new Ogrenci("Beyza Rençber","H5190051"));
		OGRENCILER.add(new Ogrenci("Fatih Ürenç","H5192252"));
	}
	
	private OgrenciDepo() {
		
	}
	
	public static List<Ogrenci> ogrencileriGetir() {
		return OGRENCILER;
	}
	
	public static List<Ogrenci> ogrenciEkle(Ogrenci ogrenci){
		OGRENCILER.add(ogrenci);
		return OGRENCILER;
	}
	
	public static List<Ogrenci> ogrenciSil(String numara){
		for(Ogrenci o : OGRENCILER) {
			if (o.getNumara().equals(numara)) {
				OGRENCILER.remove(o);
			}
		}
		return OGRENCILER;
	}
}
