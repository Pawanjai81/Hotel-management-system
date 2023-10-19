package com.geekster.roomApp.Repo;

import com.geekster.roomApp.Model.Room;
import com.geekster.roomApp.Model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IRoomRepo extends CrudRepository<Room, Integer> {

    List<Room> findByRoomPrice(double price);

    List<Room> findByRoomPriceLessThanEqualAndRoomAvailable(double price, boolean b);

    List<Room> findByRoomPriceLessThanEqualOrRoomAvailable(double price, boolean b);

    List<Room> findByRoomTypeOrRoomAvailableOrderByRoomPrice(Type type, boolean b);
}
