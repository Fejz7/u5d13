package project.u5d13.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record UserPayload(@NotEmpty(message = "aggiungi il tuo username")
                             @Size(min = 3, max = 30, message = "lo username deve essere compreso tra i 3 e i 30 caratteri")
                             String name,

                             @NotEmpty(message = "aggiungi l'email")
                             @Email(message = "L'email non è valida")
                             String email,
                             @NotEmpty(message = "manca la password")
                             @Size(min = 3, max = 30, message = "la password deve essere compresa tra i 3 e i 30 caratteri")
                             String password)  {
}
