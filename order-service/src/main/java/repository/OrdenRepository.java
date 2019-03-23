package repository;

import com.sun.org.apache.xpath.internal.operations.Or;
import model.Order;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrdenRepository {


    private List<Order> orders;

    public Order findById(int id) {

        return orders.stream().filter(order -> order.getId() == id).findFirst().orElse(null);

    }

    public Order save(Order order) {
        order.setId(orders.size() + 1);
        this.orders.add(order);

        return  order;
    }

    public Order update(Order order, int id) {
        Order orderUp = findById(order.getId());
        int indice = orders.indexOf(orderUp);
        orders.add(indice, order);
        return orderUp;

    }

    public Order delete(int id) {

        Order orderDel = findById(id);
        orders.remove(orderDel);
        return orderDel;

    }

    public List<Order> getOrfers(){
        return orders;
    }


}
