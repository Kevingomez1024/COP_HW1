class DynamicQueue{
    private DynamicNode front, rear;
    final int QUEUESIZE = 4;
    int currentSize = 0;

    public DynamicQueue(){
        front = rear = null;
    }

    public boolean empty(){
        return (front == null);
    }

    public DynamicNode insertIntoQueue(Object x){
        if(this.empty()){ // insert and return node if no nodes are in queue
            front = rear = new DynamicNode(x,null);
            currentSize = 1;
            return rear;
        }
        DynamicNode t = null,q = null;
        for(DynamicNode p = front; p != null; p = p.getNext()){ // checks and inserts duplicates
            q = p.getNext();
            if(x.equals(front.getInfo())){ // if duplicate is in first node, seat rear next to front. Set front next to front;
                rear.setNext(front);
                front = p.getNext();
                rear = rear.getNext();
                rear.setNext(null);
                return rear;
            }
            else if(x.equals(rear.getInfo())){
                return rear;
            }
            if(x.equals(p.getInfo())){
                rear.setNext(p);
                t.setNext(q);
                rear = rear.getNext();
                rear.setNext(null);
                return rear;
            }
            t = p;
        }

        if(currentSize == 4){
            front = front.getNext();
            rear.setNext(new DynamicNode(x,null));
            rear = rear.getNext();
            return rear;
        }
        else{
            rear.setNext(new DynamicNode(x,null));
            rear = rear.getNext();
            currentSize++;
            return rear;
        }


    }

    public String printQueue(){
        String queue = "";
        DynamicNode p = front;
        while(p != null){
            queue = queue + p.getInfo() + "->";
            p = p.getNext();
        }
        return queue;
    }




}