class Solution {
    public String minWindow(String s, String t) {

        int m = s.length();
        int n = t.length();
        HashMap<Character , Integer> map = new HashMap<>();
        //population
        for(int i = 0 ; i<n ; i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int ucc = map.size();
        int startIndex = -1;
        int windowstart = 0;
        int windowend = 0;

        int minlen = Integer.MAX_VALUE;
        //expansion

        while(windowend < m){
            char ch = s.charAt(windowend);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    ucc --;
                }

            }
            //shrinking
            while(ucc == 0){
            int len = windowend - windowstart + 1;
            if(len < minlen){
                minlen = len;
                startIndex = windowstart;

            }
            ch = s.charAt(windowstart);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                if(map.get(ch)>0){
                    ucc++;
                }
            }
            windowstart++;



        }
        windowend++;
        

        }
        if(startIndex == -1){
            return "";
        }
        return s.substring(startIndex,startIndex+minlen);
        

         





   

        
        
    }
}
