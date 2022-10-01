static char Race(int A,int B,int C){
    //Enter your code here
    int naruto = Math.abs(A - C);
    int sasuke = Math.abs(B - C);
    if(naruto<sasuke){
        
        return 'N';
    }if(naruto>sasuke){
      
        return 'S' ;
    }
    
    else
    return 'D' ;
    }