public class task4b {
    Node[] adjList;
    int n;
    task4b(int n){
        this.n=n;
    this.adjList=new Node[n];
    }

    public static void main(String[]args){
         task4b unDir = new task4b(7);
       unDir.addEdge(0, 1, 2);
       unDir.addEdge(0, 2, 2);
       unDir.addEdge(0, 3, 6);
       unDir.addEdge(0, 6, 6);
       unDir.addEdge(1, 2, 4);
       unDir.addEdge(1, 3, 2);
       unDir.addEdge(1, 4, 2);
       unDir.addEdge(1, 5, 5);
       unDir.addEdge(2, 4, 5);
       unDir.addEdge(2, 5, 2);
       unDir.addEdge(2, 6, 2);
       unDir.addEdge(3, 4, 2);
       unDir.addEdge(3, 5, 5);
       unDir.addEdge(4, 5, 2);
       unDir.addEdge(4, 6, 5);
       unDir.addEdge(5, 6, 2);
       
       unDir.print();
    }

    void addEdge(int src, int des, int weight){
        Node newNode= new Node(des,weight);
        if(adjList[src]==null){
            adjList[src]=newNode;
        }else{
            Node temp=adjList[src];
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
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
}
