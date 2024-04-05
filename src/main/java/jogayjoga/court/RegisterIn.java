package jogayjoga.court;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record RegisterIn(
    String name,
    String address,
    Integer capacity,
    Integer sportId
) {
}
