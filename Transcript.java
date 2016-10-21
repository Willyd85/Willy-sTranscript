import java.util.*;

class Transcript {
  String name;
  int age;
  String address;
  String phoneNumber;
  String dateOfBirth;
  String parent;

  public Transcript(String Name, int Age, String Address, String PhoneNumber, String DateOfBirth, String Parent){
    name = Name;
    age = Age;
    address = Address;
    phoneNumber = PhoneNumber;
    dateOfBirth = DateOfBirth;
    parent = Parent;
  }
  public void addGradeOne(HashMap<String, Integer> ninthGrade){
    Scanner inputClass = new Scanner(System.in);
    System.out.print("Class: ");
    String notClass = inputClass.next();

    Scanner iinputGrade = new Scanner(System.in);
    System.out.print("Grade in class: ");
    int classGrade = iinputGrade.nextInt();
    ninthGrade.put(notClass, classGrade);
  }
  public void addGradeTwo(HashMap<String, Integer> tenthGrade){
    Scanner inputClass = new Scanner(System.in);
    System.out.println("Class: ");
    String notClass = inputClass.next();

    Scanner iinputGrade = new Scanner(System.in);
    System.out.print("Grade in class: ");
    int classGrade = iinputGrade.nextInt();
    tenthGrade.put(notClass, classGrade);
  }
  public void addGradeThree(HashMap<String, Integer> eleventhGrade){
    Scanner inputClass = new Scanner(System.in);
    System.out.println("Class: ");
    String notClass = inputClass.next();

    Scanner iinputGrade = new Scanner(System.in);
    System.out.print("Grade in class: ");
    int classGrade = iinputGrade.nextInt();
    eleventhGrade.put(notClass, classGrade);
  }
  public void addGradeFour(HashMap<String, Integer> tweflthGrade){
    Scanner inputClass = new Scanner(System.in);
    System.out.println("Class: ");
    String notClass = inputClass.next();

    Scanner iinputGrade = new Scanner(System.in);
    System.out.print("Grade in class: ");
    int classGrade = iinputGrade.nextInt();
    tweflthGrade.put(notClass, classGrade);
  }
  public void TranscriptGpa(HashMap<String, Integer> ninthGrade){
    int firstGpa = 0;
    int count = 0;
    for(String grade : ninthGrade.keySet()){
      count = count + 1;
      if(ninthGrade.get(grade) > 89){
        firstGpa = firstGpa + 4;
      }
      else if(ninthGrade.get(grade) > 79 || ninthGrade.get(grade) < 90){
        firstGpa = firstGpa + 3;
      }
      else if(ninthGrade.get(grade) > 69 || ninthGrade.get(grade) < 80){
        firstGpa = firstGpa + 2;
      }
      else if(ninthGrade.get(grade) < 70){
        firstGpa = firstGpa + 1;
      }
    }
    float gpa = firstGpa / count;
  }
  public void TranscriptGpa2(HashMap<String, Integer> tenthGrade){
    int firstGpa = 0;
    int count = 0;
    for(String grade : tenthGrade.keySet()){
      count = count + 1;
      if(tenthGrade.get(grade) > 89){
        firstGpa = firstGpa + 4;
      }
      else if(tenthGrade.get(grade) > 79 || tenthGrade.get(grade) < 90){
        firstGpa = firstGpa + 3;
      }
      else if(tenthGrade.get(grade) > 69 || tenthGrade.get(grade) < 80){
        firstGpa = firstGpa + 2;
      }
      else if(tenthGrade.get(grade) < 70){
        firstGpa = firstGpa + 1;
      }
    }
    float gpa = firstGpa / count;
  }
  public void TranscriptGpa3(HashMap<String, Integer> eleventhGrade){
    int firstGpa = 0;
    int count = 0;
    for(String grade : eleventhGrade.keySet()){
      count = count + 1;
      if(eleventhGrade.get(grade) > 89){
        firstGpa = firstGpa + 4;
      }
      else if(eleventhGrade.get(grade) > 79 || eleventhGrade.get(grade) < 90){
        firstGpa = firstGpa + 3;
      }
      else if(eleventhGrade.get(grade) > 69 || eleventhGrade.get(grade) < 80){
        firstGpa = firstGpa + 2;
      }
      else if(eleventhGrade.get(grade) < 70){
        firstGpa = firstGpa + 1;
      }
    }
    float gpa = firstGpa / count;
  }
  public void TranscriptGpa4(HashMap<String, Integer> tweflthGrade){
    int firstGpa = 0;
    int count = 0;
    for(String grade : tweflthGrade.keySet()){
      count = count + 1;
      if(tweflthGrade.get(grade) > 89){
        firstGpa = firstGpa + 4;
      }
      else if(tweflthGrade.get(grade) > 79 || tweflthGrade.get(grade) < 90){
        firstGpa = firstGpa + 3;
      }
      else if(tweflthGrade.get(grade) > 69 || tweflthGrade.get(grade) < 80){
        firstGpa = firstGpa + 2;
      }
      else if(tweflthGrade.get(grade) < 70){
        firstGpa = firstGpa + 1;
      }
    }
    float gpa = firstGpa / count;
  }
  public static void main(String[] args) {
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

    Transcript student = new Transcript(inputName, inputAge, inputAddress, inputPhone, inputBirth, inputParent);
    boolean start = true;
    while(start = true){
      boolean firststart = true;
      while(firststart = true){
        Scanner freshClass = new Scanner(System.in);
        System.out.print("Press 1 to add a class from 9th grade: ");
        int freshmanYear = freshClass.nextInt();
        if(freshmanYear == 1){
          student.addGradeOne(ninthGrade);
        }
        else{
          firststart = false;
        }
      }
      boolean secondStart = true;
      while(secondStart = true){
        Scanner sophClass = new Scanner(System.in);
        System.out.print("Press 1 to add a class from 10th grade: ");
        int sophmoreYear = sophClass.nextInt();
        if(sophmoreYear == 1){
          student.addGradeTwo(tenthGrade);
        }
        else{
          secondStart = false;
        }
      }
      boolean thirdStart = true;
      while(thirdStart = true){
        Scanner junClass = new Scanner(System.in);
        System.out.print("Press 1 to add a class from 11th grade: ");
        int juniorYear = junClass.nextInt();
        if(juniorYear == 1){
          student.addGradeThree(eleventhGrade);
        }
        else{
          thirdStart = false;
        }
      }
      boolean fourthStart = true;
      while(fourthStart = true){
        Scanner senClass = new Scanner(System.in);
        System.out.print("Press 1 to add a class from 12th grade: ");
        int seniorYear = senClass.nextInt();
        if(seniorYear == 1){
          student.addGradeFour(tweflthGrade);
        }
        else{
          fourthStart = false;
        }
      }
      start = false;
    }
  }
}
