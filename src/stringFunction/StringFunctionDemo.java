package stringFunction;

public class StringFunctionDemo {

    public static void stringPractice() {
        String name = "Upright";

        int lengthOfMyString = name.length();
            System.out.println(lengthOfMyString);

        // System.out.println(name.length());
    }

    public static void changeCase(){
        String name = "Upright";
        String upper = name.toUpperCase();
        System.out.println(upper);

        String lower = name.toLowerCase();
        System.out.println(lower);
    }
    public static void splitString(){
        String schoolName = "Upright_Tech Solution"; //{"Upright", "Tech Solutions"}
        String [] arrayofSchoolName = schoolName.split("_");
        System.out.println(arrayofSchoolName.length);
        System.out.println(arrayofSchoolName[0]);
        System.out.println(arrayofSchoolName[1]);

        //Homework... split with limit
        String newSchoolName = "Upright Tech Solution";
        String [] arrayofSchoolName1 = newSchoolName.split(" ", 2);
        System.out.println(arrayofSchoolName1.length);
        System.out.println(arrayofSchoolName1[0]);
        System.out.println(arrayofSchoolName1[1]);
    }

    public static void intToString(){
        int money = 200;
        System.out.println(money + 100);
        String newMoney = String.valueOf (money);
        System.out.println(newMoney + 100);
    }

    public static void stringtoInt(){
        String money = "50";
        System.out.println(money + 100);
        int money1 = Integer.parseInt(money);
        System.out.println(money1 + 100);
    }

    public static String subStringDemo(){
        String email = "uprighttechsolution@gmail.com";
      String newText =  email.substring(7); //+1
       //System.out.println(newText);
        return newText;

    }

    public static void replaceDemo(){
        String email = "uprighttechsolutions_gmail.com";
        String newEmail = email.replace("_","@");
        System.out.println(newEmail);
    }


    public static void reverse(){
        String schoolName = "UprightTechSolutions"; //thgirpU
//        System.out.print(schoolName.charAt(6));
//        System.out.print(schoolName.charAt(5));
//        System.out.print(schoolName.charAt(4));
//        System.out.print(schoolName.charAt(3));
//        System.out.print(schoolName.charAt(2));
//        System.out.print(schoolName.charAt(1));
//        System.out.print(schoolName.charAt(0));

        for (int i = schoolName.length()-1; i>= 0; i--){
            System.out.print(schoolName.charAt(i));
        }
    }
    public static void reverseBuffer(){
        String schoolName = "UprightTechSolutions";
        StringBuffer sb = new StringBuffer(schoolName);

        sb.insert(6,"_");
        System.out.println(sb);

        sb.append("Hello");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }

    public static void palindromeDemo(){
        //madam --- madam
        //kayak --- kayak
        //Mom --- mom
        String name = "mom";
        String rev = "";
        for (int i = name.length()-1; i>=0; i--){
            rev = rev+name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("This is not palindrome");
        }
    }

        /* Homework

   1. lets say String name = "uprighttechsolutions@gmail.com";
    Validate that if the string has "@" symbol then print ("it is ok")

   2. lets say
   String name = "my name is razia";
   Write program so that you can print the following
   "My Name Is Razia"

     */


    // Homework:
    public static void validateEmail(){
        String email = "uprighttechsolutions@gmail.com";
        if(email.contains("@gmail_com")){
            System.out.println("it is ok");
        }
        else{
            System.out.println("not good");
        }
    }

    public static void formatName(){
        String name = "my name is razia";
        String[]words = name.split(" ");
       // String []words = {"my", "name", "is", "razia"};
//        System.out.println(words[0]);
//        System.out.println(words[1]);
//        System.out.println(words[2]);
//        System.out.println(words[3]);

       // StringBuilder formattedName = new StringBuilder();
        for(String singleword: words){
       String  firstLetter =  singleword.substring(0,1); // will pick m from my, n from name,
            String afterFirstLetter = singleword.substring(1); // will pick y from my
          String fullWord =  firstLetter.toUpperCase()+afterFirstLetter+ " ";
            System.out.print(fullWord);
//            formattedName.append(Character.toUpperCase(word.charAt(0)))
//                    .append(word.substring(1).toLowerCase())
//                    .append(" ");
        }
       // System.out.println(formattedName.toString().trim());
    }




    public static void main(String[] args) {

        //stringPractice();
        //changeCase();
        // splitString();
      //stringtoInt();
        //intToString();
//       String printNewText = subStringDemo();
//       System.out.println(printNewText);
        // Validate
//
//        if (printNewText.equalsIgnoreCase("teche")){
//            System.out.println("we are good");
//        }
//        else {
//            System.out.println("please check back the string");
//        }
       // replaceDemo();
      // reverse();
      //  reverseBuffer();
      //  palindromeDemo();
      // validateEmail();
       // String name = "my name is razia";
        formatName();

    }
}
