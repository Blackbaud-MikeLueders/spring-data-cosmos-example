package com.example.demo


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class DemoRepositoryTest extends Specification {

    @Autowired
    private DemoRepository repository

    def "should persist and load entity"() {
        given:
        DemoEntity entity = DemoEntity.builder()
                .shardKey("shard-key")
                .value("example-value")
                .build()

		when:
		DemoEntity savedEntity = repository.save(entity)

		then:
		assert entity.value == savedEntity.value
		assert savedEntity.id != null
    }

}
