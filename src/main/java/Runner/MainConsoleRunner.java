package Runner;

import web.service.ServiceCarImp;

public class MainConsoleRunner {

    public static void main(String[] args) {
        ServiceCarImp serviceCarImp = new ServiceCarImp();
        System.out.println(serviceCarImp.findCar(5));
    }
}
