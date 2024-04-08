package jogayjoga.court;
import lombok.Builder;

@Builder
public record CourtSportOut(
    String id,
    String name,
    String address,
    String sportId
)
{
    
}