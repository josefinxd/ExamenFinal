import java.io.*;	
import java.lang.*;

public class Final_201213061{
static String resultado="",resultado2="";
static String direccion="";
static File archivo;
static FileWriter writer;
static PrintWriter printer;

public static void main(String[] args)throws IOException{
 direccion=args[0];
 int longitud = direccion.length();
 String auxiliar="";
                
                    for(int posicion =0; posicion <longitud;posicion++)
                    {
                        if(direccion.substring(posicion,posicion+1).equals("."))
                        {
                            direccion=auxiliar;
				System.out.println(direccion);
                                break;
                        }else
                        {
                            auxiliar = auxiliar + direccion.substring(posicion,posicion+1);				
                        }
                        
                    }

 try { 
    File inFile = new File(args[0]); 
    BufferedReader reader = new BufferedReader(new FileReader(inFile)); 


    String line = null; 

    int aux=0;
    while ((line=reader.readLine()) != null) { 

    traducir(line);
    if(aux==0){ }
    else{
    resultado2="Caso#"+aux+": "+resultado;
    System.out.println(resultado2);    
    archivo = new File(direccion+" HablandoEnLenguas_201213061.txt");
            try{
                writer = new FileWriter(archivo,true);
            }catch(Exception e){
                e.printStackTrace();
            }
            printer = new PrintWriter(writer);

           try{
               printer.println(resultado2);               
           }catch(Exception e){
               e.printStackTrace();
           }

           try{
                writer.close();
            }catch(Exception e){
                e.printStackTrace();
            }}
    aux++;
    }
    reader.close( );
    } catch (Exception e) { 
          System.out.println("¡Archivo de texto vacio!");
    } 
}

public static void traducir(String cadena){
    resultado="";
    for(int i=0;i<cadena.length();i++){	
        resultado=resultado + convertir(cadena.charAt(i));
    }


        
	
	
}


public static String convertir(char x){

	switch(x){
		case 'a': return "y";		
		case 'b': return "h";	
		case 'c': return "e";
                case 'd': return "s";
		case 'e': return "o";
		case 'f': return "c";
		case 'g': return "v";
		case 'h': return "x";
		case 'i': return "d";
		case 'j': return "u";
		case 'k': return "i";
		case 'l': return "g";
		case 'm': return "l";
		case 'n': return "b";
		case 'o': return "k";
		case 'p': return "r";
		case 'q': return "z";
		case 'r': return "t";	
		case 's': return "n";
		case 't': return "w";	
		case 'u': return "j";
		case 'v': return "p";	
		case 'w': return "f";	
		case 'x': return "m";	
		case 'y': return "a";
		default: ;
	}			
		return " ";
    }
}