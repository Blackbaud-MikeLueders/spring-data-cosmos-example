package com.example.demo;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

public interface DemoRepository extends CosmosRepository<DemoEntity, String> {
}
