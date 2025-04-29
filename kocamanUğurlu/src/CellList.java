
import javax.swing.JButton;
import javax.swing.JLabel;



//actions:
//0=> do nothing
//1=> +10 points
//2=> -5 points
//3=> big prize

 class Cell{
  int action;
  Cell next;
  int cellnum;
  JButton btn;
  JLabel lbl;
  
   public Cell(int action) {
        this.action= action;
        next = null;
      
    }
  
}

public class CellList {
    Cell head;
    int size=0;
   
    public CellList() {
        this.head = null;
        
        this.size=0;
    }
    
    public Cell get(int index){
    Cell temp= head;
        if (index>31) {
            return null;
        }
    
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        
        return temp;
    }
    public void add(int action){
    Cell newCell= new Cell(action);
        if (head==null) {
            head=newCell;
            newCell.cellnum=size;
            size++;
            return;            
        }
        Cell temp=head;
        while (temp.next!=null) {            
            temp=temp.next;
        }
        temp.next=newCell;
        newCell.cellnum=size;
        size++;
    }
    public void fillrandom(){

        add(0);
        for (int i = 0; i < 31; i++) {
            add((int) (Math.random()*3));
        }
        
        
       
        
      
    }
   
    public void clear(){
        head=null;
        size=0;
    }
    
    public int getAction(int index){
   
        if (index==1) {
            return head.action;
        }
    Cell temp=head;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
    return temp.action;
 
    }
    
    
    
}
