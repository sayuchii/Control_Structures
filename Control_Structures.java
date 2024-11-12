
public class Control_Structures {
    public static void main(String[] args) {
    
      
    
    //IF STATEMENTS
        int a = 16;
        if (a%2==0){
            
        System.out.println("This is an even number");
        
        }
    
        int aNum1;
            aNum1 = 5;
        int aNum2 = 2;
        int aMax = 100;
    
     //IF - ELSE STATEMENTS                 
    if (aNum1 > aNum2){
            aMax = aNum1;
            System.out.println("yes"); 
        } 
        
    else {
            aMax = aNum2;  
              
            System.out.println("naur");
    
    }

        //SWITCH
     
       char day = 1;
       switch (day)
        
       { 
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;   
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursay");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 8:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;              
     default: 
        System.out.println("Invalid");
        break;
      
       
       } 
         
}
    

}
