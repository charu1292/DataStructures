//package threads_n_more;
//
//public class inheritance {
//
//    class Parent{
//        protected int num = 1;
//
//        Parent(){
//            System.out.println("cham_prac.Parent class default constructor.");
//        }
//
//        Parent(String x){
//            System.out.println("cham_prac.Parent class parameterised constructor.");
//        }
//
//        public void foo(){
//            System.out.println("cham_prac.Parent class foo!");
//        }
//    }
//    class Child extends Parent {
//        private int num = 2;
//
//        Child() {
//            //super constructor call should always be in the first line
//            // super();              // Either call default super() to call default parent constructor OR
//            super("Call cham_prac.Parent");    // call parameterised super to call parameterised parent constructor.
//            System.out.println("cham_prac.Child class default Constructor");
//        }
//
//        void printNum() {
//            System.out.println(num);
//            System.out.println(super.num); //prints the value of num of parent class
//        }
//
//        @Override
//        public void foo() {
//            System.out.println("cham_prac.Child class foo!");
//            super.foo();    //Calls foo method of cham_prac.Parent class inside the Overriden foo method of cham_prac.Child class.
//        }
//
//
//        public static  void main(String args[]) {
//            Parent demoObject = new Child();
//            demoObject.foo();
//            System.out.println(demoObject.num);
//
//        }
//
//    }
//}
