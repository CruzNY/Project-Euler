import java.util.*;
public class MultiplesOf3and5{
    public static void main(String[] args) throws Exception {
	int x = multiples();
	System.out.println(x);
    }
    public static int multiples(){
	int r = 0;
	List<Integer> list = new ArrayList<>();
	for (int i = 0; i <1000; i++) {
	    if( i % 3 == 0 || i % 5 ==0){
		list.add(i);
	    }
	}
	for (int i = 0; i < list.size(); i++) {
	    r += list.get(i);
	}
	//	System.out.println(Arrays.toString(list.toArray()));
	return r;
    }
}
