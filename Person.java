class Person
{
  private String name,color;
  private int age;
  
  Person(String a,int b, String c)
  {
    name=a;
    age=b;
    color=c;

  }
  String getName()
  {
    return name;
  }
  int getAge()
  {
    return age;
  }
  String getColor()
  {
    return color;
  }
  
}