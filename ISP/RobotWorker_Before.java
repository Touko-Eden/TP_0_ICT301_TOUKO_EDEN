public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les robots travaillent");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Les robots ne mangent pas");
    }
}
