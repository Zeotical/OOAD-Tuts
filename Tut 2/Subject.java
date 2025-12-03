public class Subject  //any class has extend object even if we don't code it

{   private String code; 

    private char result; 

 

    Subject(String cd, char res) 

    {    

        code = cd;
        result = res;

    } 

     

    public String getCode() 

    {    return code; 

    } 

     

    public char getResult() 

    {   return result; 

    } 

     

    public String toString() 

    {   return("Subject:"+code+" - "+result); 

    } 

} 