package com.practicetwo;

class Test {
    String s="Parent Variable";
}
class Subtest extends Test{
    String s="Child Variable";
    public void main(){
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
class Main{
    public static void main(String[] args){
        Subtest t1=new Subtest();
        t1.main();
    }
}


