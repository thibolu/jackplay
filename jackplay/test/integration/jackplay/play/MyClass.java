package integration.jackplay.play;

public abstract class MyClass {

    public String myfunction1(int arg1, String arg2) {
        return "";
    }

    public void myfunction2(Object arg1, java.util.List<String> arg2) {
    }

    public Object[] myfunction3(Object[] arg1, int[][] arg2) {
        return arg1;
    }

    public abstract void myAbstract();

    public native void myNative();
}