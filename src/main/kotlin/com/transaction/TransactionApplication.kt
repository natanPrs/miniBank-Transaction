package com.transaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class TransactionApplication

fun main(args: Array<String>) {
	runApplication<TransactionApplication>(*args)
}
