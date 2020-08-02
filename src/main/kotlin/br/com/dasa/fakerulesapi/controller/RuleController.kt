package br.com.dasa.fakerulesapi.controller

import br.com.dasa.fakerulesapi.models.Rule
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class RuleController {

    @GetMapping("/rules/{id}")
    fun getRule(@PathVariable("id") id: Int) =
        try {
            ResponseEntity(rules.first { it.id == id }, HttpStatus.ACCEPTED)
        } catch (e: Exception) {
            ResponseEntity<Any>(HttpStatus.NOT_FOUND)
        }

    val rules = setOf(
        Rule(id = 1, description = "Fake rule one for tests purpose!"),
        Rule(id = 2, description = "Fake rule two for tests purpose!"),
        Rule(id = 3, description = "Fake rule three for tests purpose!")
    )

}