package com.mkdev.currencyexchange.di

import com.mkdev.data.BalanceRepositoryImpl
import com.mkdev.data.RateRepositoryImpl
import com.mkdev.data.TransactionRepositoryImpl
import com.mkdev.domain.repository.BalanceRepository
import com.mkdev.domain.repository.RateRepository
import com.mkdev.domain.repository.TransactionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Singleton
    @Provides
    fun provideRateRepository(
        repositoryImpl: RateRepositoryImpl
    ): RateRepository = repositoryImpl

    @Singleton
    @Provides
    fun provideBalanceRepository(
        repositoryImpl: BalanceRepositoryImpl
    ): BalanceRepository = repositoryImpl

    @Singleton
    @Provides
    fun provideTransactionRepository(
        repositoryImpl: TransactionRepositoryImpl
    ): TransactionRepository = repositoryImpl
}