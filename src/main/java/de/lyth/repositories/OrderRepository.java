package de.lyth.repositories;

import de.lyth.model.persistence.Order;
import de.lyth.model.persistence.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUser(User user);

}
