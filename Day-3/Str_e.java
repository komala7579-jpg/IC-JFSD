class Str_e{
    public static void main(String[] args){
        String name="komala";
        try{
            System.out.println(name.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String out");

        }
    }
}