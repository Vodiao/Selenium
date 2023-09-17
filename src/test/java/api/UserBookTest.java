package api;

import api.dto.request.AddBookBuilder;
import api.dto.request.CollectionOfIsbns;
import api.steps.UserBookStoreSteps;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserBookTest {

    UserBookStoreSteps user = new UserBookStoreSteps();

     AddBookBuilder book = AddBookBuilder.builder()
            .userId("1066798c-6b7f-416b-9eb7-0baf4aa39f6d")
            .collectionOfIsbns(List.of(CollectionOfIsbns.builder().isbn("9781491904244").build()))
            .build();

    @Test
    void getUserWithBook(){
        var response = user.getUser();

        assertThat(response.getBooks().get(0).getTitle()).as("The title are not same")
                .isEqualTo("Git Pocket Guide");
    }

    @Test
    void getUserAndAddBook() {
        user.addBook(book);
        var getBook = user.getUser();
        assertThat(getBook.getBooks().get(getBook.getBooks().size()-1).getTitle())
                .as("The title are not same")
                .isEqualTo("You Don't Know JS");

    }
}
