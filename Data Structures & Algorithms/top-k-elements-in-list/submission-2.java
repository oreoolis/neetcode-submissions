class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // loop through array
        // store element frequency in key value
        Map<Integer, Integer> mapNums = new HashMap<>();
        for (Integer num : nums){
            mapNums.put(num, mapNums.getOrDefault(num, 0) + 1);
        }

        // anything that involves top k u need to use priority queue
        // use 'something like a comparator' to sort all elements in ascending order (max heap)
        // compare the frequency of the key via mapNums.get(x)
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> Integer.compare(mapNums.get(b), mapNums.get(a)));

        // populate the heap
        for (Integer key: mapNums.keySet()){
            heap.add(key);
        }

        List<Integer> res = new ArrayList<>();
        // loop k times to retrieve the elements K times
        for (int i = 0; i < k; i++){
            res.add(heap.poll());
            // poll pops the top most element - in this case the biggest number in the max heap
        }

        // store a new primitive array, containing the size of the heap
        int[] arrRes = new int[res.size()];
        for (int i = 0; i < res.size(); i++){
            // populate the primitive array
            arrRes[i] = res.get(i);
        }
        return arrRes;






        // System.out.println(mapNums);

        // mapNums.forEach((key, val) -> {
        //     if (val >= k){
        //         res.add(key);
        //     }
        // });

        // int[] resPrim = res.stream().mapToInt(Integer::intValue).toArray();
        // return resPrim;       

    }
}
