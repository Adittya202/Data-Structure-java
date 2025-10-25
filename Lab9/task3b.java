public class task3b {
    Node[]adjList;
    int n;
    boolean isDirected;
    task3b(int n,boolean isDirected){
        this.n=n;
        this.adjList= new Node[n];
        this.isDirected=isDirected;
    }
    void addEdge(int src, int des, int weight){
        Node newNode=new Node(des,weight);
        if(adjList[src]==null){
            adjList[src]=newNode;
        }else{
            Node temp=adjList[src];
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    
    if(!isDirected){
       
        Node revNode=new Node(src,weight);
        if(adjList[des]==null){
            adjList[des]=revNode;
        }else{
            Node temp=adjList[des];
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=revNode;
        }
    }
    }
    String maxDegree(){
        int degree=0;
        int degree2=0;
        int vertex=0;
        for(int i=0;i<adjList.length;i++){
            degree=0;
            Node temp=adjList[i];
            while(temp!=null){
                degree++;
                temp=temp.next;
            }
            if(degree2<degree){
                degree2=degree;
                vertex=i;
            }

        }
        return "vertex "+vertex+" has the maximum degree "+degree2;
    }
    public static void main(String[] args) {
        task3b degree = new task3b(7,true);
        degree.addEdge(0,1,2);
        degree.addEdge(0,2,2);
        degree.addEdge(0,3,6);
        degree.addEdge(0,6,6);
        degree.addEdge(1,2,4);
        degree.addEdge(1,4,2);
        degree.addEdge(1,5,5);
        degree.addEdge(3,1,2);
        degree.addEdge(3,4,2);
        degree.addEdge(3,5,5);
        degree.addEdge(4,2,5);
        degree.addEdge(4,5,2);
        degree.addEdge(4,6,5);
        degree.addEdge(5,2,2);
        degree.addEdge(6,2,2);
        degree.addEdge(6,5,2);
        System.out.print(degree.maxDegree());
    }
}
