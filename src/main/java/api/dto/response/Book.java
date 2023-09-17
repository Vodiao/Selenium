package api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book{
    public String isbn;
    public String title;
    public String subTitle;
    public String author;
    public Date publish_date;
    public String publisher;
    public int pages;
    public String description;
    public String website;
}
