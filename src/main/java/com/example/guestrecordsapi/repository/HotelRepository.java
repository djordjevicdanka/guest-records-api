package com.example.guestrecordsapi.repository;
import com.example.guestrecordsapi.dto.Response;
import com.example.guestrecordsapi.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    @Query("SELECT new com.example.guestrecordsapi.dto.Response(h.hotel_id, h.name, h.email, g.guest_id,g.name, g.surname, g.phone) FROM Guest g JOIN g.hotel h")

    List<Response> getJoinInformation();
}
