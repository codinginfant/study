public class Ingeritance1 {
}
class Person {
    String name;
    int age;

    void walk(){
        System.out.println("걷습니다");
    }

    class Programmer extends Person {          // Person 클래스로부터 상속. extends 키워드 사용
        String companyName;

        void coding(){
            System.out.println("코딩을 합니다")

            public class HelloJava{
                public static void main(String[] args){

                    Person p = new Person();              // Person 객체 생성
                    p.name = "김코딩";
                    p.age = 24;
                    p.walk();
                    System.out.println(p.name);

                    Programmer pq = new Programmer();     // Programmer 객체 생성
                    pg.name = "박해커";
                    pg.age = 26;
                    pg.coding();                          // Programmer의 개별기능