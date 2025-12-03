import java.util.*; 

 public class SubjectList {
    public static void main(String[] args){
        Subject s1 = new Subject("TCP1234" , 'A');
        Subject s2 = new Subject("TVP5643", 'C');
        Subject s3 = new Subject("TVR5432",'B');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Subject[] subs = new Subject[5]; 

        for (int i=0;i<5;i++){ 
            // 
            subs[i] = new Subject("TCP1234",'A'); 
            System.out.println(subs[i]);

        }
        
        ArrayList<Subject> sub = new ArrayList<Subject>(); 
        sub.add(new Subject("TCP12349",'B')); 
        sub.add(new Subject("TCP5678",'C')); 
        sub.add(new Subject("TCP9101112",'D')); 
        sub.remove(2);
        
        for(Subject i : sub){
            System.out.println(i);
        }

    }
}