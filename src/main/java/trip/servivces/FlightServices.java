package trip.servivces;

import trip.pojo.Vuelo;
import trip.utils.UtilsParse;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ibram on 06/06/2015.
 */
public class FlightServices {

    public List<Vuelo> getFlights(final String ubicationAirport, final String startAirport, final String startDate, final String numberOfPassenger ){
       return null;
    }

    public List<Vuelo> getFakeFlights(final String ubicationAirport, final String startAirport, final String startDate, final String numberOfPassenger ){
        ArrayList<Vuelo> listVuelos= new ArrayList<Vuelo>();
        for(int i=0;i<10;i++){
            Vuelo vuelo= new Vuelo();
            vuelo.setStartAirport(ubicationAirport);
            vuelo.setEndAirport(startAirport);
            vuelo.setPrice(String.valueOf(Math.random() * 100));
            vuelo.setFlightNumber(String.valueOf(Math.random()*100)+"AX");
            vuelo.setDepartureDate(startDate+" 10:00");
            vuelo.setArrivalDate(startDate+" 12:00");
            listVuelos.add(vuelo);
        }
        return listVuelos;
    }
}
