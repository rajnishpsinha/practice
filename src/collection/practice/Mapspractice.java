package collection.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Mapspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Map  <Character, String> hashmap= new HashMap<Character,String>();
hashmap.put('A',"Amit");
hashmap.put('B',"Raghav");
hashmap.put('C',"Unni");
hashmap.put('D',"Zeba");
hashmap.put('A',"Rihana");
System.out.println(hashmap);
/*Set set  = hashmap.keySet();
Iterator itr= set.iterator();
while (itr.hasNext())
{
Character key= (Character) itr.next();
System.out.print(key +" : ");
System.out.println(hashmap.get(key));
}
		*/
Set <Entry<Character, String>>entryset=hashmap.entrySet();
for (Map.Entry  e:  entryset)
{
	System.out.println(e.getKey() +": "+ e.getValue());
	}


	}

}
