package kg.easy.orderservice.dao;

import kg.easy.orderservice.models.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRep extends JpaRepository<OrderDetail,Long> {
}
