package simetric.card.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simetric.card.dao.PersonDao;
import simetric.card.model.JpaEntity;

import java.util.List;
import java.util.Random;


@Service
public class PersonServiceImp {

    @Autowired
    private PersonDao personDao;


    public JpaEntity findAll() {

        Iterable<JpaEntity> entities = personDao.findAll();
        List<JpaEntity> myList = Lists.newArrayList( entities );
        Random rand = new Random();
        int randomElement = rand.nextInt( myList.size() );
        return myList.get( randomElement );

    }

}