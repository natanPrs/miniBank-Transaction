package com.transaction.repositories

import com.transaction.models.TransactionModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface TransactionRepository : JpaRepository<TransactionModel, UUID>{
}