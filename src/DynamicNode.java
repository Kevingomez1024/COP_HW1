// this code is similar to the lecture 5 slides
// some small items might be different for example
// in some methods when given a null node, it uses
// System.exit() rather than throwing an exception
// returning null
// the code mostly came from the langsam book

class DynamicNode{
    private Object info;
    private DynamicNode next;

    public DynamicNode(Object x, DynamicNode n){
        info=x;
        next=n;
    }

    public Object getInfo(){
        return info;
    }

    public DynamicNode getNext(){
        return next;
    }

    public void setInfo(Object x){
        info=x;
    }

    public void setNext(DynamicNode n){
        next=n;
    }

    public String toString(){
        return info.toString();
    }
}


