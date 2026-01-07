public class Car implements Vehicle{
    public static Vehicle vehicle;
    @Override
    public void start() {

    }

    public void stop(){
        System.out.println("Vehicle stopped");
    }


    public static void main(String [] args){
        Car c1= new Car();
        c1.stop();
        Vehicle.vehicleBrand();
        Vehicle v1 = new Car();
        v1.start();
        Vehicle v2 = new Vehicle() {
            @Override
            public void start() {

            }

        };
        v2.stop();


    }

}
