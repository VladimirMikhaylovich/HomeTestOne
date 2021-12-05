import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class TestArray {

    //int[] array  = new int[0];

    public void addToArray(int ab, int[] array) {
        int[] a = new int[array.length];
        System.arraycopy(array, 0, a, 0, array.length);
//        for (Integer s : a) {
//            System.out.println("Array: "+s);
//            System.out.println("Length: "+a.length);
//        }
        array = new int[array.length + 1];
        System.arraycopy(a, 0, array, 0, a.length);
        array[array.length - 1] = ab;

        //return new int[];
//        for(Integer s:a){
//            System.out.println("Array: "+s);
//            System.out.println("Length: "+a.length);
//        }
        System.out.println(Arrays.toString(array));
    }

    public void deleteFromArray(int a, int[] array) {
        int[] smallArray = null;
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                smallArray = new int[array.length - 1];
                int remained = array.length - (i + 1);
                System.arraycopy(array, 0, smallArray, 0, i);
                System.arraycopy(array, i + 1, smallArray, i, remained);
                array = new int[array.length - 1];
                System.arraycopy(smallArray, 0, array, 0, smallArray.length);
            }
        }
        System.out.println(Arrays.toString(smallArray));
        System.out.printf("origin: ");
        System.out.println(Arrays.toString(array));
    }


    public void insertInArray(int a,int b, int[] array) {  // вставка нового элемента после позиции а

        int [] newArray = new int[array.length+1];
        int board = newArray.length-(a+1);

        System.arraycopy(array,0, newArray, 0, a);
        System.out.println(Arrays.toString(newArray));
        newArray[a] = b;

        System.arraycopy(array,a, newArray, a+1,board);
        System.out.println(Arrays.toString(newArray));
    }

    public void insertInArray2(int a,int b,int c, int[] array) {  // вставка нового элемента после а и b
        int [] newArray = new int[array.length+1];
        for (int i = 1; i < array.length;) {
            if(array[i] == b){ //0
                if(array[i-1] == a){ //1
                    int board = array.length-i;
                    System.arraycopy(array,0, newArray, 0, i);
                    newArray[i] = c;
                    System.out.println(Arrays.toString(newArray));
                    System.arraycopy(array,i,newArray, i+1,board);
                i++;
                }
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }

    public void insertInArray3 (char a,char b,char c, String s) {  // вставка нового элемента после а и b
        char[] array = s.toCharArray();
        char [] newArray=new char[array.length+1];
        for (int i = 1; i < array.length;) {
            if(array[i] == b){ //0
                if(array[i-1] == a){ //1
                    int board = array.length-i;
                    System.arraycopy(array,0, newArray, 0, i);
                    newArray[i] = c;
                    System.arraycopy(array,i,newArray, i+1,board);
                    i++;
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }

        String newValue =  new String(newArray);
        // return

        System.out.println("Новая строка: "+newValue);
    }
    public void insertInArray4 (char a,char b,char c, String s) {  // вставка нового элемента после а и b
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        System.out.println("Лист готов: "+list);
        for (int i = 1; i < list.size();) {
            if (list.get(i) == b) { //0
                if (list.get(i - 1) == a) { //1
                    list.add(i,'0');
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        System.out.println("New list: "+list);
        Iterator<Character> iterator = list.iterator();
        String newValue="";
        while (iterator.hasNext()){
            newValue+= iterator.next();
        }

        // return


        System.out.println("Новая строка: "+newValue);
    }
}