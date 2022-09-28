package pl.ptemich.graphs.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Vertex {

    private static int counter = 0;

    private Integer id = ++counter;
    private final String label;

}
