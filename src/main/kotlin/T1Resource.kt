package demo


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t1")
public class T1Resource {


    @Autowired
    var jdbc: JdbcTemplate? = null;

    @GetMapping
    fun list(): MutableList<MutableMap<String, Any>> {
        val ret = jdbc?.queryForList("select * from t1")
        return ret!!
    }

    @PostMapping
    fun add(name: String) {
        jdbc?.update("insert into t1 (name) values(?)", name)
    }

}
