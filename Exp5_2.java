import java.util.Vector;
class Exp5_2 {
    public static void main(String[] args) {
        System.out.println("Hardik Shah    |    16010221025");
        Vector v = new Vector();
        v.add("Delhi");
        v.add("Calcutta");
        v.add("Chennai");
        v.add("Delhi");
        Vector tmpVector = new Vector();
        String tmpValue;
        for (int j = 0; j < v.size(); j++) {
            tmpValue = (String) v.elementAt(j);
            if (tmpValue != null) {
                if (tmpVector.isEmpty())
                    tmpVector.addElement(tmpValue);
                if (tmpVector.indexOf(tmpValue) == -1)
                    tmpVector.addElement(tmpValue);
            }
        }
        for (int j = 0; j < tmpVector.size(); j++)
            System.out.print(tmpVector.elementAt(j) + " ");
    }
}
