
package com.example.guestrecordsapi.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class GuestResponse {

    @Id
    private String name;
    private String surname;
    private String date;

}

