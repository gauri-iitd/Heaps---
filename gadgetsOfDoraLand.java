class Solution
{
    class pair implements Comparable<pair>{
        int i;
        int j;
        public pair(int i,int j){
            this.i=i;
            this.j=j;
        }
        public int compareTo(pair p){
            if(p.j==this.j){
                return p.i-this.i;
            }
            else{
                return p.j-this.j;
            }
        }
        
    }
    ArrayList<Integer>TopK(ArrayList<Integer> array, int k)
    {
        // code here
        PriorityQueue<pair>pq=new PriorityQueue<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<array.size();i++){
            h.put(array.get(i),h.getOrDefault(array.get(i),0)+1);
        }
        for(Integer i:h.keySet()){
            pq.add(new pair(i,h.get(i)));
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(pq.poll().i);
        }
        return ans;
    }
}
