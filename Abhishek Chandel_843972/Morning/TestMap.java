package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap
{

public static void main(String[] args)
{
// TODO Auto-generated method stub
Map<String, List<String>> map= new HashMap<String, List<String>>();
List<String> One = new ArrayList<String>();
One.add("Abcdef");
One.add("xyzabc");
One.add("lmnopqrst");

List<String> Two = new ArrayList<String>();
Two.add("Mas");
Two.add("Nome");
Two.add("Logprs");

map.put("CS", One);
map.put("ECE", Two);

System.out.println("Fetching Keys and their values");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values );

}

}
}