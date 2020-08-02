package br.com.dasa.fakerulesapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FakeRulesApiApplication

fun main(args: Array<String>) {
	runApplication<FakeRulesApiApplication>(*args)
}
