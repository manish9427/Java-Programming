# Functions
- str.length()
- str.charAt(i)
- char [] rev = str.toCharArray()
- String.valueOf(rev)
- String reversedString = new String(rev)
- StringBuilder sb = new StringBuilder()
- sb.append(str.charAt(i))
- System.out.println(sb.toString());
- String str = "This is a count of Words";
- String[] words = str.split("\\s+");  // Split the string into words using whitespace as the delimiter
- str = str.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase(); // Remove punctuation and convert the string to lowercase
- int num=153;
- int digits = String.valueOf(num).length(); // 3

# Convert 
- String str = Integer.toString(num); //Convert the integer to a string
- String str = String.valueOf(num); //Convert the integer to a string
- int reversedNum = Integer.parseInt(reversedStr); // Convert the reversed string back to an integer

# Array
- String[] words = {"Manish","Verma"}; 
- for(String word:words){}


# HashMap
- Map<key, value> map = new HashMap<>();
- map.put(key,value)
- map.getOrDefault(word, 0)+1
- map.containsKey(word)
- System.out.println(map) // object of {key=value}
- map.get(word) // you will get the value of the key
- map.keySet() // array of key
- map.values() // array of values
- map.entrySet() // array of [key=values]
###### keySet
for(String key:map.keySet()){
    System.out.println(key + " : " + map.get(key));
}
###### entrySet
for(Map.Entry<String, Integer> entry: map.entrySet()){
    System.out.println(entry.getKey() + " : " + entry.getValue());
}
for(Map.Entry<String, Integer> entry: map.entrySet()){
    System.out.println(entry);
}
###### Iterator (While Loop)
Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
while(iterator.hasNext()){
    Map.Entry<String , Integer> entry = iterator.next();
    System.out.println(entry.getKey() + " : " + entry.getValue());
}
