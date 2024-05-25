package jogayjoga.court;
import lombok.Builder;
import java.io.Serializable;

@Builder
public record CourtOut(
    String id,
    String name,
    String address
) implements Serializable
{
    private static final long serialVersionUID = 1L;
    
}
