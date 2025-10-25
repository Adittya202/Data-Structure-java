public class task2b {
    Node[] adjList;
    int n;
    boolean isDirected;

    task2b(int n,boolean isDirected) {
        this.n = n;
        this.adjList = new Node[n];
        this.isDirected=isDirected;
    }

    void addEdge(int src, int des, int weight) {
        Node newNode = new Node(des, weight);
        if (adjList[src] == null) {
            adjList[src] = newNode;
        } else {
            Node temp = adjList[src];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        if(!isDirected){
        Node revNode = new Node(src, weight);
        if (adjList[des] == null) {
            adjList[des] = revNode;
        } else {
            Node temp = adjList[des];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = revNode;
        }
    }
    }

    void print() {
        for (int idx = 0; idx < adjList.length; idx++) {
            System.out.print("vertex " + idx + " -->");
            Node temp = adjList[idx];
            while (temp != null) {
                System.out.print(" (" + (int) temp.vertex + " w:" + (int) temp.weight + ")");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    void maxSum(){
        int sum2=0;
        int rslt=0;
        for(int i=0;i<adjList.length;i++){
         Node temp=adjList[i];
         int sum1=0;
         
        
         while(temp!=null){
            sum1+=(int)temp.weight;
            temp=temp.next;
         }
         if(sum2<sum1){
            sum2=sum1;
            rslt=i;
         }
        }
        System.out.println("vertex "+rslt+" has the maxSum = "+sum2);
    }
    public static void main(String[] args) {
        task2b gr = new task2b(7,false);
        gr.addEdge(0, 1, 2);
        gr.addEdge(0, 2, 2);
        gr.addEdge(0, 3, 6);
        gr.addEdge(0, 6, 6);
        gr.addEdge(1, 2, 4);
        gr.addEdge(1, 3, 2);
        gr.addEdge(1, 4, 2);
        gr.addEdge(1, 5, 5);
        gr.addEdge(2, 4, 5);
        gr.addEdge(2, 5, 2);
        gr.addEdge(2, 6, 2);
        gr.addEdge(3, 4, 2);
        gr.addEdge(3, 5, 5);
        gr.addEdge(4, 5, 2);
        gr.addEdge(4, 6, 5);
        gr.addEdge(5, 6, 2);
        gr.print();
        gr.maxSum();

    }
}



