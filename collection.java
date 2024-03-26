
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class collection {

    public static void main(String[] args) {
        Map <String,Set<Integer>> studiant=new LinkedHashMap<>();
        test(studiant);
      }
      public static void  test (Map<String,Set<Integer>> map ){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Combient des etudiants vous pouvez d'entrer:");
        byte nombre_eleve=scanner.nextByte();
        scanner.nextLine();
        for(int i=0;i<nombre_eleve;i++){
          System.out.print("Entrer le nom d'eleve"+(i+1)+":");
         String nom_eleve=scanner.nextLine();
         
         if(!nom_eleve.isEmpty()){
          System.out.print("Entrer le nombre des modules:");
          byte nombre_module=scanner.nextByte();
          Set <Integer> notes0=new LinkedHashSet<>();
          for(int j=0;j<nombre_module;j++){
            
            System.out.print("Entrer la note de la module "+(j+1)+":");
            int note_module=scanner.nextInt();
            notes0.add(note_module);
          }
          map.put(nom_eleve,notes0);
         
         }
         else{
          System.out.println("Entrer le nom d'eleve"+i);
          i--;
         }
         scanner.nextLine();
         

        }
        List<Double>  premiere_note= new ArrayList<>();
        String nom_premiereeleve="";
        String nom_dernieeleve=" ";
        for(Map.Entry<String,Set<Integer>> e:map.entrySet()){
            double somme=0.0;
            double moyenne=0.0;
            for(int i:e.getValue()){
                somme+=i;
                moyenne=Math.round(somme/e.getValue().size());
                
            }
            premiere_note.add(moyenne);
            System.out.println(e.getKey()+":"+moyenne);
            if(moyenne==Collections.max(premiere_note)){
                nom_premiereeleve=e.getKey();
            }
            else if(moyenne==Collections.min(premiere_note)){
              nom_dernieeleve=e.getKey();
          }
            
        }
         
          double ps=Collections.max(premiere_note);
          double ds=Collections.min(premiere_note);

          
          //System.out.println(premiere_note);
            System.out.println("\u001B[32m"+">>Premiere note c'est de: "+nom_premiereeleve+" "+ps);     
            System.out.println("\u001B[32m"+">>Derniere note c'est de: "+nom_dernieeleve+" "+ds);   
            System.out.println(" \u001B[37m");  
            scanner.close();
}
}