public class NoX {
    public List<String> noX(List<String> strings) {
        strings = strings.stream()
                .map(n -> n.replace("x",""))
                .collect(Collectors.toList());
        return strings;
    }
}