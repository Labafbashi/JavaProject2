public interface Vehicle {
    default int getFee() {
        return 0;
    }
}
