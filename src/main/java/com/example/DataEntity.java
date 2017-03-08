package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;

/**
 * Created by Abderrazak BOUADMA
 * on 08/03/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonComponent
public class DataEntity {
    private String id;
    private String title;
}
