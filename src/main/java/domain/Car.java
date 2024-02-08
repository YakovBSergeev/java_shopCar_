package domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Car {
    private final String mark;
    private final String color;
}
