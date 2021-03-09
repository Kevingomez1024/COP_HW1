class DynamicQueue{
    private DynamicNode front, rear;
    int QUEUESIZE;
    int currentSize = 0;

    public DynamicQueue(int QUEUESIZE){
        front = rear = null;
        this.QUEUESIZE = QUEUESIZE;
    }

    public boolean empty(){
        return (front == null);
    }

    public String insertIntoQueue(Object x, int queueIndex){

        if(this.empty()){ // insert node if no nodes are in queue
            front = rear = new DynamicNode(x,null);
            currentSize = 1;
            return "Read key " + x + "for queue " + queueIndex + ". Inserting " + x + "in rear. Q" + queueIndex + ": " + printQueue();
        }

        DynamicNode t = null,q = null;
        for(DynamicNode p = front; p != null; p = p.getNext()){ // checks and inserts duplicates
            q = p.getNext();
            if(x.equals(front.getInfo())){ // if duplicate is in first node, seat rear next to front. Set front next to front;
                rear.setNext(front);
                front = p.getNext();
                rear = rear.getNext();
                rear.setNext(null);
                return "Read key " + x + "for queue " + queueIndex + "." + x + " is a duplicate. Inserting " + x + "in rear. Q" + queueIndex + ": " + printQueue();

            }
            else if(x.equals(rear.getInfo())){
                return "Read key " + x + "for queue " + queueIndex + "." + x + " is a duplicate that is already in rear. Q" + queueIndex + ": " + printQueue();
            }
            if(x.equals(p.getInfo())){
                rear.setNext(p);
                t.setNext(q);
                rear = rear.getNext();
                rear.setNext(null);
                return "Read key " + x + "for queue " + queueIndex + "." + x + " is a duplicate. Inserting " + x + "in rear. Q" + queueIndex + ": " + printQueue();
            }
            t = p;
        }

        //inserts at the end of the list if it is full and deletes the first node
        if(currentSize == QUEUESIZE){
            Object temp = front;        // used to return info of item deleted when queue is full
            front = front.getNext();
            rear.setNext(new DynamicNode(x,null));
            rear = rear.getNext();
            return "Read key " + x + "for queue " + queueIndex + ". Queue is full. Deleting " + temp + " and inserting " + x + "in rear. Q" + queueIndex + ": " + printQueue();

        }
        else{ //inserts new node at the end
            rear.setNext(new DynamicNode(x,null));
            rear = rear.getNext();
            currentSize++;
            return "Read key " + x + "for queue " + queueIndex + ". Inserting " + x + "in rear. Q" + queueIndex + ": " + printQueue();

        }


    }

    public String printQueue(){
        if(this.empty()){
            return "Empty";
        }
        String queue = "";
        DynamicNode p = front;
        while(p != null){
            if(p.getNext() == null){
                queue += p.getInfo();
            }
            else{
                queue = queue + p.getInfo() + "->";
            }
            p = p.getNext();
        }
        return queue;
    }




}