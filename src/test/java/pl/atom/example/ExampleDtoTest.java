package pl.atom.example;

import static org.junit.jupiter.api.Assertions.*;

class ExampleDtoTest {


    void testDto() {
        ExampleDto exampleDto = new ExampleDto("id", "name", "title");
        assertEquals("id", exampleDto.id());
        assertEquals("name", exampleDto.name());
        assertEquals("title", exampleDto.title());
    }
}