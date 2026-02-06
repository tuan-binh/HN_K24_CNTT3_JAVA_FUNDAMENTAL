package com.example.chat_app_backend.models.repositories;

import com.example.chat_app_backend.models.entities.FriendShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IFriendShipRepository extends JpaRepository<FriendShip,Long> {
}
