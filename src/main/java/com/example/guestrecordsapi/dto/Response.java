package com.example.guestrecordsapi.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Response {

    @Id
    private int idHotela;
    private String nameHotela;
    private String dateReservation;
    private String phoneGuest;

}
