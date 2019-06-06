package demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(name: String): String {
        println("hello name333222222:sss2a" + name)
        return "e3fvdsgfd你好$name p"
    }

}