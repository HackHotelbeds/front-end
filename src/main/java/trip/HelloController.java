package trip;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trip.pojo.Itinerary;
import trip.servivces.CocheServices;
import trip.servivces.FlightServices;
import trip.utils.Connection;
import trip.utils.UtilsParse;

@RestController
@RequestMapping("/")
public class HelloController {




    protected String applicationOnlyBearerToken;
    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();
    public Connection connection= new Connection();
    CocheServices cocheServices= new CocheServices();
    FlightServices flightServices=new FlightServices();

    @RequestMapping(value="/")
     public String isAlive(){
        //connection.connectSabreAPI();


        Itinerary itinerary= new Itinerary();
        itinerary.setListCar(cocheServices.getRentalCars("","","","",1));
        itinerary.setIda(flightServices.getFakeFlights("LAX","NYK","10/10/2015","1"));
        itinerary.setVuelta(flightServices.getFakeFlights("NYK","LAX","15/10/2015","1"));
        return new UtilsParse().convertObjectToJson(itinerary);
    }






}