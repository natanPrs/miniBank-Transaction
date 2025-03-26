package com.transaction.mappers

import com.transaction.dtos.TransactionDto
import com.transaction.models.TransactionModel
import java.time.LocalDate
import java.time.LocalDateTime

fun TransactionDto.toTransactionEntity(transactionDto: TransactionDto): TransactionModel =
    TransactionModel(
        senderDocument = this.senderDocument,
        receiverDocument = this.receiverDocument,
        amount = this.amount,
        localStamp = LocalDateTime.now()
    )