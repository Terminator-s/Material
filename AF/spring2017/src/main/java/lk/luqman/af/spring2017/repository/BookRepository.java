package lk.luqman.af.spring2017.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import lk.luqman.af.spring2017.model.Books;

public interface BookRepository extends MongoRepository<Books, String> {

}
