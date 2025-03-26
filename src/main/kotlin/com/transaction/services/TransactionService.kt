package com.transaction.services

import com.transaction.dtos.TransactionDto
import com.transaction.mappers.toTransactionEntity
import com.transaction.models.TransactionModel
import com.transaction.repositories.TransactionRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class TransactionService(
    private val transactionRepository: TransactionRepository,
    private val transactionServiceClient: TransactionServiceClient) {

    fun createTransaction(transactionDto: TransactionDto): ResponseEntity<String> {
        return transactionServiceClient.sendTransactionData(transactionDto)
    }
}