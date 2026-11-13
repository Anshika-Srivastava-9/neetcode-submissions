class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()) return false;
     char[] arr1=s.toCharArray();
     char[] arr2=t.toCharArray();
     Arrays.sort(arr1);
     Arrays.sort(arr2);
     String sort1=new String(arr1);
     String sort2=new String(arr2);
     return sort1.equals(sort2);
         }
}
