public enum PlaneType {
    BOEING757 (200, 99790),
    A380 (555, 560000),
    DREAMLINER (235, 228000),
    EMBRAER (98, 51800);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }


}
