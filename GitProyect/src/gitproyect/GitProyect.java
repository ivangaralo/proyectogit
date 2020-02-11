//ivank
package gitproyect;

public class GitProyect {

    public static void main (String[] args){
        int d=GitProyect(19, 7, 2020);
        System.out.println(d);
        String dias [] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        System.out.println(dias[d]);        
    }

   private static int GitProyect (int Day, int Month, int Year){
       int Git;
       Month = (Month +10) % 12;
       Year = Year -1 * ((Month > 10)?1:0);
       Git = (13 * Month -1) / 5 + 1 +Year % 100 + (Year % 100) / 4 + (-2 * (Year /100)) + (Year / 400) % 7;
       Git = ((Git + Day) % 7 + 6) % 7;
       return Git;
   }
    
}
