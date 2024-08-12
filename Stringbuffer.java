public class Stringbuffer{
    public static void main(String[] args) throws Exception{
        StringBuffer sb=new StringBuffer("Vinay");
        try{
        sb.append("Kanu");
        String s="Kanukuntla";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.replace("a", "s"));
        System.out.println(sb); 

        StringBuilder sbb=new StringBuilder("Sai");
        sbb.append("Kiran");
        System.out.println(sbb); 
        if(!sbb.equals(null)){
             throw new Exception();
        }
    }
    catch(Exception e){
        System.err.println("Found error");
    }
    }
}