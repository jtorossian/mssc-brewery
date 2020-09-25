package guru.springframework.msscbrewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Torossian on 2020-09-25.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    UUID ID;
    String name;
}
