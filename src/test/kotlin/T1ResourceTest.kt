package demo


import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@SpringBootTest
@RunWith(SpringRunner::class)
internal class T1ResourceTest {
    @Autowired
    var res: T1Resource? = null

    @Test
    fun list() {
        val l = res!!.list()
        println("l:$l")
    }

    @Test
    fun add() {
        val name = UUID.randomUUID().toString()
        res!!.add(name)
    }
}