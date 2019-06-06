package demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.ResultSet

@RestController
@RequestMapping("/t1/v2")
class T1ResourceV2(@Autowired val jdbc: JdbcTemplate) {
    @Autowired
    @GetMapping
    fun list(): List<T1> {
        val mapper = T1RowMapper()
        val ret: List<T1> = jdbc.query("select * from t1", mapper);
        return ret;
    }

    private class T1RowMapper : RowMapper<T1> {
        override fun mapRow(rs: ResultSet, rowNum: Int): T1? {
            var ret = T1();
            ret.tid = rs.getInt("id")
            ret.name = rs.getString("name")
            return ret;
        }

    }
}