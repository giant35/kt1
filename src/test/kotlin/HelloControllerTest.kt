package demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
internal class HelloControllerTest {

    @Autowired
    var c : HelloController? = null

    @Test
    fun testhello() {
        val t = c?.hello("aaa")
        println("t:${t}")
    }
}