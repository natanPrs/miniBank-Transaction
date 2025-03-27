package com.transaction.services

import com.transaction.dtos.ResponseTransactionDto
import com.transaction.dtos.TransactionDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "transaction-service", url = "http://localhost:8081/users")
interface TransactionServiceClient {

    @PostMapping("/transaction")
    fun sendTransactionData(@RequestBody transactionDto: TransactionDto): ResponseTransactionDto
}