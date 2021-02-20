package com.example.demo;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Container(containerName = "Demo", ru = "400")
public class DemoEntity {

    @Id
    @GeneratedValue
    private String id;

    @PartitionKey
    private String shardKey;

    private String value;

}
