package SuperTest;

public class Students extends Person {
    String id="Students";
    public void eat(){
        System.out.println("Students中的eat方法");
    }
    public void sleep(){
        System.out.println("Students中的sleep方法");
    }
    public void study(){
        System.out.println("Students中的study方法");
    }
    public void showId(){
        System.out.println("super id="+super.id+", this id ="+this.id);
    }
}
