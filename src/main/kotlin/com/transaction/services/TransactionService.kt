package com.transaction.services

import com.transaction.dtos.ResponseTransactionDto
import com.transaction.dtos.TransactionDto
import com.transaction.models.TransactionModel
import com.transaction.repositories.TransactionRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TransactionService(
    private val transactionRepository: TransactionRepository,
    private val transactionServiceClient: TransactionServiceClient) {

    fun createTransaction(transactionDto: TransactionDto): TransactionModel {
        val response = transactionServiceClient.sendTransactionData(transactionDto)
        return saveTransaction(response)
    }

    fun saveTransaction(responseTransactionDto: ResponseTransactionDto): TransactionModel {
        val newTransaction = TransactionModel(
            senderName = responseTransactionDto.senderName,
            senderDocument = responseTransactionDto.senderDocument,
            receiverName = responseTransactionDto.receiverName,
            receiverDocument = responseTransactionDto.receiverDocument,
            amount = responseTransactionDto.amount,
            localStamp = LocalDateTime.now()
        )

        return transactionRepository.save(newTransaction)
    }
}