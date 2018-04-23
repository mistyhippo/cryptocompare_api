package crypto.controllers;

import crypto.models.HistoHourRoot;
import crypto.services.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crypto")

public class CryptoController {

    @Autowired
    CryptoService cryptoService;

    @RequestMapping("/histohour")
    public HistoHourRoot searchHistohour(@RequestParam(value = "fsym", defaultValue = "BTC")String fsym,
                                         @RequestParam(value = "tsym", defaultValue = "USD")String tsym,
                                         @RequestParam(value = "limit")int limit,
                                         @RequestParam(value = "aggregate")int aggregate,
                                         @RequestParam(value = "e", defaultValue = "CCCAGG")String e){


        return cryptoService.mapHistoHour(fsym,tsym,limit,aggregate,e);


    }



}
