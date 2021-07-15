package guru.sfg.brewery.model.event;

import guru.sfg.brewery.model.BeerDto;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class BeerEvent implements Serializable {
    private final BeerDto beerDto;

}
