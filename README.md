# Java Object Oriented Programming

## I. Các khái niệm cơ bản

1. **Class (Lớp)**

   - là nơi định nghĩa thông tin của các đối tượng, cũng có thể hiểu là một kiểu dữ liệu mà biến của kiểu dữ liệu này được coi như 1 đối tượng
   - VD: con người, học sinh, công nhân, ...

2. **Object (Đối tượng)**
   - là tất cả những thực thể có trạng thái và hành vi được biết đến như là một đối tượng. Có thể hiểu đối tượng là một biến
   - VD:
     ```java
             Student a = new Student();
             // a chính là 1 Object
     ```
3. **Attribute (Thuộc tính)**

   - là các đặc điểm của đối tượng
   - VD: name, age,... là các thuộC tính của đối tượng học sinh

4. **Method (Phương thức)**

   - là các hành vi của đối tượng
   - VD: nhập, xuất,...

5. **Access Modifier (Phạm vi truy cập)**
   | Phạm vi truy cập | trong class | trong package | ngoài package bởi class con | ngoài package |
   |:---|:---:|:---:|:---:|:---:|
   | **private** | Yes | No | No | No |
   | **default** | Yes | Yes | No | No |
   | **protected** | Yes | Yes | Yes | No |
   | **public** | Yes | Yes | Yes | Yes |

6. **Constructor (Phương thức khởi tạo)**

   - Là một phương thức đặc biệt, phương thức này sẽ tự động được gọi khi bạn khởi tạo một đối tượng
   - Không được định nghĩa kiểu trả về
   - Có tên trùng với tên lớp.
   - Nếu một class không được khai báo constructor nào thì chương trình sẽ tự động tạo ra một constructor mặc định.
   - constructor được chia làm 2 loại
     - constructor có tham số
     - constructor không tham số
   - VD:

     ```java
         class Student {
             private String name;
             private int age;

             // constructor không tham số
             public Student() {

             }

             // constructor có tham số
             public Student(String name, int age) {
                 this.name = name;
                 this.age = age;
             }
         }
     ```

7. **This**
   - this được sử dụng để đại diện cho đối tượng hiện tại, nó được sử dụng trong lớp để tham chiếu tới các thành viên của lớp
   - Sử dụng `this()` gọi Constructor của lớp hiện tại. `this()` phải được khai báo dòng lệnh đầu tiên trong Constructor.
8. **Super**
   - Từ khóa super trong java là một biến tham chiếu được sử dụng để tham chiếu trực tiếp đến đối tượng của lớp cha gần nhất.
   - super có 3 cách sử dụng như sau:
     - từ khoá super sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
     - super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
     - Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha.
9. **Final**

   - Từ khóa final trong Java được sử dụng để hạn chế người dùng. Từ khóa final có thể được sử dụng trong nhiều ngữ cảnh:
     - Biến final: bạn không thể thay đổi giá trị của biến final (nó sẽ là hằng số).
     - Phương thức final: bạn không thể ghi đè phương thức final nhưng phương thức final có thể được kế thừa
     - Lớp final: bạn không thể kế thừa lớp final.
     - Biến static final trống: Một biến final mà không được khởi tạo tại thời điểm khai báo được gọi là biến final trống
   - VD:

     ```java
          final public class MyFinalClass{…}

          public class MyClass{
              final public double PI = 3.14
              final public void method(){…}
          }
     ```

10. **Static Variable (Biến tĩnh)**

- Static variable là biến mà bạn có thể sử dụng mà không cần phải khởi tạo đối tượng.
- Static variable dùng chung cho tất cả các đối tượng. nghĩa là static variable có giá trị giống nhau ở tất cả các đối tượng

11. **Static method (Phương thức tĩnh)**

- giống với Static variable là có thể dùng mà không cần phải khởi tạo đối tượng.
- Trong cùng một lớp, phương thức tĩnh chỉ có thể gọi tới phương thức tĩnh hay biến tĩnh khác, không thể gọi tới phương thức và biến không phải là tĩnh

12. **Method overloading (Nạp chồng phương thức)**

- Nếu một lớp có nhiều phương thức cùng tên nhưng khác nhau về kiểu dữ liệu hoặc số các tham số, thì đó là nạp chồng phương thức.
- Nạp chồng phương thức giúp bạn tránh được việc tạo ra các phương thức với tên gọi khác nhau, giúp cho code trở nên gọn gàng, dễ đọc hơn.
- VD:

  ```java
      class Math {
          public static int max(int a, int b) {
              // ...
          }
          public static double max(double a, double b) {
              // ...
          }
          public static int max(int a, int b, int c) {
              // ...
          }

          public static void main(String[] args) {
              max(2,4);
              max(2.34,5.43);
              max(2, 3, 6);
          }
      }
  ```

13. **Method overriding (ghi đè phương thức)**

    - Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha.
    - Nói cách khác, nếu lớp con cung cấp sự cài đặt cụ thể cho phương thức đã được cung cấp bởi một lớp cha của nó được gọi là ghi đè phương thức (method overriding) trong java.
    - Ghi đè phương thức được sử dụng để cung cấp cài đặt đặc biệt của một phương thức mà đã được định nghĩa ở lớp cha.
    - Ghi đè phương thức được sử dụng cho đa hình runtime.
    - Nguyên tắc ghi đè phương thức trong java
      - Phương thức phải có tên giống với lớp cha.
      - Phương thức phải có tham số giống với lớp cha.
      - Lớp con và lớp cha có mối quan hệ kế thừa.
    - **chú ý:**
      - Không ghi đè được phương thức static vì phương thức static được ràng buộc với class còn phương thức instance được ràng buộc với đối tượng. Static thuộc về vùng nhớ class còn instance thuộc về vùng nhớ heap.

14. Sự khác nhau giữa overloading và overriding trong java
    | STT | Nạp chồng phương thức (overloading) | Ghi đè phương thức (overriding) |
    |:---:|:---|:---|
    | 1 | Nạp chồng phương thức được sử dụng để giúp code của chương trình dễ đọc hơn. | Ghi đè phương thức được sử dụng để cung cấp cài đặt cụ thể cho phương thức được khai báo ở lớp cha. |
    | 2 | Nạp chồng được thực hiện bên trong một class. | Ghi đè phương thức xảy ra trong 2 class có quan hệ kế thừa. |
    | 3 | Nạp chồng phương thức thì tham số phải khác nhau. | Ghi đè phương thức thì tham số phải giống nhau. |
    | 4 | Nạp chồng phương thức là ví dụ về đa hình lúc biên dịch. | Ghi đè phương thức là ví dụ về đa hình lúc runtime. |
    | 5 | Trong java, nạp chồng phương thức không thể được thực hiện khi chỉ thay đổi kiểu giá trị trả về của phương thức. Kiểu giá trị trả về có thể giống hoặc khác. Giá trị trả về có thể giống hoặc khác, nhưng tham số phải khác nhau. | Giá trị trả về phải giống nhau. |

15. **Abstraction method (Phương thức trừu tượng)**

    - Một phương thức được khai báo là abstract và không có trình triển khai thì đó là phương thức trừu tượng.
    - Nếu bạn muốn một lớp chứa một phương thức cụ thể nhưng bạn muốn triển khai thực sự phương thức đó để được quyết định bởi các lớp con, thì bạn có thể khai báo phương thức đó trong lớp cha ở dạng abstract.
    - Từ khóa abstract được sử dụng để khai báo một phương thức dạng abstract. Một phương thức abstract không có thân phương thức.
    - Phương thức abstract sẽ không có định nghĩa, được theo sau bởi dấu chấm phảy, không có dấu ngoặc nhọn theo sau

      ```java
            // lớp trừu tượng
            abstract class Bike{
                // phương thức trừu tượng
                abstract void run();
            }
            class Honda4 extends Bike{
                void run() {
                    System.out.println("chạy bốc đầu :))");
                }

                public static void main(String args[]) {
                    Bike obj = new Honda4();
                    obj.run();
                    // kq: chạy bốc đầu :))
                }
            }
      ```

16. **Interface**

    - Một Interface trong Java là một bản thiết kế của một lớp. Nó chỉ có các phương thức trừu tượng. Interface là một kỹ thuật để thu được tính trừu tượng hoàn toàn và đa kế thừa trong Java.
    - Một Interface trong Java là một tập hợp các phương thức trừu tượng (abstract). Một class triển khai một interface, do đó kế thừa các phương thức abstract của interface.
    - Một interface **không** phải là một lớp. Viết một interface giống như viết một lớp, nhưng chúng có 2 định nghĩa khác nhau.
      - Một lớp mô tả các thuộc tính và hành vi của một đối tượng.
      - Một interface chứa các hành vi mà một class triển khai.
    - Trừ khi một lớp triển khai interface là lớp trừu tượng abstract, còn lại tất cả các phương thức của interface cần được định nghĩa trong class.

      ```java
           package mypackage;
           interface MyInterface{
               void myMethod1();
               void myMethod2();
           }

           public class MyClass implements MyInterface{
               //phải là public
               public void myMethod1(){
                   System.out.println(“Override my method 1");
               }
               public void myMethod2(){
                   System.out.println(“Override my method 2");
               }
               // method riêng của class
               public void mymethod3(){
                   System.out.println("My method 3");
               }
           }
      ```

    - **So sánh interface với class**
      - giống:
        - Một interface được viết trong một file với định dạng .java, với tên của interface giống tên của file
        - Bytecode của interface được lưu trong file có định dạng .class
        - Khai báo interface trong một package, những file bytecode tương ứng cũng có cấu trúc thư mục có cùng tên package.
      - khác:
        - không thể khởi tạo một interface.
        - không chứa bất cứ hàm Constructor nào
        - Tất cả các phương thức của interface đều là abstract.
        - Một interface không thể chứa một trường nào trừ các trường có cả static và final.
        - Một interface không thể kế thừa từ lớp, nó được triển khai bởi một lớp.
        - Một interface có thể kế thừa từ nhiều interface khác.
        - khi kế thừa sử dụng từ khoá `implements` thay vì `extends` như class

17. **OOP là gì ???**
    
    Lập trình hướng đối tượng là một kỹ thuật lập trình cho phép lập trình viên tạo ra các đối tượng trong code trừu tượng hóa các đối tượng thực tế trong cuộc sống. Hướng tiếp cận này hiện đang rất thành công và đã trở thành một trong những khuôn mẫu phát triển phần mềm, đặc biệt là các phần mềm cho doanh nghiệp.
## II. 4 tính chất của lập trình hướng đối tượng

1. **Encapsulation (Đóng gói)**

   - Tính đóng gói trong java là kỹ thuật ẩn giấu thông tin không liên quan và hiện thị ra thông liên quan. Mục đích chính của đóng gói trong java là giảm thiểu mức độ phức tạp phát triển phần mềm.
   - Đóng gói cũng được sử dụng để bảo vệ trạng thái bên trong của một đối tượng. Bởi việc ẩn giấu các biến biểu diễn trạng thái của đối tượng. Việc chỉnh sửa đối tượng được thực hiện, xác nhận thông qua các phương thức. Hơn nữa, việc ẩn giấu các biến thì các lớp sẽ không chia sẻ thông tin với nhau được. Điều này làm giảm số lượng khớp nối có thể có trong một ứng dụng.
   - Lợi ích:
     - Có thể tạo lớp read-only hoặc write-only bằng việc cài đặt phương thức setter hoặc getter.
     - Có thể kiểm soát đối với dữ liệu. Giả sử bạn muốn đặt giá trị của id chỉ lớn hơn 100 bạn có thể viết logic bên trong lớp setter.
   - VD:

     ```java
         public class Student {
             private String name;

             public String getName() {
                 return name;
             }

             public void setName(String name) {
                 this.name = name;
             }

                 public static void main(String[] args) {
                     Student s = new Student();
                     s.setName("Sơn");
                     System.out.println(s.getName());
                     // kq: Sơn
                 }
         }
     ```

2. **Inheritance (Kế thừa)**

   - Kế thừa trong java là sự liên quan giữa hai class với nhau, trong đó có class cha (superclass) và class con (subclass). Khi kế thừa class con được hưởng tất cả các phương thức và thuộc tính của class cha. Tuy nhiên, nó chỉ được truy cập các thành viên public và protected của class cha. Nó không được phép truy cập đến thành viên private của class cha.
   - Tư tưởng của kế thừa trong java là có thể tạo ra một class mới được xây dựng trên các lớp đang tồn tại. Khi kế thừa từ một lớp đang tồn tại bạn có sử dụng lại các phương thức và thuộc tính của lớp cha, đồng thời có thể khai báo thêm các phương thức và thuộc tính khác.
   - Có 3 kiểu kế thừa trong java:
     - Đơn kế thừa: B kế thừa A
     - Kế thừa nhiều cấp: C kế thừa B, B kế thừa A
     - Kế thừa thứ bậc: B kế thừa A, C kế thừa A
   - Tại sao đa kế thừa không được support trong java?
     - Để giảm thiểu sự phức tạp và đơn giản hóa ngôn ngữ
     - Hãy suy xét kịch bản sau: Có 3 lớp A, B, C. Trong đó lớp C kế thừa từ các lớp A và B. Nếu các lớp A và B có phương thức giống nhau và bạn gọi nó từ đối tượng của lớp con, như vậy khó có thể xác đinh được việc gọi phương thức của lớp A hay B.

3. **Polymorphism (Đa hình)**

   - Là một khái niệm mà chúng ta có thể thực hiện một hành động bằng nhiều cách khác nhau.
   - Chúng ta có thể thực hiện đa hình trong java bằng cách nạp chồng phương thức và ghi đè phương thức.
   - Có hai kiểu của đa hình trong java:

     - Đa hình lúc biên dịch (compile): xem VD phần nạp chồng phương thức
     - Đa hình lúc thực thi (runtime):

       - **Upcasting**: Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con

         ```java
                class A {
                    // ...
                }

                class B extends A {
                    // ...
                }

                public static void main(String[] args) {
                    B b = new A();
                }
         ```

       - Đa hình lúc runtime là quá trình gọi phương thức đã được ghi đè trong thời gian thực thi chương trình. Trong quá trình này, một phương thức được ghi đè được gọi thông qua biến tham chiếu của một lớp cha.

         ```java
                 class Animal {
                     void eat() {
                         System.out.println("ăn");
                     }
                 }

                 class Dog extends Animal {
                     void eat() {
                         System.out.println("ăn cơm");
                     }
                 }

                 class BabyDog extends Dog {
                     void eat() {
                         System.out.println("uống sữa");
                     }

                     public static void main(String args[]) {
                         Animal a1, a2, a3;
                         a1 = new Animal();
                         a2 = new Dog();
                         a3 = new BabyDog();
                         a1.eat();
                         a2.eat();
                         a3.eat();
                         // kq:
                         // ăn
                         // ăn cơm
                         // uống sữa
                     }
                 }
         ```

4. **Abstraction (Trừu tượng)**
   - Tính trừu tượng là một tiến trình ẩn các cài đặt chi tiết và chỉ hiển thị tính năng tới người dùng.
   - Nói cách khác, nó chỉ hiển thị các thứ quan trọng tới người dùng và ẩn các chi tiết nội tại, ví dụ: để gửi tin nhắn, người dùng chỉ cần soạn text và gửi tin. Bạn không biết tiến trình xử lý nội tại về phân phối tin nhắn.
   - Tính trừu tượng giúp bạn trọng tâm hơn vào đối tượng thay vì quan tâm đến cách nó thực hiện.
   - Có 2 cách để đạt được sự trừu tượng hóa trong java:
     - Sử dụng lớp abstract
     - Sử dụng interface
