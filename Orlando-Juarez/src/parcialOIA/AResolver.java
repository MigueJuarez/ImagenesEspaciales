package parcialOIA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AResolver extends EjercicioOIA{

	FileWriter fw;
	FileReader fr;
	BufferedReader br;
	BufferedWriter bw;
	
	public AResolver(File entrada, File salida) {
		super(entrada, salida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void resolver() {
		// TODO Auto-generated method stub
		try {
			
			fr=new FileReader(super.entrada);
			br=new BufferedReader(fr);
			
			String linea = br.readLine();
			String salida ="";
			
			
			int lectura=0;
			int contadordeletras=1;
			
			while(lectura<linea.length()) {				
				
				while(lectura+1<linea.length() && linea.charAt(lectura)==linea.charAt(lectura+1)) {
					lectura++;
					contadordeletras++;
				}
				
				if(lectura+1<linea.length() && contadordeletras>1 ) {
					salida += " ("+linea.charAt(lectura) + contadordeletras +") ";
					contadordeletras=1;
				}
				else
					if(lectura+1<linea.length() && contadordeletras==1){
						salida += linea.charAt(lectura);
						contadordeletras=1;
					}
				if(lectura+1>=linea.length() && contadordeletras>1 ) {
					salida += " ("+linea.charAt(lectura) + contadordeletras +") ";
					contadordeletras=1;
				}
				
				else
					if(lectura+1>=linea.length() && contadordeletras==1){
						salida += linea.charAt(lectura);
						contadordeletras=1;
					}
	
				lectura++;
			}
			
		System.out.println(salida);
			
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException ee)
		{
			ee.printStackTrace();

		}
		finally
		{
			try
			{
			fr.close();
			br.close();
			}
			catch(IOException ee)
			{
				ee.printStackTrace();
			}
		}
	}
	
	
}
