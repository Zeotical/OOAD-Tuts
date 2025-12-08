import java.util.*; 


public class Student extends Person {

  ArrayList<Subject> sub = new ArrayList<Subject> () ;

  public Student(String name, String gender){

    super(name,gender);
  }
  
  public void addSubject(String subCode, char grade){
              
      sub.add(new Subject(subCode,grade)); 
      
  }
  
  public void remSubject(String subCode){
    Subject removeSub = null ; // og     Subject removeSub = new Subject("blah",'A'); but can just create null
       for(Subject i : sub){
           if(i.getCode().equals(subCode)){
               
               removeSub = i;
            }
        }
      sub.remove(removeSub);
      System.out.println("Subject " + subCode + " removed.");
  
  }
  
   
   public String toString(){ //overiding 
       return "Student name : " + getName();
    }

 public void printTranscript(){
      
      toString();
      for(Subject i : sub){
            System.out.println(i);
        }

  }

}
