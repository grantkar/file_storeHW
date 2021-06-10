package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sql2o.Sql2o;



@Component
public class TestRepository {
    private final Sql2o sql2o;
    private static final String SELECT_PRODUCTS_QUERY = "select hash, file_size as fileSize from file_metadata";

    public TestRepository(@Autowired Sql2o sql2o) {
        this.sql2o = sql2o;
    }

}
