package jogayjoga.court;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ReservationIn(
    String courtId,
    String userId,
    String date
)
{
    
}

