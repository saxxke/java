public class CWH_14_StringMethods {
    public static void main(String[] args) {
        String name = "Kingshuk";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "    King     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
         
        System.out.println(name.substring(3));
        System.out.println(name.substring(1, 5));

        System.out.println(name.replace('k', 'l'));
        System.out.println(name.replace("ing", "tu"));

        System.out.println(name.startsWith("Kin"));
        System.out.println(name.endsWith("Kin"));

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("ing"));

        String modifiedname = "Harryrry";
        System.out.println(modifiedname.indexOf("rry"));
        System.out.println(modifiedname.indexOf("rry",4));
        System.out.println(modifiedname.indexOf("chy"));

        System.out.println(modifiedname.lastIndexOf("rry"));
        System.out.println(modifiedname.lastIndexOf("rry", 4));
    
        System.out.println(name.equals("Kingshuk"));
        System.out.println(name.equalsIgnoreCase("kinGsHuk"));
    }
}
