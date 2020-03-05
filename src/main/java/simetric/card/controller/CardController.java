package simetric.card.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simetric.card.model.JpaEntity;
import simetric.card.service.PersonServiceImp;


@RestController
@ResponseBody
@RequestMapping(value = "/restful",produces = "application/json",method = RequestMethod.POST)
public class CardController  {
    private static final Logger LOGGER= LoggerFactory.getLogger(CardController.class);

    @Autowired
    PersonServiceImp personServiceImp;


    @RequestMapping(value = "/cardInformation",produces = "application/json",method = RequestMethod.POST)
    public JpaEntity cardInformation(){
        try {
            return personServiceImp.findAll();
        }
        catch (Exception e){
           LOGGER.error(e.getMessage(),e);
           return null;
        }
    }
}
