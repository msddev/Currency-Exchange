package com.mkdev.domain.intractor

import com.mkdev.domain.model.Rate
import com.mkdev.domain.repository.RateRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRatesUseCase @Inject constructor(
    private val repository: RateRepository
) : BaseUseCase<Boolean, Flow<List<Rate>>> {
    override suspend fun invoke(params: Boolean): Flow<List<Rate>> =
        repository.getRates(params)
}