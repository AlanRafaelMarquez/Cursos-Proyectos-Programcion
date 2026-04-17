package TratamientoExepciones;

import javax.swing.*;
import java.io.*;
import java.nio.Buffer;

public class JerarquiaDeEsepciones {
    public void leerArchivo () throws FileNotFoundException, IOException {
        File archivo = new File("C:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while ((linea = bf.readLine()) != null){
            System.out.println(linea);
        }

    }

    public void leerArchivo2(){
        try{
            leerArchivo();
        } catch (FileNotFoundException ex ){
            JOptionPane.showMessageDialog(null,"No se ha encontrado el archivo deseado Por favor verifica la ruta");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"A UCORRIDO UNA EXEPCION VERIFICADA");
        }finally {

        }

        System.out.println("Programa Terminado");
    }

    public static void main (String[] args){
        JerarquiaDeEsepciones prueba = new JerarquiaDeEsepciones();
        prueba.leerArchivo2();
    }
}
