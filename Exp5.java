import java.util.*;

interface stack {
    int[] push(int a, int st[]);

    void pop();

    void display(int st[]);

    void check(int s);
}

class Expt5 implements stack {
    static int nextIndex = 0;
    public int[] push(int a, int st[]) {
        st[nextIndex] = a;
        nextIndex++;
        System.out.println("");
        return (st);
    }

    public void pop() {
        if (nextIndex == 0) {
            check(nextIndex);
        } else {
            System.out.println("Last In First Out\n");
            nextIndex--;
        }

    }

    public void display(int st[]) {
        int i;
        if (nextIndex == 0)
            check(nextIndex);
        else {
            System.out.print("Elements of stack are: ");
            for (i = 0; i < nextIndex; i++) {
                System.out.print(st[i] + " ");
            }
            System.out.println("\n");
        }
    }

    public void check(int s) {
        if (nextIndex == 0)
            System.out.println("Stack empty, please push some values\n");
        else
            System.out.println("Stack full, please pop some values\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Expt5 ob = new Expt5();
        System.out.println("Name: Hardik Shah    |    Roll no.: 16010221025");
        System.out.print("Size of stack: ");
        int s = sc.nextInt();
        int st[] = new int[s];
        int c;
        while (true) {
            System.out.println("1 for Push, 2 for Pop, 3 for Display, 4 for exit");
            c = sc.nextInt();
            if (c == 1) {
                if (nextIndex == s)
                    ob.check(nextIndex);
                else {
                    System.out.print("Enter value to be pushed:");
                    c = sc.nextInt();
                    ob.push(c, st);
                }
            } else if (c == 2) {
                ob.pop();
                st[nextIndex] = 0;
            } else if (c == 3) {
                ob.display(st);
            } else if (c == 4)
                System.exit(0);
            else {
                System.out.println("Invalid, Please enter again\n");
            }
        }
    }
}

