package parcialOIA;
import java.io.File;
public class MainOIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File e=new File ("LoteDePrueba\\IN\\Caso_01_nombreDelCaso.in");
		File s=new File ("salida.out");
		
		AResolver aResolver=new AResolver(e,s);
		
		aResolver.resolver();
		
	}

}
