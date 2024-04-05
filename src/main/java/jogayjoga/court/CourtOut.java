package jogayjoga.court;
import lombok.Builder;

@Builder
public record CourtOut(
    String name,
    String address
)
{
    
}
