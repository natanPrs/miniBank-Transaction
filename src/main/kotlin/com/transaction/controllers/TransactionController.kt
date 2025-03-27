package com.transaction.controllers

import com.transaction.dtos.TransactionDto
import com.transaction.models.TransactionModel
import com.transaction.services.TransactionService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transactions")
class TransactionController(private val transactionService: TransactionService) {

    @PostMapping
    fun createTransaction(@RequestBody transactionDto: TransactionDto): ResponseEntity<TransactionModel> {
        val newTransaction = transactionService.createTransaction(transactionDto)
        return ResponseEntity(newTransaction, HttpStatus.CREATED)
    }
}