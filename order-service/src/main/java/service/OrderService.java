package service;

import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.OrdenRepository;

import java.util.List;

@Service
public class OrderService {

    private OrdenRepository ordenRepository;

    @Autowired
    public  OrderService(OrdenRepository ordenRepository) {
        this.ordenRepository = ordenRepository;

    }

    public Order findById(int id) {
          return this.ordenRepository.findById(id);

    }

    public Order save(Order order) {
        return this.ordenRepository.save(order);
    }

    public Order update(Order order, int id) {
        return this.ordenRepository.update(order, id);

    }

    public Order delete(int id) {
        return this.delete(id);

    }


}
