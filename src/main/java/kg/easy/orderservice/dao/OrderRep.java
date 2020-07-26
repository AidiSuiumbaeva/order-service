package kg.easy.orderservice.dao;

import kg.easy.orderservice.models.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRep  extends JpaRepository<Order,Long> {
}
