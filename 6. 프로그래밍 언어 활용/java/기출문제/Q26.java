class Singleton{
    static private Singleton instance = null;
    private int count = 0;
    static public Singleton get(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void count(){count++;}
    public int getCount(){return count;}
}
public class Q26 {
    public static void main(String[] args){
        Singleton s1 = Singleton.get();
        s1.count();
        Singleton s2 = Singleton.get();
        s2.count();
        Singleton s3 = Singleton.get();
        s3.count();
        System.out.print(s1.getCount());        
    }
}
