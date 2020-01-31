package patronAbstractFactory.primerEjercicio.principal;

import javax.swing.JOptionPane;

import patronAbstractFactory.primerEjercicio.fabricas.FabricaBusetas;
import patronAbstractFactory.primerEjercicio.fabricas.FabricaDeTaxis;
import patronAbstractFactory.primerEjercicio.fabricas.FabricaDeVehiculos;

/**
 * clase principal del aplicativo donde se establecen las instancias 
 * de las fabricas
 * @author chenao
 *
 */
public class Principal {
 
public static void main(String[] args) 
{
 FabricaBusetas busetas=new FabricaBusetas();
 FabricaDeTaxis taxi=new FabricaDeTaxis();
 FabricaBusetas buses=new FabricaBusetas();
 String cad="",salida;
 cad+="Ingrese la opción correspondiente para obtener el codigo del servicio\n";
 cad+="1. Codigo servicio de Taxis\n";
 cad+="2. Codigo servicio de Buses\n";
 cad+="3. Codigo servicio de Busetas\n\n";
 try {
 do {
  try
     {
  int opcion=Integer.parseInt(JOptionPane.showInputDialog(cad));
  switch (opcion)
  {
  case 1:FabricaDeVehiculos.crearFabricaDeVehiculo(taxi);
   break;
 case 2:FabricaDeVehiculos.crearFabricaDeVehiculo(buses);
   break;
 case 3:FabricaDeVehiculos.crearFabricaDeVehiculo(busetas);
   break;
default:JOptionPane.showMessageDialog(null,"No es un valor de consultavalido");
    break;
   }
  } catch (Exception e) {
 JOptionPane.showMessageDialog(null,"No es un parametro de consulta valido");
  }
 salida=JOptionPane.showInputDialog("Desea consultar otro codigo? S/N");
  
 } while (salida.toUpperCase().equals("S"));
     } catch (Exception e) {
  JOptionPane.showMessageDialog(null,"Bye!!!");
  }
 }
}
