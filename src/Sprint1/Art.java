package ArticleAssignments;

public class Art {
    public void paint(){
        System.out.println("Я рисую");
    }
}
class Pointillist extends Art{
    @Override
    public void paint() {
        System.out.println("Я рисую точками");
    }
}
class Impressionist extends Art{
    @Override
    public void paint(){
        System.out.println("Я передаю впечатления.");
    }

}
class Cubist extends Art{
    @Override
    public  void paint(){
        System.out.println("Я использую простые геометрические формы.");
    }

}
