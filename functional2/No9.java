public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n %10 !=9)
                .collect(Collectors.toList());
    }
}