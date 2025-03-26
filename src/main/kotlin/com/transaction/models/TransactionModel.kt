package com.transaction.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "tb_transactions")
data class TransactionModel (

    @Id
    val id: UUID = UUID.randomUUID(),

    val senderDocument: String,

    val receiverDocument: String,

    val amount: BigDecimal,

    val localStamp: LocalDateTime
)