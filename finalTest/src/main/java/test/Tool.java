package test;
public class Tool {
public static boolean isUsable(String a){
return (!(a ==null || a.isBlank()));
}   
public static boolean isUsable(Object[] obj){
return (!(obj ==null && obj.length == 0));
}
public static int count(Object[] obj){
    if(!isUsable(obj))return -1;
    int count= 0;
    for (int i = 0; i < obj.length; i++) {
        if(obj[i] != null)count++;
        
    }
    return count;
    
}
}
