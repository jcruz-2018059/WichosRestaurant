import modelos.*;
import java.util.ArrayList;
import java.util.Scanner;
 	
 	public class Main {
 		public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        
        listaUsuarios.add(new Usuarios("Javier", "Cruz", "jcruz",2018059,"Administrador"));
        listaUsuarios.add(new Usuarios("Brayan", "Reyes", "breyes",2018278,"Trabajador"));
        listaUsuarios.add(new Usuarios("Jose", "Ajanel", "jajanel",2019236,"Trabajador"));
        listaUsuarios.add(new Usuarios("Paola", "Hernandez", "phernandez",2018040,"Trabajador"));

        ArrayList<Productos> listaProductos = new ArrayList<>();
        
        listaProductos.add(new Productos("ENTRADA","Papas a la francesa", 20, 15));
        listaProductos.add(new Productos("PLATO FUERTE","Hamburguesa", 20, 30));
        listaProductos.add(new Productos("BEBIDAS","Horchata", 10, 10));
        listaProductos.add(new Productos("POSTRES","Helado", 0, 15));
        
        boolean salir = false;
        while (!salir) {  

        	System.out.println("-------Bienvenido a Wichos------");
        	System.out.println(" 1. Iniciar sesion");
        	System.out.println(" 2. salir");

        	int numero = Integer.parseInt(leer.nextLine());

        	switch(numero){
        		case 1:
        			System.out.println("--------------------------------");
        			System.out.println("Ingrese su Nombre de Usuario: ");
        			String name = leer.nextLine();
                                System.out.println("Ingrese su password: ");
                                int pass = Integer.parseInt(leer.nextLine());
                                System.out.println("Escoga su Puesto laboral");
                                System.out.println("1. Administrador");
                                System.out.println("2. Trabajador");
                                int roll = Integer.parseInt(leer.nextLine());

                                        switch(roll){
                                                case 1:
                                                boolean volver = false;
                                                    while (!volver) {  
                                                    System.out.println("------------- Menu -------------");
                                                    System.out.println(" 1 - Agregar Empleado ");
                                                    System.out.println(" 2 - Ver lista de empleados");
                                                    System.out.println(" 3 - Eliminar empleados ");
                                                    System.out.println(" 4 - Agregar Productos ");
                                                    System.out.println(" 5 - Ver lista de Productos");
                                                    System.out.println(" 6 - Eliminar Productos ");
                                                    System.out.println(" 7 - crear factura ");
                                                    System.out.println(" 0 - volver");
                                                    
                                                    
                                                    int opcion = Integer.parseInt(leer.nextLine());
                                                   
                                                    switch(opcion) {
                                                        case 1: 

                                                            Usuarios a = new Usuarios();
                                                            System.out.println("--------------------------------");
                                                            System.out.println("Ingrese el nombre del empleado: ");
                                                            
                                                            a.setNombre(leer.nextLine());
                                                            System.out.println("Ingrese el apellido del empleado: ");
                                                            
                                                            a.setApellido(leer.nextLine());
                                                            System.out.println("Ingrese el nombre de usuario: ");
                                                            
                                                            a.setUsuario(leer.nextLine());
                                                            System.out.println("Ingrese la Password:");
                                                            
                                                            a.setPassword(Integer.parseInt(leer.nextLine()));

                                                            System.out.println("Ingrese el roll del empleado:");
                                                            a.setRoll(leer.nextLine());

                                                            
                                                            listaUsuarios.add(a);
                                                            
                                                            
                                                            
                                                            System.out.println("--------------------------------");
                                                            System.out.println("USUARIO CREADO CON EXITO: ");
                                                            System.out.println("Nombre: " + a.getNombre());
                                                            System.out.println("Apellido: " + a.getApellido());
                                                            System.out.println("Usuario: " + a.getUsuario());
                                                            System.out.println("Password: " + a.getPassword());
                                                            System.out.println("Roll: " + a.getRoll());
                                                            System.out.println("--------------------------------");
                                                            
                                                            break;
                                                        case 2: 
                                                           for(int i = 0; i < listaUsuarios.size(); i++){ 
                                                               System.out.println("USUARIO: " + (i + 1));
                                                               
                                                               Usuarios perfil =  listaUsuarios.get(i); 
                                                               
                                                               System.out.println("--------------------------------");
                                                               System.out.println("Nombre: " + perfil.getNombre());
                                                               System.out.println("Apellido: " + perfil.getApellido());
                                                               System.out.println("Usuario: " + perfil.getUsuario());
                                                               System.out.println("Roll: " + perfil.getRoll());
                                                               System.out.println("--------------------------------");
                                                           }
                                                            
                                                            break;
                                                        case 3: 
                                                            System.out.println("Ingresa el nombre de usuario a eliminar: ");
                                                            String patente = leer.nextLine();
                                                            
                                                            for (int i = 0; i < listaUsuarios.size(); i++) {
                                                                Usuarios perfil = listaUsuarios.get(i);
                                                                
                                                                if (patente.equals(perfil.getNombre())) {
                                                                    
                                                                    listaUsuarios.remove(i);
                                                                    System.out.println("Usuario eliminado");
                                                                }
                                                            }
                                                            break;
                                                        case 4:
                                                            Productos p = new Productos();
                                                            System.out.println("--------------------------------");
                                                            System.out.println("Ingrese la categoria del producto ");
                                                            p.setCategoria(leer.nextLine());

                                                            System.out.println("Ingrese el nombre del producto ");
                                                            p.setNombrep(leer.nextLine());

                                                            System.out.println("Ingrese el Stock del producto ");
                                                            p.setStock(Integer.parseInt(leer.nextLine()));

                                                            System.out.println("Ingrese el precio del producto ");
                                                            p.setPrecio(Integer.parseInt(leer.nextLine()));
                                                            
                                                            listaProductos.add(p);
                                                            
                                                            System.out.println("--------------------------------");
                                                            System.out.println("PRODUCTO INGRESADO CON EXITO");
                                                            System.out.println("Categoria: " + p.getCategoria());
                                                            System.out.println("Nombre: " + p.getNombrep());
                                                            System.out.println("Precio: Q" + p.getPrecio());
                                                
                                                            break;
                                                        case 5:
                                                            for(int i = 0; i < listaProductos.size(); i++){ 
                                                           System.out.println("PRODUCTO: " + (i + 1));
                                                           
                                                           Productos eleccion =  listaProductos.get(i); 
                                                           
                                                           System.out.println("--------------------------------");
                                                           System.out.println("Categoria: "+ eleccion.getCategoria());
                                                           System.out.println("Nombre: " + eleccion.getNombrep());
                                                           System.out.println("Precio Q: " + eleccion.getPrecio());
                                                           System.out.println("Stock: " + eleccion.getStock());
                                                           System.out.println("--------------------------------");
                                                                }
                                                        
                                                            break;
                                                        case 6:
                                                            System.out.println("Ingresa el nombre del producto a eliminar ");
                                                            String np = leer.nextLine();
                                                            
                                                            for (int i = 0; i < listaProductos.size(); i++) {
                                                                Productos eleccion = listaProductos.get(i);
                                                               
                                                                if (np.equals(eleccion.getNombrep())) {
                                                                    
                                                                    listaProductos.remove(i);
                                                                    System.out.println("Producto eliminado");
                                                                }
                                                            }
                                                
                                                            break;
                                                        case 7:
                                                            System.out.println("--------------------------------");
                                                            System.out.println("Ingresa el nombre del Cliente: ");
                                                            String cliente = leer.nextLine();
                                                            System.out.println("Ingresa Nit del cliente: ");
                                                            int nit = Integer.parseInt(leer.nextLine());
                                                            System.out.println("Ingresa la Entrada comsumida: ");
                                                            String ent = leer.nextLine();
                                                            System.out.println("Ingresa el precio ");
                                                            int pe = Integer.parseInt(leer.nextLine());
                                                            System.out.println("Ingresa El plato fuerte comsumido: ");
                                                            String pf = leer.nextLine();
                                                            System.out.println("Ingresa el precio ");
                                                            int pi = Integer.parseInt(leer.nextLine());
                                                            System.out.println("Ingresa la bebida consumida: ");
                                                            String be = leer.nextLine();
                                                            System.out.println("Ingresa el precio ");
                                                            int po = Integer.parseInt(leer.nextLine());
                                                            System.out.println("Ingresa le postre: ");
                                                            String pos = leer.nextLine();
                                                            System.out.println("Ingresa el precio ");
                                                            int pc = Integer.parseInt(leer.nextLine());

                                                            int total = +pe+pi+po+pc;
                                                            System.out.println("--------------------------------");
                                                            System.out.println("Nombre: " +cliente);
                                                            System.out.println("NIT: " +nit);
                                                            System.out.println(ent+ "......................" +pe);
                                                            System.out.println(pf+ "......................" +pi);
                                                            System.out.println(be+ "......................" +po);
                                                            System.out.println(pos+ "......................" +pc);
                                                            System.out.println("Total: Q" +total);


                                                            break;
                                                        case 0:
                                                            volver = true;
                                                            System.out.println("Volviendo a pagina principal");
                                                            break;
                                                        default: 
                                                            System.out.println("Opcion invalida!!!!!!!");
                                                            }
                                                        
                                                    }
                                                    break;
                                                case 2:
                                                boolean back = false;
                                                    while (!back) {
                                                    System.out.println("------------- Menu -------------");
                                                    System.out.println(" 1 - Ver lista de Productos");
                                                    System.out.println(" 2 - crear factura ");
                                                    System.out.println(" 3 - volver ");

                                                    int opcion2 = Integer.parseInt(leer.nextLine());

                                                    switch(opcion2){
                                                        case 1:
                                                            for(int i = 0; i < listaProductos.size(); i++){ 
                                                           System.out.println("PRODUCTO: " + (i + 1));
                                                           
                                                           Productos eleccion =  listaProductos.get(i); 
                                                           
                                                           System.out.println("--------------------------------");
                                                           System.out.println("Categoria: "+ eleccion.getCategoria());
                                                           System.out.println("Nombre: " + eleccion.getNombrep());
                                                           System.out.println("Precio Q: " + eleccion.getPrecio());
                                                           System.out.println("Stock: " + eleccion.getStock());
                                                           System.out.println("--------------------------------");
                                                                }
                                                            break;
                                                        case 2:
                                                            System.out.println("--------------------------------");
                                                            System.out.println("Ingresa el nombre del Cliente: ");
                                                            String cliente = leer.nextLine();
                                                            System.out.println("Ingresa Nit del cliente: ");
                                                            int nit = Integer.parseInt(leer.nextLine());
                                                            System.out.println("Ingresa la Entrada comsumida: ");
                                                            String ent = leer.nextLine();
                                                            System.out.println("Ingresa el precio ");
                                                            int pe = Integer.parseInt(leer.nextLine());
                                                            System.out.println("Ingresa El plato fuerte comsumido: ");
                                                            String pf = leer.nextLine();
                                                            System.out.println("Ingresa el precio ");
                                                            int pi = Integer.parseInt(leer.nextLine());
                                                            System.out.println("Ingresa la bebida consumida: ");
                                                            String be = leer.nextLine();
                                                            System.out.println("Ingresa el precio ");
                                                            int po = Integer.parseInt(leer.nextLine());
                                                            System.out.println("Ingresa le postre: ");
                                                            String pos = leer.nextLine();
                                                            System.out.println("Ingresa el precio ");
                                                            int pc = Integer.parseInt(leer.nextLine());

                                                            int total = +pe+pi+po+pc;
                                                            System.out.println("--------------------------------");
                                                            System.out.println("Nombre: " +cliente);
                                                            System.out.println("NIT: " +nit);
                                                            System.out.println(ent+ "......................" +pe);
                                                            System.out.println(pf+ "......................" +pi);
                                                            System.out.println(be+ "......................" +po);
                                                            System.out.println(pos+ "......................" +pc);
                                                            System.out.println("Total: Q" +total);

                                                            break;
                                                        case 3:
                                                            back = true;
                                                            System.out.println("Volviendo a pagina principal");
                                                            break;
                                                        default: 
                                                            System.out.println("Opcion invalida!!!!!!!");
                                                            }
                                                        }
                                                    }

                                                    break;
                                                case 2:
                                                    salir = true;
                                                    System.out.println("Gracias por visitar Wichos");
                                                    break;
                                                    default: 
                                                            System.out.println("Opcion invalida!!!!!!!");
                                        }
                                    }
                                }
                            }
                        
                    

 

                                        





