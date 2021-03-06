package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.DAO.CarDAOListimpl;
import web.config.HibernateConfig;
import web.model.Car;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarServiceimpl implements CarService{


    @Autowired
    @Qualifier ("carDAOHibernateImpl")
    CarDAO carDAO;
    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }

    @Override
    @Transactional
    public void addCar(Car car) {
        carDAO.addCar(car);

    }

    @Override
    public List<Car> getNumberOfCars(int counter) {
        return carDAO.getNumberOfCars(counter);
    }
}
