package demo

import org.junit.Test

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@SpringBootTest
@RunWith(SpringRunner::class)
class T1ResourceV2Test {

    @Autowired
    var res: T1ResourceV2? = null

    @Test
    fun list() {
        val l = res!!.list()
        println("val:$l")
    }
}