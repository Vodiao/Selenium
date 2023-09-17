package api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBookStoreResponseBuilder {
    public String userId;
    public String username;
    public ArrayList<Book> books;
}

