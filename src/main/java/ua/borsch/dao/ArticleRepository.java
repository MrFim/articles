package ua.borsch.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.borsch.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
