package project.u5d13.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record EventPayload(@NotEmpty(message = "manca il titolo")
                              String title,

                              @NotEmpty(message = "descrivi l'evento")
                              @Size(min = 3, max = 30, message = "deve essere compreso tra 3 e 30 caratteri")
                              String description,

                              @NotEmpty(message = "manca la location")
                              String location,

                              @NotNull(message = "aggiungi la data")
                              LocalDate date,

                              @NotNull(message = "aggiungi il numero di sedute")
                              int AvailableSeats

)  {
}
