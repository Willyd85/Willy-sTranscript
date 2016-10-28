import java.util.*;

class Transcript {
  String name;
  int age;
  String address;
  String phoneNumber;
  String dateOfBirth;
  String parent;
  String graduation;

  public Transcript(String Name, int Age, String Address, String PhoneNumber, String DateOfBirth, String Parent, String Graduation){
    name = Name;
    age = Age;
    address = Address;
    phoneNumber = PhoneNumber;
    dateOfBirth = DateOfBirth;
    parent = Parent;
    graduation = Graduation;
  }
  public void addGrade(HashMap<String, Integer> year){
    Scanner inputClass = new Scanner(System.in);
    System.out.print("Class: ");
    String notClass = inputClass.next();

    Scanner iinputGrade = new Scanner(System.in);
    System.out.print("Grade in class: ");
    int classGrade = iinputGrade.nextInt();
    year.put(notClass, classGrade);
  }
  public static void main(String[] args) {
    int allCredits = 0;
    HashMap<String, Integer> ninthGrade = new HashMap<String, Integer>();

    HashMap<String, Integer> tenthGrade = new HashMap<String, Integer>();

    HashMap<String, Integer> eleventhGrade = new HashMap<String, Integer>();

    HashMap<String,Integer> tweflthGrade = new HashMap<String, Integer>();

    Scanner inName = new Scanner(System.in);
    System.out.print("Full Name: ");
    String inputName = inName.next();

    Scanner inAge = new Scanner(System.in);
    System.out.print("Age: ");
    int inputAge = inAge.nextInt();

    Scanner inAddress = new Scanner(System.in);
    System.out.print("Address: ");
    String inputAddress = inAddress.next();

    Scanner inPhone = new Scanner(System.in);
    System.out.print("Phone number: ");
    String inputPhone = inPhone.next();

    Scanner inBirth = new Scanner(System.in);
    System.out.print("Date of Birth: ");
    String inputBirth = inBirth.next();

    Scanner inParent = new Scanner(System.in);
    System.out.print("Parents name: ");
    String inputParent = inParent.next();

    Scanner inputGrad = new Scanner(System.in);
    System.out.print("Graduation date: ");
    String inGrad = inputGrad.next();

    Transcript student = new Transcript(inputName, inputAge, inputAddress, inputPhone, inputBirth, inputParent, inGrad);
    while(true){
      while(true){
        Scanner freshClass = new Scanner(System.in);
        System.out.print("Type 1 to add a class from 9th grade, or 2 to quit: ");
        int freshmanYear = freshClass.nextInt();
        if(freshmanYear == 1){
          student.addGrade(ninthGrade);
        }
        else if(freshmanYear == 2){
          break;
        }
      }
      while(true){
        Scanner sophClass = new Scanner(System.in);
        System.out.print("Press 1 to add a class from 10th grade, or 2 to quit: ");
        int sophmoreYear = sophClass.nextInt();
        if(sophmoreYear == 1){
          student.addGrade(tenthGrade);
        }
        else if(sophmoreYear == 2){
          break;
        }
      }
      while(true){
        Scanner junClass = new Scanner(System.in);
        System.out.print("Press 1 to add a class from 11th grade, or 2 to quit: ");
        int juniorYear = junClass.nextInt();
        if(juniorYear == 1){
          student.addGrade(eleventhGrade);
        }
        else if(juniorYear == 2){
          break;
        }
      }
      while(true){
        Scanner senClass = new Scanner(System.in);
        System.out.print("Press 1 to add a class from 12th grade, or 2 to quit: ");
        int seniorYear = senClass.nextInt();
        if(seniorYear == 1){
          student.addGrade(tweflthGrade);
        }
        else if(seniorYear == 2){
          break;
        }
      }
      break;
    }
    int creds = 0;
    for(String nGrade : ninthGrade.keySet()){
      Scanner input1Creds = new Scanner(System.in);
      System.out.print("Type 1 if course was full year or 2 if half: ");
      int credss = input1Creds.nextInt();

      if(credss == 1){
        int ccreds = creds + 2;
        creds = ccreds;
      }
      else if(credss == 2){
        int ccreds = creds + 2;
        creds = ccreds;
      }
    }
    for(String teGrade : tenthGrade.keySet()){
      Scanner input2Creds = new Scanner(System.in);
      System.out.print("Type 1 if course was full year or 2 if half: ");
      int c2redss = input2Creds.nextInt();

      if(c2redss == 1){
        int c2creds = creds + 2;
        creds = c2creds;
      }
      else if(c2redss == 2){
        int c2creds = creds = 1;
        creds = c2creds;
      }
    }
    for(String elGrade : eleventhGrade.keySet()){
      Scanner input3Creds = new Scanner(System.in);
      System.out.print("Type 1 if course was full year or 2 if half: ");
      int c3redss = input3Creds.nextInt();

      if(c3redss == 1){
        int c3creds = creds + 2;
        creds = c3creds;
      }
      else if(c3redss == 2){
        int c3creds = creds + 1;
        creds = c3creds;
      }
    }
    for(String tweGrade : tweflthGrade.keySet()){
      Scanner input4Creds = new Scanner(System.in);
      System.out.print("Type 1 if course was full year or 2 if half: ");
      int c4redss = input4Creds.nextInt();

      if(c4redss == 1){
        int c4creds = creds + 2;
        creds = c4creds;
      }
      else if(c4redss == 2){
        int c4creds = creds + 1;
        creds = c4creds;
      }
    }
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Student: " + student.name);
    System.out.println("Address: " + student.address);
    System.out.println("Phone Number: " + student.phoneNumber);
    System.out.println("Date of Birth: " + student.dateOfBirth);
    System.out.println("Parent/Guardian: " + student.parent);
    System.out.println("Academic Record");
    System.out.println("------------------");
    System.out.println("Freaman Year");
    System.out.println("-------------");
    int nninthGrade = 0;
    int nCount = 0;
    for(String nGrade : ninthGrade.keySet()){
      nCount++;
      System.out.println(nGrade + " | " + ninthGrade.get(nGrade));
      if(ninthGrade.get(nGrade) > 89){
        int nninthgrade = nninthGrade + 4;
        nninthGrade = nninthgrade;
      }
      else if(ninthGrade.get(nGrade) > 79 | ninthGrade.get(nGrade) < 90){
        int nninthgrade = nninthGrade + 3;
        nninthGrade = nninthgrade;
      }
      else if(ninthGrade.get(nGrade) > 69 | ninthGrade.get(nGrade) < 80){
        int nninthgrade = nninthGrade + 2;
        nninthGrade = nninthgrade;
      }
      else if(ninthGrade.get(nGrade) < 70){
      int nninthgrade = nninthGrade + 1;
      nninthGrade = nninthgrade;
      }
    }
    float nGpa = nninthGrade / nCount;
    System.out.println("");
    System.out.println("Sophmore Year");
    System.out.println("---------------");
    int ttenthGrade = 0;
    int teCount = 0;
    for(String teGrade : tenthGrade.keySet()){
      teCount++;
      System.out.println(teGrade + " | " + tenthGrade.get(teGrade));
      if(tenthGrade.get(teGrade) > 89){
        int ttenthgrade = ttenthGrade + 4;
        ttenthGrade = ttenthgrade;
      }
      else if(tenthGrade.get(teGrade) > 79 | tenthGrade.get(teGrade) < 90){
        int ttenthgrade = ttenthGrade + 3;
        ttenthGrade = ttenthgrade;
      }
      else if(tenthGrade.get(teGrade) > 69 | tenthGrade.get(teGrade) < 80){
        int ttenthgrade = ttenthGrade + 2;
        ttenthGrade = ttenthgrade;
      }
      else if(tenthGrade.get(teGrade) < 70);
      int ttenthgrade = ttenthGrade + 1;
      ttenthGrade = ttenthgrade;
    }
    float teGpa = ttenthGrade / teCount;
    System.out.println("");
    System.out.println("Junoir Year");
    System.out.println("-------------");
    int eeleventhGrade = 0;
    int elCount = 0;
    for(String elGrade : eleventhGrade.keySet()){
      elCount++;
      System.out.println(elGrade + " | " + eleventhGrade.get(elGrade));
      if(eleventhGrade.get(elGrade) > 89){
        int eeleventhgrade = eeleventhGrade + 4;
        eeleventhGrade = eeleventhgrade;
      }
      else if(eleventhGrade.get(elGrade) > 79 | eleventhGrade.get(elGrade) < 90){
        int eeleventhgrade = eeleventhGrade + 3;
        eeleventhGrade = eeleventhgrade;
      }
      else if(eleventhGrade.get(elGrade) > 69 | eleventhGrade.get(elGrade) < 80){
        int eeleventhgrade = eeleventhGrade + 2;
        eeleventhGrade = eeleventhgrade;
      }
      else if(eleventhGrade.get(elGrade) < 70){
      int eeleventhgrade = eeleventhGrade + 1;
      eeleventhGrade = eeleventhgrade;
      }
    }
    float elGpa = eeleventhGrade / elCount;
    System.out.println("");
    System.out.println("Senior Year");
    System.out.println("-------------");
    int ttweflthGrade = 0;
    int tweCount = 0;
    for(String tweGrade : tweflthGrade.keySet()){
      tweCount++;
      System.out.println(tweGrade + " | " + tweflthGrade.get(tweGrade));
      if(tweflthGrade.get(tweGrade) > 89){
        int ttweflthgrade = ttweflthGrade + 4;
        ttweflthGrade = ttweflthgrade;
      }
      else if(tweflthGrade.get(tweGrade) > 79 | tweflthGrade.get(tweGrade) < 90){
        int ttweflthgrade = ttweflthGrade + 3;
        ttweflthGrade = ttweflthgrade;
      }
      else if(tweflthGrade.get(tweGrade) > 69 | tweflthGrade.get(tweGrade) < 80){
        int ttweflthgrade = ttweflthGrade + 2;
        ttweflthGrade = ttweflthgrade;
      }
      else if(tweflthGrade.get(tweGrade) < 70){
      int ttweflthgrade = ttweflthGrade + 1;
      ttweflthGrade = ttweflthgrade;
      }
    }
    float tweGpa = ttweflthGrade / tweCount;
    float endgpa = nGpa + teGpa + elGpa + tweGpa;
    float endGpa = endgpa / 4;
    System.out.println("");
    System.out.println("Academic Summary");
    System.out.println("--------------------");
    System.out.println("Cumulative GPA: " + endGpa);
    int endCredits = creds / 2;
    System.out.println("Credits Earned: " + endCredits);
    if(endCredits < 24){
      System.out.println("Diploma Earned: No");
    }
    else{
      System.out.println("Diploma Earned: Yes");
    }
    System.out.println("Graduation Date: " + student.graduation);
  }
}
