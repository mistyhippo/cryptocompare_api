package crypto.services;


import crypto.models.HistoHourRoot;
import crypto.models.HistoMinuteRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CryptoService {

    @Autowired
    RestTemplate restTemplate;

    public HistoHourRoot mapHistoHour(String fsym, String tsym, int limit, int aggregate, String e){

        String fquery = "https://min-api.cryptocompare.com/data/histohour?fsym="+fsym+"&tsym="+tsym+"&limit="+limit+"&aggregate="+aggregate+"&e="+e;
        HistoHourRoot rootObject = restTemplate.getForObject(fquery,HistoHourRoot.class);

        return rootObject;


    }

    public HistoMinuteRoot mapHistoMinute(String fsym, String tsym, int limit, int aggregate, String e){
        String fquery = "https://min-api.cryptocompare.com/data/histominute?fsym="+fsym+"&tsym="+tsym+"&limit="+limit+"&aggregate="+aggregate+"&e="+e;

        HistoMinuteRoot rootObject = restTemplate.getForObject(fquery, HistoMinuteRoot.class);

        return rootObject;

    }
}
