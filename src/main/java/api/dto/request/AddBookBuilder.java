package api.dto.request;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBookBuilder {

    String userId;

    List<CollectionOfIsbns> collectionOfIsbns;

}