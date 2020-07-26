package kg.easy.orderservice.dao;

import kg.easy.orderservice.models.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRep extends JpaRepository<Client,Long> {
}
