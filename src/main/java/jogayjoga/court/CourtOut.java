package jogayjoga.court;
import lombok.Builder;

@Builder
public record CourtOut(
    String id,
    String name,
    String address
)
{
    
}
