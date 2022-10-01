static void Pattern(int N){
//Enter your code here
System.out.println("*");
for(int line=1;line<=N-2;line++)
{
    System.out.print("*");
    for(int j=1;j<=line;j++){
        System.out.print("^");
    }
    System.out.println("*");
}
for(int star=1;star<=N+1;star++){
    System.out.print("*");
}
}