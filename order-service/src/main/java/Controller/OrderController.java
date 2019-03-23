package Controller;


import lombok.extern.slf4j.Slf4j;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.OrderService;

import javax.validation.Valid;

@Slf4j
@RestController("/order")
public class OrderController {

    @Autowired
    private OrderService orderServicece;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable(value = "id", required = true)int id ){

        System.out.printf("Order %s", id);

        Order order = orderServicece.findById(id);

        return ResponseEntity.status(HttpStatus.OK).body(order);


    }


    @PostMapping
    public ResponseEntity save(@RequestBody @Valid Order orderDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body("{ \"order\" : /"+orderDTO.getId()+"}");
    }


    @PutMapping("/{id}")
    public ResponseEntity<Order> update(@PathVariable int id, @RequestBody @Valid Order order) {
        return ResponseEntity.status(HttpStatus.OK).body(orderServicece.update(order, id));
    }

    @GetMapping("/")
    public ResponseEntity<Order> getOrders(Order order){
        log.info("getOrders {} {}", order.getNome(), order.getId());
        return new ResponseEntity<>(order, HttpStatus.OK);
    }


}
