public class Transcript {
  String name;
  int age;
  String address;
  int phoneNumber;
  String dateOfBirth;
  String parent;

  public Transcript(String Name, int Age, String Address, int PhoneNumber, String DateOfBirth, String Parent){
    name = Name;
    age = Age;
    address = Address;
    phoneNumber = PhoneNumber;
    dateOfBirth = DateOfBirth;
    parent = Parent;
  }
  public void TranscriptGpa(Hashmap<String, int> grades){
    int firstGpa = 0;
    int count = 0;
    for(String grade : grades.keySet()){
      count = count + 1;
      if(grades.keyset(grade) > 90){
        firstGpa = firstGpa + 4;
      }
      else if(grades.keySet(grade) > 80, grades.keySet(grade) < 90){
        firstGpa = firstGpa + 3);
      }
      else if(grades.keySet(grade) > 70, grades.keySet(grade) < 80){
        firstGpa = firstGpa + 2;
      }
      else if(grades.keySet(grade) < 65){
        firstGpa = firstGpa + 1;
      }
    }
    float gpa = firstGpa / gpa;
  }
  public static void main(String[] args) {
    Hashmap<String, Integer> ninthGrade = new Hashmap<String, Integer>();
    ninthGrade.put("English", 90);
    ninthGrade.put("Algebra", 90);
    ninthGrade.put("Biology", 90);
    ninthGrade.put("American Histoy", 90);
    ninthGrade.put("Drawing", 90);
    ninthGrade.put("Martial Arts 1", 90);
    ninthGrade.put("MS Office", 90);

    Hashmap<String, Integer> tenthGrade = new Hashmap<String, Integer>();
    tenthGrade.put("English", 90);
    tenthGrade.put("Algebra 2", 90);
    tenthGrade.put("Chemistry", 90);
    tenthGrade.put("World history", 90);
    tenthGrade.put("Latin 1", 90);
    tenthGrade.put("Martial Arts 2", 90);
    tenthGrade.put("Piano", 90);

    Hashmap<String, Integer> eleventhGrade = new Hashmap<String, Integer>();
    tenthGrade.put("English", 85);
    tenthGrade.put("Algebra 2", 95);
    tenthGrade.put("Marine Biology", 95);
    tenthGrade.put("American Government", 95);
    tenthGrade.put("Economics", 95);
    tenthGrade.put("Latin 2", 95);
    tenthGrade.put("Web Design", 95);

    Hashmap<String,Integer> tweflthGrade = new Hashmap<String, Integer>();
    tweflthGrade.put("English", 85);
    tweflthGrade.put("Calculus", 95);
    tweflthGrade.put("Physics", 95);
    tweflthGrade.put("Photography", 95);
    twelfthGrade.put("Yearbook", 95);
    twelfthGrade.put("Drivers Ed", 95);
    twelfthGrade.put("Studip Art", 95);
    twelfthGrade.put("Piano", 95);
  }
}
