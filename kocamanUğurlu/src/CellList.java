
import javax.swing.JButton;
import javax.swing.JLabel;

//actions:
//0=> do nothing
//1=> +10 points
//2=> -5 points
//3=> big prize
class Cell {

    int action;
    Cell next;
    Cell prev;
    Cell altCell;

    JButton btn;
    JLabel lbl;

    public Cell(int action) {
        this.action = action;
        next = null;
        prev = null;
        altCell = null;

    }

}

public class CellList {

    Cell head;
    Cell tail;
    int size = 0;

    public static void main(String[] args) {
        CellList celllist = new CellList();
        celllist.fillrandom();
        for (int i = 0; i < celllist.size; i++) {
            System.out.println(celllist.get(i).action);
        }
    }

    public CellList() {
        this.head = null;
        this.tail = null;

        this.size = 0;
    }

    public Cell get(int index) {
        Cell temp = head;
        if (index > 31) {
            return null;
        }

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void add(int action) {
        Cell newCell = new Cell(action);
        if (head == null) {
            head = newCell;
            tail = newCell;

            size++;
            return;
        }
        tail.next = newCell;
        newCell.prev = tail;
        tail = newCell;

        size++;
    }

    public void fillrandom() {

        add(0);
        for (int i = 0; i < 31; i++) {
            add((int) (Math.random() * 3));
        }

    }

    public void addMovers() {
        this.get(3).altCell = this.get(8);
        this.get(6).altCell = this.get(4);
        this.get(9).altCell = this.get(13);
        this.get(11).altCell = this.get(5);
        this.get(14).altCell = this.get(17);
        this.get(18).altCell = this.get(8);
        this.get(20).altCell = this.get(26);
        this.get(23).altCell = this.get(19);
        this.get(27).altCell = this.get(22);
        this.get(28).altCell = this.get(30);

    }

    public int getAction(int index) {

        if (index == 1) {
            return head.action;
        }
        Cell temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp.action;

    }

}
