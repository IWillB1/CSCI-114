/**
 * T.java - Class renamed to T type from Interfacelab
 * 
 * @author Will Bouasisavath
 * @version Module 16, Lab
 */
public class T implements Comparable<T> { //Class renamed to T
    
    String value; //One instance variable must be there to use Comparable
    
    public T(String value) {
        
        this.value = value; //Constructor
        
    }

    public static void main(String[] args) {
        
        //Now create 4 instances of the class and store them into array
        T t1 = new T("18") ;
        T t2 = new T("-24") ;
        T t3 = new T("0") ;
        T t4 = new T("-6") ;
        T firstSet[] = {t1,t2,t3,t4} ; //array is of type T
        System.out.print("Unsorted: ") ;
        print(firstSet) ;
        sort(firstSet) ;
        System.out.print("Sorted: ") ;
        print(firstSet) ;

    }

    public static void sort(T[] array) { //changed parameter to T
        
        for (int i = 0 ; i < array.length - 1 ; i++) {
            
            int smallest = i ;
            
            for (int j = i + 1 ; j < array.length ; j++) {
                
                if (array[smallest].compareTo(array[j])>0) { //compareTo used is the overriden one
                    
                    smallest = j ;
                    
                }
            }
            
            T temp = array[i] ; //changed temp to T
            array[i] = array[smallest] ;
            array[smallest] = temp ;
        }
    }

    public static void print(T[] array) { //changed to T type in parameter
        
        for (int i = 0 ; i < array.length ; i++) {
            
            System.out.print(array[i].value + " ") ;
            
        }
        
        System.out.println() ;
        
    }

    public int compareTo(T o) {
        
        return this.value.compareTo(o.value);
        
    }
}