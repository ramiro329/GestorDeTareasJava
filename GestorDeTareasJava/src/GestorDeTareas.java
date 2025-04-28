package GestorDeTareasJava.src;
import java.util.ArrayList; 
import java.util.Scanner; 
 
public class GestorDeTareas { 
    public static void main(String[] args) { 
        ArrayList<String> tareas = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in); 
        int opcion;
        do { 
            System.out.println("1. Agregar tarea\n2. Listar tareas\n3. Salir"); 
            try { 
                opcion = sc.nextInt(); 
            } catch (Exception e) { 
                System.out.println("aqui debe ingresar un numero"); 
                sc.nextLine(); 
                opcion = 0; 
            } 
 
            switch (opcion) { 
                case 1: 
             System.out.println("aqui tienes que escribir la tarea:"); 
             sc.nextLine(); 
             String tarea = sc.nextLine(); 
             if (!tarea.trim().isEmpty()) { 
             tareas.add(tarea); 
} else { 
            System.out.println("La tarea no puede estar vacía."); 
} 
break;
                case 2: 
                    System.out.println("Tareas: " + tareas); 
                    break; 
                    case 3: 
                    System.out.println("Escribe la tarea a buscar:"); 
                    sc.nextLine(); 
                    String buscar = sc.nextLine(); 
                    if(tareaExiste(tareas, buscar)) { 
                    System.out.println("La tarea existe."); 
                    } else { 
                    System.out.println("La tarea NO existe."); 
                    } 
                    break;   
            } 
        } while (opcion != 3); 
        sc.close();
    }
        public static boolean tareaExiste(ArrayList<String> lista, String tarea) { 
            return lista.contains(tarea);  
    } 
} 
